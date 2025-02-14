package sec02.exam01;

public class AnimalExam {

	public static void main(String[] args) {

		// Animal의 eat()과 sound()만 알고 있는 상태
		Animal a1 = new Animal();
		a1.eat();
		a1.sound();
		
//		int a = 10;
//		System.out.println(10);
		
		Cat cat = new Cat();
		cat.eat();
		cat.push();
		
		Animal a2 = (Animal)cat;	// 자식이 부모가 될때
		Animal a3 = cat;			// 형변환 연산자 생략 가능
									// 사실은 자식에서 부모만 빼온다
		a3.eat();
		a3.sound();
//		a3.push();
		
//		Dog dog = new Dog();
//		Animal a5 = (Animal)dog;
		Animal a4 = new Dog();
		a4.eat();
		a4.sound();
		
		catMom(cat);
		Dog dog = new Dog();
//		catMom(dog);
		Animal a6 = (Animal)cat;
		feed(a6);
		feed(dog);
	}

	static void catMom(Cat cat) {
		cat.eat();
		cat.sound();
		cat.push();
	}
	
	static void feed(Animal animal) {
		System.out.println("                          feed 실행");
		animal.eat();
		animal.sound();
	}
}
