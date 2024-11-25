package _random;

public class Random {

	public static void main(String[] args) {

		String[] names = new String[10];
		names[0] = "남기원";
		names[1] = "김도희";
		names[2] = "이준규";
		names[3] = "탁정현";
		names[4] = "이주희";
		names[5] = "김경민";
		names[6] = "박혜성";
		names[7] = "안혜리";
		names[8] = "채민병";
		names[9] = "최수완";		

		int fire = (int)(Math.random() * 10000) % 10;
		System.out.println("당선 : "+ names[fire]);
		
	}

}
