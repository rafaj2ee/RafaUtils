package br.com.rafaj2ee.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Class created to add zimbra users or update them
 * @author Rafael Lima
 *
 */
public class ZimbraAddUsers {

	public static final String 	SEMICOLON 		= ";";
	public static final String 	COMMA	 		= ",";
	public static final String 	LINE_NEXT 		= "\n";
	public static final String 	QUOTES 			= "\"";
	public static final String 	PASSWORD 		= "rafaj2ee1";
	public static final String 	DISPLAY_NAME	= "displayName";
	public static final String 	EMPTY			= "";
	public static final String	COMMAND_ZMPROV	= "/opt/zimbra/bin/zmprov";
	public static final String 	TRUE			= "TRUE";
	public static final String 	CHANGE_PASSWORD	= "zimbraPasswordMustChange";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = null;
        //creation param
        String param = "ca";
        ArrayList<Integer> celNumber = new ArrayList<Integer>();
        celNumber.add(5);
        celNumber.add(0);
        try {
        	String planString = FileUtils.readFileAsString(args[0]);
			String[] planLines = planString.split(LINE_NEXT);
	    // run the Unix "ps -ef" command
            // using the Runtime exec method:
            //System.in.
            Runtime runtime = Runtime.getRuntime(); 
        	String su[] = {"su","zimbra"};
            Process p = runtime.exec(su);
        	String content = "";
            for(int i = 1; i < planLines.length; i++) {

            	String[] cells = planLines[i].split(SEMICOLON);
            	//String execArray[] = {"/opt/zimbra/bin/zmprov", "ca", cells[5].trim().replaceAll(QUOTES, "").toLowerCase()+" rafaj2ee1 displayName "+(cells[0].indexOf(QUOTES)!=-1?cells[0].trim():QUOTES+QUOTES)+" zimbraPasswordMustChange TRUE"};
            	String execArray[] = {COMMAND_ZMPROV, param, cells[celNumber.get(0)].trim().replaceAll(QUOTES, EMPTY).toLowerCase(),PASSWORD, DISPLAY_NAME,(cells[0].indexOf(QUOTES)!=-1?cells[0].trim().replaceAll(QUOTES, EMPTY):EMPTY), CHANGE_PASSWORD, TRUE};
            	//more arguments increase logic
            	if(args.length>1) {            		
            		execArray=null;
            		if(args.length>2) {
            			celNumber = new ArrayList<Integer>();
            			if(args[2].split(COMMA).length>1) {
            				for(String number: args[2].split(COMMA)){
                    			celNumber.add(new Integer(number));   
            				}
            			} else {
                			celNumber.add(new Integer(args[2]));
                    		execArray = new String[]{COMMAND_ZMPROV, param, content};
            			}
                		content = cells[celNumber.get(0)].trim().replaceAll(QUOTES, EMPTY).toLowerCase();
            			cells[celNumber.get(0)].trim().replaceAll(QUOTES, EMPTY);
            		}
            		param = args[1];
            		//when you have only one cell index it will not include the display name
            		if(execArray==null) {
                		execArray = new String[]{COMMAND_ZMPROV, param, content, DISPLAY_NAME,(cells[celNumber.get(1)].indexOf(QUOTES)!=-1?cells[celNumber.get(0)].trim().replaceAll(QUOTES, EMPTY):EMPTY)};            			
            		}
            		if(param.split(COMMA).length>1) {
            			ArrayList<String> newList = new ArrayList<String>();
            			newList.addAll(Arrays.asList(execArray));  
            			int changeIndex = 1;
            			newList.remove(changeIndex);
            			for(String par : param.split(COMMA)) {
            				newList.add(changeIndex,par);
            				changeIndex++;
            			}
            			execArray = newList.toArray(new String[0]);
            		}
            		
            	}
            	for(String temp: execArray) {
            		System.out.print(temp+" ");
            	}
            	System.out.println("- REG -"+i);
            	p = runtime.exec(execArray);
            }        
            BufferedReader stdInput = new BufferedReader(new 
                 InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new 
                 InputStreamReader(p.getErrorStream()));

            // read the output from the command
            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
            
            // read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
            
            System.exit(0);
        }
        catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
	}

}
