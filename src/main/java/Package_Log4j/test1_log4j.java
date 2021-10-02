package Package_Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class test1_log4j {

	private static Logger logger = (Logger) LogManager.getLogger(test1_log4j.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nHello World, From - Log4j\n");
		logger.info("This is info message");
		logger.error("This is error message");
		logger.warn("This is warning message");
		logger.fatal("This is fatal message");
		logger.trace("This is trace message");

		System.out.print("\n COmpleted");
	}

}

/*
 * add log4j config files
 * https://springframework.guru/log4j-2-configuration-using-properties-file/
 *D:\Sel_Java\src\main\resources\log4j2.properties
 * 
 *
 * Hello World, From - Log4j
 * 
 * 09:21:24.191 [main] ERROR Package_Log4j.test1_log4j - This is error message
 * 09:21:24.195 [main] FATAL Package_Log4j.test1_log4j - This is fatal message
 * 
 * COmpleted
 */

/*
 * After log4j2.properties Hello World, From - Log4j
 * 
 * [INFO ] 2021-06-23 09:29:54.102 [main] test1_log4j - This is info message
 * [ERROR] 2021-06-23 09:29:54.104 [main] test1_log4j - This is error message
 * [WARN ] 2021-06-23 09:29:54.105 [main] test1_log4j - This is warning message
 * [FATAL] 2021-06-23 09:29:54.105 [main] test1_log4j - This is fatal message
 * 
 * COmpleted
 */
