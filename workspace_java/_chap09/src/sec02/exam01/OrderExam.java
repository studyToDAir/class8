package sec02.exam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderExam {

	public static void main(String[] args) {

		MemberDTO m1 = new MemberDTO();
		MemberDTO m2 = new MemberDTO();
		MemberDTO m3 = new MemberDTO();
		
		m1.name = "멤바1";
		m1.age = 25;

		m2.name = "멤바2";
		m2.age = 35;
		
		m3.name = "멤바3";
		m3.age = 29;
		
		List list = new ArrayList();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
//		if (m1 > m3) {}
		
		Comparator c = new OrderBy();
		
		// 익명 객체
		Comparator c2 = new Comparator() {
			public int a = 10;		// 내부에서는 사용 가능
			public void test() {	// 하지만 이름이 없어서 밖에서 못씀
				
			}
			
			@Override
			public int compare(Object o1, Object o2) {
				MemberDTO dto1 = (MemberDTO)o1;
				MemberDTO dto2 = (MemberDTO)o2;
				
				int result = dto1.age - dto2.age;
				
				return result;
			}
		};
		// 파괴함수: 원본을 바꾼다
		Collections.sort(list, c2);
		
		for(int i=0; i<list.size(); i++) {
			MemberDTO dto = (MemberDTO)list.get(i);
			System.out.println(dto.age);
		}
	}

}
