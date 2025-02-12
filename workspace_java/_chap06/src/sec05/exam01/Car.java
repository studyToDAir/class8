package sec05.exam01;

public class Car {
	String model;
	int speed;
	
	Car(String model){
		this.model = model;
		printModel();

		this.printModel();
	}
	
	// 메소드명 : printModel
	// 전달인자 : 없음
	// 리턴타입 : 없음
	// 필드의 model을 출력
	void printModel() {
		int a = 9;	// 밖에서 접근할 수 없다
		System.out.println(this.model);
	}
}
