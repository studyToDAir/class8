package sec01.exam01;

public class ExtendsExam{

	public static void main(String[] args) {
		Child c = new Child();
		c.printName();
		String cName = c.getName();
		System.out.println("cName: "+ cName);
		System.out.println("c.name: "+ c.name);
		
		String pName = c.parentName();
		System.out.println(pName);
		
		Child c2 = new Child("새로운 이름");
		String pName2 = c2.parentName();
		System.out.println(pName2);	// "새로운 이름"
	}

}
