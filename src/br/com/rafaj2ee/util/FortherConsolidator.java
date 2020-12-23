package br.com.rafaj2ee.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TreeMap;

public class FortherConsolidator implements ConsolidatorInterface {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Nome;Data;Atividade;Horas;Extras");
		TreeMap<String, TreeMap> plans = new TreeMap<String, TreeMap>(); 
		
		TreeMap frango = new TreeMap();
		frango.put(DATE_TYPE, 1);
		frango.put(DATE, 1);
		frango.put(HOUR, 7);
		frango.put(EXTRA, 8);
		frango.put(DESCRIPTION, 9);
		frango.put(NAME, "Franco Doi");
		frango.put(LINE_START, 11);
		frango.put(LINE_END, 43);

		plans.put("FrancoDoi.csv", frango);

		TreeMap kimura = new TreeMap();
		kimura.put(NAME, "Luis Kimura");
		kimura.put(DATE_TYPE, 2);
		kimura.put(DATE, 0);
		kimura.put(HOUR, 6);
		kimura.put(EXTRA, 12);
		kimura.put(DESCRIPTION, 5);
		kimura.put(LINE_START, 9);
		kimura.put(LINE_END, 39);

		plans.put("LuisKimura.csv", kimura);

		TreeMap rafaelLima = new TreeMap();
		rafaelLima.put(NAME, "Rafael Lima");
		rafaelLima.put(DATE_TYPE, 2);
		rafaelLima.put(DATE, 0);
		rafaelLima.put(HOUR, 6);
		rafaelLima.put(EXTRA, 12);
		rafaelLima.put(DESCRIPTION, 5);
		rafaelLima.put(LINE_START, 9);
		rafaelLima.put(LINE_END, 40);
		
		plans.put("RafaelLima.csv", rafaelLima);

		TreeMap rafaelTeixeira = new TreeMap();
		rafaelTeixeira.put(NAME, "Rafael Teixeira");
		rafaelTeixeira.put(DATE_TYPE, 2);
		rafaelTeixeira.put(DATE, 0);
		rafaelTeixeira.put(HOUR, 6);
		rafaelTeixeira.put(EXTRA, 12);
		rafaelTeixeira.put(DESCRIPTION, 5);
		rafaelTeixeira.put(LINE_START, 9);
		rafaelTeixeira.put(LINE_END, 40);
		
		plans.put("RafaelTeixeira.csv", rafaelTeixeira);

		TreeMap pedroBressan = new TreeMap();
		pedroBressan.put(NAME, "Pedro Bressan");
		pedroBressan.put(DATE_TYPE, 2);
		pedroBressan.put(DATE, 0);
		pedroBressan.put(HOUR, 6);
		pedroBressan.put(EXTRA, 12);
		pedroBressan.put(DESCRIPTION, 5);
		pedroBressan.put(LINE_START, 9);
		pedroBressan.put(LINE_END, 50);
		
		plans.put("Pbressan.csv", pedroBressan);		
		
		for(String planName: plans.keySet()){  
	          TreeMap planConf = (TreeMap) plans.get(planName);
	          try {
				String planString = FileUtils.readFileAsString(PATH+planName);
				String[] planLines = planString.split(LINE_NEXT);
				for(int i = (Integer) planConf.get(LINE_START); i<(Integer) planConf.get(LINE_END); i++) {
					String[] planData = planLines[i].split(SEMICOLON);
					String date = planData[(Integer) planConf.get(DATE)];
					Integer dateType = (Integer) planConf.get(DATE_TYPE);
					if(dateType == 2) {
						Calendar calendar = GregorianCalendar.getInstance();
						SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
						calendar.set(GregorianCalendar.YEAR, ACTUAL_YEAR);
						calendar.set(GregorianCalendar.MONTH, ACTUAL_MONTH);
						calendar.set(GregorianCalendar.DAY_OF_MONTH, Integer.parseInt(date));
						date = sdf.format(calendar.getTime());
					}
					String hour = planData[(Integer) planConf.get(HOUR)];
					String extra = planData[(Integer) planConf.get(EXTRA)];
					if(hour.trim().isEmpty()) {
						hour = ZERO_HOURS;
					} else if(hour.trim().length()==4){
						hour = ZERO+hour;
					}
					
					if(extra.trim().isEmpty()||extra.trim().equalsIgnoreCase(QUOTES)) {
						extra = ZERO_HOURS;
					} else if(extra.trim().length()==4){
						extra = ZERO+extra;
					}

					System.out.println(planConf.get(NAME)+SEMICOLON+date+SEMICOLON+planData[(Integer) planConf.get(DESCRIPTION)]+SEMICOLON+hour+SEMICOLON+extra);					
				}

	          } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  		System.out.println("TOTAL;;;;");
	  		System.out.println(";;;;");
		}  
	}

}
