package sec03.exam02;

public class Dog extends Animal {

	String name;
	
	Dog(){
		super(null);
	}
	
	@Override
	void sound() {
		System.out.println("멍멍");
	}
	
	public Dog clone() {
		Dog dog2 = new Dog();
		dog2.name = this.name;
		return dog2;
	}
	
	boolean equals(Dog dog) {
		return (this.name == dog.name);
	}
	

}
