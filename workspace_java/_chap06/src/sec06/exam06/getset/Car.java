package sec06.exam06.getset;

public class Car {

	private int speed;
	private boolean stop;
	
	// 이렇게 마음대로 만들어도 되는데
	public int test() {
		return speed;
	}

	// getter는 보통 필드 값을 리턴하는 기능
	// 메소드명 : get + 필드명(첫글자만 대문자)
	// 전달인자 : 없음
	// 리턴타입 : 필드의 타입
	public int getSpeed() {
//		this.speed++;
		return this.speed;
	}

	// setter는 보통 필드 값을 수정하는 기능
	// 메소드명 : set + 필드명(첫글자만 대문자)
	// 전달인자 : 필드의 타입으로된 변수하나
	// 리턴타입 : 없음
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// getter 중에서 boolean 타입의 경우
	// get+필드명 대신에 is+필드명도 가능하다
	// 그런데 오류가 발생하거나 인식 못하는 (남이 만든)클래스가
	// 있을 수 있어서 그냥 get+필드명이 더 좋다
	public boolean isStop() {
		return this.stop;
	}
}
