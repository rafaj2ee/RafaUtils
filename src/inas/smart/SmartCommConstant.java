package inas.smart;

/**
 *
 * @author yun
 */
public class SmartCommConstant {

    /**
     * The '<em><b>SM_SUCCESS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <br>
     * This is used to indicate that If SmartDriver command is executed normally, SM_SUCCESS will be returned.
     * </p>
     * <!-- end-user-doc -->
     * @see #SM_SUCCESS_LITERAL
     * @model name="SM_SUCCESS"
     * @generated
     * @ordered
     */
    public static final int SM_SUCCESS = 0;
    /**
     * The '<em><b>SM_FAIL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <br>
     * This is used to indicate that If SmartDriver command failed, SM_FAIL will be returned.
     * </p>
     * <!-- end-user-doc -->
     * @see #SM_FAIL_LITERAL
     * @model name="SM_FAIL"
     * @generated
     * @ordered
     */
    public static final int SM_FAIL = -1;
    /**
     * there is no device to use.<br>
     * SM_F_FOUNDNODEV = 0x80000000
     */
    public static final int SM_F_FOUNDNODEV = 0x80000000; // there is no device to use.
    /**
     * index of device is out of bound.<br>
     * SM_F_INVALIDDEVIDX = 0x80000001
     */
    public static final int SM_F_INVALIDDEVIDX = 0x80000001; // index of device is out of bound.
    /**
     * invalid buffer pointer. (may be null)<br>
     * SM_F_INVALIDBUFPOINTER = 0x80000002
     */
    public static final int SM_F_INVALIDBUFPOINTER = 0x80000002; // invalid buffer pointer. (may be null)
    /**
     * not exist device. (not connected device)<br>
     * M_F_NOTEXISTDEV = 0x80000003
     */
    public static final int SM_F_NOTEXISTDEV = 0x80000003; // not exist device. (not connected device)
    /**
     * einvalid parameter value.<br>
     * SM_F_INVALIDPARAM = 0x80000004
     */
    public static final int SM_F_INVALIDPARAM = 0x80000004; // invalid parameter value.
    /**
     * device open failed.<br>
     * SM_F_DEVOPENFAILED = 0x80000005
     */
    public static final int SM_F_DEVOPENFAILED = 0x80000005; // device open failed.
    /**
     * device io operation is failed.<br>
     * SM_F_DEVIO = 0x80000006
     */
    public static final int SM_F_DEVIO = 0x80000006; // device io operation is failed.
    /**
     * enot found driver or cannot acquire DEVMODE<br>
     * M_F_FOUNDNODRV = 0x80000007
     */
    public static final int SM_F_FOUNDNODRV = 0x80000007; // not found driver or cannot acquire DEVMODE
// from driver.
    /**
     * invalid handle value.<br>
     * SM_F_INVALIDHANDLE = 0x80000008
     */
    public static final int SM_F_INVALIDHANDLE = 0x80000008; // invalid handle value.
    /**
     * card is already inside of device.<br>
     * M_F_CARDISINSIDE = 0x80000009
     */
    public static final int SM_F_CARDISINSIDE = 0x80000009; // card is already inside of device.
    /**
     * no card is inside of device.<br>
     * SM_F_NOCARDISINSIDE = 0x8000000A
     */
    public static final int SM_F_NOCARDISINSIDE = 0x8000000A; // no card is inside of device.
    /**
     * no cards are in hopper.<br>
     * SM_F_HOPPEREMPTY = 0x8000000B
     */
    public static final int SM_F_HOPPEREMPTY = 0x8000000B; // no cards are in hopper.
    /**
     * no card both hopper and inside of printer.<br>
     * SM_F_NOCARDONBOTH = 0x8000000C
     */
    public static final int SM_F_NOCARDONBOTH = 0x8000000C; // no card both hopper and inside of printer.
    /**
     * timeout occured while wait...<br>
     * SM_F_WAITTIMEOUT = 0x8000000D
     */
    public static final int SM_F_WAITTIMEOUT = 0x8000000D; // timeout occured while wait...
    /**
     * case is opened.<br>
     * SM_F_CASEOPEN = 0x8000000E
     */
    public static final int SM_F_CASEOPEN = 0x8000000E; // case is opened.
    /**
     * current status has error flag.<br>
     * SM_F_ERRORSTATUS = 0x8000000F
     */
    public static final int SM_F_ERRORSTATUS = 0x8000000F; // current status has error flag.
    /**
     * card-in action is failed.<br>
     * SM_F_CARDIN = 0x80000010
     */
    public static final int SM_F_CARDIN = 0x80000010;  // card-in action is failed.
    /**
     * card-out action is failed.<br>
     * SM_F_CARDOUT = 0x80000011
     */
    public static final int SM_F_CARDOUT = 0x80000011; // card-out action is failed.
    /**
     * card-back-out action is failed.<br>
     * SM_F_CARDOUTBACK = 0x80000012
     */
    public static final int SM_F_CARDOUTBACK = 0x80000012; // card-back-out action is failed.
    /**
     * card move (to magnetic) is failed.<br>
     * SM_F_MOVE2MAG = 0x80000013
     */
    public static final int SM_F_MOVE2MAG = 0x80000013; // card move (to magnetic) is failed.
    /**
     * card move (to IC) is failed.<br>
     * M_F_MOVE2IC = 0x80000014
     */
    public static final int SM_F_MOVE2IC = 0x80000014; // card move (to IC) is failed.
    /**
     * card move (to RF) is failed.<br>
     * SM_F_MOVE2RF = 0x80000015
     */
    public static final int SM_F_MOVE2RF = 0x80000015; // card move (to RF) is failed.
    /**
     * card move (to Rotator) is failed.<br>
     * SM_F_MOVE2ROT = 0x80000016
     */
    public static final int SM_F_MOVE2ROT = 0x80000016; // card move (to Rotator) is failed.
    /**
     * ecard move (from Rotator) is failed.<br>
     * SM_F_MOVE2DEV = 0x80000017
     */
    public static final int SM_F_MOVE2DEV = 0x80000017; // card move (from Rotator) is failed.
    /**
     * magnetic read/write is failed,<br>
     * SM_F_MAGRW = 0x80000018
     */
    public static final int SM_F_MAGRW = 0x80000018; // magnetic read/write is failed,
    /**
     * printer failed to receive print data.<br>
     * SM_F_NOPRINTDATA = 0x80000019
     */
    public static final int SM_F_NOPRINTDATA = 0x80000019; // printer failed to receive print data.
    /**
     * print failed.<br>
     * SM_F_PRINT = 0x8000001A
     */
    public static final int SM_F_PRINT = 0x8000001A; // print failed.
    /**
     * seek-ribbon is failed.<br>
     * SM_F_SEEKRIBBON = 0x8000001B
     */
    public static final int SM_F_SEEKRIBBON = 0x8000001B; // seek-ribbon is failed.
    /**
     * move-ribbon is failed.<br>
     * SM_F_RSM_F_MOVERIBBON = 0x8000001C
     */
    public static final int SM_F_MOVERIBBON = 0x8000001C; // move-ribbon is failed.
    /**
     * ribbon is empty.<br>
     * SM_F_EMPTYRIBBON = 0x8000001D
     */
    public static final int SM_F_EMPTYRIBBON = 0x8000001D; // ribbon is empty.
    /**
     * ic-head up failed.<br>
     * SM_F_ICHUP = 0x8000001E
     */
    public static final int SM_F_ICHUP = 0x8000001E; // ic-head up failed.
    /**
     * ic-head down failed.<br>
     * SM_F_ICHDN = 0x8000001F
     */
    public static final int SM_F_ICHDN = 0x8000001F; // ic-head down failed.
    /**
     * rotate to top is failed.<br>
     * SM_F_ROTTOP = 0x80000020
     */
    public static final int SM_F_ROTTOP = 0x80000020; // rotate to top is failed.
    /**
     * rotate to bottom is failed.<br>
     * SM_F_ROTBOTTOM = 0x80000021
     */
    public static final int SM_F_ROTBOTTOM = 0x80000021; // rotate to bottom is failed.
    /**
     * requested no magnetic track.<br>
     * SM_F_REQNOMAGTRACK = 0x80000022
     */
    public static final int SM_F_REQNOMAGTRACK = 0x80000022; // requested no magnetic track.
    /**
     * requested two or more magnetic tracks in<br>
     * SM_F_REQMULTIMAGTRACK = 0x80000023
     */
    public static final int SM_F_REQMULTIMAGTRACK = 0x80000023; // requested two or more magnetic tracks in
// XXXGetBuffer function.
    /**
     * file not found.<br>
     * SM_F_FILENOTFOUND = 0x80000024
     */
    public static final int SM_F_FILENOTFOUND = 0x80000024; // file not found.
    /**
     * field is not exist.<br>
     * SM_F_FIELDNOTFOUND = 0x80000025
     */
    public static final int SM_F_FIELDNOTFOUND = 0x80000025; // field is not exist.
    /**
     * failed to load image.<br>
     * SM_F_IMAGELOAD = 0x80000026
     */
    public static final int SM_F_IMAGELOAD = 0x80000026; // failed to load image.
    /**
     * dc creation is failed.<br>
     * M_F_CREATEDC = 0x80000027
     */
    public static final int SM_F_CREATEDC = 0x80000027; // dc creation is failed.
    /**
     * driver verification is failed. may the<br>
     * SM_F_VERIFYDRV = 0x80000028
     */
    public static final int SM_F_VERIFYDRV = 0x80000028; // driver verification is failed. may the
// driver is not ours.
    /**
     * failed to make spool data.<br>
     * SM_F_SPOOLING = 0x80000029
     */
    public static final int SM_F_SPOOLING = 0x80000029; // failed to make spool data.
    /**
     * request access to ic/rf module without<br>
     * SM_F_DEVNOTOPENED = 0x8000002A
     */
    public static final int SM_F_DEVNOTOPENED = 0x8000002A; // request access to ic/rf module without
// opening the printer device.
    /**
     * usb is temporarily blocked by other.<br>
     * SSM_F_USEDBYOTHER = 0x8000002B
     */
    public static final int SM_F_USEDBYOTHER = 0x8000002B; // usb is temporarily blocked by other.
    /**
     * socket creation failed.<br>
     * SM_F_SOCKETCREATE = 0x8000002C
     */
    public static final int SM_F_SOCKETCREATE = 0x8000002C; // socket creation failed.
    /**
     * socket connection failed.<br>
     * SM_F_SOCKETCONNECT = 0x8000002D
     */
    public static final int SM_F_SOCKETCONNECT = 0x8000002D; // socket connection failed.
    /**
     * SSL initialization failed.<br>
     * SM_F_SSLINIT = 0x8000002E
     */
    public static final int SM_F_SSLINIT = 0x8000002E; // SSL initialization failed.
    /**
     * SSL creation failed.<br>
     * SM_F_SSLCREATE = 0x8000002F
     */
    public static final int SM_F_SSLCREATE = 0x8000002F; // SSL creation failed.
    /**
     * SSL connection is failed.<br>
     * SM_F_SSLCONNECT = 0x80000030
     */
    public static final int SM_F_SSLCONNECT = 0x80000030; // SSL connection is failed.
    /**
     * host is already reserved status.<br>
     * SM_F_RESERVED = 0x80000031
     */
    public static final int SM_F_RESERVED = 0x80000031; // host is already reserved status.
    /**
     * socket fd is invalid.<br>
     * SM_F_INVALIDSOCKET = 0x80000032
     */
    public static final int SM_F_INVALIDSOCKET = 0x80000032; // socket fd is invalid.
    /**
     * packet is sended less than requested.<br>
     * SSM_F_LESSSENDED = 0x80000033
     */
    public static final int SM_F_LESSSENDED = 0x80000033; // packet is sended less than requested.
    /**
     * packet is received less than requested.<br>
     * SM_F_LESSRECVED = 0x80000034
     */
    public static final int SM_F_LESSRECVED = 0x80000034; // packet is received less than requested.
    /**
     * esocket error occured.<br>
     * SM_F_SOCKETERROR = 0x80000035
     */
    public static final int SM_F_SOCKETERROR = 0x80000035; // socket error occured.
    /**
     * packet is not valid.<br>
     * SM_F_INVALIDPACKET = 0x80000036
     */
    public static final int SM_F_INVALIDPACKET = 0x80000036; // packet is not valid.
    /**
     * received packet sequence/id is not equal.<br>
     * SM_F_PACKETSEQDIFFER = 0x80000037
     */
    public static final int SM_F_PACKETSEQDIFFER = 0x80000037; // received packet sequence/id is not equal.
    /**
     * reply flag is not setted on received packet.<br>
     * SM_F_PACKETFLAGNOREPLY = 0x80000038
     */
    public static final int SM_F_PACKETFLAGNOREPLY = 0x80000038; // reply flag is not setted on received packet.
    /**
     * sent packet header is incorrect.<br>
     * SM_F_PACKETFLAGHEADER = 0x80000039
     */
    public static final int SM_F_PACKETFLAGHEADER = 0x80000039; // sent packet header is incorrect.
    /**
     * argument is not valid on sent packet.<br>
     * SM_F_PACKETFLAGARGUMENT = 0x8000003A
     */
    public static final int SM_F_PACKETFLAGARGUMENT = 0x8000003A; // argument is not valid on sent packet.
    /**
     * execution error flag is setted.<br>
     * M_F_PACKETFLAGEXE = 0x8000003B
     */
    public static final int SM_F_PACKETFLAGEXE = 0x8000003B; // execution error flag is setted.
    /**
     * bad command flag is setted.<br>
     * SM_F_PACKETFLAGBADCMD = 0x8000003C
     */
    public static final int SM_F_PACKETFLAGBADCMD = 0x8000003C; // bad command flag is setted.
    /**
     *  <br>
     * SM_F_PACKETFLAGINIT = 0x8000003D
     */
    public static final int SM_F_PACKETFLAGINIT = 0x8000003D; //
    /**
     * invalid handle is given.<br>
     * SM_F_PACKETFLAGHANDLE = 0x8000003E
     */
    public static final int SM_F_PACKETFLAGHANDLE = 0x8000003E; // invalid handle is given.
    /**
     * file open failed..<br>
     * SM_F_FILEOPEN = 0x8000003F
     */
    public static final int SM_F_FILEOPEN = 0x8000003F; // file open failed...
    /**
     * read from fale is failed.<br>
     * SM_F_FILEREAD = 0x80000040
     */
    public static final int SM_F_FILEREAD = 0x80000040; // read from fale is failed.
    /**
     * not support yet...<br>
     * SSM_F_NOTSUPPORTYET = 0x80000041
     */
    public static final int SM_F_NOTSUPPORTYET = 0x80000041; // not support yet...
    /**
     * insufficient buffer.<br>
     * SM_F_INSUFFICIENTBUF = 0x80000042
     */
    public static final int SM_F_INSUFFICIENTBUF = 0x80000042; // insufficient buffer.
// Contact Smartcard error codes...
    /**
     * SCardEstablish failed.<br>
     * SSM_F_ICESTABLISH = 0x80000043
     */
    public static final int SM_F_ICESTABLISH = 0x80000043; // SCardEstablish failed.
    /**
     * SCardListReaders failed.<br>
     * SM_F_ICLISTREADER = 0x80000044
     */
    public static final int SM_F_ICLISTREADER = 0x80000044; // SCardListReaders failed.
    /**
     * SCardConnect failed.<br>
     * SM_F_ICCONNECT = 0x80000045
     */
    public static final int SM_F_ICCONNECT = 0x80000045; // SCardConnect failed.
    /**
     * SCardStatus failed.<br>
     * SM_F_ICGETSTATUS = 0x80000046
     */
    public static final int SM_F_ICGETSTATUS = 0x80000046; // SCardStatus failed.
    /**
     * SCardDisconenct failed.<br>
     * SM_F_ICDISCONNECT = 0x80000047
     */
    public static final int SM_F_ICDISCONNECT = 0x80000047; // SCardDisconenct failed.
    /**
     * SCardReleaseContext failed.<br>
     * SM_F_ICRELEASE = 0x80000048
     */
    public static final int SM_F_ICRELEASE = 0x80000048; // SCardReleaseContext failed.
// Contactless Smartcard error codes...
    /**
     * setting value is incorrect. (Port No., ...)<br>
     * SM_F_RFINVALIDSETTING = 0x80000049
     */
    public static final int SM_F_RFINVALIDSETTING = 0x80000049; // setting value is incorrect. (Port No., ...)
    /**
     * port open failed.<br>
     * SM_F_RFOPEN = 0x8000004A
     */
    public static final int SM_F_RFOPEN = 0x8000004A; // port open failed.
    /**
     * connect failed.<br>
     * SM_F_RFCONNECT = 0x8000004B
     */
    public static final int SM_F_RFCONNECT = 0x8000004B; // connect failed.
    /**
     * open the port that already opened.<br>
     * SM_F_RFALREADYOPENED = 0x80000051
     */
    public static final int SM_F_RFALREADYOPENED = 0x80000051; // open the port that already opened.
    /**
     * port open failed.<br>
     * SM_F_RFOPENFAIL = 0x80000052
     */
    public static final int SM_F_RFOPENFAIL = 0x80000052; // port open failed.
    /**
     * invalid COM port number.<br>
     * SM_F_RFINVALIDCOMMPORT = 0x80000053
     */
    public static final int SM_F_RFINVALIDCOMMPORT = 0x80000053; // invalid COM port number.
    /**
     * error of communication setting.<br>
     * SM_F_RFFAILGETCOMMSTATE = 0x80000054
     */
    public static final int SM_F_RFFAILGETCOMMSTATE = 0x80000054; // error of communication setting.
    /**
     * error of communication setting.<br>
     * SM_F_RFFAILSETCOMMSTATE = 0x80000055
     */
    public static final int SM_F_RFFAILSETCOMMSTATE = 0x80000055; // error of communication setting.
    /**
     * error of communication setting.<br>
     * SM_F_RFFAILCOMMIOTHREAD = 0x80000056
     */
    public static final int SM_F_RFFAILCOMMIOTHREAD = 0x80000056; // error of communication setting.
    /**
     * incorrect function parameter.<br>
     * SM_F_RFPARAMETER = 0x80000057
     */
    public static final int SM_F_RFPARAMETER = 0x80000057; // incorrect function parameter.
    /**
     * SM_F_RFCOMMSTATE = 0x80000150
     */
    public static final int SM_F_RFCOMMSTATE = 0x80000150;//
    /**
     * running non-blocking mode works.<br>
     * SM_F_RFCOMMSTATEPROCESS = 0x80000151
     */
    public static final int SM_F_RFCOMMSTATEPROCESS = 0x80000151; // running non-blocking mode works.
    /**
     * finished non-blocking mode works.<br>
     * SM_F_RFCOMMSTATEFINISH = 0x8000015F
     */
    public static final int SM_F_RFCOMMSTATEFINISH = 0x8000015F; // finished non-blocking mode works.
    /**
     * SM_F_RFCOMMSTATEERROR = 0x800001D0
     */
    public static final int SM_F_RFCOMMSTATEERROR = 0x800001D0; //
    /**
     * data transmition error.<br>
     * SM_F_RFCOMMSTATEERRORWRITE = 0x800001D1
     */
    public static final int SM_F_RFCOMMSTATEERRORWRITE = 0x800001D1; // data transmition error.
    /**
     * invalid received data format.<br>
     * SM_F_RFCOMMSTATEERRORFORMAT = 0x800001D2
     */
    public static final int SM_F_RFCOMMSTATEERRORFORMAT = 0x800001D2; // invalid received data format.
    /**
     * incorrect data length of received.<br>
     * SM_F_RFCOMMSTATEERRORLENGTH = 0x800001D3
     */
    public static final int SM_F_RFCOMMSTATEERRORLENGTH = 0x800001D3; // incorrect data length of received.
    /**
     * error of received data's LRC.<br>
     * SM_F_RFCOMMSTATEERRORLRC = 0x800001D4
     */
    public static final int SM_F_RFCOMMSTATEERRORLRC = 0x800001D4; // error of received data's LRC.
    /**
     * receiving timeout.<br>
     * SM_F_RFCOMMSTATEERRORTIMEOUT = 0x800001D5
     */
    public static final int SM_F_RFCOMMSTATEERRORTIMEOUT = 0x800001D5; // receiving timeout.
// additional error codes...
    /**
     * invalid or not support barcode name.<br>
     * SM_F_INVALIDNAME = 0x80000200
     */
    public static final int SM_F_INVALIDNAME = 0x80000200; // invalid or not support barcode name.
    /**
     * object is not exist.
     * SM_F_OBJECTNOTFOUND = 0x80000203
     */
    public static final int SM_F_OBJECTNOTFOUND = 0x80000203; // object is not exist.
    /**
     * sub-dll load failed...<br>
     * SM_F_SUBDLLLOADFAILED = 0x80000204
     */
    public static final int SM_F_SUBDLLLOADFAILED = 0x80000204; // sub-dll load failed...
    /**
     * configuration file load/save failed...<br>
     * SM_F_CONFIGFILEFAILED = 0x80000205
     */
    public static final int SM_F_CONFIGFILEFAILED = 0x80000205; // configuration file load/save failed...
    /**
     * text/image alignment<br>
     * OBJ_ALIGN_LEFT = 0x00
     */

    /* Added by Kyle 20110822
     * Device Name
     */
   // public static final int 	SMART_OPENDEVICE_BYID = 0;				// open or get device information by using device-id
   // public static final int 	SMART_OPENDEVICE_BYDESC	= 1;				//


  //  public static final int 	SMART_PRINTER_TYPE_USB	= 1;
  //  public static final int     SMART_PRINTER_TYPE_NET	= 2;
  //  public static final int 	SMART_PRINTER_TYPE_ALL	= 3;


  //  public static final int     MAX_SMART_PRINTER = 32;

    /////////////////////////The End of the edition by Kyle/////////////////////////////




/*
 * Move Position
 */
public static final int 	CARDPOS_PRINT	= 0;
public static final int 	CARDPOS_MAGNETIC = 1;
public static final int 	CARDPOS_IC	= 2;
public static final int 	CARDPOS_RF	= 3;
public static final int 	CARDPOS_TOROT	= 4;			// move to rotator.
public static final int 	CARDPOS_FROMROT	= 5;			// move from rotator. after move, must move to another position.
public static final int 	CARDPOS_RF2	= 6;			// move to omnikey module position.

/*
 * Page / Panel
 */
public static final byte 	PAGE_MAXCOUNT = 2;
public static final byte	PANELID_COLOR = 1;
public static final byte	PANELID_BLACK = 2;
public static final byte	PANELID_OVERLAY = 4;
public static final byte	PANELID_UV = 8;

/*
 * Magnetic
 */
public static final int 	MAG_T1		= 1;
public static final int 	MAG_T2		= 2;
public static final int 	MAG_T3		= 4;
public static final int 	MAG_JIS		= 8;
public static final int 	MAG_T1MAX	= 76;
public static final int 	MAG_T2MAX	= 37;
public static final int 	MAG_T3MAX	= 104;
public static final int 	MAG_JISMAX	= 69;

/*
 * Magnetic Option
 */
public static final char 	MAG_LOCO	= 0x00;
public static final char	MAG_HICO	= 0x10;
public static final char	MAG_BITMODE	= 0x80;


/*
 * Beep
 */
public static final int 	BEEP_LONG	= 1;			// single long beep
public static final int 	BEEP_SHORT	= 2;			// three times of short beep

/*
 * LCD Character
 */
public static final int 	LCD_LINE1 = 0;			// LCD Text Display Line Position. (Small Text Base)
public static final int 	LCD_LINE2 = 1;
public static final int 	LCD_LINE3 = 2;
public static final int 	LCD_LINE4 = 3;
public static final int 	LCD_LINE5 = 4;
public static final int 	LCD_LINE6 = 5;
public static final int 	LCD_LINE7 = 6;
public static final int 	LCD_LINE8 = 7;

public static final int 	LCD_TYPE_CH	= 0;			// character LCD : Big Sized Text
public static final int 	LCD_TYPE_GSMALL	= 1;			// graphic LCD : Small Sized Text
public static final int 	LCD_TYPE_GBIG	= 2;			// graphic LCD : Big Sized Text

public static final int 	LCD_LENSMALL =	21;			// Length of Small Text
public static final int 	LCD_LENBIG =  16;			// Length of Big Text
public static final int 	LCD_LEN_CH = LCD_LENBIG;
public static final int 	LCD_LEN_GSMALL = LCD_LENSMALL;
public static final int 	LCD_LEN_GBIG =	LCD_LENBIG;


/**
 * RF : Card Type<br>
 * RFTYPEUNSET = -1
 */
    public static final int	RFTYPEUNSET = -1;
/**
 * RF : Card Type<br>
 * RFTYPEMIFARE = 0
 */
    public static final int	RFTYPEMIFARE = 0;
   /**
 * RF : Card Type<br>
 * RRFTYPE15693 = 1
 */
    public static final int	RFTYPE15693 = 1;
   /**
 * RF : Card Type<br>
 * RRFTYPE14443A = 2
 */
    public static final int	RFTYPE14443A = 2;
    /**
 * RF : Card Type<br>
 * RRFTYPE14443B = 3
 */
    public static final int	RFTYPE14443B = 3;

/**
 * RF : Mifare<br>
 * RF_MIFARE_SIDEA	= 1
 */
    public static final int	RF_MIFARE_SIDEA	= 1;
  /**
 * RF : Mifare<br>
 * F_MIFARE_SIDEB	= 2
 */
public static final int	RF_MIFARE_SIDEB	= 2;

/**
 * RF-PCSC : Auth Side<br>
 * authentication with Mifare key A<br>
 * MIFARE_AUTHENT1A = 0x60
 */
    public static final char MIFARE_AUTHENT1A = 0x60;		// authentication with Mifare key A
/**
 * RF-PCSC : Auth Side<br>
 * authentication with Mifare key B<br>
 * MIFARE_AUTHENT1B = 0x61
 */
    public static final char MIFARE_AUTHENT1B = 0x61;		// authentication with Mifare key B


/**
 * Device<br>
 * internal device (IC, RF)<br>
 * INTERNALDEV = 1
 */
    public static final int	INTERNALDEV = 1;			// internal device (IC, RF)
    /**
     * Device<br>
     * external device (SIM, RF)<br>
     * EXTERNALDEV = 2;
     */
    public static final int	EXTERNALDEV = 2;			// external device (SIM, RF)

    public static final int OBJ_ALIGN_LEFT = 0x00;
    /**
     * text/image alignment<br>
     * OBJ_ALIGN_CENTER = 0x01
     */
    public static final int OBJ_ALIGN_CENTER = 0x01;
    /**
     * text/image alignment<br>
     * OBJ_ALIGN_RIGHT = 0x02
     */
    public static final int OBJ_ALIGN_RIGHT = 0x02;
    /**
     * text/image alignment<br>
     * OBJ_ALIGN_JUSTIFY = 0x03
     */
    public static final int OBJ_ALIGN_JUSTIFY = 0x03;	// text object only...
    /**
     * text/image alignment<br>
     * OBJ_ALIGN_HNOALIGN = 0x04
     */
    public static final int OBJ_ALIGN_HNOALIGN = 0x04;
    /**
     * text/image alignment<br>
     * OBJ_ALIGN_TOP = 0x00
     */
    public static final int OBJ_ALIGN_TOP = 0x00;
    /**
     * text/image alignment<br>
     * OBJ_ALIGN_MIDDLE = 0x10
     */
    public static final int OBJ_ALIGN_MIDDLE = 0x10;
    /**
     * text/image alignment<br>
     * OBJ_ALIGN_BOTTOM = 0x20
     */
    public static final int OBJ_ALIGN_BOTTOM = 0x20;
    /**
     * text/image alignment<br>
     * OBJ_ALIGN_VNOALIGN = 0x30
     */
    public static final int OBJ_ALIGN_VNOALIGN = 0x30;
    /**
     * text/image alignment<br>
     * OBJ_ALIGN_HORZMASK = 0x0F
     */
    public static final int OBJ_ALIGN_HORZMASK = 0x0F;
    /**
     * OBJ_ALIGN_VERTMASK = 0xF0
     */
    public static final int OBJ_ALIGN_VERTMASK = 0xF0;
    /*
    static final int	MAKE_LONIBBLE(nb) =	( (nb) & 0x0F )
    static final int	MAKE_HINIBBLE(nb)= 	( ((nb) & 0x0F) << 4 )
    static final int	GET_LONIBBLE(bt)	( (bt) & 0x0F )
    static final int	GET_HINIBBLE(bt)	( ((bt) & 0xF0 ) >> 4 )
    static final int	MAKE_ALIGN(h,v)		( (h) | (v) )
    static final int	OBJ_ALIGN_NOALIGN	(OBJ_ALIGN_VNOALIGN|OBJ_ALIGN_HNOALIGN)
    static final int	GET_HALIGN(a)		GET_HINIBBLE(a)
    static final int	GET_VALIGN(a)		GET_LONIBBLE(a)
    static final int	SET_HALIGN(a,h)		MAKE_ALIGN(h,GET_VALIGN(a))
    static final int	SET_VALIGN(a,v)		MAKE_ALIGN(GET_HALIGN(a),v)
     */
    /**
     * scale to fit to width of frame<br>
     * IMGSCALE_FITHORZ = 0x00
     */
    public static final int IMGSCALE_FITHORZ = 0x00;	// scale to fit to width of frame
    /**
     * scale to fit to height of frame<br>
     * IMGSCALE_FITVERT = 0x01
     */
    public static final int IMGSCALE_FITVERT = 0x01;	// scale to fit to height of frame
    /**
     * scale to fit to frame.<br>
     * IMGSCALE_FITFRAME = 0x02
     */
    public static final int IMGSCALE_FITFRAME = 0x02;	// scale to fit to frame.
    /**
     * scale factor is user setted.<br>
     * IMGSCALE_USER = 0x03
     */
    public static final int IMGSCALE_USER = 0x03;	// scale factor is user setted.
    /**
     * IMGSCALE_BEST = IMGSCALE_FITHORZ
     */
    public static final int IMGSCALE_BEST = IMGSCALE_FITHORZ;
    /**
     * default amplyfiying value<br>
     * IMGSCALE_BASEAMP = 10000
     */
    public static final int IMGSCALE_BASEAMP = 10000;	// default amplyfiying value
    /**
     * IMGEFFECT_CONTRASTMIN = -100
     */
    public static final int IMGEFFECT_CONTRASTMIN = -100;
    /**
     * IMGEFFECT_CONTRASTMAX = 100
     */
    public static final int IMGEFFECT_CONTRASTMAX = 100;	//412
    /**
     * IMGEFFECT_BRIGHTMIN = -256
     */
    public static final int IMGEFFECT_BRIGHTMIN = -256;
    /**
     * IMGEFFECT_BRIGHTMAX = 255
     */
    public static final int IMGEFFECT_BRIGHTMAX = 255;
    /**
     * FONT_NORMAL = 0x00
     */
    public static final byte FONT_NORMAL = 0x00;
    /**
     * FONT_BOLD = 0x01
     */
    public static final byte FONT_BOLD = 0x01;
    /**
     *  FONT_ITALIC = 0x02
     */
    public static final byte FONT_ITALIC = 0x02;
    /**
     * FONT_UNDERLINE = 0x04
     */
    public static final byte FONT_UNDERLINE = 0x04;
    /*
    static final int	OTB_NONE =			0x0000;
    static final int	OTB_FromEnum(e)=		(1 << (e));
    static final int	OTB_RECT			OTB_FromEnum(obj_rect)
    static final int	OTB_ROUNDRECT		OTB_FromEnum(obj_roundrect)
    static final int	OTB_OVAL			OTB_FromEnum(obj_oval)
    static final int	OTB_LINE			OTB_FromEnum(obj_line)
    static final int	OTB_IMAGE			OTB_FromEnum(obj_image)
    static final int	OTB_TEXT			OTB_FromEnum(obj_text)
    static final int	OTB_BAR				OTB_FromEnum(obj_bar)
     */
    /**
     * unit type definition<br>
     * UNITTYPE_TEXT = 0x0010
     */
    static final int UNITTYPE_TEXT = 0x0010;
    /**
     * unit type definition<br>
     * UNITTYPE_IMAGE = 0x0020
     */
    static final int UNITTYPE_IMAGE = 0x0020;
    /**
     * unit type definition<br>
     * NITTYPE_BARCODE = 0x0040
     */
    static final int UNITTYPE_BARCODE = 0x0040;
    /**
     * unit info direction<br>
     * UNITINFO_FIRST = 0
     */
    public static final int UNITINFO_FIRST = 0;
    /**
     * unit info direction<br>
     * UNITINFO_NEXT = 1
     */
    public static final int UNITINFO_NEXT = 1;
    /**
     * MAX_FIELDNAMELEN = 32
     */
    public static final int MAX_FIELDNAMELEN = 32;
    /**
     * PRINTER_ID_MAX = 32
     */
    public static final int PRINTER_ID_MAX = 32;
    /**
     * MAX_FIELDVALUELEN = 1024
     */
    public static final int MAX_FIELDVALUELEN = 1024;
    /**
     * IELD_PREFIX = '~'
     */
    public static final char FIELD_PREFIX = '~';
    /**
     * 카드흡입중<br>
     * SMSC_M_CARDIN = 0x0000000000000001L
     */
    public static final long SMSC_M_CARDIN = 0x0000000000000001L;   // 카드흡입중
    /**
     * 카드배출중<br>
     * SMSC_M_CARDOUT = 0x0000000000000002L
     */
    public static final long SMSC_M_CARDOUT = 0x0000000000000002L;   // 카드배출중
    /**
     * 인쇄위치이동중<br>
     * SMSC_M_MOVE_PRINT = 0x0000000000000004L
     */
    public static final long SMSC_M_MOVE_PRINT = 0x0000000000000004L;   // 인쇄위치이동중
    /**
     * 프린터에서로테이터로이동중<br>
     * SMSC_M_MOVE_PRN2ROT = 0x0000000000000008L
     */
    public static final long SMSC_M_MOVE_PRN2ROT = 0x0000000000000008L;   // 프린터에서로테이터로이동중
    /**
     * 로테이터에서프린터로이동중<br>
     * SMSC_M_MOVE_ROT2PRN = 0x0000000000000010L
     */
    public static final long SMSC_M_MOVE_ROT2PRN = 0x0000000000000010L;   // 로테이터에서프린터로이동중
    /**
     * IC 위치로이동중<br>
     * SMSC_M_MOVE_IC = 0x0000000000000020L
     */
    public static final long SMSC_M_MOVE_IC = 0x0000000000000020L;   // IC 위치로이동중
    /**
     * RF 위치로이동중<br>
     * SMSC_M_MOVE_RF = 0x0000000000000040L
     */
    public static final long SMSC_M_MOVE_RF = 0x0000000000000040L;   // RF 위치로이동중
    /**
     * 마그네틱위치로이동중<br>
     * SMSC_M_MOVE_MAG = 0x0000000000000080L
     */
    public static final long SMSC_M_MOVE_MAG = 0x0000000000000080L;   // 마그네틱위치로이동중
    /**
     * 써멀헤드업중<br>
     * SMSC_M_THUP = 0x0000000000000100L
     */
    public static final long SMSC_M_THUP = 0x0000000000000100L;   // 써멀헤드업중
    /**
     * 써멀헤드다운중<br>
     * SMSC_M_THDOWN = 0x0000000000000200L
     */
    public static final long SMSC_M_THDOWN = 0x0000000000000200L;   // 써멀헤드다운중
    /**
     * IC 헤드)(Contactor) 업중<br>
     * SMSC_M_ICHUP = 0x0000000000000400L
     */
    public static final long SMSC_M_ICHUP = 0x0000000000000400L;   // IC 헤드)(Contactor) 업중
    /**
     * IC 헤드)(Contactor) 다운중<br>
     * SMSC_M_ICHDOWN = 0x0000000000000800L
     */
    public static final long SMSC_M_ICHDOWN = 0x0000000000000800L;   // IC 헤드)(Contactor) 다운중
    /**
     * 인쇄중<br>
     * SMSC_M_PRINT = 0x0000000000001000L
     */
    public static final long SMSC_M_PRINT = 0x0000000000001000L;   // 인쇄중
    /**
     * 마그네틱읽기/쓰기중<br>
     * SMSC_M_MAGRW = 0x0000000000002000L
     */
    public static final long SMSC_M_MAGRW = 0x0000000000002000L;   // 마그네틱읽기/쓰기중
    /**
     * 리본찾는중<br>
     * SMSC_M_SEEKRIBBON = 0x0000000000004000L
     */
    public static final long SMSC_M_SEEKRIBBON = 0x0000000000004000L;   // 리본찾는중
    /**
     * 리본이동중<br>
     * SMSC_M_MOVERIBBON = 0x0000000000008000L
     */
    public static final long SMSC_M_MOVERIBBON = 0x0000000000008000L;   // 리본이동중
    /**
     * 카드앞면상향회전중<br>
     * SMSC_M_ROTATORTOP = 0x0000000000010000L
     */
    public static final long SMSC_M_ROTATORTOP = 0x0000000000010000L;   // 카드앞면상향회전중
    /**
     * 카드앞면하향회전중<br>
     * SMSC_M_ROTATORBOTTOM = 0x0000000000020000L
     */
    public static final long SMSC_M_ROTATORBOTTOM = 0x0000000000020000L;   // 카드앞면하향회전중
    /**
     * 호퍼에카드적재되어있음<br>
     * SMSC_S_HOPPERHASCARD = 0x0000000000040000L
     */
    public static final long SMSC_S_HOPPERHASCARD = 0x0000000000040000L;   // 호퍼에카드적재되어있음
    /**
     * 써멀헤드업상태<br>
     * SMSC_S_THUP = 0x0000000000080000L
     */
    public static final long SMSC_S_THUP = 0x0000000000080000L;   // 써멀헤드업상태
    /**
     * 카드인센서에카드감지<br>
     * SMSC_S_CARDIN = 0x0000000000100000L
     */
    public static final long SMSC_S_CARDIN = 0x0000000000100000L;   // 카드인센서에카드감지
    /**
     * 카드아웃센서에카드감지<br>
     * SMSC_S_CARDOUT = 0x0000000000200000L
     */
    public static final long SMSC_S_CARDOUT = 0x0000000000200000L;   // 카드아웃센서에카드감지
    /**
     * 로테이터에서카드앞면상향상태<br>
     * SMSC_S_ROTATORTOP = 0x0000000000400000L
     */
    public static final long SMSC_S_ROTATORTOP = 0x0000000000400000L;   // 로테이터에서카드앞면상향상태
    /**
     * 로테이터장착되어있음<br>
     * SMSC_S_EQUIPROTATOR = 0x0000000000800000L
     */
    public static final long SMSC_S_EQUIPROTATOR = 0x0000000000800000L;   // 로테이터장착되어있음
    /**
     * 인쇄버퍼받는중<br>
     * SMSC_M_RECVPRINTDATA = 0x0000000001000000L
     */
    public static final long SMSC_M_RECVPRINTDATA = 0x0000000001000000L;   // 인쇄버퍼받는중
    /**
     * 인쇄데이터버퍼보유중<br>
     * SMSC_S_HASPRINTBUFFER = 0x0000000002000000L
     */
    public static final long SMSC_S_HASPRINTBUFFER = 0x0000000002000000L;   // 인쇄데이터버퍼보유중
    /**
     * SBS 명령수행중<br>
     * SMSC_M_SBSRUNNING = 0x0000000004000000L
     */
    public static final long SMSC_M_SBSRUNNING = 0x0000000004000000L;   // SBS 명령수행중
    /**
     * SBS 모드상태<br>
     * SMSC_S_SBSMODE = 0x0000000008000000L
     */
    public static final long SMSC_S_SBSMODE = 0x0000000008000000L;   // SBS 모드상태
    /**
     * 케이스연림상태<br>
     * SMSC_S_CASEOPEN = 0x0000000010000000L
     */
    public static final long SMSC_S_CASEOPEN = 0x0000000010000000L;   // 케이스연림상태
    /**
     * 장치초기화중<br>
     * SMSC_M_INIT = 0x0000000020000000L
     */
    public static final long SMSC_M_INIT = 0x0000000020000000L;   // 장치초기화중
    /**
     * 테스트모드상태<br>
     * SMSC_S_TESTMODE = 0x0000000080000000L
     */
    public static final long SMSC_S_TESTMODE = 0x0000000080000000L;   // 테스트모드상태
// ERROR-PART
    /**
     * 카드삽입실패<br>
     * SMSC_F_CARDIN = 0x0000000100000000L
     */
    public static final long SMSC_F_CARDIN = 0x0000000100000000L; // 0x0000000100000000;        // 카드삽입실패
    /**
     * 인쇄위치로이동실패<br>
     * SMSC_F_MOVETOPRINT = 0x0000000200000000L
     */
    public static final long SMSC_F_MOVETOPRINT = 0x0000000200000000L; // 0x0000000200000000;   // 인쇄위치로이동실패
    /**
     * 카드배출실패<br>
     * SMSC_F_CARDOUT = 0x0000000400000000L
     */
    public static final long SMSC_F_CARDOUT = 0x0000000400000000L; // 0x0000000400000000;       // 카드배출실패
    /**
     * 마그네틱위치로이동실패<br>
     * SMSC_F_MOVETOMAG = 0x0000000800000000L
     */
    public static final long SMSC_F_MOVETOMAG = 0x0000000800000000L; // 0x0000000800000000;     // 마그네틱위치로이동실패
    /**
     * SMART_SURFACE_PROPERTIES<br>
     * Part - Side<br>
     * Indicate printing page information<br>
     * PAGE_FRONT = 0
     */
    public static final byte PAGE_FRONT = 0; // front
    /**
     * SMART_SURFACE_PROPERTIES<br>
     * Part - Side<br>
     * PAGE_BACK = 1
     */
    public static final byte PAGE_BACK = 1; // back
    /**
     * Indicate printing direction to Vertical<br>
     * Part - orientation<br>
     * DMORIENT_PORTRAIT = 1
     */
    public static final int DMORIENT_PORTRAIT = 1;
    /**
     * Indicate printing direction to Horizontal.<br>
     * Part - orientation<br>
     * DMORIENT_LANDSCAPE = 2
     */
    public static final int DMORIENT_LANDSCAPE = 2;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwMSTrack1<br>
     * Define ISO type track 1 encoding mode.<br>
     * Define which encoding mode will be used when printing and magnetic<br>
     * encoding do at the same time.<br>
     * There are 6 type encoding mode, that is Normal, Reverse, Bit, Normal HiCo,<br>
     * Reverse Bit, Bit HiCo.<br>
     * Normal : Encode input date with normal way<br>
     * Reverse : Encode input date with reverse way<br>
     * Bit : Treat input data as binary data(input 0 or 1)<br>
     * Hico means encode at HiCo card.<br>
     * Part - dwMSTrack1<br>
     * SMART_ENCODE_NORMAL=0x00
     */
    static public int SMART_ENCODE_NORMAL = 0x00;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwMSTrack1<br>
     * Define ISO type track 1 encoding mode.<br>
     * Define which encoding mode will be used when printing and magnetic<br>
     * encoding do at the same time.<br>
     * There are 6 type encoding mode, that is Normal, Reverse, Bit, Normal HiCo,<br>
     * Reverse Bit, Bit HiCo.<br>
     * Normal : Encode input date with normal way<br>
     * Reverse : Encode input date with reverse way<br>
     * Bit : Treat input data as binary data(input 0 or 1)<br>
     * Hico means encode at HiCo card.<br>
     * Part - dwMSTrack1<br>
     * SMART_ENCODE_REVERSE = 0x01
     */
    static public int SMART_ENCODE_REVERSE = 0x01;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwMSTrack1<br>
     * Define ISO type track 1 encoding mode.<br>
     * Define which encoding mode will be used when printing and magnetic<br>
     * encoding do at the same time.<br>
     * There are 6 type encoding mode, that is Normal, Reverse, Bit, Normal HiCo,<br>
     * Reverse Bit, Bit HiCo.<br>
     * Normal : Encode input date with normal way<br>
     * Reverse : Encode input date with reverse way<br>
     * Bit : Treat input data as binary data(input 0 or 1)<br>
     * Hico means encode at HiCo card.<br>
     * Part - dwMSTrack1<br>
     * SMART_ENCODE_BIT = 0x02
     */
    static public int SMART_ENCODE_BIT = 0x02;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwMSTrack1<br>
     * Define ISO type track 1 encoding mode.<br>
     * Define which encoding mode will be used when printing and magnetic<br>
     * encoding do at the same time.<br>
     * There are 6 type encoding mode, that is Normal, Reverse, Bit, Normal HiCo,<br>
     * Reverse Bit, Bit HiCo.<br>
     * Normal : Encode input date with normal way<br>
     * Reverse : Encode input date with reverse way<br>
     * Bit : Treat input data as binary data(input 0 or 1)<br>
     * Hico means encode at HiCo card.<br>
     * Part - dwMSTrack1<br>
     * MART_ENCODE_HICO_NORM = 0x03
     */
    static public int SMART_ENCODE_HICO_NORM = 0x03;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwMSTrack1<br>
     * Define ISO type track 1 encoding mode.<br>
     * Define which encoding mode will be used when printing and magnetic<br>
     * encoding do at the same time.<br>
     * There are 6 type encoding mode, that is Normal, Reverse, Bit, Normal HiCo,<br>
     * Reverse Bit, Bit HiCo.<br>
     * Normal : Encode input date with normal way<br>
     * Reverse : Encode input date with reverse way<br>
     * Bit : Treat input data as binary data(input 0 or 1)<br>
     * Hico means encode at HiCo card.<br>
     * Part - dwMSTrack1<br>
     * SMART_ENCODE_HICO_REV = 0x04
     */
    static public int SMART_ENCODE_HICO_REV = 0x04;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwMSTrack1<br>
     * Define ISO type track 1 encoding mode.<br>
     * Define which encoding mode will be used when printing and magnetic<br>
     * encoding do at the same time.<br>
     * There are 6 type encoding mode, that is Normal, Reverse, Bit, Normal HiCo,<br>
     * Reverse Bit, Bit HiCo.<br>
     * Normal : Encode input date with normal way<br>
     * Reverse : Encode input date with reverse way<br>
     * Bit : Treat input data as binary data(input 0 or 1)<br>
     * Hico means encode at HiCo card.<br>
     * Part - dwMSTrack1<br>
     * SMART_ENCODE_HICO_BIT = 0x05
     */
    static public int SMART_ENCODE_HICO_BIT = 0x05;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocSupply<br>
     * Define hopper and fixed value is “0”.<br>
     *  SMART_SUPPLY_AUTO = 0x00
     */
    static public int SMART_SUPPLY_AUTO = 0x00;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocSupply<br>
     * Define hopper and fixed value is “0”.<br>
     *  SMART_SUPPLY_HOPPER = 0x01
     */
    static public int SMART_SUPPLY_HOPPER = 0x01;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocTray<br>
     * Define card type and fixed value is "0".<br>
     *  SMART_TRAY_CR80 = 0x00
     */
    static public int SMART_TRAY_CR80 = 0x00;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocRibbon<br>
     * Define which kind of ribbon is used.<br>
     * dwDocRibbon is automatically set when you open the printer with<br>
     * SmartDCL_OpenDevice” function. If you want to change that value, read<br>
     * ribbon type with “SmartComm_GetRibbonType”and set new value.<br>
     *  SMART_RIBBON_YMCKO = 0x00  // YMCKO
     */
    static public int SMART_RIBBON_YMCKO = 0x00;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocRibbon<br>
     * Define which kind of ribbon is used.<br>
     * dwDocRibbon is automatically set when you open the printer with<br>
     * SmartDCL_OpenDevice” function. If you want to change that value, read<br>
     * ribbon type with “SmartComm_GetRibbonType”and set new value.<br>
     *  SMART_RIBBON_YMCKO = 0x01  // YMCKO.K
     */
    static public int SMART_RIBBON_YMCKOK = 0x01;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocRibbon<br>
     * Define which kind of ribbon is used.<br>
     * dwDocRibbon is automatically set when you open the printer with<br>
     * SmartDCL_OpenDevice” function. If you want to change that value, read<br>
     * ribbon type with “SmartComm_GetRibbonType”and set new value.<br>
     *  SMART_RIBBON_hYMCKO = 0x02; // half YMCKO
     */
    static public int SMART_RIBBON_hYMCKO = 0x02; // half YMCKO
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocRibbon<br>
     * Define which kind of ribbon is used.<br>
     * dwDocRibbon is automatically set when you open the printer with<br>
     * SmartDCL_OpenDevice” function. If you want to change that value, read<br>
     * ribbon type with “SmartComm_GetRibbonType”and set new value.<br>
     * SMART_RIBBON_KO = 0x03; // KO
     */
    static public int SMART_RIBBON_KO = 0x03; // KO
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocRibbon<br>
     * Define which kind of ribbon is used.<br>
     * dwDocRibbon is automatically set when you open the printer with<br>
     * SmartDCL_OpenDevice” function. If you want to change that value, read<br>
     * ribbon type with “SmartComm_GetRibbonType”and set new value.<br>
     * SMART_RIBBON_K = 0x04; // K
     */
    static public int SMART_RIBBON_K = 0x04; // K
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocRibbon<br>
     * Define which kind of ribbon is used.<br>
     * dwDocRibbon is automatically set when you open the printer with<br>
     * SmartDCL_OpenDevice” function. If you want to change that value, read<br>
     * ribbon type with “SmartComm_GetRibbonType”and set new value.<br>
     * SMART_RIBBON_BO = 0x05; // BO
     */
    static public int SMART_RIBBON_BO = 0x05; // BO
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocRibbon<br>
     * Define which kind of ribbon is used.<br>
     * dwDocRibbon is automatically set when you open the printer with<br>
     * SmartDCL_OpenDevice” function. If you want to change that value, read<br>
     * ribbon type with “SmartComm_GetRibbonType”and set new value.<br>
     * SMART_RIBBON_B = 0x06; // B
     */
    static public int SMART_RIBBON_B = 0x06; // B
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocRibbon<br>
     * Define which kind of ribbon is used.<br>
     * dwDocRibbon is automatically set when you open the printer with<br>
     * SmartDCL_OpenDevice” function. If you want to change that value, read<br>
     * ribbon type with “SmartComm_GetRibbonType”and set new value.<br>
     *  SMART_RIBBON_BYMCKO = 0x07; // BYMCKO
     */
    static public int SMART_RIBBON_BYMCKO = 0x07; // BYMCKO
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocRibbon<br>
     * Define which kind of ribbon is used.<br>
     * dwDocRibbon is automatically set when you open the printer with<br>
     * SmartDCL_OpenDevice” function. If you want to change that value, read<br>
     * ribbon type with “SmartComm_GetRibbonType”and set new value.<br>
     *  SMART_RIBBON_YMCKFO = 0x08; // YMCKFO
     */
    static public int SMART_RIBBON_YMCKFO = 0x08; // YMCKFO
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocRibbon<br>
     * Define which kind of ribbon is used.<br>
     * dwDocRibbon is automatically set when you open the printer with<br>
     * SmartDCL_OpenDevice” function. If you want to change that value, read<br>
     * ribbon type with “SmartComm_GetRibbonType”and set new value.<br>
     *  SMART_RIBBON_REWRITABLE = 0x09; // Rewritable Printer
     */
    static public int SMART_RIBBON_REWRITABLE = 0x09; // Rewritable Printer
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocResin<br>
     * Define the method when print color image, extract black with resin panel and<br>
     * print with high density. Resin extract method has Black Objects, Black Texts,<br>
     * Black Dots and Not Use.<br>
     * Black Objects: Extract black text and black drawing automatically and print<br>
     * with resin panel<br>
     * Black Texts: Extract black text and print with resin panel<br>
     * Black Dot : Extract all blacks among print data and print with resin panels<br>
     * Not Use: Do not use resin panel<br>
     * *) not used in DCL mode<br>
     * SMART_RESIN_BLACKOBJECT = 0x00;
     */
    static public int SMART_RESIN_BLACKOBJECT = 0x00;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocResin<br>
     * Define the method when print color image, extract black with resin panel and<br>
     * print with high density. Resin extract method has Black Objects, Black Texts,<br>
     * Black Dots and Not Use.<br>
     * Black Objects: Extract black text and black drawing automatically and print with resin panel<br>
     * Black Texts: Extract black text and print with resin panel<br>
     * Black Dot : Extract all blacks among print data and print with resin panels<br>
     * Not Use: Do not use resin panel<br>
     * *) not used in DCL mode<br>
     * SMART_RESIN_BLACKTEXT = 0x01;
     */
    static public int SMART_RESIN_BLACKTEXT = 0x01;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocResin<br>
     * Define the method when print color image, extract black with resin panel and<br>
     * print with high density. Resin extract method has Black Objects, Black Texts,<br>
     * Black Dots and Not Use.<br>
     * Black Objects: Extract black text and black drawing automatically and print with resin panel<br>
     * Black Texts: Extract black text and print with resin panel<br>
     * Black Dot : Extract all blacks among print data and print with resin panels<br>
     * Not Use: Do not use resin panel<br>
     * *) not used in DCL mode<br>
     * MART_RESIN_BLACKTDOT = 0x02;
     */
    static public int SMART_RESIN_BLACKTDOT = 0x02;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocResin<br>
     * Define the method when print color image, extract black with resin panel and<br>
     * print with high density. Resin extract method has Black Objects, Black Texts,<br>
     * Black Dots and Not Use.<br>
     * Black Objects: Extract black text and black drawing automatically and print with resin panel<br>
     * Black Texts: Extract black text and print with resin panel<br>
     * Black Dot : Extract all blacks among print data and print with resin panels<br>
     * Not Use: Do not use resin panel<br>
     * *) not used in DCL mode<br>
     * MART_RESIN_NOTUSE = 0x03;
     */
    static public int SMART_RESIN_NOTUSE = 0x03;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocQuality<br>
     * Define printing quality.<br>
     * Standard: High quality<br>
     * Fast : A little bit lower quality than standard but fast printing speed.<br>
     * Partial : Print only image exists.<br>
     * Semi-Partial : Print from image starts to card end.<br>
     * We recommend to use “Standard” mode to maintain high printing quality.<br>
     * SMART_QUALITY_STANDARD = 0x00;
     */
    static public int SMART_QUALITY_STANDARD = 0x00;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocQuality<br>
     * Define printing quality.<br>
     * Standard: High quality<br>
     * Fast : A little bit lower quality than standard but fast printing speed.<br>
     * Partial : Print only image exists.<br>
     * Semi-Partial : Print from image starts to card end.<br>
     * We recommend to use “Standard” mode to maintain high printing quality.<br>
     * SMART_QUALITY_VERYHIGH = 0x01;
     */
    static public int SMART_QUALITY_VERYHIGH = 0x01;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocQuality<br>
     * Define printing quality.<br>
     * Standard: High quality<br>
     * Fast : A little bit lower quality than standard but fast printing speed.<br>
     * Partial : Print only image exists.<br>
     * Semi-Partial : Print from image starts to card end.<br>
     * We recommend to use “Standard” mode to maintain high printing quality.<br>
     * SMART_QUALITY_PARTIAL = 0x02;
     */
    static public int SMART_QUALITY_PARTIAL = 0x02;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocQuality<br>
     * Define printing quality.<br>
     * Standard: High quality<br>
     * Fast : A little bit lower quality than standard but fast printing speed.<br>
     * Partial : Print only image exists.<br>
     * Semi-Partial : Print from image starts to card end.<br>
     * We recommend to use “Standard” mode to maintain high printing quality.<br>
     * SMART_QUALITY_SEMIPARTIAL = 0x03;
     */
    static public int SMART_QUALITY_SEMIPARTIAL = 0x03;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocColor<br>
     * Define whether print color or black and white when color ribbon is used.<br>
     * SMART_COLOR_COLOR = 0x00;
     */
    static public int SMART_COLOR_COLOR = 0x00;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocColor<br>
     * Define whether print color or black and white when color ribbon is used.<br>
     * SMART_COLOR_BLACKNWHITE = 0x01;
     */
    static public int SMART_COLOR_BLACKNWHITE = 0x01;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocDither<br>
     * Define which dithering algorithm will be used when print black and white with<br>
     * resin panel.<br>
     * Threshold: Define black and white with standard density.<br>
     * Random: Use random function during dithering<br>
     * Diffusion: Use diffusion algorithm<br>
     * We recommend diffusion dither.<br>
     * SMART_DITHER_THRESHOLD = 0x00;
     */
    static public int SMART_DITHER_THRESHOLD = 0x00;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocDither<br>
     * Define which dithering algorithm will be used when print black and white with<br>
     * resin panel.<br>
     * Threshold: Define black and white with standard density.<br>
     * Random: Use random function during dithering<br>
     * Diffusion: Use diffusion algorithm<br>
     * We recommend diffusion dither.<br>
     * SMART_DITHER_RANDOM = 0x01;
     */
    static public int SMART_DITHER_RANDOM = 0x01;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocDither<br>
     * Define which dithering algorithm will be used when print black and white with<br>
     * resin panel.<br>
     * Threshold: Define black and white with standard density.<br>
     * Random: Use random function during dithering<br>
     * Diffusion: Use diffusion algorithm<br>
     * We recommend diffusion dither.<br>
     * SMART_DITHER_DIFFUSION = 0x02;
     */
    static public int SMART_DITHER_DIFFUSION = 0x02;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocPrintSide<br>
     * Define single side print or dual side print<br>
     * The value which come from “SmartDCL_Print” function to print side<br>
     * parameter is saved. If rotator is not installed, Front is used and rotator is<br>
     * installed, choose “Front” when print front side and choose “Both” when print dual side.<br>
     * You can check if rotator is installed or not calling “ SmartComm_GetStatus”function.<br>
     * SMART_PRINTSIDE_FRONT = 0x00;
     */
    static public int SMART_PRINTSIDE_FRONT = 0x00;
    /**
     * SMART_SURFACE_OEMDEV<p>
     * dwDocPrintSide<br>
     * Define single side print or dual side print
     * The value which come from “SmartDCL_Print” function to print side
     * parameter is saved. If rotator is not installed, Front is used and rotator is
     * installed, choose “Front” when print front side and choose “Both” when print dual side.
     * You can check if the rotator is installed or not by calling “ SmartComm_GetStatus”function.
     * SMART_PRINTSIDE_BOTH = 0x01;
     */
    static public int SMART_PRINTSIDE_BOTH = 0x01;
}
