package sec03.exam02;

public abstract class Windows {

	abstract void start();
	
	void boot() {
		System.out.println("CMOS 실행");
		System.out.println("윈도우 실행");
		start();
		System.out.println("윈도우 실행 성공 커서는 로딩으로...");
	}
}
