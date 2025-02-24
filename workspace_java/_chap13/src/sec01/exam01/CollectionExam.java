package sec01.exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

		System.out.println("-------------");
		
		HashMap map1 = new HashMap();
		Map map = new HashMap();
		
		// 추가
		// 순서는 보장하지 않는다
		map.put("k1", 10);
		map.put("abc", list);
		
		// 가져오기
		int k1 = (int)map.get("k1");
		System.out.println(  k1  );
		// key가 없는 경우 null
		System.out.println(  map.get("k2")  );
		
		// 초기화
		map = new HashMap();

		// 리스트에 map 넣기 
		list = new ArrayList();

		map = new HashMap();
		map.put("제목", "뱅뱅뱅");
		map.put("가수", "빅뱅");
		list.add(map);
		System.out.println(list);
		
//		map = new HashMap();	// 마지막 값만 여러번 나온다면 new해줘야 한다
		map = new HashMap();
		map.put("제목", "바람이 분다");
		map.put("가수", "이소라");
		list.add(map);
		
		System.out.println(list);
		
		
		// 제네릭 : <String>
		// 60점짜리설명:추가할 자료형을 제한하는 용도로 쓰인다
		// 100점짜리 설명:전달인자나 리턴타입의 자료형을 동적으로 변경한다
		List<String> list1 = new ArrayList<String>();
		list1.add("abc");
//		list1.add(123);
		String str = list1.get(0);
		
		// 제네릭에 int 즉 원시타입은 사용할 수 없고 wrapper 클래스 사용
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("str", 123);
//		map2.put(987, "asdf");
		int c = map2.get("str");
		
	}

}
