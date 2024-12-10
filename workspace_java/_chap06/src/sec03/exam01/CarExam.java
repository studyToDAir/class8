package sec03.exam01;

public class CarExam {
	
//	CarExam(){
//		
//	}

	public static void main(String[] args) {

		Car c1 = new Car(1300);

		Car c2 = new Car("스파크");

		Car c3 = new Car();
		c3.brand = "스파크";
		c3.setBrand(null);
		System.out.println(c3.brand);
		
	}

}
