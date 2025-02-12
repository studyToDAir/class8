package sec05.exam01;

public class CarExam {

	public static void main(String[] args) {

		Car c1 = new Car("롤스로이스");
		Car c2 = new Car("카이엔");
		
		c1.printModel();
		c2.printModel();
		System.out.println("-----------");
		System.out.println( c1.model );
		
	}

}
