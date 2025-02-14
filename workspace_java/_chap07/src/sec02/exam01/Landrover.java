package sec02.exam01;

public class Landrover extends Car{

	@Override
	protected void drive() {
		System.out.println("랜드로버를 운전합니다");
	}
	
	void autoRun() {
		System.out.println("자율주행을 시작합니다");
	}
}
