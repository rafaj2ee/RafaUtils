package br.com.rafaj2ee.util;

import inas.smart.SmartCommConstant;
import inas.smart.SmartDriver;
import inas.smart.SmartPrinterList;

import java.util.ArrayList;
import java.util.List;

import javax.smartcardio.ATR;
import javax.smartcardio.Card;
import javax.smartcardio.CardChannel;
import javax.smartcardio.CardException;
import javax.smartcardio.CardTerminal;
import javax.smartcardio.CommandAPDU;
import javax.smartcardio.ResponseAPDU;
import javax.smartcardio.TerminalFactory;
import javax.swing.Timer;

public class SmartCHTest {
	static inas.smart.SmartDriver SD = new inas.smart.SmartDriver();
	TerminalFactory factory; //
	java.util.List<CardTerminal> terminals; // Get the terminals attached
	CardTerminal terminal; // receive the object of terminals
	Card card; //
	CardChannel channel; //
	String readerName;
	boolean IsAuthenticated;
	int card_Type;
	byte currentBlock;
	byte keynum;
	private Timer t;
	int h = 1;
	
	public static void main(String[] args) {
		System.out.println("Teste SMART CH");
		
		SmartPrinterList spl = new SmartPrinterList();
		SD.init();
		int nres = SmartCommConstant.SM_SUCCESS;

		nres = SD.jSmartComm_GetDeviceList2(spl);
		nres = SD.jSmartDCL_OpenDevice2(spl.desc[SD.index],
				SD.SMART_OPENDEVICE_BYDESC, 2);
		nres = SmartCommConstant.SM_SUCCESS;
		// SD.
		// start SBS mode
		if (nres == SmartCommConstant.SM_SUCCESS) {
			nres = SD.jSmartComm_CardIn(SmartDriver.handle);
		}
		if (nres == SmartCommConstant.SM_SUCCESS) {
			nres = SD.jSmartComm_Move(SmartDriver.handle,
					SmartCommConstant.RF_MIFARE_SIDEA);
		}
		
		/*
		if (nres == SmartCommConstant.SM_SUCCESS) {
			nres = SD.jSmartComm_Move(SmartDriver.handle,
					SmartCommConstant.RF_MIFARE_SIDEA);
		}
		*/
		// SD.jSmartComm_ICInput(SmartDriver.handle,
		// SmartCommConstant.INTERNALDEV, dwInLen, pInBuf, pdwOutLen, pOutBuf);
		/*
		 * //SmartCardMiddleware CardService cartao=null; try {
		 * //OcfUtil.printOCFConfigFilesFound(); cartao =
		 * OcfUtil.getServico(CardService.class,CardRequest.ANYCARD, false);
		 * 
		 * } catch (CardTerminalException ex) { ex.printStackTrace(); } catch
		 * (CardServiceException ex) { ex.printStackTrace(); } catch
		 * (ClassNotFoundException ex) { ex.printStackTrace(); } catch
		 * (Exception e) { e.printStackTrace(); }
		 */

		/*
		 * if (nres == SmartCommConstant.SM_SUCCESS) { //SD. nres =
		 * SD.jSmartComm_MagReadAction(SD.handle, 7); // MAG_T1 | MAG_T2 |
		 * MAG_T3 System.out.print("MagReadAction() = " + nres + "\n");
		 * 
		 * char ctrack1[], ctrack2[], ctrack3[]; ctrack1 = new char[1024];
		 * ctrack2 = new char[1024]; ctrack3 = new char[1024]; int len1[],
		 * len2[], len3[]; len1 = new int[1]; len2 = new int[2]; len3 = new
		 * int[3]; nres = SD.jSmartComm_MagGetAllBuffer(SD.handle, 1 , ctrack1,
		 * len1, 1 , ctrack2, len2, 1 , ctrack3, len3);
		 * 
		 * String read_track1 = new String(ctrack1, 0, len1[0]); String
		 * read_track2 = new String(ctrack2, 0, len2[0]); String read_track3 =
		 * new String(ctrack3, 0, len3[0]);
		 * System.out.print("MagGetAllBuffer() = " + nres + "\n");
		 * System.out.print("read track1 = " + read_track1 + "\n");
		 * System.out.print("read track2 = " + read_track2 + "\n");
		 * System.out.print("read track3 = " + read_track3 + "\n"); }
		 */
		//Não usar smartcardio junto com api da SmartCH

		SmartCHTest smartCardTest = new SmartCHTest();
		smartCardTest.estabilishContext();
		System.out.println(smartCardTest.connect());
		smartCardTest.disconnect();
		SD.Clear_Opened_DeviceInfo();
		/*
		if (nres == SmartCommConstant.SM_SUCCESS) {
			nres = SD.jSmartComm_CardOut(SmartDriver.handle);
		}
		*/
	}

	public String connect() {
		String s = "";
		String s1 = "";
		String atr_temp = "";
		String uid_temp = "";
		String returnCode = "";
		int atr_byte = 0;
		int n, x;

		try {
			// establish a connection with the card
			System.out.println("Cartão presente "+terminal.isCardPresent());
			card = terminal.connect("T=1");
			System.out.print(card);

			channel = card.getBasicChannel();
			// ////////ATR////////
			ATR r2 = channel.getCard().getATR();
			byte atr[] = r2.getBytes();

			for (n = 0; n < atr.length; n++) {
				x = (int) (0x000000FF & atr[n]); // byte to int conversion
				s = Integer.toHexString(x).toUpperCase();
				if (s.length() == 1)
					s = "0" + s;
				s1 = s1 + s + " ";

			}
			atr_temp = s1;
			System.out.println("\nATR->"+atr_temp);
			// return atr_temp;

			try {
				atr_byte = atr[14];

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.toString());
			}

			// ////////UID///////////
			s1 = "";
			CommandAPDU c2 = new CommandAPDU(0xff, 0xCA, 0x00, 0x00, null,
					0x00, 0x00, 0x1);
			ResponseAPDU r1 = channel.transmit(c2);
			byte uid[] = r1.getBytes();

			for (n = 0; n < uid.length - 2; n++) {
				x = (int) (0x000000FF & uid[n]); // byte to int conversion
				s = Integer.toHexString(x).toUpperCase();
				if (s.length() == 1)
					s = "0" + s;
				s1 = s1 + s + " ";
			}
			uid_temp = s1;
			System.out.println("UID->"+uid_temp);
			if (uid_temp.matches("")) {

			} else {
				// jLabel15.setText("UID ="+uid_temp);
			}

			// Card Type
			if (atr_byte == 1) {
				card_Type = 1;
				card_Type_Identification();
				/*
				 * jLabel17.setText("Card Type: Mifare 1K");
				 * jButton3.setEnabled(false); jButton4.setEnabled(true);
				 * jComboBox2.setEnabled(true);
				 * jFormattedTextField2.setEnabled(true);
				 * jButton9.setEnabled(true); jRadioButton1.setEnabled(true);
				 * jRadioButton2.setEnabled(true); jComboBox4.setEnabled(true);
				 * jButton5.setEnabled(true); jComboBox2.setSelectedIndex(0);
				 * jComboBox3.setSelectedIndex(0);
				 * jComboBox4.setSelectedIndex(0);
				 * jTextField1.setText("SmartCard Inserted");
				 * jTextField1.setBackground(new Color(173,255, 47));
				 * jTextField1.setForeground(Color.black);
				 * if(jRadioButton2.isSelected()==true) {
				 * jComboBox3.setEnabled(true); } else
				 * if(jRadioButton1.isEnabled()==true) {
				 * jComboBox3.setEnabled(true); jComboBox3.setSelectedIndex(0);
				 * }
				 */
			} else if (atr_byte == 2) {
				card_Type = 2;
				card_Type_Identification();
				/*
				 * jLabel17.setText("Card Type: Mifare 4K");
				 * jButton3.setEnabled(false); jButton4.setEnabled(true);
				 * jComboBox2.setEnabled(true);
				 * jFormattedTextField2.setEnabled(true);
				 * jButton9.setEnabled(true); jRadioButton1.setEnabled(true);
				 * jRadioButton2.setEnabled(true); //
				 * jComboBox3.setEnabled(true); jComboBox4.setEnabled(true);
				 * jButton5.setEnabled(true); //
				 * jFormattedTextField3.setEnabled(true);
				 * jComboBox2.setSelectedIndex(0);
				 * jComboBox3.setSelectedIndex(0);
				 * jComboBox4.setSelectedIndex(0);
				 * jTextField1.setText("SmartCard Inserted");
				 * jTextField1.setBackground(new Color(173,255, 47));
				 * jTextField1.setForeground(Color.black);
				 * if(jRadioButton2.isSelected()==true) {
				 * jComboBox3.setEnabled(true); } else
				 * if(jRadioButton1.isEnabled()==true) {
				 * jComboBox3.setEnabled(true); jComboBox3.setSelectedIndex(0);
				 * }
				 */
			} else if (uid_temp.matches("")) {
				/*
				 * jLabel15.setText("UID = n/a"); jLabel17.setText(
				 * "                            Card Type: No Mifare 1K or 4K Card "
				 * ); jButton3.setEnabled(false); jButton4.setEnabled(true);
				 */
			} else {
				/*
				 * jLabel17.setText(
				 * "                            Card Type: No Mifare 1K or 4K Card "
				 * ); jButton3.setEnabled(false); jButton4.setEnabled(true);
				 */
			}
			System.out.println("> SCardConnect \n     Successsful\n\n");

		} catch (CardException e) {
			// Textcolorchange("> SCardConnect" +
			// "\n   Failed... \n\n",Color.red);
			e.printStackTrace();
		}
		return atr_temp;
	}// GEN-LAST:event_jButton3MouseClicked
		// ********************************************************
		// Function Name:card_Type_Identification
		// Description:Function to add blocks in block combo box based on card
		// type
		// ********************************************************

	private List<String> card_Type_Identification() {
		List<String> jComboBox4 = new ArrayList<String>();

		if (card_Type == 1) {
			jComboBox4.add("00");
			jComboBox4.add("01");
			jComboBox4.add("02");
			jComboBox4.add("03");
			jComboBox4.add("04");
			jComboBox4.add("05");
			jComboBox4.add("06");
			jComboBox4.add("07");
			jComboBox4.add("08");
			jComboBox4.add("09");
			jComboBox4.add("10");
			jComboBox4.add("11");
			jComboBox4.add("12");
			jComboBox4.add("13");
			jComboBox4.add("14");
			jComboBox4.add("15");
			jComboBox4.add("16");
			jComboBox4.add("17");
			jComboBox4.add("18");
			jComboBox4.add("19");
			jComboBox4.add("20");
			jComboBox4.add("21");
			jComboBox4.add("22");
			jComboBox4.add("23");
			jComboBox4.add("24");
			jComboBox4.add("25");
			jComboBox4.add("26");
			jComboBox4.add("27");
			jComboBox4.add("28");
			jComboBox4.add("29");
			jComboBox4.add("30");
			jComboBox4.add("31");
			jComboBox4.add("32");
			jComboBox4.add("33");
			jComboBox4.add("34");
			jComboBox4.add("35");
			jComboBox4.add("36");
			jComboBox4.add("37");
			jComboBox4.add("38");
			jComboBox4.add("39");
			jComboBox4.add("40");
			jComboBox4.add("41");
			jComboBox4.add("42");
			jComboBox4.add("43");
			jComboBox4.add("44");
			jComboBox4.add("45");
			jComboBox4.add("46");
			jComboBox4.add("47");
			jComboBox4.add("48");
			jComboBox4.add("49");
			jComboBox4.add("50");
			jComboBox4.add("51");
			jComboBox4.add("52");
			jComboBox4.add("53");
			jComboBox4.add("54");
			jComboBox4.add("55");
			jComboBox4.add("56");
			jComboBox4.add("57");
			jComboBox4.add("58");
			jComboBox4.add("59");
			jComboBox4.add("60");
			jComboBox4.add("61");
			jComboBox4.add("62");
			jComboBox4.add("63");

		} else if (card_Type == 2) {
			jComboBox4.add("00");
			jComboBox4.add("01");
			jComboBox4.add("02");
			jComboBox4.add("03");
			jComboBox4.add("04");
			jComboBox4.add("05");
			jComboBox4.add("06");
			jComboBox4.add("07");
			jComboBox4.add("08");
			jComboBox4.add("09");
			jComboBox4.add("10");
			jComboBox4.add("11");
			jComboBox4.add("12");
			jComboBox4.add("13");
			jComboBox4.add("14");
			jComboBox4.add("15");
			jComboBox4.add("16");
			jComboBox4.add("17");
			jComboBox4.add("18");
			jComboBox4.add("19");
			jComboBox4.add("20");
			jComboBox4.add("21");
			jComboBox4.add("22");
			jComboBox4.add("23");
			jComboBox4.add("24");
			jComboBox4.add("25");
			jComboBox4.add("26");
			jComboBox4.add("27");
			jComboBox4.add("28");
			jComboBox4.add("29");
			jComboBox4.add("30");
			jComboBox4.add("31");
			jComboBox4.add("32");
			jComboBox4.add("33");
			jComboBox4.add("34");
			jComboBox4.add("35");
			jComboBox4.add("36");
			jComboBox4.add("37");
			jComboBox4.add("38");
			jComboBox4.add("39");
			jComboBox4.add("40");
			jComboBox4.add("41");
			jComboBox4.add("42");
			jComboBox4.add("43");
			jComboBox4.add("44");
			jComboBox4.add("45");
			jComboBox4.add("46");
			jComboBox4.add("47");
			jComboBox4.add("48");
			jComboBox4.add("49");
			jComboBox4.add("50");
			jComboBox4.add("51");
			jComboBox4.add("52");
			jComboBox4.add("53");
			jComboBox4.add("54");
			jComboBox4.add("55");
			jComboBox4.add("56");
			jComboBox4.add("57");
			jComboBox4.add("58");
			jComboBox4.add("59");
			jComboBox4.add("60");
			jComboBox4.add("61");
			jComboBox4.add("62");
			jComboBox4.add("63");
			jComboBox4.add("64");
			jComboBox4.add("65");
			jComboBox4.add("66");
			jComboBox4.add("67");
			jComboBox4.add("68");
			jComboBox4.add("69");
			jComboBox4.add("70");
			jComboBox4.add("71");
			jComboBox4.add("72");
			jComboBox4.add("73");
			jComboBox4.add("74");
			jComboBox4.add("75");
			jComboBox4.add("76");
			jComboBox4.add("77");
			jComboBox4.add("78");
			jComboBox4.add("79");
			jComboBox4.add("80");
			jComboBox4.add("81");
			jComboBox4.add("82");
			jComboBox4.add("83");
			jComboBox4.add("84");
			jComboBox4.add("85");
			jComboBox4.add("86");
			jComboBox4.add("87");
			jComboBox4.add("88");
			jComboBox4.add("89");
			jComboBox4.add("90");
			jComboBox4.add("91");
			jComboBox4.add("92");
			jComboBox4.add("93");
			jComboBox4.add("94");
			jComboBox4.add("95");
			jComboBox4.add("96");
			jComboBox4.add("97");
			jComboBox4.add("98");
			jComboBox4.add("99");
			jComboBox4.add("100");
			jComboBox4.add("101");
			jComboBox4.add("102");
			jComboBox4.add("103");
			jComboBox4.add("104");
			jComboBox4.add("105");
			jComboBox4.add("106");
			jComboBox4.add("107");
			jComboBox4.add("108");
			jComboBox4.add("109");
			jComboBox4.add("110");
			jComboBox4.add("111");
			jComboBox4.add("112");
			jComboBox4.add("113");
			jComboBox4.add("114");
			jComboBox4.add("115");
			jComboBox4.add("116");
			jComboBox4.add("117");
			jComboBox4.add("118");
			jComboBox4.add("119");
			jComboBox4.add("120");
			jComboBox4.add("121");
			jComboBox4.add("122");
			jComboBox4.add("123");
			jComboBox4.add("124");
			jComboBox4.add("125");
			jComboBox4.add("126");
			jComboBox4.add("127");
			jComboBox4.add("128");
			jComboBox4.add("129");
			jComboBox4.add("130");
			jComboBox4.add("131");
			jComboBox4.add("132");
			jComboBox4.add("133");
			jComboBox4.add("134");
			jComboBox4.add("135");
			jComboBox4.add("136");
			jComboBox4.add("137");
			jComboBox4.add("138");
			jComboBox4.add("139");
			jComboBox4.add("140");
			jComboBox4.add("141");
			jComboBox4.add("142");
			jComboBox4.add("143");
			jComboBox4.add("144");
			jComboBox4.add("145");
			jComboBox4.add("146");
			jComboBox4.add("147");
			jComboBox4.add("148");
			jComboBox4.add("149");
			jComboBox4.add("150");
			jComboBox4.add("151");
			jComboBox4.add("152");
			jComboBox4.add("153");
			jComboBox4.add("154");
			jComboBox4.add("155");
			jComboBox4.add("156");
			jComboBox4.add("157");
			jComboBox4.add("158");
			jComboBox4.add("159");
			jComboBox4.add("160");
			jComboBox4.add("161");
			jComboBox4.add("162");
			jComboBox4.add("163");
			jComboBox4.add("164");
			jComboBox4.add("165");
			jComboBox4.add("166");
			jComboBox4.add("167");
			jComboBox4.add("168");
			jComboBox4.add("169");
			jComboBox4.add("170");
			jComboBox4.add("171");
			jComboBox4.add("172");
			jComboBox4.add("173");
			jComboBox4.add("174");
			jComboBox4.add("175");
			jComboBox4.add("176");
			jComboBox4.add("177");
			jComboBox4.add("178");
			jComboBox4.add("179");
			jComboBox4.add("180");
			jComboBox4.add("181");
			jComboBox4.add("182");
			jComboBox4.add("183");
			jComboBox4.add("184");
			jComboBox4.add("185");
			jComboBox4.add("186");
			jComboBox4.add("187");
			jComboBox4.add("188");
			jComboBox4.add("189");
			jComboBox4.add("190");
			jComboBox4.add("191");
			jComboBox4.add("192");
			jComboBox4.add("193");
			jComboBox4.add("194");
			jComboBox4.add("195");
			jComboBox4.add("196");
			jComboBox4.add("197");
			jComboBox4.add("198");
			jComboBox4.add("199");
			jComboBox4.add("200");
			jComboBox4.add("201");
			jComboBox4.add("202");
			jComboBox4.add("203");
			jComboBox4.add("204");
			jComboBox4.add("205");
			jComboBox4.add("206");
			jComboBox4.add("207");
			jComboBox4.add("208");
			jComboBox4.add("209");
			jComboBox4.add("210");
			jComboBox4.add("211");
			jComboBox4.add("212");
			jComboBox4.add("213");
			jComboBox4.add("214");
			jComboBox4.add("215");
			jComboBox4.add("216");
			jComboBox4.add("217");
			jComboBox4.add("218");
			jComboBox4.add("219");
			jComboBox4.add("220");
			jComboBox4.add("221");
			jComboBox4.add("222");
			jComboBox4.add("223");
			jComboBox4.add("224");
			jComboBox4.add("225");
			jComboBox4.add("226");
			jComboBox4.add("227");
			jComboBox4.add("228");
			jComboBox4.add("229");
			jComboBox4.add("230");
			jComboBox4.add("231");
			jComboBox4.add("232");
			jComboBox4.add("233");
			jComboBox4.add("234");
			jComboBox4.add("235");
			jComboBox4.add("236");
			jComboBox4.add("237");
			jComboBox4.add("238");
			jComboBox4.add("239");
			jComboBox4.add("240");
			jComboBox4.add("241");
			jComboBox4.add("242");
			jComboBox4.add("243");
			jComboBox4.add("244");
			jComboBox4.add("245");
			jComboBox4.add("246");
			jComboBox4.add("247");
			jComboBox4.add("248");
			jComboBox4.add("249");
			jComboBox4.add("250");
			jComboBox4.add("251");
			jComboBox4.add("252");
			jComboBox4.add("253");
			jComboBox4.add("254");
			jComboBox4.add("255");

		}
		return jComboBox4;
	}
    // Establish Context
    //********************************************************
    //Function Name: jButton1MouseClicked
    //Input(Parameter) : evt
    //OutPutParameter:-------
    //Description:Establishing the context to the reader
    //********************************************************
    public void estabilishContext() {//GEN-FIRST:event_jButton1MouseClicked
        factory = TerminalFactory.getDefault();
        try {
			terminals = factory.terminals().list();
		} catch (CardException e) {
			e.printStackTrace();
		}
        String reader=terminals.toString();
        System.out.println(reader);
        readerName = reader.replace("[", "");
        readerName = readerName.replace("]", "");
        readerName = readerName.split(",")[1].trim();
        readerName = readerName.replace("PC/SC terminal", "").trim();
        
        if(!(readerName.matches("")))
       {
            IsAuthenticated = false;
            // get the terminal Selected
            if(readerName.contains("CL"))
            {
                terminal = terminals.get(1);
            }
            else
            {
               terminal = terminals.get(0);
            }
            System.out.println(">SCardEstablishContext Successsful");
            //t=new Timer(1000, taskperformer);
            //t.start();
       }
       else
       {
    	   System.out.println("> SCardEstablishContext" + "   Failed...");
       }
        
            
    
    }
    
    //Disconnect
    //********************************************************
    //Function Name: DisconnectButtonClick
    //Input(Parameter) : evt
    //OutPutParameter:-------
    //Description:Disconnect the Smartcard
    //********************************************************
    public void disconnect() {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        
        try{  
                // disconnect
                card.disconnect(false);
                if(card.toString().contains("DISCONNECT"))
                {
                    //System.out.println(card);
                	System.out.println("> SCardDisconnect" + "     Successful");
                }
            }
            catch(CardException e)
            {
                 System.out.println(e.toString());  
            }
    }
}
