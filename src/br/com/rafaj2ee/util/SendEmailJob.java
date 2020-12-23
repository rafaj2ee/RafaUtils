package br.com.rafaj2ee.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.mail.MessagingException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.joda.time.DateTime;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import br.com.rafaj2ee.entity.Birthday;

public class SendEmailJob implements Job {
    protected static Log logger = LogFactory.getLog(SendEmailJob.class);

	public static String TASK_NAME = "Aniversário: ";
	/**
	 * Envia emails 
	 */
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		try {
			Session session = HibernateUtil.getSession();
			SmtpMail mail = new SmtpMail();
			Integer failedMinutes = new Integer(
					Constants.FAILED_MAIL_MINUTES);
			logger.debug("EMAIL FAILED MINUTES ="+Constants.FAILED_MAIL_MINUTES);
			if(failedMinutes!=0) {
				Constants.FAILED_MAIL_MINUTES = "0";
			}
			Integer recycleTime = new Integer(
					Constants.STATUS_MON_RECYCLE_TIME_MINUTES)*
					(StatefullHelper.getEmailJobRecycleLost())+failedMinutes;
					
			
			Criteria criteria = session.createCriteria(Birthday.class);
			DateTime dataAnterior = new DateTime();
			dataAnterior = dataAnterior.minusMinutes(recycleTime);
			logger.debug("EMAIL DATA ANTES ="+dataAnterior.toString()+"|Data atual="+new DateTime().toString());
			criteria.add(Restrictions.ne("statusFarol.codStatusFarol", Constants.STATUS_OK));
			criteria.add(Restrictions.between("datColeta", dataAnterior.toDate(),new DateTime().toDate()));
			criteria.addOrder(Order.asc("codFarolBackup"));
			List<Birthday> faroisBackup =  criteria.list();
			logger.debug("EMAIL FAROIS COM ERRO ="+faroisBackup.size());
			StringBuffer farolString = new StringBuffer();
			Set mailTo = new LinkedHashSet();
			for (Birthday farolBackup : faroisBackup) {
				Criteria criteriaMail = session.createCriteria(Birthday.class);
				criteriaMail.add(Restrictions.eq("tipoFarol.codTipoFarol", 1/*Constants.TIPO_FAROL*/));
				Birthday farolMail = null;
				//StringBuffer farolString = (StringBuffer) faroisTree.get(farolExecutado.getId().getCodFarol());
				logger.debug("EMAIL criteriaMail.list().size() ="+criteriaMail.list().size());
				
				if(criteriaMail.list().size() > 0) {
					String mensagem = "Teste de email ";
					String[] substituir =  {Constants.dateFormat.format(new Date()), 
					farolBackup.getNome()};
					mensagem = String.format(mensagem, substituir);
					farolString.append(mensagem);
					mailTo.addAll(Arrays.asList(farolMail.getMail()));
					}
			}
			try {
				if(mailTo.size()>0) {
					mail.sendmailHTML(new ArrayList(mailTo), Constants.MAIL_SUBJECT+" "+Constants.dateFormat.format(new Date()), farolString.toString());
					logger.info("Email farois enviado para destinatário/s ");				
				} else {
					logger.info("Email nenhum erro encontrado");
				}		
			} catch (MessagingException e) {
				//StatefullHelper.setEmailJobStatus(false);
				logger.error("Email farois erro ao enviar para destinatário/s ", e);
			}
			
			//StatefullHelper.setEmailJobStatus(true);
			session.close();
		} catch (Exception e) {
			//StatefullHelper.setEmailJobStatus(false);
		}
	}

}
