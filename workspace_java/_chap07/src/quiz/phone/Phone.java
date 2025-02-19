package quiz.phone;

public class Phone {
/*
 * 	- 전화 걸기
	- 전화 받기
 */

	String number;
	Phone(String number){
		this.number = number;
	}
	
	
	void call(String number) {
		System.out.println(number+"로 전화거는 중...");
	}
	
	void callback() {
		System.out.println("전화가 왔습니다");
	}
}
