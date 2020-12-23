/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inas.smart;

import java.io.IOException;
import java.net.URL;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SmartDriver {
       
    native int SmartComm_GetDeviceList2( int nNum,                        //
                                            char[] IDArray,                 // name
                                            char[] IDArray2,                  //id
                                            char[] IDArray3,                  //dev
                                            char[] IDArray4,                  //desc
                                            int[] nIDArray2);                 //pid   

    native int SmartComm_OpenDevice2(int[] pHandle, char[] szdev, int devtype);

    native int SmartDCL_OpenDevice2(int[] pHandle, char[] szPrinterID, int ndevtype, int nOrientation); 

    native int SmartComm_CloseDevice(int hHandle);  
    
    native int SmartDCL_CloseDevice(int hHandle);   
              
    native int SmartComm_GetStatus(int handle, long status[]); 

    native int SmartComm_GetRibbonType(int handle, int type[]);  
 
    native int SmartComm_GetRibbonRemain(int handle, int remain[]); 

    native int SmartComm_ClearStatus(int hHandle);  
   
    native int SmartComm_SBSStart(int hHandle);   

    native int SmartComm_SBSEnd(int hHandle);   
    
    native int SmartComm_CardOut(int hHandle);   
    
    native int SmartComm_Move(int hHandle, int pos);   
    
    native int SmartComm_ICHContact(int hHandle);   

    native int SmartComm_ICHDiscontact(int hHandle);   

    native int SmartComm_MagReadAction(int hHandle, int nTrackID);  
   
    native int SmartComm_MagGetBuffer(int hHandle, int nTrackID, char pOutBuf[], int pnInOutLen[]);  
  
    native int SmartComm_MagGetAllBuffer(int hHandle,
            boolean bGetT1, char[] pBufT1, int[] pnT1Len,
            boolean bGetT2, char[] pBufT2, int[] pnT2Len,
            boolean bGetT3, char[] pBufT3, int[] pnT3Len);   

    native int SmartComm_MagWriteAction(int hHandle, int nTrackID, boolean bHighCo);   
  
    native int SmartComm_MagBitModeGetBPI(int nBPI, int pNewBPI);  

    native int SmartComm_MagBitModeGetMaxSize(int nBPI, int[] pnMaxSize); 

    native int SmartComm_MagSetBuffer(int hHandle, int nTrackID, byte[] pInBuf, int nLen);   
       
    native int SmartComm_MagGetCryptoBuffer(int hHandle, int nTrackID, byte[] pOutBuf, int[] pnInOutLen,
            char[] pKey);   

    native int SmartComm_MagGetAllCryptoBuffer(int hHandle,
            boolean bGetT1, char[] pBufT1, int[] pnT1Len,
            boolean bGetT2, char[] pBufT2, int[] pnT2Len,
            boolean bGetT3, char[] pBufT3, int[] pnT3Len, char[] pKey); 
   
    native int SmartComm_MagSetCryptoBuffer(int hHandle, int nTrackID, byte[] pInBuf, int nInLen, char[] pKey); 

    native int SmartComm_MagSetAllCryptoBuffer(int hHandle,
            boolean bSetT1, char[] pBufT1, int nT1Len,
            boolean bSetT2, char[] pBufT2, int nT2Len,
            boolean bSetT3, char[] pBufT3, int nT3Len, char[] pKey); 
 
    native int SmartComm_OpenDocument(int hHandle, char szCSDName[]);  

    native int SmartComm_CloseDocument(int hHandle); 

    native int SmartComm_GetPrinterSettings(int hHandle, CHASM_DEVMODE pDm); 

    native int SmartComm_SetPrinterSettings(int hHandle, CHASM_DEVMODE pDm);  

    native int SmartComm_DrawImage(int hHandle, byte page, byte panel, int x, int y, int cx, int cy,
            char[] szImgPath, RECT prcArea);  
  
    native int SmartCommEx_DrawImage(int hHandle, byte page, byte panel, int x, int y, int cx, int cy,
            int nScaleMethod, byte nAlign, char[] szImgPath, RECT prcArea);  
   
    native int SmartComm_DrawRect(int hHandle, byte page, byte panel, int x, int y,
            int cx, int cy, int col, RECT prcArea);  

    native int SmartComm_Print(int hHandle); 

    native int SmartDCL_Print(int hHandle, int nPrintSide);  

    native int SmartComm_DoPrint(int hHandle);  
    
    native int SmartComm_IsBackEnable(int hHandle, boolean[] pbEnabled);  
   
    native int SmartComm_ICPowerOn(int hHandle, int nDev, long[] pdwOutLen, byte[] pOutBuf);  

    native int SmartComm_ICPowerOff(int hHandle, int nDev);  

    native int SmartComm_ICInput(int hHandle, int nDev, long dwInLen, byte[] pInBuf,
            long[] pdwOutLen, byte[] pOutBuf);  

    native int SmartComm_ICOutput(int hHandle, int nDev, long dwInLen, byte[] pInBuf,
            long[] pdwOutLen, byte[] pOutBuf);  
       
    native int SmartComm_GetDeviceInfo2(  char[]      szdev,                  // ID or Description
                                            int         IdDesc,                 // 0 = ID, 1 = Description
                                            char[]      name,                   // printer name
                                            char[]	id,			// printer ID
                                            char[]	dev,			// device connection
                                            int	[]	dev_type, 		// 1=USB, 2=NET
                                            int []	pid,			// USB product ID
                                            char[]      usbport,		// usb port
                                            char[]    	link,			// symbolic link of usb port
                                            int []	is_bridge,             	// Network module bridge
                                            char[]	ver,			// version of network protocol
                                            char[] 	ip,			// ip address
                                            int []	tcpport,		// tcp port
                                            int []	is_ssl,			// ssl protocol
                                            int []	is_dual,                // dual printer
                                            char[]	ic1,			// internal contact encoder
                                            char[]	ic2,			// external contact SIM encoder
                                            char[]	rf1,			// internal contactless encoder
                                            char[]	rf2			// external contactless encoder 
                                           );  
    
    native int SmartComm_CardIn(int hHandle);  
    
    native int SmartComm_MagSetAllBuffer
            (int hHandle,
            boolean bSetT1, char[] pBufT1, int nT1Len,
            boolean bSetT2, char[] pBufT2, int nT2Len,
            boolean bSetT3, char[] pBufT3, int nT3Len);  
 
    native int SmartComm_DrawText(int hHandle, byte page, byte panel, int x, int y, char[] szFontName,
            int nFontSize, byte nFontStyle, char[] szText, RECT prcArea);  
         
    public static SmartPrinterList SmartPrinterList = new SmartPrinterList();

    public static SmartPrinterInfo SmartPrinterInfo = new SmartPrinterInfo();

    public static final int 	SMART_PRINTER_TYPE_USB	= 1;

    public static final int     SMART_PRINTER_TYPE_NET	= 2;

    public static final int 	SMART_PRINTER_TYPE_ALL	= 3;

    public static int   index;
    
    static SmartCommConstant SmartCommonConstant = new SmartCommConstant();
   
    static public DeviceInfo DeviceInfo = null;
   
    static public Vector DeviceList = null;
   
    static public Vector Opened_DeviceInfo = null;
    
    static public Vector OpenedDCL_DeviceInfo = null;
   
    static public int NoDevice;
   
    static public String PrinterID = "";
     
    static public String PrinterDesc = "";
    
    static public String PrinterDev = "";
    
    static public String PrinterName = "";
    
    static public int PrinterPID = 0;
    
    public static final int 	SMART_OPENDEVICE_BYID = 0;
    
    public static final int 	SMART_OPENDEVICE_BYDESC	= 1;				//

   static public int handle;
    
   static public int Cmd_status;

   
   static long piStatus = 0;
    
   public static void main(String args[]) throws IOException {
      NoDevice = -1;
        handle = -1;
    }
    
    static {
         System.loadLibrary("SmartCommJNI");
    }
    /**
     * initialize SmartDriver Class
     */
    static public void init() {
        DeviceList = new Vector();
        Opened_DeviceInfo = new Vector();
        OpenedDCL_DeviceInfo = new Vector();
        NoDevice = -1;
        handle = -1;
        Cmd_status = SmartCommonConstant.SM_FAIL;
    }

    /**
     * Destroy SmartDriver Class
     */
    static public void close() {
       DeviceList.removeAllElements();
        Opened_DeviceInfo.removeAllElements();
        OpenedDCL_DeviceInfo.removeAllElements();
        NoDevice = -1;
        handle = -1;
    }



    /**
     *                jSmartComm_GetDeviceList2 is command which is collecting the available Smart Printer ID or discriptions. To use
     *                Smart Printer, do SmartComm_OpenDevice2 and to do it, Printer ID or Description is needed.
     * @return       The number of Devices
     * @see          Using "SmartComm2.dll", you can get printer devices list which are connected with both USB and Network.
     *                Printer ID is standard to recognize Smart Printer. It’s factory default is “SMART”.
     *                For more information, please refer to the setup program’s manual.
     */
    public int jSmartComm_GetDeviceList2(SmartPrinterList spl) {

        init();

        int ret = SmartCommonConstant.SM_FAIL;
                                                
        int n = 0;
        char[] name = new char[32*128];
        char[] id   = new char[32*64];
        char[] dev  = new char[32*64];
        char[] desc = new char[32*256];
        int[] pid = new int[32];
        

        ret = SmartComm_GetDeviceList2(n, name, id, dev, desc, pid);
        spl.n = ret;

        if (ret < 0) {
            System.out.println("FUNC : FAIL - jSmartComm_GetDeviceList2.");
            return ret;
        }
        if (!DeviceList.isEmpty()) {
            DeviceList.removeAllElements();
        }
        
        NoDevice = ret;     
        int[] nPID = new int[NoDevice];

        String sdev = new String();
        String sid = new String();
        String sdesc = new String();
        String sname = new String();
        
        for (int i = 0; i < NoDevice; i++)  //Added by Kyle
        {
            sid = new String(id, i * 64, 64);  //org
            sname = new String(name, i * 128, 128);
            sdev = new String(dev, i * 64, 64);
            sdesc = new String(desc, i * 256, 256);

            nPID[i] =  pid[i];


            sid.getChars(0, 64, spl.id[i], 0);
            sname.getChars(0, 128, spl.name[i], 0);
            sdev.getChars(0, 64, spl.dev[i], 0);
            sdesc.getChars(0, 64, spl.desc[i], 0);
            spl.pid[i] = nPID[i];

            if (i == 0) {
                SmartDriver.PrinterID = sid;
                SmartDriver.PrinterDesc = sdesc;
                SmartDriver.PrinterName = sname;
                SmartDriver.PrinterDev = sdev;
                SmartDriver.PrinterPID = nPID[0];
            }

       
            sid = CopyUntilNullOrSpace(sid);
            sdesc = CopyUntilNullOrSpace(sdesc);
            sname = CopyUntilNullOrSpace(sname);
            sdev = CopyUntilNullOrSpace(sdev);
            
            
            if(spl.dev[i][0] == 'U')
            {
                spl.devtype[i] = 0;  //USB
            }
            else
            {
                spl.devtype[i] = 1; //NET
            }
       

            System.out.println("DEBUG : Number of Printers  = " + NoDevice + ", i=" + i + " Printer ID=" + sid );
            System.out.println("DEBUG : Printer Name        =" + sname);
            System.out.println("DEBUG : Printer dev         =" + sdev);
            System.out.println("DEBUG : Printer description =" + sdesc);
           
            DeviceList.add(i, sid);
        }
 

        return NoDevice;
    }
    
    /**
     *          SmartComm_OpenDevice2 is a function to initializing and receiving the handle to use Smart Printer.
     *
     *          Printer ID should use the returned value from SmartComm_GetDeviceList2.
     * @param  szPrinterID   [in] Printer ID to open. This vaue must use one of values which can be got using SmartComm_GetDeviceList2.
     * @return         Printer handle will be returned if it is succeed.
     */
     public int jSmartComm_OpenDevice2(char[] szdev, int devtype) 
     {
        int thandle[] = new int[1];
           int ret = SmartComm_OpenDevice2(thandle, szdev, devtype);

        if (ret == SmartCommonConstant.SM_FAIL) {
            return -1;
        }
        
        String tPrinterID = new String();
        SmartDriver.handle = thandle[0];
        
       if(devtype==SMART_OPENDEVICE_BYID)
       {
            tPrinterID = new String(szdev);
            char ID[] = new char[256];
            
            tPrinterID.getChars(0, tPrinterID.length(), ID, 0);

            if(devtype==SMART_OPENDEVICE_BYID)
            {
                SmartDriver.PrinterID = tPrinterID;
            }
        }
       
       DeviceInfo = new DeviceInfo();
        DeviceInfo.setHandle(ret);
        DeviceInfo.setID(tPrinterID);
        if (!IsExistsOpenedDevice(tPrinterID)) {
            Opened_DeviceInfo.add(DeviceInfo);
            
        }
        
        return SmartDriver.handle;
    }


    /**
     *           SmartDCL_OpenDevice is a function to initializing and receiving the handle to use DCL mode. Printer ID
     *           should use the returned value from SmartComm_GetDeviceList2.
     * @param   szDev   [in] Printer ID or Dev. This vaue must use one of values which can be got using SmartComm_GetDeviceList2.
     * @param   devType  SMART_OPENDEVICE_BYDESC = 1, SMART_OPENDEVICE_BYID = 0;
     * @param   nOrientation   [in] Orientation of the paper   #define DMORIENT_PORTRAIT 1   #define DMORIENT_LANDSCAPE 2
     * @return  Printer handle will be returned if it is succeed.
     */

    public int jSmartDCL_OpenDevice2(char[] szDev, int devtype, int nOrientation) 
    {

        int thandle[] = new int[1];
        int ret = SmartDCL_OpenDevice2(thandle, szDev, devtype, nOrientation);

        if (ret == SmartCommonConstant.SM_FAIL) {
            return -1;
        }
         String tPrinterID = new String();
         SmartDriver.handle = thandle[0];
       if(devtype==SMART_OPENDEVICE_BYID)
       {
            tPrinterID = new String(szDev);
            char ID[] = new char[256];
            
            tPrinterID.getChars(0, tPrinterID.length(), ID, 0);

            

            if(devtype==SMART_OPENDEVICE_BYID)
            {
                SmartDriver.PrinterID = tPrinterID;
            }
        }
        DeviceInfo = new DeviceInfo();
        DeviceInfo.setHandle(ret);
        DeviceInfo.setID(tPrinterID);
        if (!IsExistsOpenedDevice(tPrinterID)) {
            Opened_DeviceInfo.add(DeviceInfo);
        }
        return SmartDriver.handle;
          
        
    }

    /**
     *          SmartComm_CloseDevice is close command when the use of Smart Printer is finished.
     * @param  hHandle   [in] Smart Printer’s handle which is open by using SmartDCL_OpenDevice.2
     * @return SM_SUCCESS will be returned if it is succeed.
     * @throws IOException
     * @see    If received the handle after success of SmartComm_OpenDevice2, the handle should be returned by
     *          SmartComm_CloseDevice. Especially in case of using the network , the hanlde
     *          Should be returned as soon as it finished its use to use the printer by other users. If the handel is not
     *          returned, the session will be closed after some time later and SmartComm_CloseDevice will be
     *          executed in SmartCommonService. The timeout is defined as CMD_TIMEOUT in
     *          SmartCommonService.ini. CMD_TIMEOUT is setup value by milliseconds and its default is 30 seconds.
     */
 
    public int jSmartComm_CloseDevice(int hHandle)  
    {
        int found_idx = -1;
        DeviceInfo tDeviceInfo = null;
        for (int i = 0; i < Opened_DeviceInfo.size(); i++) {
            tDeviceInfo = (DeviceInfo) Opened_DeviceInfo.get(i);
            if (tDeviceInfo.getHandle() == hHandle) {
                found_idx = i;
                break;
            }
        }
        if (found_idx < 0) {
            ;
//            return SmartCommConstant.SM_FAIL;
        }
        int ret = tDeviceInfo.Close();
        int thandle[] = new int[1];

        thandle[0] = handle;
        
        ret = SmartComm_CloseDevice(handle);
 
        return ret;
    }

    /**
     *          SmartDCL_CloseDevice is close command when the use of Smart Printer is finished.
     * @param  hHandle   [in] Smart Printer’s handle which is open by using SmartDCL_OpenDevice.
     * @return           SmartCommConstant.SM_SUCCESS will be returned if it is succeed.
     * @throws IOException
     */
    
    public int jSmartDCL_CloseDevice(int hHandle)
    {
        int ret =0;
        SmartDCL_CloseDevice(hHandle); 
       return ret;
    }
  
    /**
     *          SmartComm_GetStatus
     * @param hHandle        [in] Handle of Smart Printer
     * @param tpiStatus
     * @return               SmartCommConstant.SM_SUCCESS will be returned when it is succeed.
     * @see   Remarks
     *        Smart Printer’s ribbons have RFID tag so the ribbon type will be recognized automatically. Ribbons type
     *        are defined in SmartComm2.h.
     *        SMART Rewritable Printer not use ribbon but will print by heat the surface of card. However, it will
     *        recognize as using SMART_RIBBON_REWIRTABLE type ribbon.
     * @serialData v1.0
     */
    public int jSmartComm_GetStatus(int hHandle, long[] tpiStatus) {
        // long = 64-bit integer, double-64bit real
        int ret = SmartComm_GetStatus(hHandle, tpiStatus);
        return ret;
    }

    /**
     *          SmartComm_GetStatus
     * @param hHandle        [in] Handle of Smart Printer
     * @return               64 bit value to show the printer's state.
     * @see   Remarks
     *        Smart Printer’s ribbons have RFID tag so the ribbon type will be recognized automatically. Ribbons type
     *        are defined in SmartComm2.dll.h.
     *        SMART Rewritable Printer not use ribbon but will print by heat the surface of card. However, it will
     *        recognize as using SMART_RIBBON_REWIRTABLE type ribbon.
     * @serialData v1.0
     */
    public long jSmartComm_GetStatus(int hHandle) {
//        Object piStatus = new Object();
        long tpiStatus[] = new long[1];
        int ret = SmartComm_GetStatus(hHandle, tpiStatus);
        return tpiStatus[0];
    }
    

    /**
     *         SmartComm_GetRibbonType is for checking the ribbon type installed in Smart Printer.
     * @param hHandle        [in] Handle of Smart Printer
     * @return               SmartCommConstant.SM_SUCCESS will be returned when it is succeed.
     * @see   Remarks
     *        Smart Printer’s ribbons have RFID tag so the ribbon type will be recognized automatically. Ribbons type
     *        are defined in SmartComm2.dll.h.
     *        SMART Rewritable Printer not use ribbon but will print by heat the surface of card. However, it will
     *        recognize as using SMART_RIBBON_REWIRTABLE type ribbon.
     */
    public int jSmartComm_GetRibbonType(int hHandle) {
        int pnRibbonType[] = null;
        pnRibbonType[0] = -1;
        int ret = SmartComm_GetRibbonType(hHandle, pnRibbonType); // (HSMART hHandle, int* pnRibbonType );
        Cmd_status = ret;
        return pnRibbonType[0];
    }

    public int jSmartComm_GetRibbonType(int hHandle, int ribbon_type[]) {
        int ret = SmartComm_GetRibbonType(hHandle, ribbon_type); 
        Cmd_status = ret;
        return ret;
    }
    /**
     *          SmartComm_GetRibbonRemain is for the checking of ribbon remains.
     * @param hHandle [in] Handel of Smart Printer which is open.
     * @return      If value is succeed, SM_SUCCESS will be returned.
     * @see         In Smart Printer, the ribbon’s remains can be managed by RFID tag system. If the ribbon’s remains are
     *        not enough, it can be alarmed and if there is no available remains, change notice can be indicated
     */

    public int jSmartComm_GetRibbonRemain(int hHandle, int ribbon_remain[] ) {
        int ret = SmartComm_GetRibbonRemain(hHandle, ribbon_remain); 
        Cmd_status = ret;
        return ret;
    }

    /**
     *           SmartComm_GetRibbonRemain is for the checking of ribbon remains.
     * @param hHandle [in] Handel of Smart Printer which is open.
     * @return      If value is succeed, SM_SUCCESS will be returned.
     * @see         In Smart Printer, the ribbon’s remains can be managed by RFID tag system. If the ribbon’s remains are
     *        not enough, it can be alarmed and if there is no available remains, change notice can be indicated
     */
    public int jSmartComm_GetRibbonRemain(int hHandle) {
        int pnRibbonRemain[] = null;
        pnRibbonRemain[0] = -1;
        int ret = SmartComm_GetRibbonRemain(hHandle, pnRibbonRemain);   // int* pnRibbonRemain
        Cmd_status = ret;
        return pnRibbonRemain[0];
    }

    /**
     *         SmartComm_ClearStatus can be clear the command when there is error in Smart Printer.
     * @param hHandle
     * @return int If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_ClearStatus(int hHandle) {
        int ret = SmartComm_ClearStatus(hHandle);
        Cmd_status = ret;
        return ret;
    }

  

   
    /**
     *           SmartComm_SBSStart is for converting to SBS (Step-By-Step) mode when Smart Printer is in normal mode.
     * @param   hHandle [in] Handle of Smart Printer which is open.
     * @return          If the vaue is executed normally, SM_SUCCESS will be returned.
     * @see    This SBS mode is to control the operation of Smart Printer per each step. The main difference between
     *          SBS mode and Normal mode is that the printing data through spool is not preceded automatically but it
     *          is preceded by SmartComm_DoPrint command. And to prevent wrong printing, if receive
     *          SmartComm_SBSStart command, the data in spool will be removed. So if you want to develop the
     *          issuance program using SMART Printer SDK, it is recommended to initialize by SmartComm_SBSStart
     *          after SmartComm_OpenDevice2.
     * @serialData v1.0
     */
    public int jSmartComm_SBSStart(int hHandle) {

        int ret = SmartComm_SBSStart(hHandle);
        Cmd_status = ret;
        return ret;
    }

    /**
     *            SmartComm_SBSEnd is for converting to normal mode after finish SBS mode.
     * @param   hHandle [in] Handle of Smart Printer which is open.
     * @return int If the vaue is executed normally, SM_SUCCESS will be returned.
     * @serialData  v1.0
     */
    public int jSmartComm_SBSEnd(int hHandle) {

        int ret = SmartComm_SBSEnd(hHandle);
        Cmd_status = ret;
        return ret;
    }

    /**
     *            SmartComm_CardIn is for inserting one card to inside of printer from hopper.
     * @param   hHandle [in] Handle of Smart Printer which is open.
     * @return If the vaue is executed normally, SM_SUCCESS will be returned.
     * @serialData v1.0
     */
    public int jSmartComm_CardIn(int hHandle) {
        int ret = 0;
        ret = SmartComm_CardIn(hHandle);
        Cmd_status = ret;
        return ret;
    }

    /**
     *             SmartComm_CardOut is for sending the card in inside of printer to stacker.
     * @param   hHandle [in] Handle of Smart Printer which is open.
     * @return          If the vaue is executed normally, SM_SUCCESS will be returned.
     * @serialData v1.0
     */
    public int jSmartComm_CardOut(int hHandle) {
        int ret = SmartComm_CardOut(hHandle);
        Cmd_status = ret;
        return ret;
    }


    /**
     *              SmartComm_Move is for moving the card to some place.
     * {@link URL}. SmartComm_Move is for moving the card to some place.
     * #define CARDPOS_PRINT 0 // Print position
    #define CARDPOS_MAGNETIC 1 // Magnetic encoding position
    #define CARDPOS_IC 2 // Contact smart card encoding position
    #define CARDPOS_RF 3 // Contactless smart card encoding position
    #define CARDPOS_TOROT 4 // From main body to rotator
    #define CARDPOS_FROMROT 5 // From rotator to main body
    #define CARDPOS_RF2 6 // Contactless smart card encoding position 2 (default)
     * @param hHandle [in] Handle of Smart Printer which is open.
     * @param pos   [out] Nominate the card moving position.
     * @return If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_Move(int hHandle, int pos) {
        int ret = SmartComm_Move(hHandle, pos);
        Cmd_status = ret;
        return ret;
    }



    /**
     *         SmartComm_ICHContact is for contacting IC module’s head with IC of card.
     * @param hHandle [in] Handle of Smart Printer which is open.
     * @return If the vaue is executed normally, SM_SUCCESS will be returned.
     * @see    Smart Printer supports 2 contact smart cards encoder. One is the internal encoder for CR-80 size card
     *         and the other is external encoder using SIM slot of printer’s front side. SmartComm_ICHContact is to
     *         move IC head to contact with IC of card. In SIM, if it is inserted, it is contacted.
     *         You need to execute SmartComm_ICHContact for physical contact before connect with contact smart
     *         card. And after disconnect with contact smart card, you have to execute SmartComm_ICHDiscontact to
     *         avoid the physical contact.
     */
    public int jSmartComm_ICHContact(int hHandle) {

        int ret = SmartComm_ICHContact(hHandle);
        Cmd_status = ret;
        return ret;
    }

    /**
     *        SmartComm_ICHDiscontact is for moving IC head to not contact with IC of card after finished IC encoding.
     *
     * @param hHandle Handle of Smart Printer which is open.
     * @return If the vaue is executed normally, SM_SUCCESS will be returned.
     * @see   If you use SmartComm_ICHContact to contact with IC of card, you have to proceed
     *        SmartComm_ICHDiscontact to moving IC head from IC of card. If not, it will be the reason of card
     *        moving problem or other problem.
     */
    public int jSmartComm_ICHDiscontact(int hHandle) {

        int ret = SmartComm_ICHDiscontact(hHandle);
        Cmd_status = ret;
        return ret;
    }

    /**
     *      SmartComm_Rotate is for rotating of card. If receive SmartComm_Rotate, the card is moving to rotator and
     *      it will be rotate 180 degree and return to inside of printer.
     * @param hHandle [in] Handle of Smart Printer which is open.
     * @return        If the vaue is executed normally, SM_SUCCESS will be returned.
     * @see           SmartComm_Rotate is for Smart Printer with rotator option.
     *                 You can check the rotation option by call SmartComm_GerStatus and read the status value.
     * @serialData v1.0
     */

    /**
     *       SmartComm_MagReadAction is for reading the magnetic stripe. If the reading is succeed, you have to
     *     operate SmartComm_MagGetBuffer to bring the data.<p>
     * #define MAG_T1 1 // ISO Track 1<br>
     * #define MAG_T2 2 // ISO Track 2<br>
     * #define MAG_T3 4 // ISO Track 3<br>
     * #define MAG_JIS 8 // JIS Track<br>
     *
     * @param hHandle [in] Handle of Smart Printer which is open.
     * @param nTrackID
     * @return If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_MagReadAction(int hHandle, int nTrackID) {

        int ret = SmartComm_MagReadAction(hHandle, nTrackID);
        Cmd_status = ret;
        return ret;
    }

    /**
     *         SmartComm_MagGetBuffer is for bring the reading data which is executed in SmartComm_MagReadAction.
     * @param hHandle    [in] Handle of Smart Printer which is open.
     * @param nTrackID   [in] Nominate the reading track.
     * @param  pOutBuf   BYTE*[out] Buffer to receive the reading data.
     * @param InOutLen
     * @return If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_MagGetBuffer(int hHandle, int nTrackID, String pOutBuf, int InOutLen) {
        char OutBuf[] = new char[InOutLen];
        int pnInOutLen[] = new int[1];
        pnInOutLen[0] = InOutLen;

        int ret = SmartComm_MagGetBuffer(hHandle, nTrackID, OutBuf, pnInOutLen);
        pOutBuf = new String(OutBuf, 0, InOutLen);
        Cmd_status = ret;
        return ret;
    }

    /**
     *         SmartComm_MagGetAllBuffer is for bring all the reading data which is got by SmartComm_MagReadAction.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @param bGetT1   [in] Track 1 Decide whether read the track buffer or not. If it is TRUE, not read.
     * @param pBufT1   [out] Track 1 Buffer to input the data.
     * @param pnT1Len  [in/out] Track1 Set the buffer size and return the number of reading data.
     * @param bGetT2   [in] Track 2 Decide whether read the track buffer or not. If it is TRUE, not read.
     * @param pBufT2   [out] Track 2 Buffer to input the data.
     * @param  pnT2Len [in/out] Track2 Set the buffer size and return the number of reading data.
     * @param bGetT3   [in] Track 3 Decide whether read the track buffer or not. If it is TRUE, not read.
     * @param pBufT3   [out] Track 3 Buffer to input the data.
     * @param pnT3Len  [in/out] Track3 Set the buffer size and return the number of reading data.
     * @return If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_MagGetAllBuffer(int hHandle, boolean bGetT1, char[] pBufT1, int[] pnT1Len,
            boolean bGetT2, char[] pBufT2, int[] pnT2Len, boolean bGetT3, char[] pBufT3, int[] pnT3Len) 
    {
        int ret = SmartComm_MagGetAllBuffer(hHandle, bGetT1, pBufT1, pnT1Len,
                bGetT2, pBufT2, pnT2Len, bGetT3, pBufT3, pnT3Len);
        Cmd_status = ret;
        return ret;
    }

/**
     *                  SmartComm_MagGetAllBuffer is for bring all the reading data which is got by SmartComm_MagReadAction.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @param bGetT1   [in] Track 1 Decide whether read the track buffer or not. If it is TRUE, not read.
     * @param pBufT1   [out] Track 1 Buffer to input the data.
     * @param pnT1Len  [in/out] Track1 Set the buffer size and return the number of reading data.
     * @param bGetT2   [in] Track 2 Decide whether read the track buffer or not. If it is TRUE, not read.
     * @param pBufT2   [out] Track 2 Buffer to input the data.
     * @param  pnT2Len [in/out] Track2 Set the buffer size and return the number of reading data.
     * @param bGetT3   [in] Track 3 Decide whether read the track buffer or not. If it is TRUE, not read.
     * @param pBufT3   [out] Track 3 Buffer to input the data.
     * @param pnT3Len  [in/out] Track3 Set the buffer size and return the number of reading data.
     * @return If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_MagGetAllBuffer(int hHandle, int bGetT1, char[] pBufT1, int[] pnT1Len,
            int bGetT2, char[] pBufT2, int[] pnT2Len, int bGetT3, char[] pBufT3, int[] pnT3Len) {

        boolean bGetT1_flag, bGetT2_flag, bGetT3_flag;
        if ( bGetT1 == 1 )
            bGetT1_flag = true;
        else bGetT1_flag = false;
        if ( bGetT2 == 1 )
            bGetT2_flag = true;
        else bGetT2_flag = false;
        if ( bGetT3 == 1 )
            bGetT3_flag = true;
        else bGetT3_flag = false;

        int ret = SmartComm_MagGetAllBuffer(hHandle, bGetT1_flag, pBufT1, pnT1Len,
                bGetT2_flag, pBufT2, pnT2Len, bGetT3_flag, pBufT3, pnT3Len);
        Cmd_status = ret;
        return ret;
    }
    /**
     *         SmartComm_MagWriteAction is for writing the buffered data to the magnetic stripe. Before do
     *         SmartComm_MagWriteAction, you have to proceed SmartComm_MagSetBuffer to buffer the data.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @param nTrackID [in] Nominate the writing track.
     * @param bHighCo  [in] Decide to encoding to HiCo magnetic stripe. If it is TRUE, HiCo is used and FALSE is LoCo.
     * @return If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_MagWriteAction(int hHandle, int nTrackID, boolean bHighCo) {

        int ret = SmartComm_MagWriteAction(hHandle, nTrackID, bHighCo);
        Cmd_status = ret;
        return ret;
    }

   /**
     *        SmartComm_MagWriteAction is for writing the buffered data to the magnetic stripe. Before do
     *        SmartComm_MagWriteAction, you have to proceed SmartComm_MagSetBuffer to buffer the data.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @param nTrackID [in] Nominate the writing track.
     * @param bHighCo  [in] Decide to encoding to HiCo magnetic stripe. If it is TRUE, HiCo is used and FALSE is LoCo.
     * @return If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_MagWriteAction(int hHandle, int nTrackID, int bHighCo) {

        boolean HighCo_Flag;
        if ( bHighCo == 1 )
            HighCo_Flag = true;
        else
            HighCo_Flag = false;
        int ret = SmartComm_MagWriteAction(hHandle, nTrackID, HighCo_Flag);
        Cmd_status = ret;
        return ret;
    }
     /**
     *         SmartComm_MagBitModeGetBPI If you record with bit mode, SmartComm_MagBitModeGetBPI will bring accurate BPI.
     * @param nBPI [in] BPI value is recorded by Bit Mode.
     * @param  pNewBPI [out] nBPI value will be brought the accurate value for use.
     * @return If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_MagBitModeGetBPI(int nBPI, int pNewBPI) {

        int ret = SmartComm_MagBitModeGetBPI(nBPI, pNewBPI);
        Cmd_status = ret;
        return ret;
    }

    /**
     *         SmartComm_MagBitModeGetMaxSize
     *         If you record by bit mode, SmartComm_MagBitModeGetMaxSize will bring the maximum data length from BPI.
     * @param nBPI  [in] BPI value is recorded by Bit Mode.
     * @param pnMaxSize
     * @return pnMaxSize  [out] when you use the nBPI, it will bring the maximum bit data length.
     */
    public int jSmartComm_MagBitModeGetMaxSize(int nBPI, int[] pnMaxSize) {
        int ret = SmartComm_MagBitModeGetMaxSize(nBPI, pnMaxSize);
        Cmd_status = ret;
        return pnMaxSize[0];
    }

    /**
     *         SmartComm_MagSetBuffer is for tranfering the data for SmartComm_MagWriteAction.
     * @param hHandle
     * @param nTrackID
     * @param pInBuf
     * @param nLen
     * @return  int If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_MagSetBuffer(int hHandle, int nTrackID, byte[] pInBuf, int nLen) {
        int pnMaxSize = -1;
        int ret = SmartComm_MagSetBuffer(hHandle, nTrackID, pInBuf, nLen);
        Cmd_status = ret;
        return pnMaxSize;
    }

    /**
     *        SmartComm_MagSetAllBuffer
     *        SmartComm_MagSetAllBuffer is for sending all track’s data which is encoded SmartComm_MagWriteAction.
     * @param hHandle
     * @param bSetT1 [in] Track 1 Decide to send the track buffer. If it is TRUE, it is sending.
     * @param pBufT1 [in] Track 1 Buffer to send the data.
     * @param nT1Len Track1 length
     * @param bSetT2 [in] Track 2 Decide to send the track buffer. If it is TRUE, it is sending.
     * @param pBufT2 [in] Track 2 Buffer to send the data.
     * @param nT2Len Track2 length
     * @param bSetT3 [in] Track 3 Decide to send the track buffer. If it is TRUE, it is sending..
     * @param pBufT3 [in] Track 3 Buffer to send the data.
     * @param nT3Len Track3 length
     * @return  int If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_MagSetAllBuffer(int hHandle, 
            boolean bSetT1, char[] pBufT1, int nT1Len, 
            boolean bSetT2, char[] pBufT2, int nT2Len, 
            boolean bSetT3, char[] pBufT3, int nT3Len) {
        int ret = SmartComm_MagSetAllBuffer(hHandle, bSetT1, pBufT1, nT1Len, bSetT2,
                pBufT2, nT2Len, bSetT3, pBufT3, nT3Len);
        Cmd_status = ret;
        return ret;
    }

   
    /**
     *         SmartComm_MagGetCryptoBuffer
     *         SmartComm_MagGetCryptoBuffer is for bring the data which is read at SmartComm_MagReadAction by using AES128 encrypted algorithm.
     * @param hHandle
     * @param nTrackID    [in] Nominate the reading track.
     * @param pOutBuf     [out] Buffer to input the reading data.
     * @param pnInOutLen  [in/out] Set the buffer size and return the number of reading data.
     * @param pKey
     * @return  int       If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_MagGetCryptoBuffer(int hHandle, int nTrackID, byte[] pOutBuf,
            int[] pnInOutLen, char[] pKey) {
        int pnMaxSize = -1;
        int ret = SmartComm_MagGetCryptoBuffer(hHandle, nTrackID, pOutBuf, pnInOutLen, pKey);
        Cmd_status = ret;
        return ret;
    }

    /**
     *         SmartComm_MagGetAllCryptoBuffer is for bring all the encrypted track data
     *         which is read at SmartComm_MagReadAction by using AES128.
     * @param hHandle [in] Handle of Smart Printer which is open.
     * @param bGetT1 [in] Track 1 Decide wheter read the track buffer. If it is TRUE, reading.
     * @param pBufT1 [out] Track 1 Buffer to input the data.
     * @param pnT1Len [in/out] Track1 Set the buffer size and return the number of the reading data.
     * @param bGetT2 [in] Track 2 Decide wheter read the track buffer. If it is TRUE, reading.
     * @param pBufT2 [out] Track 2 Buffer to input the data.
     * @param pnT2Len [in/out] Track2 Set the buffer size and return the number of the reading data.
     * @param bGetT3 [in] Track 3 Decide wheter read the track buffer. If it is TRUE, reading.
     * @param pBufT3 [out] Track 3 Buffer to input the data.
     * @param pnT3Len [in/out] Track3 Set the buffer size and return the number of the reading data.
     * @param pKey [in] Nominate the code key to use.
     * @return  int If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_MagGetAllCryptoBuffer(int hHandle, boolean bGetT1,
            char[] pBufT1, int[] pnT1Len, boolean bGetT2, char[] pBufT2, int[] pnT2Len,
            boolean bGetT3, char[] pBufT3, int[] pnT3Len, char[] pKey) {
        int ret = SmartComm_MagGetAllCryptoBuffer(hHandle, bGetT1,
                pBufT1, pnT1Len, bGetT2, pBufT2, pnT2Len,
                bGetT3, pBufT3, pnT3Len, pKey);
        Cmd_status = ret;
        return ret;
    }

    /**
     *         SmartComm_MagSetCryptoBuffer is for sending that encryped data which is writed at
     *         SmartComm_MagWriteAction by AES128.
     * @param hHandle [in] Handle of Smart Printer which is open.
     * @param nTrackID [in] Nominate the writing track.
     * @param pInBuf [in] Buffer to send the writing data.
     * @param nInLen
     * @param pKey [in] Nominate the code key.
     * @return  int If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_MagSetCryptoBuffer(int hHandle, int nTrackID, byte[] pInBuf, int nInLen, char[] pKey) {
        int ret = SmartComm_MagSetCryptoBuffer(hHandle, nTrackID, pInBuf, nInLen, pKey);
        Cmd_status = ret;
        return ret;
    }

    /**
     *        SmartComm_MagSetAllCryptoBuffer is for tranferring the encrypted data
     *        which will be encoded at SmartComm_MagWriteAction by AES128.
     * @param hHandle [in] Handle of Smart Printer which is open.
     * @param bSetT1  [in] Track 1 Decide wheter send the track buffer. If it is TRUE, sending.
     * @param pBufT1  [in] Track 1 Buffer to send the data.
     * @param pnT1Len [in] Data length of track 1.
     * @param bSetT2  [in] Track 2 Decide wheter send the track buffer. If it is TRUE, sending.
     * @param pBufT2  [in] Track 2 Buffer to send the data.
     * @param pnT2Len [in] Data length of track 2.
     * @param bSetT3  [in] Track 3 Decide wheter send the track buffer. If it is TRUE, sending.
     * @param pBufT3  [in] Track 3 Buffer to send the data.
     * @param pnT3Len [in] Data length of track 3.
     * @param pKey    [in] Nominate the code key.
     * @return  int If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_MagSetAllCryptoBuffer(int hHandle, boolean bSetT1, char[] pBufT1, int pnT1Len, boolean bSetT2,
            char[] pBufT2, int pnT2Len, boolean bSetT3, char[] pBufT3, int pnT3Len, char[] pKey) {
        int ret = SmartComm_MagSetAllCryptoBuffer(hHandle, bSetT1, pBufT1, pnT1Len, bSetT2,
                pBufT2, pnT2Len, bSetT3, pBufT3, pnT3Len, pKey);
        Cmd_status = ret;
        return ret;
    }

    /**
     *         SmartComm_OpenDocument is for printing the CSD file which is made in Smart Design program provided.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @param szCSDName [in] Name of CSD file
     * @return  int If the vaue is executed normally, SM_SUCCESS will be returned.
     * @serialData v1.0
     */
    public int jSmartComm_OpenDocument(int hHandle, char szCSDName[]) {
        int ret = SmartComm_OpenDocument(hHandle, szCSDName);
        Cmd_status = ret;
        return ret;
    }

    /**
     *         SmartComm_OpenDocument is for printing the CSD file which is made in Smart Design program provided.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @param CSDName [in] Name of CSD file
     * @return  int If the vaue is executed normally, SM_SUCCESS will be returned.
     * @serialData v1.0
     */
    
    public int jSmartComm_OpenDocument(int hHandle, String CSDName) {
        char szCSDNames[] = new char[1024];
        CSDName.getChars(0, CSDName.length(), szCSDNames, 0);
        //szCSDNames = CSDName.toCharArray();
        int ret = SmartComm_OpenDocument(hHandle, szCSDNames);
        Cmd_status = ret;
        return ret;
    }

    /**
     *         SmartComm_CloseDocument is for finishing the CSD file.
     * @param hHandle
     * @return  int If the vaue is executed normally, SM_SUCCESS will be returned.
     * @serialData v1.0
     */
    public int jSmartComm_CloseDocument(int hHandle) {
        int ret = SmartComm_CloseDocument(hHandle);
        Cmd_status = ret;
        return ret;
    }
    /**
     *         SmartComm_GetPrinterSettings is for bring the printing setup value of Smart Printer. The printing setup
     *         value is including all value which can be changed in the pritner proerties of Windows controll board.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @param pDm
     * @return int If the vaue is executed normally, SM_SUCCESS will be returned.
     * @serialData v1.0
     */
    public int jSmartComm_GetPrinterSettings(int hHandle, CHASM_DEVMODE pDm) {

        int ret = SmartComm_GetPrinterSettings(hHandle, pDm);
        Cmd_status = ret;
        return ret;
    }
    
    /**
     *       SmartComm_SetPrinterSettings is for setting the printer setup value. The printing setup value is
     *      including all value which can be changed in the printer?셲 properties of Windows controll board.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @param pDm
     * @return int If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_SetPrinterSettings(int hHandle, CHASM_DEVMODE pDm) {
        int ret = SmartComm_SetPrinterSettings(hHandle, pDm);
        Cmd_status = ret;
        return ret;
    }
    
    /**
     *         SmartComm_DrawImage is for printing the image directly not using CSD file.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @param page     [in] Set the printed side. (Front : 0, Back : 1)
     * @param panel    [in] Set the image’s printing type among color, resin, overlay.
     * @param x        [in] Image’s X axis starting position. Left side is 0 and max is 1027.
     * @param y        [in] Image’s Y axis starting position. Up side is 0 and max is 635.
     * @param cx       [in] It means the width when the image is scaling. 0 is image’s original size.
     * @param cy       [in] It means the height when the image is scaling. 0 is original size.
     * @param szImgPath  [in] Set the image file’s location.
     * @param prcArea    [out] Return value where is printed the image on the card.
     * @return int If the vaue is executed normally, SM_SUCCESS will be returned.
     *
     * @see           In case of using SmartComm_DrawImage in local, the image file is used direclty
     *                 but if use it in network, the image file will be tranfer by temporary file and print it.
     *                 Temporary file is default and save at C:\SMARTSERVER\tmp\.
     *                 If SmartCommonService is execute, it is deleted. Panel to print is defined
     *                 at SmartComm2.dll.h.
     * #define PANELID_COLOR 1 // Color panel which use YMC
     * #define PANELID_BLACK 2 // Black panel which use Resin
     * #define PANELID_OVERLAY 4 // Transparency panel which use Overlay
     * #define PANELID_UV 8 // Transparency panel which use Fluorescent
     *                 In the DCL Mode, if CSD fie is opened by SmartComm_OpenDocument or print data is added by
     *                 SmartComm_DrawXXX, the data which is drawn in SMART SURFACE DC will be ignored.
     * @serialData  v1.0
     */
    public int jSmartComm_DrawImage(int hHandle, byte page, byte panel, int x, int y, int cx, int cy,
            char[] szImgPath, RECT prcArea) {
        int rect[] = new int[32];
        int ret = SmartComm_DrawImage(hHandle, page, panel, x, y, cx, cy, szImgPath, prcArea);
        Cmd_status = ret;
        return ret;
    }

    /**
     *         SmartCommEx_DrawImage is for printing the image directly not using CSD file.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @param page     [in] Set the printed side. (Front : 0, Back : 1)
     * @param panel    [in] Set the image’s printing type among color, resin, overlay.
     * @param x        [in] Image’s X axis starting position. Left side is 0 and max is 1027.
     * @param y        [in] Image’s Y axis starting position. Up side is 0 and max is 635.
     * @param cx       [in] It means the width when the image is scaling. 0 is image’s original size.
     * @param cy       [in] It means the height when the image is scaling. 0 is original size.
     * @param nScaleMethod  [in] decide to image maximize/minimize in the frame.
     *               #define IMGSCALE_FITHORZ 0x00 // hold the width x vertical rate and range will be matched cx.
     *               #define IMGSCALE_FITVERT 0x01 // hold width x vertical rate and height will be matched cy.
     *               #define IMGSCALE_FITFRAME 0x02 // without hold the size, range and height will be matched cx,cy.
     * @param nAlign [in] decide the image alignment in the frame.
     *               #define OBJ_ALIGN_LEFT 0x00 // left alignment, match with left side in the frame.
     *               #define OBJ_ALIGN_CENTER 0x01 // center alignment, match with center in the frame.
     *               #define OBJ_ALIGN_RIGHT 0x02 // right alignment, match with right side in the frame.
     *               #define OBJ_ALIGN_TOP 0x00 // top alignment, match with upper side in the frame.
     *               #define OBJ_ALIGN_MIDDLE 0x10 //middle alignment, match with middle in the frame.
     *               #define OBJ_ALIGN_BOTTOM 0x20 // bottom alignment, match with bottom in theframe.
     * @param szImgPath [in] Set the image file’s location.
     * @param prcArea [out] Return value where is printed the image on the card.
     * @return int If the vaue is executed normally, SM_SUCCESS will be returned.
     * @see SmartCommEx_DrawImage does not support to network.
     *      Panel to print is defined at SmartCommon2.dll.h.
     *      #define PANELID_COLOR 1 // Color panel which use YMC
     *      #define PANELID_BLACK 2 // Black panel which use Resin
     *      #define PANELID_OVERLAY 4 // Transparency panel which use Overlay
     *      #define PANELID_UV 8 // Transparency panel which use Fluorescent
     *      When the csd file is opened by SmartComm_OpenDocument under DCL mode or add some printing
     *      datas with SmartComm_DrawXXX, the datas on DC of SMART_SURFACE which is drawn by user, is ignored.
     */
    public int jSmartCommEx_DrawImage(int hHandle, byte page, byte panel, int x, int y,
            int cx, int cy, int nScaleMethod, byte nAlign, char szImgPath[], RECT prcArea) {

        int ret = SmartCommEx_DrawImage(hHandle, page, panel, x, y, cx, cy, nScaleMethod, nAlign, szImgPath, prcArea);
        Cmd_status = ret;
        return ret;
    }

    /**
     *         SmartComm_DrawText is for printing the text without using CSD file.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @param page     [in] Decide the text printing side. (Front : 0, Back : 1)
     * @param panel    [in] Decide the text printing type among color, resin, overlay.
     * @param x        [in] Text’s X axis starting position. Left side is 0 and max is 1027.
     * @param y        [in] Text’s Y axis starting position. Up side is 0 and max is 635.
     * @param szFontName [in] Font name to use for the text printing.
     * @param nFontSize
     * @param nFontStyle  [in] Font type to use for the text printing.
     * @param szText   [in] The text contents to print.
     * @param prcArea  [out] The return value where the text is printed on the card.
     * @return int If the vaue is executed normally, SM_SUCCESS will be returned.
     * @serialData  v1.0
     */
    public int jSmartComm_DrawText(int hHandle, byte page, byte panel, int x, int y,
            char[] szFontName, int nFontSize, byte nFontStyle, char[] szText, RECT prcArea) {

        int ret = SmartComm_DrawText(hHandle, page, panel, x, y, szFontName, nFontSize, nFontStyle, szText, prcArea);
        Cmd_status = ret;
        return ret;
    }
   
    /**
     *         SmartComm_DrawText is for printing the text without using CSD file.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @param page     [in] Decide the text printing side. (Front : 0, Back : 1)
     * @param panel    [in] Decide the text printing type among color, resin, overlay.
     * @param x        [in] Text’s X axis starting position. Left side is 0 and max is 1027.
     * @param y        [in] Text’s Y axis starting position. Up side is 0 and max is 635.
     * @param szFontName [in] Font name to use for the text printing.
     * @param nFontSize
     * @param nFontStyle  [in] Font type to use for the text printing.
     * @param szText   [in] The text contents to print.
     * @return RECT   If the vaue is executed normally, RECT class will be returned.
     * @serialData  v1.0
     * @return RECT The return value where the text is printed on the card.
     */
    public RECT jSmartComm_DrawText(int hHandle, byte page, byte panel, int x, int y,
            char[] szFontName, int nFontSize, byte nFontStyle, char[] szText) {
        RECT prcArea = new RECT();
        int ret = SmartComm_DrawText(hHandle, page, panel, x, y, szFontName, nFontSize, nFontStyle, szText, prcArea);
        Cmd_status = ret;
        return prcArea;
    }

    /**
     *         SmartComm_DrawRect is for printing the rectangle without using CSD file.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @param page     [in] Decide the rectangle’s printing side. (Front : 0, Back : 1)
     * @param panel    [in] Decide the rectangle printing type among color, resin, overlay.
     * @param x        [in] Rectangle’s X axis starting position. Left side is 0 and max is 1027.
     * @param y        [in] Text’s Y axis starting position. Up side is 0 and max is 635.
     * @param cx       [in] Width of rectangle.
     * @param cy       [in] Height of rectangle.
     * @param col      [in] Color of rectangle.
     * @param prcArea  [out] The return value where the rectangle is printed on the card.
     * @return int     If the vaue is executed normally, SM_SUCCESS will be returned.
     * @serialData v1.0
     */
    public int jSmartComm_DrawRect(int hHandle, byte page, byte panel, int x, int y, int cx, int cy, int col, RECT prcArea) {
        int ret = SmartComm_DrawRect(hHandle, page, panel, x, y, cx, cy, col, prcArea);
        Cmd_status = ret;
        return ret;
    }

    /**
     *         SmartComm_DrawRect is for printing the rectangle without using CSD file.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @param page     [in] Decide the rectangle’s printing side. (Front : 0, Back : 1)
     * @param panel    [in] Decide the rectangle printing type among color, resin, overlay.
     * @param x        [in] Rectangle’s X axis starting position. Left side is 0 and max is 1027.
     * @param y        [in] Text’s Y axis starting position. Up side is 0 and max is 635.
     * @param cx       [in] Width of rectangle.
     * @param cy       [in] Height of rectangle.
     * @param col      [in] Color of rectangle.
     * @return RECT     If the vaue is executed normally, RECT class will be returned.
     * @serialData v1.0
     */
    public RECT jSmartComm_DrawRect(int hHandle, byte page, byte panel, int x, int y, int cx, int cy, int col) {
        RECT prcArea = new RECT();
        int ret = SmartComm_DrawRect(hHandle, page, panel, x, y, cx, cy, col, prcArea);
        Cmd_status = ret;
        return prcArea;
    }

    /**
     *         SmartComm_Print is for sending the printing data to spool.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @return int If the vaue is executed normally, SM_SUCCESS will be returned.
     * @see   If SmartComm_Print is execute when Smart Printer is normal mode, one card is in and print and out
     *         same as general program. However in SBS mode, it will be transfer to the spool of Smart Printer.
     *         If add SmartComm_DoPrint, it can be printed in SBS mode.
     * @serial v1.0
     */
    public int jSmartComm_Print(int hHandle) {
        int ret = SmartComm_Print(hHandle);
        Cmd_status = ret;
        return ret;
    }

    /**
     *         SmartDCL_Print is for sending the printing data to printer directly.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @param nPrintSide [in] Print side.<br>
     *     #define SMART_PRINTSIDE_FRONT 0 // Print front side only.<br>
     *     #define SMART_PRINTSIDE_BOTH 1 // Print both side.<br>
     * @return int If the vaue is executed normally, SM_SUCCESS will be returned.
     * @see When you do not set SBS mode, the SMART printer feed a card from hopper and print image and eject<br>
     *      the card as like normal printer. But the SMART printer just keep the image data in the printer buffer until<br>
     *      receive SmartComm_DoPrint command in the SBS mode.<br>
     *      If you draw using SmartComm_DrawXXX, the direct drawing data in SMART_SURFACE will be ignored.
     * @serialData v1.0
     */
    public int jSmartDCL_Print(int hHandle, int nPrintSide) {
        int ret = SmartDCL_Print(hHandle, nPrintSide);
        Cmd_status = ret;
//        ret = 0;
        return ret;
    }

    /**
     *         SmartComm_DoPrint is for printing the data in spool in SBS mode.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @return int If the vaue is executed normally, SM_SUCCESS will be returned.
     * @serialData v1.0
     */
    public int jSmartComm_DoPrint(int hHandle) {
        int ret = SmartComm_DoPrint(hHandle);
        Cmd_status = ret;
        return ret;
    }

    /**
     *         SmartComm_IsBackEnable command will check the back side is activated or not.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @param pbEnabled  [out] check the back side which is activated or not.
     * @return int If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_IsBackEnable(int hHandle, boolean[] pbEnabled) {
        int ret = SmartComm_IsBackEnable(hHandle, pbEnabled);
        Cmd_status = ret;
        return ret;
    }

    /**
     *        SmartComm_ICPowerOn is for operating the contactless smart card by power in.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @param nDev     [in] Number to distinguish the device (1: Internal, 2: External)
     * @param pdwOutLen [out] Length of contactless smart card’s chip serial number
     * @param pOutBuf  [out] Return the contactless smart card’s chip serial number
     * @return int If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_ICPowerOn(int hHandle, int nDev, long[] pdwOutLen, byte[] pOutBuf) {
        int ret = SmartComm_ICPowerOn(hHandle, nDev, pdwOutLen, pOutBuf);
        Cmd_status = ret;
        return ret;
    }

    /**
     *         SmartComm_ICPowerOff is for stopping the use of contactless smart card.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @param nDev     [in] Number to distinguish the device (1: Internal, 2: External)
     * @return int If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_ICPowerOff(int hHandle, int nDev) {
        int ret = SmartComm_ICPowerOff(hHandle, nDev);
        Cmd_status = ret;
        return ret;
    }


    /**
     *         SmartComm_ICInput is for sending APDU command set to contactless smart card.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @param nDev     [in] Number to distinguish the device (1: Internal, 2: External)
     * @param dwInLen  [in] Input buffer’ size
     * @param pInBuf   [in] Input buffer
     * @param pdwOutLen  [in/out] Size of reading data and its output buffer
     * @param pOutBuf  [out] Output buffer of reading data
     * @return int If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_ICInput(int hHandle, int nDev, long dwInLen, byte[] pInBuf, long[] pdwOutLen, byte[] pOutBuf) {

        int ret = SmartComm_ICInput(hHandle, nDev, dwInLen, pInBuf, pdwOutLen, pOutBuf);
        Cmd_status = ret;
        return ret;
    }

    /**
     *         SmartComm_ICOutput is for sending APDU command set to contactless smart card.
     * @param hHandle  [in] Handle of Smart Printer which is open.
     * @param nDev     [in] Number to distinguish the device (1: Internal, 2: External)
     * @param dwInLen  [in] Input buffer’ size
     * @param pInBuf   [in] Input buffer
     * @param pdwOutLen  [in/out] Size of reading data and its output buffer
     * @param pOutBuf  [out] Output buffer of reading data
     * @return int If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int jSmartComm_ICOutput(int hHandle, int nDev, long dwInLen, byte[] pInBuf, long[] pdwOutLen, byte[] pOutBuf) {

        int ret = SmartComm_ICOutput(hHandle, nDev, dwInLen, pInBuf, pdwOutLen, pOutBuf);
        Cmd_status = ret;
        return ret;
    }


    /**
     *         get Opened Device handle at index i
     * @param i
     * @return    int If the vaue is executed normally, SM_SUCCESS will be returned.
     */
    public int getOpenedDevicehandle(int i) {
        if (Opened_DeviceInfo.isEmpty()) {
            return -1;
        }
        DeviceInfo = (DeviceInfo) Opened_DeviceInfo.elementAt(i);
        return DeviceInfo.handle;
    }

    /**
     *              get Printer ID name from DeviceList saved after SmartComm_GetDeviceList is called.
     * @param i    slot no in Device List Array from 0
     * @return              String
     */
    public static String getDeviceListID(int i) {
        if (DeviceList.isEmpty()) {
            return null;
        }
        String aaa = DeviceList.elementAt(i).toString();
        return aaa;
    }
 
    /**
     *         Copy char Array to String until null
     * @param charArray [in] char type array
     * @return String until null char.
     */
    public static String CopyUntilNull(char charArray[]) {
        int i = 0;
        for (i = 0; i < charArray.length; i++) {
            if (charArray[i] == 0x00) {
                break;
            }
        }
        String sid = new String(charArray, 0, i);
        return sid;
    }

    /**
     *         Copy char Array to String until null or space
     * @param tstr input string
     * @return String until null of space character
     */
    public static String CopyUntilNullOrSpace(String tstr) {
        int i = 0;
        for (i = 0; i < tstr.length(); i++) {
            if (tstr.charAt(i) == 0x00 || tstr.charAt(i) == 0x20) {
                break;
            }
        }
        String sid = new String();
        sid = tstr.substring(0, i + 1);
        return sid;
    }

    /**
     *         check if ID of Printer Name is opened
     * @param ID
     * @return boolean
     */
    public static boolean IsExistsOpenedDevice(String ID) {
        int found_idx = -1;
        DeviceInfo tDeviceInfo = null;
        for (int i = 0; i < Opened_DeviceInfo.size(); i++) {
            tDeviceInfo = (DeviceInfo) Opened_DeviceInfo.get(i);
            if (tDeviceInfo.getID().compareTo(ID) == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     *          Class local method for closing all opened device
     * @return 0 always
     */
    public int Clear_Opened_DeviceInfo() {
        int ret;
        DeviceInfo tDeviceInfo = null;
        for (int i = 0; i < Opened_DeviceInfo.size(); i++) {
            tDeviceInfo = (DeviceInfo) Opened_DeviceInfo.get(i);
            ret = SmartComm_CloseDevice(tDeviceInfo.getHandle());
        }
        Opened_DeviceInfo.removeAllElements();
        return 0;
    }




     /**
     *         jSmartComm_GetDeviceInfo2 is for collecting device information
     * @param devInfo   [out] Smart printer infomation
     * @param szdev     [in]  Printer ID or Description
     * @param devtype   [in]  0 = id, 1 = description
     * @return int If the vaue is executed normally, SM_SUCCESS will be returned.
     */
   
    public int jSmartComm_GetDeviceInfo2(SmartPrinterInfo devInfo, char[] szdev, int devtype){

        int ret = 0;
        char[]  name    = new char[256];                         // printer name
        char[]	id      = new char[256];			// printer ID
        char[]	dev     = new char[256];			// device connection
        int []  dev_type = new int[1];                               // 1=USB, 2=NET
        int []	pid     = new int[1];                                            // USB product ID
        char[]    usbport        = new char[256];		// usb port
        char[]    link          = new char[256];		//symbolic link of usb port
        int []	is_bridge   = new int[1];                                      // Network module bridge
        char[]	ver     = new char[256];			// version of network protocol
        char[] 	ip      = new char[256];			// ip address
        int []	tcpport = new int[1];                                	// tcp port
        int []	is_ssl  = new int[1];                 			// ssl protocol
        int []	is_dual = new int[1];                                        // dual printer
        char[]	ic1     = new char[256];			// internal contact encoder
        char[]	ic2     = new char[256];			// external contact SIM encoder
        char[]	rf1     = new char[256];			// internal contactless encoder
        char[]	rf2     = new char[256];			// external contactless encoder

        ret = SmartComm_GetDeviceInfo2( szdev,
                                     devtype,
                                     name,                   // printer name
                                     id,			// printer ID
                                     dev,			// device connection
                                     dev_type, 		// 1=USB, 2=NET
                                     pid,			// USB product ID
                                     usbport,		// usb port
                                    link,			// symbolic link of usb port
                                    is_bridge,             	// Network module bridge
                                    ver,			// version of network protocol
                                    ip,			// ip address
                                    tcpport,		// tcp port
                                    is_ssl,			// ssl protocol
                                    is_dual,                // dual printer
                                    ic1,			// internal contact encoder
                                    ic2,			// external contact SIM encoder
                                    rf1,			// internal contactless encoder
                                    rf2			// external contactless encoder
         );
        //devInfo.name = new char (name);
        System.arraycopy(name, 0, devInfo.name, 0, name.length);
        System.arraycopy(id, 0, devInfo.id, 0, id.length);
        System.arraycopy(dev, 0, devInfo.dev, 0, dev.length);
        devInfo.dev_type[0] = dev_type[0];
        devInfo.pid[0] = pid[0];
        System.arraycopy(usbport, 0, devInfo.usbport, 0, usbport.length);
        System.arraycopy(link, 0, devInfo.link, 0, link.length);
        devInfo.is_bridge[0] = is_bridge[0];
        System.arraycopy(ver, 0, devInfo.ver, 0, ver.length);
        System.arraycopy(ip, 0, devInfo.ip, 0, ip.length);
        devInfo.tcpport[0] = tcpport[0];
        devInfo.is_ssl[0] = is_ssl[0];
        devInfo.is_dual[0] = is_dual[0];
        System.arraycopy(ic1, 0, devInfo.ic1, 0, ic1.length);
        System.arraycopy(ic2, 0, devInfo.ic2, 0, ic1.length);
        System.arraycopy(rf1, 0, devInfo.rf1, 0, ic1.length);
        System.arraycopy(rf2, 0, devInfo.rf2, 0, ic1.length);
        

        return ret;
    }
    //////////////////////////The end of addition by Kyle////////////////////////////

}
