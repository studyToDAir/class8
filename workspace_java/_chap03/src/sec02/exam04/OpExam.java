package sec02.exam04;

public class OpExam {

	public static void main(String[] args) {

		boolean a = false;
		System.out.println("a : "+ a);
		
		a = !a;
		System.out.println("a : "+ a);
		
		double b = 7.0;
		System.out.println(b / 3);
		// double을 0으로 나누면 Infinity 에러
//		System.out.println(b / 0);
		// int를 0으로 나누면 "/ by zero" 에러
//		System.out.println(3 / 0);
		
		int c = 9684321;
		int d = 5;
		System.out.println("몫 : "+ (c / d));
		System.out.println("나머지 : "+ (c % d));
		
		// 깜짝퀴즈
		// 난 돈이 10000원 있고
		// 4500원짜리 커피 최대 몇잔 살 수 있나요?
		// 그때 남은 잔돈은?
		
		int money = 10000;
		int coffee = 4500;
		int count = money / coffee;
		System.out.println("총 "+ count +"잔");
		int change = money % coffee;
		System.out.println("잔액 "+ change +"원");
		
		// 올리브영에서 전품목 15% 세일 중!!
		// 1번. 꿀홍차(5000)을 샀을때 얼마를 내야 하나?
		int honey = 5000;
		double result = honey*1 - (honey * 0.15);
		result = honey * (1 - 0.15);
		// 2번. 꿀홍차(5000)와 립스틱(30000)을 하나씩 사면?
		int lip = 30000;
		result = (honey * (1 - 0.15)) + (lip * (1 - 0.15));
		result = (honey + lip) * (1 - 0.15);
		System.out.println("꿀홍차+립스틱 : "+ result);

		// 3번. 7234원이 있어요
		// 5000, 1000, 500, 100, 50, 10, 1원
		// 각각 최대 몇개까지로 표현할 수 있나요?
		
		int money1 = 7234;
		int cnt5000 = money1 / 5000;	// 1
		System.out.println("5000 : "+ cnt5000);
//		money1 = money1 - cnt5000;
//		int money2 = money1 - (cnt5000*5000); // 2234
		int money2 = money1 % 5000; // 2234
		int 천원 = money2 / 1000;
		System.out.println("1000 : "+ 천원);
		money2 = money2 % 1000;
		
		int m500 = money2 / 500;
		System.out.println("500 : "+ m500);
		money2 = money2 % 500;
		
		int m100 = money2 / 100;
		System.out.println("100 : "+ m100);
		money2 = money2 % 100;
		
		int m50 = money2 / 50;
		System.out.println("50 : "+ m50);
		money2 = money2 % 50;
		
		int m10 = money2 / 10;
		System.out.println("10 : "+ m10);
		money2 = money2 % 10;
		
		System.out.println("1 : "+ money2);
		
		
		char c1 = 'A';
		c1 = (char)(c1 + 1);
		System.out.println(c1);
		
		System.out.println(""+ 3 + 3.0 );
		
		String c2 = "100";
		int c3 = Integer.parseInt(c2);
		System.out.println(c3 + 3);
		
		boolean bool = 3 > 5;
		System.out.println(bool);
		
		System.out.println( 1 == 1 );
		System.out.println( 1 == 1.0 );
		System.out.println("소수점");
		System.out.println( 0.1 == 0.1f );
		// 소수점 이하는 정확하지 않아서
		// 0.1을 0.09999999 또는 0.1000000001로 처리할 수 있기 때문에
		// 같은 타입으로 변환해서 비교하자
		System.out.print("형변환 : ");
		System.out.println( (float)0.1 == 0.1f );
		
		System.out.println( 'C' < 'J' );
//		System.out.println( "ab" < "ac" );
		
		System.out.println(" 3 != 3 : "+ (3 != 3) );
		
		String s1 = "최민수";
		String s2 = "최민수";
		System.out.println(s1 == s2);
		// 글씨 비교는 == 사용 금지
		System.out.println( s1.equals(s2) );
		System.out.println( !s1.equals(s2) );
		// String 변수 또는 "글씨".equals(비교값)
		// "최민수".equals(s2)
		
		int i1 = 87;
		System.out.println(i1 +"은 B 학점인가?");
		System.out.println(
			(i1 >= 80) && (i1 < 90)	
		);
		System.out.println(
			(i1 >= 80) || (i1 < 90)	
		);
		
		System.out.println( 10 | 1 );
		System.out.println( 10 | 3 );
		
		int k1 = 7;
		int k2 = 15;
		int k3 = 17;
		System.out.println("k3이 가장 큰 값인가?");
		// k3가 k1보다도 크거나 같"고" 
		// k3가 k2보다도 크거나 같으면
		// k3는 가장 크다
		System.out.println(
			(k3 >= k1) && (k3 >= k2)
		);
		
		int m1 = 5;
		m1 = m1 + 2;
		m1 += 2;

		money2 = money2 % 500;
		money2 %= 500;
		
		int n1 = 10;
		n1 = n1 + 1; // n1 = 1 + n1;
		n1 += 1;
		n1++;
		++n1;
		
		n1 = n1 - 1;
		n1 -= 1;
		n1--;
		--n1;
		
		int n2 = 10;
		System.out.println( "n2 : "+ (++n2) );
		System.out.println( "n2 : "+ (n2++) );
		// n2 == 12
		System.out.println("n2 : "+ n2);
		
		
		int x = 1;
		int y = 1;
		int result1 = ++x + 10;	// 12
		int result2 = y++ + 10;	// 11
		System.out.println("result1 : "+ result1);
		System.out.println("result2 : "+ result2);
		
		int z = 1;
		//					 1 + 3
//		System.out.println(  z++ + ++z  );
		int z1 = ++z;
		z = z + 1;
		
		z = z + 1;
		int z2 = z; 
		
		System.out.println(  z1 + z2  );
		
		
		System.out.println(z);
		
//		z = 1;
		z = z++ - --z * z++ / --z;
//		(z++ - ((--z * z++) / --z))
		
		
		int score = 95;
		char grade = (score  > 90) ? 'A' : 'B';
		
	}

}
