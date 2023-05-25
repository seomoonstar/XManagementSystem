package log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLog {
	FileHandler filein;
	LogManager logm;
	Logger loger;
	
	public EventLog(String filename) {
		try {
			logm = LogManager.getLogManager();
			loger = logm.getLogger(Logger.GLOBAL_LOGGER_NAME);
			filein = new FileHandler(filename);
			filein.setFormatter(new SimpleFormatter());
			loger.addHandler(filein);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void log(String logMessage) {
		loger.info(logMessage);
	}
}
