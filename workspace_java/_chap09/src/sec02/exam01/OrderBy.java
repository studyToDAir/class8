package sec02.exam01;

import java.util.Comparator;

public class OrderBy implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		MemberDTO dto1 = (MemberDTO)o1;
		MemberDTO dto2 = (MemberDTO)o2;
		
		int result = dto1.age - dto2.age;
		
		return result;
	}

}
