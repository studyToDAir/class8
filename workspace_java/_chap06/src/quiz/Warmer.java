package quiz;

public class Warmer {
	
	String onOff;

	// 메소드 선언 : 리턴타입 메소드명 (전달인자들) { }
	// 상태 표시 기능(전원 상태와 발열 상태 출력)
	void display() {
		System.out.println(this.onOff);
	}

	// 전원 켜기 기능
	void powerOn() {
		System.out.println("전원을 켭니다");
//		String onOff = "켜기";
		// 지역변수라서 이 메소드 또는 이 {} 안에서만 사용 가능
		// display 메소드에서 참조할 수 없음
		// 그래서 필드에 String onOff 만들고 
		// 거기에 저장해야겠다
		
		this.onOff = "켜기";
		
	}
	
	// 전원 끄기 기능
	void powerOff() {
		System.out.println("전원 끕니다");
//		String onOff = "끄기";
		
		this.onOff = "끄기";

	}
	
	// 저온 발열 기능(단, 전원이 켜져 있을때만)
	void low() {
		if(this.onOff.equals("끄기")) {
			System.out.println("전원이 꺼져있습니다");
		} else {
			System.out.println("저온으로 따뜻하게");
		}
	}
	// 고온 발열 기능(단, 전원이 켜져 있을때만)
	// 발열 중지 기능
	
	// 필드, 생성자, 메소드 마음대로 사용하기, 안써도 됨
}
