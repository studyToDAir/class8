package kr.or.human.a;

public class MemberDTO {

	private String id;
	private String pw2;
	
	public String getId() {
		System.out.println("MemberDTO getId 실행");
		return id;
	}
	public void setId(String id) {
		System.out.println("MemberDTO setId 실행 id:"+ id);
		this.id = id;
	}
	public String getPw() {
		return pw2;
	}
	public void setPw(String pw) {
		this.pw2 = pw;
	}

	
	
}
