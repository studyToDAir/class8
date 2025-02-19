package quiz.cafe;

public class CafeExam {

	public static void main(String[] args) {

		Baristar baristar = new Baristar();
		Baker baker = new Baker();
		
		Welfare w = new Welfare();
		w.pay(baristar, 100);
		w.pay(baker, 123);
		
		baristar.printMoney();	// 233, 123, 100, 223, 100
		baker.printMoney();		// 123, 233, 233, 223, 123
		
		w.learn(baristar, "커피");
		
		baker.study(null, 0);
	}

}
