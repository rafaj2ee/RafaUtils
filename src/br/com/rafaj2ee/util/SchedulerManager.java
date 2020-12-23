package br.com.rafaj2ee.util;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

import java.text.ParseException;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerKey;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.matchers.GroupMatcher;

/**
 * Manage the scheduled services loading the quartz framework support classes.
 * 
 */
public class SchedulerManager {

    protected static Log logger = LogFactory.getLog(SchedulerManager.class);

    private SchedulerFactory sf;

    private Scheduler sched;

    private static SchedulerManager instance;

    // This is the JOB/Trigger group used for the initial configured jobs
    public static String CONFIG_GROUP = "CONFIG_SCHEDULED_JOBS";

    private SchedulerManager() {
        super();
        try {
            sf = new StdSchedulerFactory();
            sched = sf.getScheduler();
            logger.info("Scheduled Services Instantiated...");

        } catch (Exception e) {
            logger.info("Error starting Scheduled Services", e);
            e.printStackTrace();
        }
    }

    private SchedulerManager(String properties) {
        super();
        try {
            logger.info("Scheduled Services Starting with properties [" + properties + "]");
            sf = new StdSchedulerFactory(properties);
            sched = sf.getScheduler();
            logger.info("Scheduled Services Instantiated with properties [" + properties + "]");

        } catch (Exception e) {
            logger.info("Error starting Scheduled Services", e);
            e.printStackTrace();
        }
    }

    public static SchedulerManager getInstance() {
        if (instance == null) {
            instance = new SchedulerManager();
        }
        return instance;
    }

    /**
     * Starts ScheduleManager using a custom properties file for Quartz
     * 
     * @param properties
     * @return
     * @throws SchedulerException
     */
    protected static SchedulerManager getInstance(String properties) {
        if (instance == null) {
            instance = new SchedulerManager(properties);
        }
        return instance;
    }

    public void shutdown() {
        logger.info("Stopping Scheduled Services. Waiting for jobs to complete ...");

        try {
            if (sched != null) {
                sched.shutdown(true);
            } else {
                sched = sf.getScheduler();
            }
            logger.info("Shutdown signal sent. Waiting for jobs to complete ...");

        } catch (Exception e) {
            logger.error("Error on Scheduled Services Shutdown. Waiting for jobs to complete ...", e);
            try {
                if (sched != null) {
                    sched.shutdown(false);
                    logger.info("Scheduled Services Shutdown Forced.");
                }
            } catch (Exception e1) {
                logger.error("Error on Scheduled Services Forced Shutdown.", e1);
                return;
            }
        }

        logger.info("Scheduled Services sucessfully stopped.");
    }

    public void start() {
        logger.info("Initializing Scheduled Services...");
        // verify for Spring Context

        try {
            sched = sf.getScheduler();
        } catch (Exception e) {
            logger.error("Failed to start SchedulerManager", e);
            e.printStackTrace();
        }

        try {
            sched.start();
        } catch (Exception e) {
            logger.error("Failed to start SchedulerManager", e);
            e.printStackTrace();
        }

        logger.info("Scheduled Services Initialized");
        
    }

    /**
     * This method generates a scheduled report by given attributes
     * 
     * @param schedulerName
     * @param schedulerGroup
     * @param parameters
     * @param scheduleExpression
     * @throws SchedulerException
     */
    public void createScheduler(String schedulerName, String schedulerGroup, Map<String, Object> parameters,
            String scheduleExpression) {

        JobDetail job = newJob(SendEmailJob.class)
                .withIdentity(schedulerName,
                        schedulerGroup).build();

        JobDataMap map = job.getJobDataMap();
        map.putAll(parameters);

        Trigger trigger = null;
        try {
            trigger = newTrigger()
                    .withIdentity(schedulerName, schedulerGroup)
                    .forJob(job.getKey())
                    .withSchedule(cronSchedule(scheduleExpression))
                    .build();

            if (sched == null) {
                sched = sf.getScheduler();
            }
            sched.scheduleJob(job, trigger);
            logger.info("Scheduler name " + job.getDescription() + " scheduled to " + trigger.getFinalFireTime());

        } catch (ParseException e) {
            logger.error("Error on creating trigger for Job " + schedulerName, e);

        } catch (Exception e) {
            logger.error("Error on schedulling Job Generic error " + schedulerName, e);
        }
    }

    /**
     * Deletes Job from Quartz scheduler
     * 
     * @param schedulerName
     * @throws SchedulerException
     */
    public void cancelScheduler(String schedulerName) {
        try {
            logger.info("Trying to execute cancelScheduler name " + schedulerName);
            JobKey jobKey = new JobKey(schedulerName);
            sched.deleteJob(jobKey);
            logger.info("Scheduler name " + schedulerName + " deleted");
        } catch (Exception e) {
            logger.error("Invalid scheduler name [" + schedulerName + "]", e);
        }
    }

    /**
     * This method executes scheduled job immediately by its name
     * 
     * @param schedulerName
     * @throws SchedulerException
     */
    public void executeScheduler(String schedulerName) {
        try {
            logger.info("Trying to execute scheduler name " + schedulerName);
            TriggerKey triggerKey = new TriggerKey(schedulerName);
            Trigger startNow =
                    newTrigger().startNow().build();
            sched.rescheduleJob(triggerKey, startNow);
            logger.info("Scheduler name " + schedulerName + " will start immediately" + startNow.getFinalFireTime());

        } catch (Exception e) {
            logger.error("Invalid scheduler name [" + schedulerName + "]", e);
        }
    }

    /**
     * This method lists the configured job keys. It doesn't list all jobs only those under the CONFIG_GROUP group.
     * 
     * @return
     * @throws com.orga.reportserver.scheduler.SchedulerException
     */
    @SuppressWarnings("unchecked")
    public Set<JobKey> listConfigJobKeys() {

        Set<JobKey> jobKeys = null;
        try {
            jobKeys = sched.getJobKeys(GroupMatcher.groupEquals(CONFIG_GROUP));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jobKeys;

    }

}
