package br.com.rafaj2ee.util;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;



public class SmtpMail {
		public void sendmail(String to, String subject, String msgBody) throws MessagingException, UnsupportedEncodingException {
			Message message = new MimeMessage(getSession());
			Address adress[] = {new InternetAddress(to)};
			message.setFrom(Constants.FROM_ADDRESS);
			message.addRecipients(RecipientType.TO, adress);
			message.addFrom(new InternetAddress[] { new InternetAddress(Constants.MAIL_FROM) });
			message.setReplyTo(adress);
			message.setSubject(MimeUtility.encodeText(subject, Constants.CHARSET, "Q"));
			message.setContent(msgBody, "text/plain");

			Transport.send(message);
		}

		public void sendmailHTML(String to, String subject, String msgBody) throws MessagingException, UnsupportedEncodingException {
			MimeMessage message = new MimeMessage(getSession());

			message.addRecipient(RecipientType.TO, new InternetAddress(to));
			message.addFrom(new InternetAddress[] { new InternetAddress(Constants.MAIL_FROM) });
			message.setSubject(MimeUtility.encodeText(subject, Constants.CHARSET, "Q"), Constants.CHARSET);
			message.setContent(msgBody, "text/html;charset=\""+Constants.CHARSET+"\"");

			Transport.send(message);
		}

		public void sendmailHTML(String to, String subject, String msgBody, String attach) throws MessagingException, UnsupportedEncodingException {
			Message message = new MimeMessage(getSession());

			message.addRecipient(RecipientType.TO, new InternetAddress(to));
			message.addFrom(new InternetAddress[] { new InternetAddress(Constants.MAIL_FROM) });
			message.setSubject(MimeUtility.encodeText(subject, Constants.CHARSET, "Q"));
			//message.setContent(msgBody, "text/html;charset=\""+Constants.CHARSET+"\"");
			message.setSentDate(new Date());
			// create and fill the first message part
	        MimeBodyPart mbp1 = new MimeBodyPart();
	        mbp1.setContent(msgBody, "text/html;charset=\""+Constants.CHARSET+"\"");
			// create and fill the second message part
	        MimeBodyPart mbp2 = new MimeBodyPart();
	        // Use setText(text, charset), to show it off !
	        //mbp2.setContent(attach, "image/jpg");
	        // create the Multipart and its parts to it
	        DataSource source = 
	            new FileDataSource(attach);
	        mbp2.setDataHandler(new DataHandler(source));
	        mbp2.setFileName(source.getName());
	        Multipart mp = new MimeMultipart();
	        mp.addBodyPart(mbp1);
	        mp.addBodyPart(mbp2);
	        message.setContent(mp);
	        Transport.send(message);
		}
		
		public void sendmailHTML(List<String> toList, String subject, String msgBody) throws MessagingException, UnsupportedEncodingException {
			Message message = new MimeMessage(getSession());			
			message.setFrom(Constants.FROM_ADDRESS);
			for(Iterator<String> i =  toList.iterator(); i.hasNext(); ){
				message.addRecipient(RecipientType.TO, new InternetAddress(i.next()));
			}

			message.addFrom(new InternetAddress[] { new InternetAddress(Constants.MAIL_FROM) });

			message.setSubject(MimeUtility.encodeText(subject, Constants.CHARSET, "Q")); 
			message.setContent(msgBody, "text/html;charset=\""+Constants.CHARSET+"\"");

			Transport.send(message);
		}
		
		
		private Session getSession() {
			Authenticator authenticator = new Authenticator();

			Properties properties = new Properties();
			properties.setProperty("mail.smtp.submitter", Constants.MAIL_AUTHENTICATOR_USER);
			properties.setProperty("mail.smtp.auth", Constants.MAIL_AUTHENTICATOR);
			properties.setProperty("mail.smtp.from", Constants.MAIL_FROM);

			properties.setProperty("mail.smtp.host", Constants.SMTP_ADDRESS);
			properties.setProperty("mail.smtp.port", Constants.SMTP_PORT);
			if(Constants.MAIL_AUTHENTICATOR.trim().equalsIgnoreCase("true")) {
				return Session.getInstance(properties, authenticator);
			} else {
				return Session.getInstance(properties);
			}
		}

		private class Authenticator extends javax.mail.Authenticator {
			private PasswordAuthentication authentication;

			public Authenticator() {
				String username = Constants.MAIL_AUTHENTICATOR_USER;
				String password = Constants.MAIL_AUTHENTICATOR_PASSWORD;
				authentication = new PasswordAuthentication(username, password);					
			}

			protected PasswordAuthentication getPasswordAuthentication() {
				return authentication;
			}
		}
	}

