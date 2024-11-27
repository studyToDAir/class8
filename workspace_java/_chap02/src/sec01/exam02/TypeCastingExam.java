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
		
//		String ccc = "100";
//		int dddd = (int)ccc;
		
		/*
		 * 1. 내 나이 : int
		 * 2. 운전면허 보유 여부 : boolean
		 * 3. 우리집의 스마트폰 개수 : int
		 * 4. 내 이름 : String
		 * 5. 소수점까지의 온도 : double
		 * 6. 1.2999와 1.3이 같은가? : boolean
		 * 7. 1평이 3.3제곱미터일때 5평 : double
		 */
		
		// 깜짝퀴즈
		// 그럼 주최자는 얼마를 내야 하는가?
		/*
		 * 전체 금액에서 한명 당 내야 하는 금액
		 * int 한명당 = 10000원
		 * 
		 */
		double e2 = (total / count);
        int g21 = (int)total / count;
        float h2 = (float) ((e2 - (double)g21) * count);
        float f2 = (float) h2 + g21;
        System.out.println("총 금액은 " + f2 + "만원입니다.\n슬퍼하지 마세요. 더치페이로 다시 돌려드릴게요.");
		
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
