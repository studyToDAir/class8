package game.human;

import java.io.PrintStream;

public class HumanDAOImpl 
	implements HumanDAO {

	String id = "admin";
	String pw = "1234";
	String name = "이름";
	int age = 20;
	
	@Override
	public HumanDTO selectMember(HumanDTO dto) {
//		PrintStream o = System.out;
//		o.println();
		
		if( dto.getId().equals(this.id)
			&& dto.getPw().equals(this.pw) ) {
			
			dto.setName(this.name);
			dto.setAge(this.age);
			
			return dto;
		} else {
			return null;
		}

	}
	
}
