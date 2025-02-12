package sec05.exam02._static;

public class Singleton {

//	Singleton singleton = null;
//	
//	Singleton getInstance() {
//		
//		if(singleton == null) {
//			singleton = new Singleton();
//		}
//		
//		return singleton;
//	}
	
	private Singleton(){}
	
	private static Singleton singleton = new Singleton();
	
	static Singleton getInstance() {
		return singleton;
	}
}

class SingletonExam {
	public static void main(String[] a) {
//		Singleton s = Singleton.singleton;
//		Singleton.singleton = null;
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 == s2);
	}
}



