package sec06.exam02.pack2;

import java.util.ArrayList;

//import sec06.exam02.pack1.Human1;
//import sec06.exam02.pack1.Human4;
import sec06.exam02.pack1.*;	// 해당 패키지의 모든 클래스 가져오기
								// 하위 패키지(폴더)의 클래스는 재외
public class Human3 {

	void test() {
		// 클래스를 찾을 때
		// 1. 내 패키지에 있는가?
		// 2. java.lang 패키지에 있는가?
		// 3. import한 곳에 있는가?
		
		// import하는 두가지 방법
		// 1. 클래스명 앞에 패키지 정보 적기
		sec06.exam02.pack1.Human1 h1 = new sec06.exam02.pack1.Human1();
		// 2. import 키워드 사용
		Human1 h1_1 = new Human1();
		
		
		// class가 public이 아니라서 다른 패키지에서 사용 불가
//		Human2 h2 = new Human2();
		// 기본 생성자가 public이어서 사용 가능
		Human4 h4 = new Human4();
		
//		System.out.println( h1.a );
		String b = "1";
		Math.random();
		
		new ArrayList();
	}
	
}
