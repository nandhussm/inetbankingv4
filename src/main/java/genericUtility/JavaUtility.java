package genericUtility;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
		/**
		 * @author Nandhu
		 * Get Current Date
		 * @return 
		 */

		public static String getCurrentDate() {
			Date dt=new Date();
			String currentdate = dt.toString().replace(":", "").replace(" ", "");
			return currentdate;
		}
		
		/**
		 * 
		 * @author Nandhu
		 * Get Random Numbers
		 */
		public static String getRandomNum() {
			Random random=new Random();
			int num=random.nextInt(1000);
			return ""+num;
		}
}