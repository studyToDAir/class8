package sec01.exam02;

public class VariableUseExam {

	public static void main(String[] args) {

		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour * 60) + minute;
		System.out.println(totalMinute);
		
		int totalSec = totalMinute * 60;
		System.out.println(totalSec);
		
		
		int x = 10;
		int y = 20;
		System.out.println("x의 값 : "+ x);
		System.out.println("x+y의 값 : "+ (x+y));
		
		x = y;
		System.out.println("x의 값 : "+ x);
		
//		System.out.println( j );
		int j = 1;
		System.out.println("j : "+ j);
		{
			System.out.println("j : "+ j);
		}
		
		{
			// 변수는 {}가 끝나면 사라진다
			int i = 0;
			System.out.println("i : "+ i);
			
			// 같은 변수명으로 또 선언할 수는 없다
//			int i = 10;
//			int j = 100;
			i = 100;
			j = 10;
		}
		// i는 이미 사라진 상태
//		System.out.println("i : "+ i);
		
		// i는 없는 상태라서 다시 선언할 수 있다
		int i = 100;
	}

}
