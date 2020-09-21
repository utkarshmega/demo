package com.javaPractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App {
	
	private static final Logger LOG = LogManager.getLogger(App.class); 
	public static void main(String[] args) {
		
		String message = "Hello, World";
		LOG.debug(message + " Will be printed on Debug");
		LOG.info(message + " Will be printed on Info");
		LOG.warn(message + " Will be printed on Warn");
		LOG.error(message + " Will be printed on Error create conflict");
		LOG.fatal(message + " Will be printed on Fatal & Good Afternoon");
		LOG.info("Appending string: {}.", message);
		System.out.println(message);


	}
}
