package sec01.exam01;

public interface RemoteControl {

	public static final int MIN_VOLUME = 0;
	int MAX_VOLUME = 10;
	
	public abstract void turnOn();
	void turnOff();
	void setVolume(int vol);
	
	default void mic(String text) {
		
	}
}
