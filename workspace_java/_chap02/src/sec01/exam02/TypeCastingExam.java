package sec01.exam02;

public class TypeCastingExam {

	public static void main(String[] args) {

		// 여기서 ()는 우선순위
		int a = 2 + (3 * 4);	
		
		// 여기서 ()는 형변환 연산자
		long b = (long)a;
		// int가 long보다 작으니까 형 변환해도 손해가 없다
		// 형 변환 연산자 생략 가능
		long c = a;
		
		long d = 3000000000L;
		int e = (int)d;
		System.out.println("e : "+ e);
		// long을 int로 변환하는 경우
		// 8byte 중에서 상위 4byte만 남기기 때문에
		// 예측하지 못한 값이 나올 수 있어서
		// [생략 불가능]
		
		long f = 10;
		/*
		 * int ii = 10;
		 * long f = (long)ii;
		 * long f = ii;
		 */
		
		int g = 3;
		long h = 4L;
		long i = (long)g + h;
		
		long i2 = g + h;
		
		double j = 3.3;
		double k = (double)g + j;
		double k2 = g + j;
		System.out.println("(double)g : "+ (double)g);
		
		int g2 = (int)j;
		System.out.println("(int)j : "+ (int)j);
		
		double total = 4.3;
		int count = 4;
		// total(단위 만원)은 회식비입니다
		// count는 참석인원입니다.
		// 참석인원은 만원단위로만 회식비를 낸다
		// 이때 인당 얼마를 내야하는지 출력하시오
		
		double d_result = total / (double)count;
		int i_result = (int)d_result;
		
		int i_result2 = (int)total / count;
		
		// 깜짝퀴즈
		// 그럼 주최자는 얼마를 내야 하는가?
		
		// 진짜 문제
		/*
		 * String a = "수박";
		 * String b = "볼링공";
		 *
		 * // a = "볼링공" 이런거 금지
		 *
		 * System.out.println( a );	// "볼링공"
		 * System.out.println( b ); // "수박"
		 */
	}

}
