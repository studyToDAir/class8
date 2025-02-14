package sec02.exam01;

public class Driver {

	void runCoupe(Coupe coupe) {
		System.out.println("쿠페만 몹니다 손님");
		coupe.drive();
	}
	
	void run(Car car) {
		System.out.println("run 박습니다 손님");
		car.drive();
//		car.autoRun();
		
		// 왼쪽 : 부모가 담긴 변수
		// 오른쪽 : 자식 클래스
		if(car instanceof Landrover) {
			System.out.println("이거 랜드로버네요!!");
			Landrover landrover = (Landrover) car;
			landrover.autoRun();
		}
	}
	
}
