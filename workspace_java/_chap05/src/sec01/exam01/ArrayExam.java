package sec01.exam01;

public class ArrayExam {

	public static void main(String[] args) {

		/*
		 * 배열
		 *  한번에 여러 변수를 만드는 방법
			같은 타입만 선언할 수 있음
			생성할때 전체 크기를 지정해줘야 함
			생성된 여러 변수들은 index로 관리한다. (index는 0번부터 시작)
		 */
		
		// 선언방법
		int[] score;	// java 스타일
//		int [] score3;	// java 스타일
		int score2[];	// c 스타일
		
		// 변수 앞이 무조건 타입이라고 읽는 경우
		// score변수는 "int로 구성된 배열이다"
		
		// 배열은 참조타입
		score = null;
		
		///////////////////////
		int score_0 = 90;
		int score_1 = 60;
		int score_2 = 70;
		
		
		/*
			배열을 생성할때 크기를 알려줘야 합니다.
			첫번째 [] (int[]) : int로 이루어진 **배열이다**
			두번째 [] (new int[3]) : 배열의 **크기**, 즉 한번에 만들 **변수의 개수**
										타입의 크기만큼 연달아서 메모리를 할당
										첫번째 주소를 변수에 저장
										index  0 부터 시작한다
			세번째 [] (intArray[0]) : 만들어진 변수 중에서 첫번째 변수를 뜻함
		 
		 */
		int[] intArray = new int[3];
		intArray[0] = 90;
		intArray[1] = 60;
//		intArray[2] = 70;
		
//		intArray = new int[30];
		
		System.out.println("intArray[0] : "+ intArray[0]);

		// 기본값은 0, false, null로 초기화된다
		System.out.println("intArray[2] : "+ intArray[2]);

		// java.lang.ArrayIndexOutOfBoundsException
		// 0~2까지만 사용 가능한데 3으로 시도했다
//		System.out.println("intArray[3] : "+ intArray[3]);
		
		
		// 배열을 선언하는 두번째 방법
		// 넣을 값을 모두 정확히 알고 있는 경우
		int[] intArray2 = new int[] {90, (int)Math.random(), 70};
		
		int[] intArray2_1 = null;
		intArray2_1 = new int[] {90, (int)Math.random(), 70};
		intArray2_1 = new int[] {90, (int)Math.random(), 70, 80};
		
		// 배열을 선언하는 세번째 방법 
		// new int[]에 해당하는걸 생략가능
		// 선언과 동시에 초기화 하는 경우에만 사용 가능
		int[] intArray3 = {90, (int)Math.random(), 70};
//		intArray3 = {90, (int)Math.random(), 70};
		
		System.out.println("intArray3의 길이 : "+ intArray2_1.length);
//		intArray2_1.length = 5;
		
		System.out.println("intArray3 : "+ intArray3);
		
		
		String[] sArr = new String[14];
//		sArr = new String[4];
		
		sArr[0] = "이름1";
		sArr[1] = "이름2";
		
		int k = 1;
		
		// sArr[2] = "이름3";

		k++;
		sArr[k] = "이름"+ (k+1);
		
		for(int i=0; i<sArr.length; i++) {
			sArr[i] = "이름" + (i+1);
		}
		
		// sArr의 모든 내용을 출력
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		// 깜짝퀴즈
		// 1~10까지 배열에 넣고
		// 배열의 총 합 출력
		// 배열의 평균값 출력
		int[] nums = new int[10];
		for(int i=0; i < nums.length; i++) {
			nums[i] = i+1;
		}
		
		int sum = 0;
		for(int i=0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		System.out.println("합계 : "+ sum);
		
		System.out.println("평균 : "+ ((double)sum / nums.length));
		
		// 간단퀴즈
		// 1~10까지 순서대로 저장된 배열을
		// 10부터 1까지 거꾸로 출력
		for(int i=nums.length-1; i >=0; i--) {
			System.out.println(nums[i]);
		}
		
		for(int i=0; i < nums.length; i++) {
			System.out.println(nums[  nums.length-1 - i  ]);
		}
		
		
		// [3,4,7,5,1,4,6]
		/*
		 * 문제1. 홀수의 개수 구하기
		 * 문제2. 4보다 큰 수의 개수 구하기
		 * 문제3. 최대값 구하기
		 */
		
		/* 
		 * 문제4. 두번째 큰 수 구하기
		 * 문제5. 배열을 하나씩 뒤(오른쪽)로 밀기
		 * 		5-1 : 0으로 채우기
		 * 		5-2 : 첫자리에 마지막 것 넣기
		 * 문제6. 임시비밀번호 8자리 만들기
		 * 		6-1 : 숫자로
		 * 		6-2 : 소문자로
		 * 		*6-3 : 숫자2개이상, 대/소문자 조합
		 * 
		 * 문제7. 예약
		 * 		자리가 10개 있는 소극장 예약 시스템
		 * 		자리 번호는 1~10번까지 번호의 자리가 있음
		 * 		만약1 : 예약이 가능하면 "n번자리 예약 했습니다"
		 * 		만약2 : 예약이 불가능하다면 "이미 예약 되어있습니다"
		 * 		메뉴 : "1.예약, 2.모든좌석현황, 3.잔여좌석, 4. 종료"
		 * 
		 * 문제8. 로또 6개 배열에 저장
		 * 		단, 중복 없이
		 */
	}

}








