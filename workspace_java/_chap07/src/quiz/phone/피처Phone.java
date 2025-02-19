package quiz.phone;

public class 피처Phone extends Phone{
/*
	- 전화 걸기
	- 전화 받기
	- 문자 보내기
*/

	피처Phone(String number){
		super(number);
	}
	
	
//	@Override
	void callback(String call) {
		System.out.println(call +"에서 전화가 왔습니다");
	}
	
	void text(String number, String msg) {
		System.out.println(number +"로 "+ msg +"라는 문자를 보내는 중...");
	}
}
