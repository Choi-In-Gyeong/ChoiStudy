package day0609;

import java.util.Calendar;

public class _08_CalenderEx {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);

		

		if (hourOfDay>4 && hourOfDay<12) {
			System.out.println("±Â¸ð´×");
		}else if (hourOfDay<18) {
			System.out.println("±Â¿ÀÈÄ");
		}else if (hourOfDay<22) {
			System.out.println("±ÂÀú³á");
		}else{
			System.out.println("±Â¹ã");
		}
	}

}
