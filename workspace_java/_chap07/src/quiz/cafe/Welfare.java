package quiz.cafe;

public class Welfare {

	void pay(Emp emp, int money) {
		emp.sal(money);
	}
	
	void learn(Emp emp, String theme) {
		emp.study(theme);
//		emp.study(null, 0);
	}
	
}
