package sec04.exam01.method;

public class Calc {

	boolean isOn = false; // 전원, false: 꺼짐, true: 켜짐

	// 전원을 켜는
	// isOn = true 바꿔주는 
	// 메소드 선언
	void powerOn() {
		int a = 10;
		
		isOn = true;
		System.out.println("전원을 켭니다");
	}
	
	void powerOff() {
		isOn = false;
		System.out.println("전원을 끕니다");
	}
	
	/**
	 * 더하기
	 * 두 수를 입력 받아서 더한 결과를 돌려줌
	 * 
	 * 메소드명 : plus
	 * 전달인자 : int, int
	 * 리턴타입 : int (두 수의 합)
	 * 
	 * @param : int x, int y
	 * @return : int
	 * @author : todair@naver.com
	 */
	int plus(int x, int y) {
		System.out.println("x : "+ x);
		System.out.println("y : "+ y);
		
		int result = x + y;
		
		return result;
	}
	
	/**
	 * 나누기
	 * 두 정수를 받아서
	 * 나누기한 결과를
	 * 돌려준다
	 *  // 10, 4 전달 시 2.5 돌려받음
	 *  
	 *  메소드명 : divide
	 *  전달인자 : int x, int y
	 *  리턴타입 : double
	 */
	double divide(int x, int y) {
		System.out.println("x : "+ x);
		System.out.println("y : "+ y);
		
		double result = 0;
		
		if( y == 0 ) {
			System.out.println("0으로 나눌 수 없습니다");
		} else {
			result = (double)x / y;
		}
		
		return result;
	}
	
	// 배열을 전달할때 얕은복사에 관하여
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}
	
	int sum2 = 0;
	// ... 가변인자
	// 다른데서 호출할때 : sum2(1,2,3,4)
	// 내부에서 사용할때 values는 배열 취급
//	int sum2(int a, int ... values) {
	int sum2(int ... values) {
//		int sum2 = 0;
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}
	
	// ArrayList 전달하는 예제
}
