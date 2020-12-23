package br.com.rafaj2ee.util;


public class StatefullHelper {
	private static Integer emailJobRecycleLost = 1;
	private static Integer buscaRecycleLost = 1;
	private static Integer buscaManualRecycleLost = 1;

	private static Boolean buscaStatus = true;
	private static Boolean buscaManualStatus = true;
	public static Integer getEmailJobRecycleLost() {
		return emailJobRecycleLost;
	}
	public static void setEmailJobRecycleLost(Integer emailJobRecycleLost) {
		StatefullHelper.emailJobRecycleLost = emailJobRecycleLost;
	}
	public static Integer getBuscaRecycleLost() {
		return buscaRecycleLost;
	}
	public static void setBuscaRecycleLost(Integer buscaRecycleLost) {
		StatefullHelper.buscaRecycleLost = buscaRecycleLost;
	}
	public static Integer getBuscaManualRecycleLost() {
		return buscaManualRecycleLost;
	}
	public static void setBuscaManualRecycleLost(Integer buscaManualRecycleLost) {
		StatefullHelper.buscaManualRecycleLost = buscaManualRecycleLost;
	}
	
	public static Boolean getBuscaStatus() {
		return buscaStatus;
	}
	public static void setBuscaStatus(Boolean buscaStatus) {
		StatefullHelper.buscaStatus = buscaStatus;
		if(buscaStatus==false) {
			buscaRecycleLost++;
		} else {
			buscaRecycleLost = 1;
		}
	}
	public static Boolean getBuscaManualStatus() {
		return buscaManualStatus;
	}
	public static void setBuscaManualStatus(Boolean buscaManualStatus) {
		StatefullHelper.buscaManualStatus = buscaManualStatus;
		if(buscaManualStatus==false) {
			buscaManualRecycleLost++;
		} else {
			buscaManualRecycleLost = 1;
		}
	}
	
}
