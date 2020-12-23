package br.com.rafaj2ee.util;

import org.apache.log4j.Logger;


public class ServiceManager {

	public static void main(String args[]) {
		ServiceManager.windowsService(args);
	}

	private static Logger log = Logger.getLogger(ServiceManager.class);
	private static ServiceManager serviceInstance = new ServiceManager();
	private static String filesPath;

	/**
	 * Static method called by prunsrv to start/stop the service. Pass the
	 * argument "start" to start the service, and pass "stop" to stop the
	 * service.
	 */
	public static void windowsService(String args[]) {
		String cmd = "start";
		if (args.length > 0) {
			cmd = args[0];
		}
		if ("start".equals(cmd)) {

			serviceInstance.start(args[1]);
			//serviceInstance.start(args[1]);
			// serviceInstance.start(System.getProperty("user.dir"));

		} else {
			serviceInstance.stop();
		}
	}

	/**
	 * Flag to know if this service instance has been stopped.
	 */
	private boolean stopped = false;

	private SchedulerManager manager = null;

	/**
	 * Start this service instance
	 */
	public void start(String filesPath) {
		ServiceManager.filesPath = filesPath;
		stopped = false;

		log.info("SeeIt iniciado");

		Thread thread = new Thread() {
			@Override
			public void run() {

				//Constants.HOME = ServiceManager.filesPath;
				//Constants.loadProperties();
				try {
					manager = SchedulerManager.getInstance();
					manager.start();
				} catch (Exception e) {
					log.error(e.getMessage());
				}

			}
		};

		thread.start();

		while (!stopped) {
			synchronized (this) {
				try {
					this.wait(Integer.MAX_VALUE);
				} catch (Exception e) {
					log.error("Erro:", e);
				}
			}
		}
	}

	/**
	 * Stop this service instance
	 */
	public void stop() {
		stopped = true;
		log.debug("Sent STOP request");
		synchronized (this) {
			try {
				manager.shutdown();
			} catch (Exception e) {
				log.error("Erro:", e);
			}
			this.notify();
		}
	}
}
