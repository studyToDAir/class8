package quiz.login;

public class PortalExam {

	public static void main(String[] args) {

		Naver naver = new Naver();
		Daum daum = new Daum();
		
		boolean result = naver.join("회원1", "id1", "pw1");
		if(result) {
			System.out.println("naver 회원가입 성공");
		} else {
			System.out.println("naver 회원가입 실패");
		}
		
		result = daum.join("회원1", "id1", "pw1");
		if(result) {
			System.out.println("daum 회원가입 성공");
		} else {
			System.out.println("daum 회원가입 실패");
		}
	}

}
