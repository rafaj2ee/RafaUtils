/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inas.smart;

/**
 * Class OEMDEV device structure
 * @author inasystem
 */
public class OEMDEV {

    /**
     * Constant<br>
     * SMART_MAG_BUFFER = 1024
     */
    public static final int SMART_MAG_BUFFER = 1024;
//    OEM_DMEXTRAHEADER dmOEMExtra = null;
    /**
     * variable long dwSize
     */
    public static long dwSize;
    /**
     * variable long dwSignature
     */
    public static long dwSignature;
    /**
     * variable long dwVersion
     */
    public static long dwVersion;
    /////////////////////////////
    // EXPERT setting area
    /////////////////////////////
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
     * Printer Type ( Not Used yet)
     */
    public static long dwDocPrinterType;
    /**
     * dwDocHeatControl ( Not Used yet)
     */
    public static long dwDocHeatControl;
    // Magnetic Stripe Encoding Method
    /**
     * ISO 타입 track1 인코딩 모드를 정한다.<p>>
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
     *      #define SMART_ENCODE_HICO_BIT 0x05
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
    public static byte strMSTrack1[] = new byte[SMART_MAG_BUFFER];
    /**
     * ISO 타입 track2 인코딩 데이터
     */
    public static byte strMSTrack2[] = new byte[SMART_MAG_BUFFER];
    /**
     * ISO 타입 track3 인코딩 데이터
     */
    public static byte strMSTrack3[] = new byte[SMART_MAG_BUFFER];
    /**
     * JIS II 타입 인코딩 데이터
     */
    public static byte strJISTrack[] = new byte[SMART_MAG_BUFFER];
    /////////////////////////////
    // STANDARD setting area
    /////////////////////////////
    // [Paper/Ribbon/Quality]
    /**
     * Paper Tray : Paper
     * #define SMART_SUPPLY_AUTO 0x00<br>
     * #define SMART_SUPPLY_HOPPER 0x01
     * @see
     */
    public static long dwDocSupply;				// Paper Tray : Paper
    /**
     * Doc Tray
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
     *
     */
    public static long dwDocMediaFront;                     // Front      : Media
    /**
     *
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
    public static long dwDocEdgeBack;				// Back       : Edge
    /**
     * Front      : Mask Bitmap URL
     */
    public static byte strDocMediaUserFront[] = new byte[SMART_MAG_BUFFER]; 	// Front      : Mask Bitmap URL
    /**
     * Back       : Mask Bitmap URL
     */
    public static byte strDocMediaUserBack[] = new byte[SMART_MAG_BUFFER];	// Back       : Mask Bitmap URL //
    //Private DevMode Members
    //

    /**
     * Initialize of OEMDEV class
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
        for (int i = 0; i < 1024; i++) {
            strMSTrack1[i] = 0;
        }
        for (int i = 0; i < SMART_MAG_BUFFER; i++) {
            strMSTrack2[i] = 0;
        }
        for (int i = 0; i < SMART_MAG_BUFFER; i++) {
            strMSTrack3[i] = 0;
        }
        for (int i = 0; i < SMART_MAG_BUFFER; i++) {
            strJISTrack[i] = 0;
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
            strDocMediaUserFront[i] = 0; 	// Front      : Mask Bitmap URL
        }
        for (int i = 0; i < SMART_MAG_BUFFER; i++) {
            strDocMediaUserBack[i] = 0;	// Back       : Mask Bitmap URL
        }
        //
        //Private DevMode Members
    }

    /**
     *
     * @param dwBPDitherDegree
     */
    public static void setDwBPDitherDegree(long dwBPDitherDegree) {
        OEMDEV.dwBPDitherDegree = dwBPDitherDegree;
    }

    /**
     *
     * @param dwBPDot
     */
    public static void setDwBPDot(long dwBPDot) {
        OEMDEV.dwBPDot = dwBPDot;
    }

    /**
     *
     * @param dwBPText
     */
    public static void setDwBPText(long dwBPText) {
        OEMDEV.dwBPText = dwBPText;
    }

    /**
     *
     * @param dwBPThreshold
     */
    public static void setDwBPThreshold(long dwBPThreshold) {
        OEMDEV.dwBPThreshold = dwBPThreshold;
    }

    /**
     *
     * @param dwCCBlack
     */
    public static void setDwCCBlack(long dwCCBlack) {
        OEMDEV.dwCCBlack = dwCCBlack;
    }

    /**
     *
     * @param dwCCCyan
     */
    public static void setDwCCCyan(long dwCCCyan) {
        OEMDEV.dwCCCyan = dwCCCyan;
    }

    /**
     *
     * @param dwCCMagenta
     */
    public static void setDwCCMagenta(long dwCCMagenta) {
        OEMDEV.dwCCMagenta = dwCCMagenta;
    }

    /**
     *
     * @param dwCCMain
     */
    public static void setDwCCMain(long dwCCMain) {
        OEMDEV.dwCCMain = dwCCMain;
    }

    /**
     *
     * @param dwCCOverlay
     */
    public static void setDwCCOverlay(long dwCCOverlay) {
        OEMDEV.dwCCOverlay = dwCCOverlay;
    }

    /**
     *
     * @param dwCCYellow
     */
    public static void setDwCCYellow(long dwCCYellow) {
        OEMDEV.dwCCYellow = dwCCYellow;
    }

    /**
     *
     * @param dwDocColor
     */
    public static void setDwDocColor(long dwDocColor) {
        OEMDEV.dwDocColor = dwDocColor;
    }

    /**
     *
     * @param dwDocDither
     */
    public static void setDwDocDither(long dwDocDither) {
        OEMDEV.dwDocDither = dwDocDither;
    }

    /**
     *
     * @param dwDocEdgeBack
     */
    public static void setDwDocEdgeBack(long dwDocEdgeBack) {
        OEMDEV.dwDocEdgeBack = dwDocEdgeBack;
    }

    /**
     *
     * @param dwDocEdgeFront
     */
    public static void setDwDocEdgeFront(long dwDocEdgeFront) {
        OEMDEV.dwDocEdgeFront = dwDocEdgeFront;
    }

    /**
     *
     * @param dwDocFlip
     */
    public static void setDwDocFlip(long dwDocFlip) {
        OEMDEV.dwDocFlip = dwDocFlip;
    }

    /**
     *
     * @param dwDocHeatControl
     */
    public static void setDwDocHeatControl(long dwDocHeatControl) {
        OEMDEV.dwDocHeatControl = dwDocHeatControl;
    }

    /**
     *
     * @param dwDocMediaBack
     */
    public static void setDwDocMediaBack(long dwDocMediaBack) {
        OEMDEV.dwDocMediaBack = dwDocMediaBack;
    }

    /**
     *
     * @param dwDocMediaFront
     */
    public static void setDwDocMediaFront(long dwDocMediaFront) {
        OEMDEV.dwDocMediaFront = dwDocMediaFront;
    }

    /**
     *
     * @param dwDocPrintSide
     */
    public static void setDwDocPrintSide(long dwDocPrintSide) {
        OEMDEV.dwDocPrintSide = dwDocPrintSide;
    }

    /**
     *
     * @param dwDocPrinterType
     */
    public static void setDwDocPrinterType(long dwDocPrinterType) {
        OEMDEV.dwDocPrinterType = dwDocPrinterType;
    }

    /**
     *
     * @param dwDocQuality
     */
    public static void setDwDocQuality(long dwDocQuality) {
        OEMDEV.dwDocQuality = dwDocQuality;
    }

    /**
     *
     * @param dwDocResin
     */
    public static void setDwDocResin(long dwDocResin) {
        OEMDEV.dwDocResin = dwDocResin;
    }

    /**
     *
     * @param dwDocRibbon
     */
    public static void setDwDocRibbon(long dwDocRibbon) {
        OEMDEV.dwDocRibbon = dwDocRibbon;
    }

    /**
     *
     * @param dwDocRibbonSplit
     */
    public static void setDwDocRibbonSplit(long dwDocRibbonSplit) {
        OEMDEV.dwDocRibbonSplit = dwDocRibbonSplit;
    }

    /**
     *
     * @param dwDocSupply
     */
    public static void setDwDocSupply(long dwDocSupply) {
        OEMDEV.dwDocSupply = dwDocSupply;
    }

    /**
     *
     * @param dwDocTray
     */
    public static void setDwDocTray(long dwDocTray) {
        OEMDEV.dwDocTray = dwDocTray;
    }

    /**
     *
     * @param dwEdgeSize
     */
    public static void setDwEdgeSize(long dwEdgeSize) {
        OEMDEV.dwEdgeSize = dwEdgeSize;
    }

    /**
     *
     * @param dwEjectCard
     */
    public static void setDwEjectCard(long dwEjectCard) {
        OEMDEV.dwEjectCard = dwEjectCard;
    }

    /**
     *
     * @param dwJISTrack
     */
    public static void setDwJISTrack(long dwJISTrack) {
        OEMDEV.dwJISTrack = dwJISTrack;
    }

    /**
     *
     * @param dwMSTrack1
     */
    public static void setDwMSTrack1(long dwMSTrack1) {
        OEMDEV.dwMSTrack1 = dwMSTrack1;
    }

    /**
     *
     * @param dwMSTrack2
     */
    public static void setDwMSTrack2(long dwMSTrack2) {
        OEMDEV.dwMSTrack2 = dwMSTrack2;
    }

    /**
     *
     * @param dwMSTrack3
     */
    public static void setDwMSTrack3(long dwMSTrack3) {
        OEMDEV.dwMSTrack3 = dwMSTrack3;
    }

    /**
     *
     * @param dwManualEncoding
     */
    public static void setDwManualEncoding(long dwManualEncoding) {
        OEMDEV.dwManualEncoding = dwManualEncoding;
    }

    /**
     * set strDocMediaUserBack byte array
     * @param strDocMediaUserBack
     */
    public static void setStrDocMediaUserBack(byte[] strDocMediaUserBack) {
        OEMDEV.strDocMediaUserBack = strDocMediaUserBack;
    }

    /**
     * set strDocMediaUserFront byte array
     * @param strDocMediaUserFront
     */
    public static void setStrDocMediaUserFront(byte[] strDocMediaUserFront) {
        OEMDEV.strDocMediaUserFront = strDocMediaUserFront;
    }

    /**
     * set strJISTrack
     * @param strJISTrack
     */
    public static void setStrJISTrack(byte[] strJISTrack) {
        OEMDEV.strJISTrack = strJISTrack;
    }

    /**
     *set strMSTrack1
     * @param strMSTrack1
     */
    public static void setStrMSTrack1(byte[] strMSTrack1) {
        OEMDEV.strMSTrack1 = strMSTrack1;
    }

    /**
     * set strMSTrack2
     * @param strMSTrack2
     */
    public static void setStrMSTrack2(byte[] strMSTrack2) {
        OEMDEV.strMSTrack2 = strMSTrack2;
    }

    /**
     * set strMSTrack3
     * @param strMSTrack3
     */
    public static void setStrMSTrack3(byte[] strMSTrack3) {
        OEMDEV.strMSTrack3 = strMSTrack3;
    }
}
