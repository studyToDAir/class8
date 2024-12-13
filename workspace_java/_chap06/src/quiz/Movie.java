package quiz;

public class Movie {
	
	// 생성자
	// 생성자 선언 : 클래스명 (전달인자들) {   }

	// 생성자가 없으면
	// 기본생성자 : 클래스명 () {   }
	// 생성자를 적으면 기본생성자는 생성되지 않음
	Movie(){
	}

//	Movie(){
//		System.out.println(1);
//	}
	
	Movie(String title){
		setTitle(title);
	}
	
	String title;	// 영화제목
	int year;		// 개봉일
//	Movie(String t, int y){
//		title = t;
//		year = y;
//	}
	Movie(String title, int year){
		this(title);
//		this.title = title;
//		setTitle(title);
		this.year = year;
	}
	
	// title의 값을 바꿀수 있다
	void setTitle(String title) {
//		this(title);
		if(title != null) {
			this.title = title;
		}
		else {
			System.out.println("제목을 정확히 입력하세요");
		}
		
	}
	
	void print() {
		System.out.println("제목 : "+ this.title);
		System.out.println("개봉일 : "+ this.year);
	}
}

