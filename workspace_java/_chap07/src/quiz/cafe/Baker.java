package quiz.cafe;

public class Baker extends Emp {

	void printMoney(){
		System.out.println( "제빵사 잔액 : " + this.money );
	}

	
	// 오버로딩인데 Baker에만 있다
	String study(String b, int c) {
		System.out.println(b +" 공부하기");
		return null;
	}

}
