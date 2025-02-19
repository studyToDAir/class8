package quiz.login;

public class HumanExam {

	public static void main(String[] args) {

		Naver naver = new Naver();
		naver.join("회원1", "아이디1", "비번1");

		Daum daum = new Daum();
		daum.join("회원2", "아이디2", "비번2");
		
		Human human = new Human();
		human.login((Portal)naver, "아이디2", "비번2");
	}

}
