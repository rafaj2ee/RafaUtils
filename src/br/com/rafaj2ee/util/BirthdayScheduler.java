package br.com.rafaj2ee.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Date;
import java.text.ParseException;
import java.util.List;

import javax.mail.MessagingException;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.joda.time.DateTime;

import br.com.rafaj2ee.entity.Birthday;

public class BirthdayScheduler {

	private static Logger log = Logger.getLogger(BirthdayScheduler.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		log.info("Robo de emails para aniversariante iniciando " + new DateTime());
		String planString = null;
		String body = null;
		try {
			planString = FileUtils.readFileAsString(Constants.HOME+Constants.CONFIG_DIR+Constants.BIRTHDAY_CSV, Constants.CHARSET);
			body = FileUtils.readFileAsString(Constants.HOME+Constants.CONFIG_DIR+Constants.BIRTHDAY_HTML, Constants.CHARSET);
		} catch (IOException e1) {
			log.error(e1);
		}
		String[] planLines = planString.split(Constants.LINE_NEXT);
		DateTime today = new DateTime();
		Birthday birth = null;
		Session session = HibernateUtil.getSession();
		for(int i = 0; i<planLines.length; i++) {
			String[] planData = planLines[i].split(Constants.SEMICOLON);
			DateTime jodaTemp = new DateTime();
			birth = new Birthday();
			try {

				Criteria birthdays = session.createCriteria(Birthday.class);
				birth.setMail(planData[3].replaceAll(Constants.QUOTES, Constants.EMPTY));
				birthdays.add(Restrictions.eq("mail", birth.getMail()));
				List<Birthday> lista = birthdays.list();		
				if(lista.size()>0) {
					birth=lista.iterator().next();
				}
				jodaTemp = new DateTime(Constants.dateFormat.parse(planData[2]));
				//active for tests purpose only
				//jodaTemp = new DateTime();
				birth.setData(new Date(jodaTemp.getMillis()));
				birth.setNome(planData[1].replaceAll(Constants.QUOTES, Constants.EMPTY));
				if(	jodaTemp.getDayOfMonth()==today.getDayOfMonth() &&
						jodaTemp.getMonthOfYear()== today.getMonthOfYear()	) {
						
					String url = birth.getNome();
					url = java.net.URLEncoder.encode(url, "ISO-8859-1");
					URI uri = new URI("http","aniversario.rafaj2ee.com.br","/aniversario.php", "nome="+url , null);
					url = uri.toString();
					String mailBody = String.format(body, url, birth.getNome(), birth.getNome());
					SmtpMail mail = new SmtpMail();
					mail.sendmailHTML(Constants.MAIL_TO_USER, Constants.BIRTHDAY_SUBJECT + birth.getNome(), mailBody);
					birth.setDataEnviado(new Date(today.getMillis()));
					//active for tests purpose only
					//break;
					log.info("Email enviado para aniversariante "+birth.getNome()+"-"+today);
				}
				session.saveOrUpdate(birth);

			} catch (ParseException e) {
				log.error(e);
			} catch (URISyntaxException e) {
				log.error(e);
			} catch (MessagingException e) {
				log.error(e);
			} catch (UnsupportedEncodingException e) {
				log.error(e);			}
		}
		session.saveOrUpdate(birth);
		session.flush();
		session.close();
		log.info("Robo de emails para aniversariante Terminou " + new DateTime());
	}
}
