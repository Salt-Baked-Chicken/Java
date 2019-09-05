package 泛型尝试;

import org.apache.log4j.Logger;

public class Log4jceshi { 
	public static void main(String[] args) {
		//Logger logger = org.apache.log4j.Logger.getLogger(Log4jceshi.class.getName())
		Logger LOGGER = Logger.getLogger(Log4jceshi.class.getName());
		try {
			System.out.println(8/0);
		}catch (Exception e) {
			e.printStackTrace();
			LOGGER.info("这是debug级别输出提示语句");
		}
	}
}
