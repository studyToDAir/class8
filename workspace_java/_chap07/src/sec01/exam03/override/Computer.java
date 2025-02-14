package sec01.exam03.override;

public class Computer extends Calc {

	@Override // 부모에 해당 메소드가 똑같이 있는지 검사해줌
	public int plus(int a, int b) {
//		int reuslt = a + b;
		int reuslt = super.plus(a, b);

		System.out.println("문의하신 정답은 ");
		System.out.println(reuslt + "입니다");
		return reuslt;
	}

	@Override
	public double areaCircle(double r) {
		System.out.println("Computer의 areaCircle 실행");
		return Math.PI * r * r;
	}
	
}
