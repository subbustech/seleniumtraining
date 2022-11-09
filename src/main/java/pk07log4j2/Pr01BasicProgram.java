package pk07log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Use log4j2_1.xml
public class Pr01BasicProgram {

	private static Logger log = LogManager.getLogger(Pr01BasicProgram.class.getName());
	
	public static void main(String[] args) {

		log.trace("This is trace message");
		log.debug("This is debug message");
		log.info("This is info message");
		log.warn("This is warn message");
		log.error("This is error message");
		log.fatal("This is fatal message");	

	}

}
