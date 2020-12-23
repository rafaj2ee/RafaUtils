package br.com.rafaj2ee.util;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.internet.InternetAddress;

import org.apache.log4j.Logger;

public class Constants {
	private static Logger log = Logger.getLogger(Constants.class);
	private static final Properties properties = new Properties();
	
	public static String CONFIG_FILE = "/NOTIFICATION.properties";
	public static String CONFIG_DIR = "";
	public static String DIA = "DIA";
	public static String HORA = "HORA";
	public static String MINUTO = "MINUTO";
	public static String HOME = "/var/www/aniversario";
	public static final String 	SEMICOLON 		= ";";
	public static final String 	LINE_NEXT 		= "\n";
	public static final String 	QUOTES 			= "\"";
	public static final String 	EMPTY 			= "";
	public static final String 	CHARSET 		= "ISO-8859-1";
	public static Boolean ENVIAR_EMAIL = false; 
	public static Character COD_MODELO_RECUPERACAO_FULL = null;
	public static Character COD_MODELO_RECUPERACAO_SIMPLE = null;
	public static Integer STATUS_OK = null;
	public static Integer STATUS_NAO_OK = null;
	public static Integer STATUS_ERRO = null;
	public static Integer STATUS_DESCONHECIDO = null;
	public static Character ATIVO = null;
	public static Character INATIVO = null;
	public static Integer TIPO_PERIODO_DIA = null;	
	public static Integer TIPO_PERIODO_SEMANA = null;	
	public static Integer TIPO_PERIODO_QUINZENA = null;
	public static Integer TIPO_PERIODO_MES = null;
	public static Integer TIPO_PERIODO_BIMESTE = null;	
	public static Integer TIPO_PERIODO_TRIMESTRE = null;
	public static Integer TIPO_PERIODO_SEMESTRE = null;
	public static Integer TIPO_PERIODO_ANO = null;	
	public static String FAILED_MAIL_MINUTES = null;
	public static String MAIL_SUBJECT = null;
	public static Address FROM_ADDRESS = null;
	public static String MAIL_USER = null;
	public static String MAIL_TO_USER = null;
	public static String MAIL_AUTHENTICATOR = null;
	public static String MAIL_AUTHENTICATOR_PASSWORD = null;
	public static String MAIL_AUTHENTICATOR_USER = null;
	public static String SMTP_PORT = null;
	public static String SMTP_ADDRESS = null;
	public static String MAIL_FROM = null;
	public static String LIB = null;
	public static String QUARTZ_CONFIG = null;
	public static SimpleDateFormat dateFormat = null;
	public static SimpleDateFormat procDateFormat = null;
	public static String HIBERNATE_CONFIG = null;
	public static String LOG4J_CONFIG = null;
	public static String SERVICE_NAME = null;
	public static String SERVICE_DESCRIPTION = null;
	public static String SERVICE_EXE = null;
	public static String SERVICE_JAR = null;
	public static String LIBRARY_PATH = null;
	public static String RECYCLE_TIME = null;
	public static String INSTALL_MAX_MEMORY = null;
	public static String STATUS_MON_RECYCLE_TIME_MINUTES = null;
	public static Boolean CRIPTOGRAFIA_ATIVADA = false;
	public static String NENHUM_REGISTRO_RETORNADO = null;
	public static String BIRTHDAY_SUBJECT = null;
	public static String BIRTHDAY_CSV = null;
	public static String BIRTHDAY_HTML = null;
	public static Properties getProperties() {
		return properties;
	}

	static {
		try {
			properties.load(new InputStreamReader(new FileInputStream(HOME+CONFIG_DIR+CONFIG_FILE), CHARSET));
			log.info("Properties loaded");
			LIB = properties.getProperty("LIB").trim();	
			QUARTZ_CONFIG = properties.getProperty("QUARTZ_CONFIG").trim();
			dateFormat = new SimpleDateFormat(properties.getProperty("dateFormat").trim());
			procDateFormat = new SimpleDateFormat(properties.getProperty("procDateFormat").trim());
			HIBERNATE_CONFIG = properties.getProperty("HIBERNATE_CONFIG").trim();
			LOG4J_CONFIG = properties.getProperty("LOG4J_CONFIG").trim();
			SERVICE_NAME = properties.getProperty("SERVICE_NAME").trim();
			SERVICE_DESCRIPTION = properties.getProperty("SERVICE_DESCRIPTION").trim();
			SERVICE_EXE = properties.getProperty("SERVICE_EXE").trim();
			SERVICE_JAR = properties.getProperty("SERVICE_JAR").trim();
			LIBRARY_PATH = properties.getProperty("LIBRARY_PATH").trim();
			RECYCLE_TIME = properties.getProperty("RECYCLE_TIME_MINUTES").trim();
			INSTALL_MAX_MEMORY = properties.getProperty("INSTALL_MAX_MEMORY").trim();
			STATUS_MON_RECYCLE_TIME_MINUTES = properties.getProperty("STATUS_MON_RECYCLE_TIME_MINUTES");
			MAIL_FROM = properties.getProperty("MAIL_FROM");
			SMTP_ADDRESS = properties.getProperty("SMTP_ADDRESS");
			SMTP_PORT = properties.getProperty("SMTP_PORT");
			MAIL_AUTHENTICATOR_USER = properties.getProperty("MAIL_AUTHENTICATOR_USER");
			MAIL_TO_USER = properties.getProperty("MAIL_TO_USER");
			MAIL_AUTHENTICATOR_PASSWORD = properties.getProperty("MAIL_AUTHENTICATOR_PASSWORD");
			MAIL_AUTHENTICATOR = properties.getProperty("MAIL_AUTHENTICATOR");
			MAIL_USER = properties.getProperty("MAIL_USER");
			MAIL_SUBJECT = properties.getProperty("MAIL_SUBJECT");
			FROM_ADDRESS = new InternetAddress(MAIL_FROM, MAIL_USER);
			FAILED_MAIL_MINUTES = properties.getProperty("FAILED_MAIL_MINUTES");
			ATIVO = properties.getProperty("ATIVO").charAt(0);	
			INATIVO = properties.getProperty("INATIVO").charAt(0);
			TIPO_PERIODO_DIA = new Integer(properties.getProperty("TIPO_PERIODO_DIA"));	
			TIPO_PERIODO_SEMANA = new Integer(properties.getProperty("TIPO_PERIODO_SEMANA"));	
			TIPO_PERIODO_QUINZENA = new Integer(properties.getProperty("TIPO_PERIODO_QUINZENA"));	
			TIPO_PERIODO_MES = new Integer(properties.getProperty("TIPO_PERIODO_MES"));	
			TIPO_PERIODO_BIMESTE = new Integer(properties.getProperty("TIPO_PERIODO_BIMESTE"));	
			TIPO_PERIODO_TRIMESTRE = new Integer(properties.getProperty("TIPO_PERIODO_TRIMESTRE"));	
			TIPO_PERIODO_SEMESTRE = new Integer(properties.getProperty("TIPO_PERIODO_SEMESTRE"));	
			TIPO_PERIODO_ANO = new Integer(properties.getProperty("TIPO_PERIODO_ANO"));	
			STATUS_OK = new Integer(properties.getProperty("STATUS_OK"));	
			STATUS_NAO_OK = new Integer(properties.getProperty("STATUS_NAO_OK"));	
			STATUS_ERRO = new Integer(properties.getProperty("STATUS_ERRO"));	
			STATUS_DESCONHECIDO = new Integer(properties.getProperty("STATUS_DESCONHECIDO"));	
			COD_MODELO_RECUPERACAO_FULL = properties.getProperty("COD_MODELO_RECUPERACAO_FULL").charAt(0);
			COD_MODELO_RECUPERACAO_SIMPLE = properties.getProperty("COD_MODELO_RECUPERACAO_SIMPLE").charAt(0);
			CRIPTOGRAFIA_ATIVADA = new Boolean(properties.getProperty("CRIPTOGRAFIA_ATIVADA"));
			ENVIAR_EMAIL = new Boolean(properties.getProperty("ENVIAR_EMAIL"));
			NENHUM_REGISTRO_RETORNADO = properties.getProperty("NENHUM_REGISTRO_RETORNADO");
			BIRTHDAY_SUBJECT = properties.getProperty("BIRTHDAY_SUBJECT");
			BIRTHDAY_CSV = properties.getProperty("BIRTHDAY_CSV");
			BIRTHDAY_HTML = properties.getProperty("BIRTHDAY_HTML");
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e);
		}

	}
}
