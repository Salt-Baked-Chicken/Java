package ���ͳ���;

import org.apache.log4j.Logger;

public class Log4jceshi { 
	public static void main(String[] args) {
		//Logger logger = org.apache.log4j.Logger.getLogger(Log4jceshi.class.getName())
		Logger LOGGER = Logger.getLogger(Log4jceshi.class.getName());
		try {
			System.out.println(8/0);
		}catch (Exception e) {
			e.printStackTrace();
			LOGGER.info("����debug���������ʾ���");
		}
	}
}
