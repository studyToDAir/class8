package sec02.exam01;

public class ParentExam {

	public static void main(String[] args) {

		Parent3_1 p3_1 = new Parent3_1();
		
		Parent2_1 p2_1 = (Parent2_1)p3_1;
		p2_1 = p3_1;	// 형 변환 생략 가능
		
		Parent1 p1 = p2_1;
		
		p1 = p3_1;
		
		Parent1 p1_1 = new Parent3_1();
		
		////////////////////////////////////
		Parent1 p1_2 = new Parent2_2();
		
//		p1_1 = p1_2;
		Parent2_1 pp21 = (Parent2_1)p1_1;
		// 런타임runtime 오류 : 실행해봐야 아는 오류
		Parent2_1 pp22 = (Parent2_1)p1_2;
		
		String a = null;
		a.length();
		
		
	}

}
