package br.com.rafaj2ee.util;

import java.io.IOException;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailConsolidator implements ConsolidatorInterface {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeMap<String, TreeMap> plans = new TreeMap<String, TreeMap>(); 
		TreeMap<String, String> ignore = new TreeMap<String, String>();	
		TreeMap kelitonLinkedin = new TreeMap();
		String ignoreString = "";
		plans.put("linkedinkelinton.csv", kelitonLinkedin);
		TreeMap rafaelGmail = new TreeMap();

		plans.put("rafael_contacts.csv", rafaelGmail);

		TreeMap giuseppe = new TreeMap();

		plans.put("giuseppelinkedin.csv", giuseppe);
		
		TreeMap rafaelLima = new TreeMap();
		
		plans.put("rafael_linkedin_connections_export_microsoft_outlook.csv", rafaelLima);	
		
		TreeMap carlaGail = new TreeMap();
		
		plans.put("contactsGmailCarla.csv", carlaGail);	
		
		
        int emails=0;
		Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
		String errados = "";
		TreeMap<String, String> result = new TreeMap<String, String>();
		
		for(String planName: plans.keySet()){ 

	          try {
	        	ignoreString = FileUtils.readFileAsString(PATHEMAILS+"ignorelist.csv");
	        	String planString = FileUtils.readFileAsString(PATHEMAILS+planName);
				String[] planLines = planString.split(LINE_NEXT);
				for(int i = 1; i< planLines.length; i++) {
					String[] planData = planLines[i].split(COMA);
					for(int i1 = 0 ; i1 < planData.length; i1 ++){
						if(planData[i1]!=null&&planData[i1].length()>0&&planData[i1].indexOf(AT)!=-1) {
							planData[i1] = planData[i1].replaceAll("\"",EMPTY);
							Matcher m = p.matcher(planData[i1]);
							boolean matchFound = m.matches();
							if (matchFound) {
								emails++;
								result.put(planData[i1].trim(), planData[i1]);
											
							} else {
								errados += planData[i1]+", ";
							}

						}	
					}							
				}

	          } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	

		} 
		ignoreString=ignoreString.replaceAll(SEMICOLON, EMPTY);
		String[] ignoreLines = ignoreString.split(LINE_NEXT);

		for(int i = 1; i< ignoreLines.length; i++) {
			String[] planData = ignoreLines[i].split(COMA);
			for(int i1 = 0 ; i1 < planData.length; i1 ++){
				ignore.put(planData[i1].trim(),planData[i1]);
			}
		}
		String resultEmails = "";
		int emaisCount=0;
		int variablePercent = 500;
		for(String email: result.keySet()){
			if(emaisCount%variablePercent==0&& emaisCount!=0&&resultEmails.length()>1) {
				System.out.print(LINE_NEXT+resultEmails.substring(0, resultEmails.length()-2));
				resultEmails = "";
				/*
				if(emaisCount==2000){
					variablePercent = 100;
				}
				*/
			} else {

			}
			if(		email.indexOf("2856.")== -1 &&
					email.indexOf("forther.com")== -1 &&
					email.indexOf("plusoft.com.br")== -1 &&
					email.indexOf("plurismidia.com.br")== -1 &&
					email.indexOf("atendimento")== -1 &&
					email.indexOf("digicon.com.br")== -1 &&
					email.indexOf("borland.com")== -1 &&
					email.indexOf("orga-systems.com")== -1 &&
					email.indexOf("ewave.com.br")== -1 &&
					email.indexOf("dtslatin.com")== -1 &&
					email.indexOf("dtsconsulting.com")== -1 &&
					email.indexOf("tech4b.com.br")== -1 &&
					(ignore.isEmpty() || !ignore.containsKey(email))) {
				emaisCount++;
				resultEmails += email+", ";				
			}

		}
		System.out.print(LINE_NEXT+resultEmails.substring(0, resultEmails.length()-2));
		System.out.println(LINE_NEXT+"Total processados: "+emails+ " - Total Validos: "+emaisCount+" - Total Ignorados: "+ignore.size());
        System.out.println("Errados - "+errados);
	}

}
