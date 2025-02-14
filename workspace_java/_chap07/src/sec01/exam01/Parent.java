package sec01.exam01;

public class Parent /* extends Child */{
//	Parent(){
//		System.out.println("Parent 생성자 실행");
//	}
	Parent(int a){
		System.out.println("Parent 생성자 실행");
	}
	

	String name = "Parent의 name";
	
	String getName() {
		System.out.println("Parent의 getName실행");
		return this.name;
	}
	
	Parent(String name){
		this.name = name;
	}
	
}
