package sec01.exam03.override;

public class Calc {

	double areaCircle(double r) {
		System.out.println("Calc의 areaCircle 실행");
		return 3.14 * r * r;
	}
	
	public int plus(int x, int y) {
		System.out.println("Calc의 plus 실행");
		return x + y;
	}
}
