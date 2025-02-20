package game.human;

public class HumanDTO {

	private String id;
	private String pw;
	private String name;
	private int age;
	
	String getId(){
		return this.id;
	}
	void setId(String id){
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
