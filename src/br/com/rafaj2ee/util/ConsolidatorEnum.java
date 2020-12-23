package br.com.rafaj2ee.util;

import java.util.TreeMap;

public enum ConsolidatorEnum implements ConsolidatorInterface{
	FDOI {
		TreeMap funcionario = new TreeMap();			
		/*
		funcionario.put(DATE_TYPE, 1);
		funcionario.put(DATE, 2);
		funcionario.put(HOUR, 7);
		funcionario.put(EXTRA, 8);
		funcionario.put(DESCRIPTION, 9);
		fdoi.put(NAME, "Franco Doi");
		fdoi.put(LINE_START, 11);
		fdoi.put(LINE_END, 41);
		*/
	}, 
	HSANTOS {
		 
	},
	LFKIMURA{
		
	}	, 
	PBRESSAN, 
	RNASCIMENTO, 
	RTEIXEIRA;
	private ConsolidatorEnum() {
		funcionario = new TreeMap();
	}
	private TreeMap funcionario;

	private void setFuncionario() {
	}
	
	public TreeMap getFuncionario() {
		return funcionario;
	}
}
