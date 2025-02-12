package sec05.exam02._static;

public class CalcExam {

	public static void main(String[] args) {

		System.out.println( Calc.pi );
		
		Calc c = new Calc();
		c.color = "버건디";
		
		System.out.println(c.pi);
		
		
		Calc c2 = new Calc();
//		Calc c2 = c;
		c2.color = "파랑";
		
		System.out.println(c2.pi);
		
		Calc.pi = 2;
		System.out.println(c.pi);
		System.out.println(c2.pi);
		
		c2 = c;
		
		Calc.printPi();
		
		Calc.out.println("글씨");
		
		c.printPi2();
		
//		test();
//		CalcExam ce = new CalcExam();
//		ce.test();
//		ce.main(new String[] {"abc"});
		
//		CalcExam.main(null);
		
		
	}
	
//	static void test() {
	void test() {
		
	}

}
