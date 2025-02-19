package quiz.cafe;

public class Baristar extends Emp {
	
/*
 * 	커피를 종류별로 만든다
	설겆이
 */
	String makeCoffee(String menu) {
		System.out.println(menu +" 만드는 중...");
		return menu;
	}
	
	void wash() {
		System.out.println("ㅠㅠ 설거지");
	}

	void printMoney(){
		System.out.println( "바리스타 잔액 : " + this.money );
	}
	
	@Override
	void study(String theme) {
		System.out.println(theme +" 공부하는게 너무 재미쒀영!!");
	}
	
	
}
