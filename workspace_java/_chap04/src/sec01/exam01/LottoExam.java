package sec01.exam01;

public class LottoExam {

	public static void main(String[] args) {

		// 로또 : 1~45의 숫자 중
		// 중복되지 않은 수 6개 고르기
		
		double rand = 0.0;
		/*
		 * 0 이상 1 미만
		 */
		rand = Math.random();		// 0 ~ 0.9999999
		double temp1 = rand * 45;	// 0 ~ 44.999999
		int temp2 = (int)temp1;		// 0 ~ 44
		int lotto1 = temp2 + 1;		// 1 ~ 45
		System.out.println(lotto1);
		
		rand = Math.random();		// 0 ~ 0.9999999
		double temp12 = rand * 45;	// 0 ~ 44.999999
		int temp22 = (int)temp12;		// 0 ~ 44
		int lotto2 = temp22 + 1;		// 1 ~ 45
		System.out.println(lotto2);

		rand = Math.random();		// 0 ~ 0.9999999
		double temp13 = rand * 45;	// 0 ~ 44.999999
		int temp23 = (int)temp13;		// 0 ~ 44
		int lotto3 = temp23 + 1;		// 1 ~ 45
		System.out.println(lotto3);
		
		rand = Math.random();		// 0 ~ 0.9999999
		double temp14 = rand * 45;	// 0 ~ 44.999999
		int temp24 = (int)temp14;		// 0 ~ 44
		int lotto4 = temp24 + 1;		// 1 ~ 45
		System.out.println(lotto4);
		
		rand = Math.random();		// 0 ~ 0.9999999
		double temp15 = rand * 45;	// 0 ~ 44.999999
		int temp25 = (int)temp15;		// 0 ~ 44
		int lotto5 = temp25 + 1;		// 1 ~ 45
		System.out.println(lotto5);
		
		rand = Math.random();		// 0 ~ 0.9999999
		double temp16 = rand * 45;	// 0 ~ 44.999999
		int temp26 = (int)temp16;		// 0 ~ 44
		int lotto6 = temp26 + 1;		// 1 ~ 45
		System.out.println(lotto6);
	}

}
