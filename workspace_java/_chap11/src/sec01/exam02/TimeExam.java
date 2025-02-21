package sec01.exam02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeExam {

	public static void main(String[] args) {

		long now = System.currentTimeMillis();
		System.out.println(now);
		
		for(int i=0; i<1000; i++) {
//			System.out.println(i);
		}
		
		long after = System.currentTimeMillis() - now;
		System.out.println(after);
		
		Date date = new Date();
		System.out.println(date);
		
		String format = "yyyy년 MM월 dd일 HH:mm:ss.SSS";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String formatDate = sdf.format(date);
		System.out.println(formatDate);
		
		
//		TimeExam te = new TimeExam();
//		te.
		
		TimeExam.a = 100;
		System.out.println(TimeExam.a);
	}

	static int a = 10;
}
