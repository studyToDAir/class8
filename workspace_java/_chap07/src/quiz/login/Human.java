package quiz.login;

public class Human {

	void login(Naver naver, String id, String pw) {
		System.out.println("잉?");
	}
	void login(Daum daum, String id, String pw) {
		
	}
	
	
	void login(Portal portal, String id, String pw) {
		boolean result = portal.loginCheck(id, pw);
		if(result) {
			System.out.println("로그인 성공! 메인페이지로 이동 중...");
		} else {
			System.out.println("회원이 아닙니다");
		}
	}
	
}
