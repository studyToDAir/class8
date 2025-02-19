package sec03.exam02;

public class AnimalExam {

	public static void main(String[] args) {

		// 추상클래스는 new 할 수 없다
//		new Animal();
		
		
		// 잠깐 깊은 복사, 얕은 복사 이야기
		Dog dog = new Dog();
		dog.name = "a";
		
//		Dog dog2 = new Dog();
//		dog2.name = dog.name;
		Dog dog2 = dog.clone();
		dog2.equals(dog);
		
		
		dog.sound();
		
		Animal a = dog;
		a.sound();
		dog = (Dog)a;
		
		testSound(dog);
		
		
		Dog dog3 = new Dog();
		dog3.name = "강아지 1호";
		
//		Dog dog4 = dog3;
//		dog4.name = "강아지 3호";
		setName(dog3);
//		dog3 = testName(dog3);
		System.out.println(dog3.name);
	}
	static void testSound(Animal animal) {
		animal.sound();
	}
	
	// 얕은복사
	// 전달인자로 참조타입이 가는 경우 무조건 얕은복사로 간다
	// 전달인자로는 stack 영역의 값만 복사되어 전달된다
	static void setName(Dog dog) {
		dog.name = "강아지 2호";
	}

	// 깊은 복사
	static Dog testName(Dog dog) {
		Dog dog2 = new Dog();
		dog2.name = dog.name;
		
		dog2.name = "강아지 2호";
		return dog2;
	}
}
