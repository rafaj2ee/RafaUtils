/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inas.smart;

/**
 * CHASM_DEVMODE는 SMART 프린터의 속성을 정의하고 있는 구조체(structure) 이다.<br>
 * 인쇄설정 값은 제어판의 프린터 속성에서 바꿀수 있는 모든 값을 포함하고 있다.<br>
 * Operation Mode: Driver, Network
 *
 * @see
 *       CHASM_DEVMODE는 SMART 프린터의 속성을 정의하고 있는 구조체(structure) 이다.<br>
 *       CASSM_DEVMODE는 SmartComm2.dll.h에 정의되어 있으며, 각각의 변수에 대한 설명은<br>
 *       디바이스 드라이버 매뉴얼을 참고하기 바란다.
 */
public class CHASM_DEVMODE {

    
public final int CCHDEVICENAME = 32;
 public   final int CCHFORMNAME = 32;
//     DEVMODEW devmode part
  // OOhhh? No???
    char dmDeviceName[] = new char[CCHDEVICENAME];
    short dmSpecVersion;
    short dmDriverVersion;
    short dmSize;
    short dmDriverExtra;
    double dmFields;
    short dmOrientation;
    short dmPaperSize;
    short dmPaperLength;
    short dmPaperWidth;
    short dmScale;
    short dmCopies;
    short dmDefaultSource;
    short dmPrintQuality;
    // POINTL  dmPosition
    int dmPosition_x;
    int dmPosition_y;
    double dmDisplayOrientation;
    double dmDisplayFixedOutput;
    short dmColor;
    short dmDuplex;
    short dmYResolution;
    short dmTTOption;
    short dmCollate;
    char dmFormName[] = new char[CCHFORMNAME];
    short dmLogPixels;
    double dmBitsPerPel;
    double dmPelsWidth;
    double dmPelsHeight;
    double dmDisplayFlags;
    double dmNup;
    double dmDisplayFrequency;
    double dmICMMethod;
    double dmICMIntent;
    double dmMediaType;
    double dmDitherType;
    double dmReserved1;
    double dmReserved2;
    double dmPanningWidth;
    double dmPanningHeight;


    /**
     *
     */
    public static long dummy1;
    /**
     *
     */
    public static long dummy2;
    /**
     *
     */
    public static char reserved[] = new char[564];
    /**
     *
     */
    public static final int SMART_MAG_BUFFER = 1024;
    //  OEM_DMEXTRAHEADER dmOEMExtra = null;
    static long dwSize;
    static long dwSignature;
    static long dwVersion;
    /////////////////////////////
    // SMART_SURFACE_OEMDEV
    /////////////////////////////
    // Color Correction
    /**
     * 인쇄물의 화질을 조절하기 위하여 모든 색의 농도를 조절한다.<br>
     * 사용되는 값은 -100에서 100 사이 이며 숫자가 클수록 진하게, 작을수록 흐리게 된다.
     */
    public static long dwCCMain;
    /**
     * Yellow의 농도를 조절한다.<br>
     * 사용되는 값은 -100에서 100 사이 이며 숫자가 클수록 진하게, 작을수록 흐리게 된다.
     */
    public static long dwCCYellow;
    /**
     * Magenta의 농도를 조절한다.<br>
     * 사용되는 값은 -100에서 100 사이 이며 숫자가 클수록 진하게, 작을수록 흐리게 된다.
     */
    public static long dwCCMagenta;
    /**
     * Cyan의 농도를 조절한다.<br>
     * 사용되는 값은 -100에서 100 사이 이며 숫자가 클수록 진하게, 작을수록 흐리게 된다.
     */
    public static long dwCCCyan;
    /**
     * Resin Black의 농도를 조절한다.<br>
     * 사용되는 값은 -100에서 100 사이 이며 숫자가 클수록 진하게, 작을수록 흐리게 된다.
     */
    public static long dwCCBlack;
    /**
     * Overlay의 농도를 조절한다.<br>
     * 사용되는 값은 -100에서 100 사이 이며 숫자가 클수록 진하게, 작을수록 흐리게 된다.
     */
    public static long dwCCOverlay;
    /**
     * 패널의 일부를 다음 페이지로 나누는 방법을 설정한다.<br>
     * 리본타입이 YMC.K.O 이며 인쇄면이 양면일 경우에 적용되며, 앞면에<br>
     * 칼라(YMC)를 인쇄 후 카드를 회전하여 뒷면에 흑백(K)을 인쇄하고 다시,<br>
     * 카드를 회전하여 앞면에 오버레이(O) 를 인쇄한다.<br>
     * 이 값이 0 이면 분리하지 않고, 1 이면 분리한다.
     */
    public static long dwDocRibbonSplit;
    /**
     *
     */
    public static long dwDocFlip;
    // Resin Black Processing
    /**
     * Text를 레진으로 추출할 때 어떤 농도 이상을 추출 할 것인지를<br>
     * 정의한다. Default는 완전한 black text만 레진으로 추출한다.<br>
     * 0 ~ 100 사이의 값을 사용하며, 숫자가 클수록 진한 농도를 작을수록 흐린 농도를 의미한다.
     */
    public static long dwBPText;
    /**
     * Dot를 레진으로 추출할 때 어떤 농도 이상을 추출 할 것인지를 정의한다.<br>
     * Default는 완전한 black dot만 레진으로 추출한다.<br>
     * 0 ~ 100 사이의 값을 사용하며, 숫자가 클수록 진한 농도를 작을수록 흐린 농도를 의미한다.
     */
    public static long dwBPDot;
    /**
     * 컬러를 블랙으로 전환할 때 어떤 값 이상으로 블랙으로 인식 할 것인지를 정의 한다. Default는 50이다.<br>
     * 0 ~ 100 사이의 값을 사용하며, 숫자가 클수록 진한 농도를 작을수록 흐린 농도를 의미한다.
     */
    public static long dwBPThreshold;
    /**
     * 블랙 디더링을 사용하는 경우에 디더링의 정도를 정의 한다. 숫자가 큰 경우에는 분산도가 크게 디더링하여
     * 부드럽게 보이고, 작은 경우에는 분산도가 작게 디더링하여 거칠게 보인다.<br>
     * 0 ~ 100 사이의 값을 사용한다.
     */
    public static long dwBPDitherDegree;
    // Extra Controls
    /**
     * dwDocEdgeFront, dwDocEdgeBack 의 값을 Use로 사용하는 경우에 테두리를 얼마나 인쇄하지 않을 것인지를 정한다.<br>
     * 0에서 100 사이의 값을 가지며, default는 20이다.
     */
    public static long dwEdgeSize;
    /**
     * 카드를 인쇄한 후 배출을 할 것인지 아닌지를 정의한다.
     * 0 이면 인쇄 후 카드를 배출하고, 1 이면 인쇄 후 카드를 배출하지 않는다.
     */
    public static long dwEjectCard;
    /**
     *
     */
    public static long dwDocPrinterType;
    /**
     *
     */
    public static long dwDocHeatControl;
    // Magnetic Stripe Encoding Method
    /**
     * ISO 타입 track1 인코딩 모드를 정한다.<br>
     * 인쇄 시 마그네틱 인코딩을 같이 하는 경우에 어떤 모드로 인코딩 할 것인지를 정의한다.<br>
     * Normal, Reverse, Bit, Normal HiCo, Reverse Bit, Bit HiCo 등 6가지<br>
     * 모드가 존재하며 Normal은 입력된 데이터를 정상 방향으로 인코딩,<br>
     * Reverse는 입력된 데이터를 역방향으로 인코딩, Bit는 입력된 데이터를<br>
     * 바이너리 데이터로 처리(0 or 1만 입력)하는 것을 말한다. 또한 뒤에<br>
     * HiCo 가 붙은 것은 HiCo 카드에 인코딩 하는 것을 의미 한다.
     * @see
     *      #define SMART_ENCODE_NORMAL 0x00<br>
     *      #define SMART_ENCODE_REVERSE 0x01<br>
     *      #define SMART_ENCODE_BIT 0x02<br>
     *      #define SMART_ENCODE_HICO_NORM 0x03<br>
     *      #define SMART_ENCODE_HICO_REV 0x04<br>
     *      #define SMART_ENCODE_HICO_BIT 0x05<
     */
    public static long dwMSTrack1;
    /**
     * ISO 타입 track2 인코딩 모드를 정한다
     */
    public static long dwMSTrack2;
    /**
     * ISO 타입 track3 인코딩 모드를 정한다
     */
    public static long dwMSTrack3;
    /**
     * JIS II 타입 인코딩 모드를 정한다
     */
    public static long dwJISTrack;
    // Magnetic Stripe Encoding Data
    /**
     * strMSTrack1, strMSTrack2, strMSTrack3, strJISTrack 항목의 값으로 마그네틱 인코딩 사용 여부를 정합니다.<br>
     * 0 – 사용하지 않음<br>
     * 1 – 사용
     */
    public static long dwManualEncoding;
    /**
     * ISO 타입 track1 인코딩 데이터
     */
    public static char strMSTrack1[] = new char[SMART_MAG_BUFFER];
    /**
     * ISO 타입 track2 인코딩 데이터
     */
    public static char strMSTrack2[] = new char[SMART_MAG_BUFFER];
    /**
     * ISO 타입 track3 인코딩 데이터
     */
    public static char strMSTrack3[] = new char[SMART_MAG_BUFFER];
    /**
     * JIS II 타입 인코딩 데이터
     */
    public static char strJISTrack[] = new char[SMART_MAG_BUFFER];
    /////////////////////////////
    // STANDARD setting area
    /////////////////////////////
    // [Paper/Ribbon/Quality]
    /**
     * Paper Tray : Paper
     * @see
     * #define SMART_SUPPLY_AUTO 0x00<br>
     * #define SMART_SUPPLY_HOPPER 0x01
     */
    public static long dwDocSupply;				// Paper Tray : Paper
    /**
     * Tray
     * @see
     * #define SMART_TRAY_CR80 0x00
     */
    public static long dwDocTray;					//            : Tray
    /**
     * 카드 프린터가 사용하는 리본의 종류를 정한다.<br>
     * SmartDCL_OpenDevice 함수가 호출되면 프린터에 장착된 리본의 종류를<br>
     * 읽어서 그 값으로 설정된다. 만약 이 값을 변경하고 싶다면<br>
     * SmartComm_GetRibbonType 함수를 사용하여 리본 종류를 알아내어 그 값으로 설정하면 된다.
     *
     * @see
     *      #define SMART_RIBBON_YMCKO 0x00 // YMCKO<br>
     *      #define SMART_RIBBON_YMCKOK 0x01 // YMCKO.K<br>
     *      #define SMART_RIBBON_hYMCKO 0x02 // half YMCKO<br>
     *      #define SMART_RIBBON_KO 0x03 // KO<br>
     *      #define SMART_RIBBON_K 0x04 // K<br>
     *      #define SMART_RIBBON_BO 0x05 // BO<br>
     *      #define SMART_RIBBON_B 0x06 // B<br>
     *      #define SMART_RIBBON_BYMCKO 0x07 // BYMCKO<br>
     *      #define SMART_RIBBON_YMCKFO 0x08 // YMCKFO<br>
     *      #define SMART_RIBBON_REWRITABLE 0x09 // Rewritable Printer
     */
    public static long dwDocRibbon;				// Ribbon     : Ribbon
    /**
     * 컬러 인쇄 시 검은색을 레진으로 추출하여 진하게 인쇄하는 방법을 정한다. 레진 추출 방법은<br>
     * Black Texts, Black Dots, Not Use 가 있다. Black Texts는 인쇄되는 데이터 중에서 검은색 글씨만 레진으로 추출<br>
     * 하는 것을 말하며 일반적으로 사용되는 방법 이다. Black Dots는 인쇄데이터 중 검은색은 모두 레진으로<br>
     * 추출하는 것이다. Not Use는 레진을 사용하지 않는 것을 의미 한다.
     *
     * @see
     *      #define SMART_RESIN_BLACKTEXT 0x00<br>
     *      #define SMART_RESIN_BLACKTDOT 0x01<br>
     *      #define SMART_RESIN_NOTUSE 0x02
     */
    public static long dwDocResin;					//            : Resin
    /**
     * 인쇄 품질을 의미하는 것으로 Standard, Fast, Partial, Semi-Partial이<br>
     * 있다. Standard는 고화질로 인쇄하는 것을 의미하며, Fast는 인쇄화질이<br>
     * 좀 떨어지지만 고속으로 인쇄하는 것이다. Partial은 화상이 존재하는<br>
     * 구간만 인쇄를 하며, Semi-Partial은 화상이 시작되는 위치부터 판넬<br>
     * 끝까지 인쇄를 한다.<br>
     * 고품질의 인쇄를 위해서 Standard 사용을 권장하며. 현재 Fast는 블랙<br>
     * 리본을 사용하는 경우에 대해서만 동작한다.
     *
     * @see
     *      #define SMART_QUALITY_STANDARD 0x00<br>
     *      #define SMART_QUALITY_VERYHIGH 0x01<br>
     *      #define SMART_QUALITY_PARTIAL 0x02<br>
     *      #define SMART_QUALITY_SEMIPARTIAL 0x03
     */
    public static long dwDocQuality;				// Quality    : Quality
    /**
     * Color와 Black & White 중에서 선택하는 것이다.
     *
     * @see
     *        #define SMART_COLOR_COLOR 0x00<br>
     *        #define SMART_COLOR_BLACKNWHITE 0x01
     */
    public static long dwDocColor;					//            : Color
    /**
     * 레진을 사용해서 Black & White로 인쇄하는 경우 어떤 디더링 알고리즘을<br>
     * 사용할 것인지를 정한다. Threshold, Random, Diffusion 3가지가 있다.<br>
     * Threshold는 기준 농도를 기준으로 black과 white를 정하는 것이고,<br>
     * Random은 디더링시 랜덤 함수를 사용하는 것이고, Diffusion는 diffusion<br>
     * 알고리즘을 사용하는 것이다. diffusion dither를 권장한다.
     *
     * @see
     *      #define SMART_DITHER_THRESHOLD 0x00<br>
     *      #define SMART_DITHER_RANDOM 0x01<br>
     *      #define SMART_DITHER_DIFFUSION 0x01
     */
    public static long dwDocDither;				//            : Diffusion Dither
    // [Side/Media]
    /**
     * 단면 인쇄를 할 것인지, 양면 인쇄를 할 것인지를 정한다.<br>
     * SmartDCL_Print 함수에서 print side 파라미터로 넘어온 값이 여기에 저장된다.<br>
     * 카드 프린터에 로테이터 옵션이 장착되지 않은 경우에는 Front 상태로 사용하고,<br>
     * 양면 옵션이 있는 경우, 앞면만 인쇄할 경우에는 Front, 양면을 인쇄할 경우에는 Both를 선택하면 된다.<br>
     * 로테이터 장착 여부는 SmartComm_GetStatus 함수를 호출하여 확인할 수 있다.
     *
     * @see
     *       #define SMART_PRINTSIDE_FRONT 0x00<br>
     *       #define SMART_PRINTSIDE_BOTH 0x01
     */
    public static long dwDocPrintSide;				// Print Side : Side
    /**
     * Front      : Media
     */
    public static long dwDocMediaFront;                     // Front      : Media
    /**
     * Back       : Media
     */
    public static long dwDocMediaBack;				// Back       : Media
    /**
     * 카드 앞면의 테두리 영역에 인쇄를 할 것인지 아닌지를 정한다.<br>
     *  0 – (Not Use) 카드 전체에 인쇄<br>
     *  1 – (Use) 카드 테두리에 인쇄하지 않음.<br>
     *  테두리 영역에도 선명하게 인쇄가 되므로 Not Use를 권장한다.
     */
    public static long dwDocEdgeFront;				// Front      : Edge
    /**
     * 카드 뒷면의 테두리 영역에 인쇄를 할 것인지 아닌지를 정한다.<br>
     *  0 – (Not Use) 카드 전체에 인쇄<br>
     *  1 – (Use) 카드 테두리에 인쇄하지 않음.<br>
     * 테두리 영역에도 선명하게 인쇄가 되므로 Not Use를 권장한다.
     */
    public static long dwDocEdgeBack;
    /**
     * Front      : Mask Bitmap URL
     */
    public static char strDocMediaUserFront[] = new char[SMART_MAG_BUFFER];
    /**
     * Back       : Mask Bitmap URL
     */
    public static char strDocMediaUserBack[] = new char[SMART_MAG_BUFFER];
    //
    //Private DevMode Members
    //

    /**
     * initialize
     */
    public void init() {
        dwSize = 0;
        dwSignature = 0;
        dwVersion = 0;

        /////////////////////////////
        // EXPERT setting area
        /////////////////////////////
        // Color Correction
        dwCCMain = 0;
        dwCCYellow = 0;
        dwCCMagenta = 0;
        dwCCCyan = 0;


        dwCCBlack = 0;
        dwCCOverlay = 0;
        dwDocRibbonSplit = 0;
        dwDocFlip = 0;
        // Resin Black Processing
        dwBPText = 0;
        dwBPDot = 0;
        dwBPThreshold = 0;
        dwBPDitherDegree = 0;
        // Extra Controls
        dwEdgeSize = 0;
        dwEjectCard = 0;
        dwDocPrinterType = 0;
        dwDocHeatControl = 0;
        // Magnetic Stripe Encoding Method
        dwMSTrack1 = 0;
        dwMSTrack2 = 0;
        dwMSTrack3 = 0;
        dwJISTrack = 0;
        // Magnetic Stripe Encoding Data
        dwManualEncoding = 0;
        for (int i = 0; i < SMART_MAG_BUFFER; i++) {
            strMSTrack1[i] = 0x00;
        }

        for (int i = 0; i < SMART_MAG_BUFFER; i++) {
            strMSTrack2[i] = 0x00;
        }
        for (int i = 0; i < SMART_MAG_BUFFER; i++) {
            strMSTrack3[i] = 0x00;
        }
        for (int i = 0; i < SMART_MAG_BUFFER; i++) {
            strJISTrack[i] = 0x00;
        }
        /////////////////////////////
        // STANDARD setting area
        /////////////////////////////
        // [Paper/Ribbon/Quality]
        dwDocSupply = 0;				// Paper Tray : Paper
        dwDocTray = 0;					//            : Tray
        dwDocRibbon = 0;				// Ribbon     : Ribbon
        dwDocResin = 0;					//            : Resin
        dwDocQuality = 0;				// Quality    : Quality
        dwDocColor = 0;					//            : Color
        dwDocDither = 0;				//            : Diffusion Dither
        // [Side/Media]
        dwDocPrintSide = 0;				// Print Side : Side
        dwDocMediaFront = 0;                     // Front      : Media
        dwDocMediaBack = 0;				// Back       : Media
        dwDocEdgeFront = 0;				// Front      : Edge
        dwDocEdgeBack = 0;				// Back       : Edge
        for (int i = 0; i < SMART_MAG_BUFFER; i++) {
            strDocMediaUserFront[i] = 0x00; 	// Front      : Mask Bitmap URL
        }
        for (int i = 0; i < SMART_MAG_BUFFER; i++) {
            strDocMediaUserBack[i] = 0x00;	// Back       : Mask Bitmap URL
        }
        //
        //Private DevMode Members
    }

    /**
     * Set dwBPDitherDegree value to this class
     * @param dwBPDitherDegree
     */
    public void setDwBPDitherDegree(long dwBPDitherDegree) {
        this.dwBPDitherDegree = dwBPDitherDegree;
    }

    /**
     * Set dwBPDot value to this class
     * @param dwBPDot
     */
    public void setDwBPDot(long dwBPDot) {
        this.dwBPDot = dwBPDot;
    }

    /**
     * Set dwBPText value to this class
     * @param dwBPText
     */
    public void setDwBPText(long dwBPText) {
        this.dwBPText = dwBPText;
    }

    /**
     * Set dwBPThreshold value to this class
     * @param dwBPThreshold
     */
    public void setDwBPThreshold(long dwBPThreshold) {
        this.dwBPThreshold = dwBPThreshold;
    }

    /**
     * Set dwCCBlack value to this class
     * @param dwCCBlack
     */
    public void setDwCCBlack(long dwCCBlack) {
        this.dwCCBlack = dwCCBlack;
    }

    /**
     * Set dwCCCyan value to this class
     * @param dwCCCyan
     */
    public void setDwCCCyan(long dwCCCyan) {
        this.dwCCCyan = dwCCCyan;
    }

    /**
     * Set dwCCMagenta value to this class
     * @param dwCCMagenta
     */
    public void setDwCCMagenta(long dwCCMagenta) {
        this.dwCCMagenta = dwCCMagenta;
    }

    /**
     * Set dwCCMain value to this class
     * @param dwCCMain
     */
    public void setDwCCMain(long dwCCMain) {
        this.dwCCMain = dwCCMain;
    }

    /**
     * Set dwCCOverlay value to this class
     * @param dwCCOverlay
     */
    public void setDwCCOverlay(long dwCCOverlay) {
        this.dwCCOverlay = dwCCOverlay;
    }

    /**
     * Set dwCCYellow value to this class
     * @param dwCCYellow
     */
    public void setDwCCYellow(long dwCCYellow) {
        this.dwCCYellow = dwCCYellow;
    }

    /**
     * Set dwDocColor value to this class
     * @param dwDocColor
     */
    public void setDwDocColor(long dwDocColor) {
        this.dwDocColor = dwDocColor;
    }

    /**
     * Set dwDocDither value to this class
     * @param dwDocDither
     */
    public void setDwDocDither(long dwDocDither) {
        this.dwDocDither = dwDocDither;
    }

    /**
     * Set dwDocEdgeBack value to this class
     * @param dwDocEdgeBack
     */
    public void setDwDocEdgeBack(long dwDocEdgeBack) {
        this.dwDocEdgeBack = dwDocEdgeBack;
    }

    /**
     * Set dwDocEdgeFront value to this class
     * @param dwDocEdgeFront
     */
    public void setDwDocEdgeFront(long dwDocEdgeFront) {
        this.dwDocEdgeFront = dwDocEdgeFront;
    }

    /**
     * Set dwDocFlip value to this class
     * @param dwDocFlip
     */
    public void setDwDocFlip(long dwDocFlip) {
        this.dwDocFlip = dwDocFlip;
    }

    /**
     * Set dwDocHeatControl value to this class
     * @param dwDocHeatControl
     */
    public void setDwDocHeatControl(long dwDocHeatControl) {
        this.dwDocHeatControl = dwDocHeatControl;
    }

    /**
     * Set dwDocMediaBack value to this class
     * @param dwDocMediaBack
     */
    public void setDwDocMediaBack(long dwDocMediaBack) {
        this.dwDocMediaBack = dwDocMediaBack;
    }

    /**
     * Set dwDocMediaFront value to this class
     * @param dwDocMediaFront
     */
    public void setDwDocMediaFront(long dwDocMediaFront) {
        this.dwDocMediaFront = dwDocMediaFront;
    }

    /**
     * Set dwDocPrintSide value to this class
     * @param dwDocPrintSide
     */
    public  void setDwDocPrintSide(long dwDocPrintSide) {
        this.dwDocPrintSide = dwDocPrintSide;
    }

    /**
     * Set dwDocPrinterType value to this class
     * @param dwDocPrinterType
     */
    public  void setDwDocPrinterType(long dwDocPrinterType) {
        this.dwDocPrinterType = dwDocPrinterType;
    }

    /**
     * Set dwDocQuality value to this class
     * @param dwDocQuality
     */
    public  void setDwDocQuality(long dwDocQuality) {
        this.dwDocQuality = dwDocQuality;
    }

    /**
     * Set dwDocResin value to this class
     * @param dwDocResin
     */
    public  void setDwDocResin(long dwDocResin) {
        this.dwDocResin = dwDocResin;
    }

    /**
     * Set dwDocRibbon value to this class
     * @param dwDocRibbon
     */
    public void setDwDocRibbon(long dwDocRibbon) {
        this.dwDocRibbon = dwDocRibbon;
    }

    /**
     * Set dwDocRibbonSplit value to this class
     * @param dwDocRibbonSplit
     */
    public  void setDwDocRibbonSplit(long dwDocRibbonSplit) {
        this.dwDocRibbonSplit = dwDocRibbonSplit;
    }

    /**
     * Set dwDocSupply value to this class
     * @param dwDocSupply
     */
    public void setDwDocSupply(long dwDocSupply) {
        this.dwDocSupply = dwDocSupply;
    }

    /**
     * Set dwDocTray value to this class
     * @param dwDocTray
     */
    public  void setDwDocTray(long dwDocTray) {
        this.dwDocTray = dwDocTray;
    }

    /**
     * Set dwEdgeSize value to this class
     * @param dwEdgeSize
     */
    public void setDwEdgeSize(long dwEdgeSize) {
        this.dwEdgeSize = dwEdgeSize;
    }

    /**
     * Set dwEjectCard value to this class
     * @param dwEjectCard
     */
    public  void setDwEjectCard(long dwEjectCard) {
        this.dwEjectCard = dwEjectCard;
    }

    /**
     * Set dwJISTrack value to this class
     * @param dwJISTrack
     */
    public  void setDwJISTrack(long dwJISTrack) {
        this.dwJISTrack = dwJISTrack;
    }

    /**
     * Set dwMSTrack1 value to this class
     * @param dwMSTrack1
     */
    public  void setDwMSTrack1(long dwMSTrack1) {
        this.dwMSTrack1 = dwMSTrack1;
    }

    /**
     * Set dwMSTrack2 value to this class
     * @param dwMSTrack2
     */
    public  void setDwMSTrack2(long dwMSTrack2) {
        this.dwMSTrack2 = dwMSTrack2;
    }

    /**
     * Set dwMSTrack3 value to this class
     * @param dwMSTrack3
     */
    public  void setDwMSTrack3(long dwMSTrack3) {
        this.dwMSTrack3 = dwMSTrack3;
    }

    /**
     * Set dwManualEncoding value to this class
     * @param dwManualEncoding
     */
    public  void setDwManualEncoding(long dwManualEncoding) {
        this.dwManualEncoding = dwManualEncoding;
    }

    /**
     * Set strDocMediaUserBack byte data to this class
     * @param strDocMediaUserBack
     */
    public void setStrDocMediaUserBack(char[] strDocMediaUserBack) {
        this.strDocMediaUserBack = strDocMediaUserBack;
    }

    /**
     * Set strDocMediaUserFront byte data to this class
     * @param strDocMediaUserFront
     */
    public void setStrDocMediaUserFront(char[] strDocMediaUserFront) {
        this.strDocMediaUserFront = strDocMediaUserFront;
    }

    /**
     * Set strJISTrack byte data to this class
     * @param strJISTrack
     */
    public void setStrJISTrack(char[] strJISTrack) {
        this.strJISTrack = strJISTrack;
    }

    /**
     * Set strMSTrack1 byte data to this class
     * @param strMSTrack1
     */
    public void setStrMSTrack1(char[] strMSTrack1) {
       this.strMSTrack1 = strMSTrack1;
    }

    /**
     * Set strMSTrack2 byte data to this class
     * @param strMSTrack2
     */
    public void setStrMSTrack2(char[] strMSTrack2) {
        this.strMSTrack2 = strMSTrack2;
    }

    /**
     * Set strMSTrack3 byte data to this class
     * @param strMSTrack3
     */
    public void setStrMSTrack3(char[] strMSTrack3) {
        this.strMSTrack3 = strMSTrack3;
    }
}
