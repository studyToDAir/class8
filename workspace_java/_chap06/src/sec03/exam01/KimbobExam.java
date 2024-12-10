package sec03.exam01;

public class KimbobExam {

	public static void main(String[] args) {

		Kimbob 천안역점 = new Kimbob(1000);
		천안역점.order(0);
		
		천안역점.print(0, 3);
		
		천안역점.addMenu("돈까스", 9000);
		천안역점.addMenu("제육덮밥", 8000);
		
		Kimbob 터미널점 = new Kimbob(2000);
		
		천안역점.printMenu();
		터미널점.printMenu();
		
		System.out.println(천안역점.menu);
		System.out.println(천안역점.price);
	}

}
