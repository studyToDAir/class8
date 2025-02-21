package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

public class CollectionExam {
	
	public static void main(String[] args) {

		List list = new ArrayList();
		System.out.println( list.isEmpty() );
		
		// 추가
		list.add(10);
		list.add("글씨");
		
		// 중간에 삽입
		list.add(1, 123);
		System.out.println(list);

		// 전체 크기
		System.out.println(list.size());
		
		// 삭제
		list.remove(1);
		System.out.println(list);
		
		// 읽기
//		int a = (int)list.get(100);
		int a = (int)list.get(0);
		
		// 초기화
		list.clear();
		list = new ArrayList();

	}

}
