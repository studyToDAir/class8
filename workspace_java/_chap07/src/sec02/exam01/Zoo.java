package sec02.exam01;

public class Zoo {
	Animal a1 = new Animal();
	
	Animal[] a = new Animal[100];
	int index = 0;
	
	int[] b = {1,2,3};
	Animal[] c = { null, new Animal(),  (Animal)new Cat(), new Dog()  };
	
	Zoo(Animal a){
		this.a[index] = a;
		index++;
		
		Object o = new Cat();
		Cat c = (Cat)o;
 	}
}
