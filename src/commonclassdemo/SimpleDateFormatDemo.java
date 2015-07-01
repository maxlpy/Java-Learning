package commonclassdemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH:MM");
		Date date = new Date();
		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY年MM月DD日 HH时MM分ss秒");
		System.out.println(sdf2.format(date));
				
	}
}
