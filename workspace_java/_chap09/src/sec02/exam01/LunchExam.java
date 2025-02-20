package sec02.exam01;

public class LunchExam {

	public static void main(String[] args) {

		Lunch lunch = new LunchImpl();
		lunch.order(null);
		
		
		Lunch lunch2 = new Lunch() {
			int a = 10;
			void test() {
			}
			
			@Override
			public int order(String menu) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		lunch2.order(null);
		
		
	}

}
