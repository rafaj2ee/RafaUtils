package br.com.rafaj2ee.util;

import java.nio.ByteBuffer;
import java.util.List;
import javax.smartcardio.Card;
import javax.smartcardio.CardChannel;
import javax.smartcardio.CardException;
import javax.smartcardio.CardTerminal;
import javax.smartcardio.TerminalFactory;
 
public class Read {

   public Read() {
       
       try {

           CardTerminal terminal = null;

           // show the list of available terminals
           TerminalFactory factory = TerminalFactory.getDefault();
           List<CardTerminal> terminals = factory.terminals().list();

           String readerName = "";

           for (int i = 0; i < terminals.size(); i++) {

               readerName = terminals.get(i).toString().substring(
                                   terminals.get(i).toString().length() - 2);
               System.out.println("READER->"+terminals.get(i).getName()+"|"+readerName);
               if (readerName.trim().equalsIgnoreCase("0")) {
                   terminal = terminals.get(i);
                   //System.out.println("GOTTERMINAL->"+terminals.get(i).getName());
                   //break;
               }
           }

           // Establish a connection with the card
           System.out.println("Waiting for a card..");
           terminal.waitForCardPresent(0);

           Card card = terminal.connect("*");
           CardChannel channel = card.getBasicChannel();

           // Start with something simple, read UID, kinda like Hello World!
           byte[] baReadUID = new byte[5];

           baReadUID = new byte[]{(byte) 0xFF, (byte) 0xCA, (byte) 0x00,
                                  (byte) 0x00, (byte) 0x00};

           System.out.println("UID: " + send(baReadUID, channel));
           // If successfull, the output will end with 9000

           // OK, now, the real work
           // Get Serial Number
           // Load key
           byte[] baLoadKey = new byte[12];

           baLoadKey = new byte[]{(byte) 0xFF, (byte) 0x82, (byte) 0x20,
                                     (byte) 0x1A, (byte) 0x06, (byte) 0xFF,
                                     (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
                                     (byte) 0xFF, (byte) 0xFF};
           
           System.out.println("LOAD KEY: " + send(baLoadKey, channel));
           // If successfull, will output 9000

           // Authenticate
           byte[] baAuth = new byte[7];

           baAuth = new byte[]{(byte) 0xFF, (byte) 0x88, (byte) 0x00,
                               (byte) 0x09, (byte) 0x60, (byte) 0x00};

           System.out.println("AUTHENTICATE: " + send(baAuth, channel));
           // If successfull, will output 9000

           // Read Serial
           byte[] baRead = new byte[6];

           baRead = new byte[]{(byte) 0xFF, (byte) 0xB0, (byte) 0x00,
                               (byte) 0x09, (byte) 0x10};

           System.out.println("READ: " + send(baRead, channel));
           
           //channel.transmit(arg0)
           // If successfull, the output will end with 9000

       } catch (Exception ex) {
           ex.printStackTrace();
       }
   }

   public String send(byte[] cmd, CardChannel channel) {

       String res = "";

       byte[] baResp = new byte[258];
       ByteBuffer bufCmd = ByteBuffer.wrap(cmd);
       ByteBuffer bufResp = ByteBuffer.wrap(baResp);

       // output = The length of the received response APDU
       int output = 0;

       try {

           output = channel.transmit(bufCmd, bufResp);

       } catch (CardException ex) {
           ex.printStackTrace();
       }

       for (int i = 0; i < output; i++) {
           res += String.format("%02X", baResp[i]);
           // The result is formatted as a hexadecimal integer
       }

       return res;
   }

   public static void main(String[] args) {
       new Read();
   }
}