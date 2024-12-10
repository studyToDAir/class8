package quiz;

public class Song {
	
	String title;	// 제목
	String singer;	// 가수명
	int like;		// 좋아요 수

	/**
	 * 제목을 전달 받아서
	 * 필드의 title을 변경하는 메소드 만들기
	 * 
	 * 메소드명 : setTitle
	 * @param String
	 * @return void
	 */
	// 메소드 선언
	// 리턴타입 메소드명 (전달인자들) { }
	

	
//	void setTitle(String t) {
//		title = t;
//		return;
//	}
	
	void setTitle(String title) {
		this.title = title;
//		return;
	}
	

	
	Song(){
		System.out.println("Song 생성자 실행");
		String a = "무제";
		setTitle(a);
	}
	
	// double 두개를 
	// 더하기 한 결과를 
	// 돌려주는 메소드 plus
//	void plus(double x, double y) {
//		double result = x + y;
//		System.out.println("더하기 결과 "+ result);
//	}
	double plus(double x, double y) {
		double result = x + y;
		System.out.println("더하기 결과 "+ result);
		return result;
	}
	
}
