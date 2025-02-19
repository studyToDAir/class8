package quiz.phone;

public class SmartPhone extends 피처Phone {
/*
	- 전화 걸기
	- 전화 받기
	- 문자 보내기
	- 인터넷 검색
*/
	SmartPhone(String number){
		super(number);
	}
	
	void search(String keyword) {
		System.out.println(keyword +" 검색 중...");
	}
}
