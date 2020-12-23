/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inas.smart;

/**
 *
 * @author Kyle
 */
public class SmartPrinterInfo {
    ///////////////////////////SmartPrinterStandard///////////////////////////////////////
    public static char[]	name = new char[256];			// printer name
    public static char[]	id = new char[256];			// printer ID
    public static char[]	dev = new char[256];			// device connection
    public static int[]		dev_type = new int[1];;       			// 1=USB, 2=NET
    public static int[]		pid = new int[1];                                    // USB product ID

    //////////////////SmartPrinterStandard_SmartPrinterPortUSB/////////////////////////////
    public static char[]        usbport = new char[256];			// usb port
    public static char[]    	link = new char[256];			// symbolic link of usb port
    public static int[]		is_bridge = new int[1];;                              // Network module bridge
    
    //////////////////SmartPrinterStandard_SmartPrinterPortNet/////////////////////////////
    public static char[]	ver = new char[256];			// version of network protocol
    public static char[] 	ip = new char[256];			// ip address
    public static int[]		tcpport = new int[1];                                // tcp port
    public static int[]		is_ssl = new int[1];                                 // ssl protocol

    ///////////////////////////SmartPrinterStandard///////////////////////////////////////
    public static int[]		is_dual = new int[1];        			// dual printer
    public static char[]	ic1 = new char[256];			// internal contact encoder
    public static char[]	ic2 = new char[256];			// external contact SIM encoder
    public static char[]	rf1 = new char[256];			// internal contactless encoder
    public static char[]	rf2 = new char[256];			// external contactless encoder
}
