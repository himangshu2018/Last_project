package logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogA {
	public static final Logger log=LogManager.getLogger(LogA.class.getName());
	
	public static void main(String[] args) {
		log.trace("trace massage");
		log.debug("debug massage");
		log.info("info massage");
		log.error("error massage");
		log.fatal("fatal massage");
		
	}

}
