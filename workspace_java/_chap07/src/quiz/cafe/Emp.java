package quiz.cafe;

public class Emp {
	int money;
/*
 * 	손님 접대
	공부하기
	월급 받기
 */
	
	void service() {
		System.out.println("손님을 접대합니다");
	}
	void study(String theme) {
		System.out.println(theme +" 공부하기");
	}
	void sal(int money) {
		System.out.printf("월급 %d원을 받았다!!\n", money);
		this.money += money;
	}
}
