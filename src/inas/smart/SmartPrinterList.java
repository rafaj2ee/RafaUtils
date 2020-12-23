/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inas.smart;

/**
 *
 * @author INAS
 */

public class SmartPrinterList {

    public static int	n;
    //public static SmartPrinterItem[] item = new  SmartPrinterItem[32];
    public static char[][]	name = new char[32][128];			// printer name
    public static char[][]	id = new char[32][64];                          // printer ID
    public static char[][]	dev = new char[32][64];                         // device connection
    public static char[][]	desc = new char[32][256];			// description
    public static int[] 	pid = new int[32];				// USB product ID
    public static int[]         devtype = new int[32];                                        // USB = 0; NET = 1;
}
