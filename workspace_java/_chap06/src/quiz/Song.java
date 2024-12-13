package quiz;

public class Song {
	// 필드
	// 변수 선언 : 변수타입 변수명
	// 변수 선언과 동시에 초기화는 가능
	// 나머지 "행동"은 불가능
	
	String title = new String();	// 제목
//	title = "asdf";
//	System.out.println();
	
	String singer;	// 가수명
	int like;		// 좋아요 수
//	int like = (int)plus(1,2); // 가능

	/**
	 * 제목을 전달 받아서
	 * 필드의 title을 변경하는 메소드 만들기
	 * 
	 * 메소드명 : setTitle
	 * @param String
	 * @return void
	 */
	// 메소드 선언 : 리턴타입 메소드명 (전달인자들) { }
	// 정해진 순서대로 처리

	
//	void setTitle(String t) {
//		title = t;
//		return;
//	}
	
	void setTitle(String title) {
		this.title = title;
//		return;
	}
	

	
//	Song(){
//		System.out.println("Song 생성자 실행");
//		String a = "무제";
//		setTitle(a);
//	}
	
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
