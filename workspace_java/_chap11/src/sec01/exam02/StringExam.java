package sec01.exam02;

public class StringExam {

	public static void main(String[] args) {

		String s1 = "영일이삼사오육칠팔구삼사";
		
//		char a = 'a';
		char c = s1.charAt(0);
		System.out.println("char c : "+ c);
		
		// 왼쪽부터 첫번째 일치하는 곳의 인덱스를 돌려줌
		// 없으면 -1
		int i = s1.indexOf("삼사");
		System.out.println("indexOf : "+ i);
		int i2 = s1.indexOf("a");
		System.out.println("indexOf 없은 것: "+ i2);
		
		int i3 = s1.lastIndexOf("삼사");
		System.out.println("lastIndexOf : "+ i3);
		
		// 이메일 양식 점검
		// @ 와 . 이 하나 이상 있어야 정확한 이메일 주소 양식이라고 판단
		String email = "todair@human.or.kr";
		if(email.indexOf("@") != -1 
				&& email.indexOf(".") >= 0) {
			System.out.println("이메일 OK");
		} else {
			System.out.println("이메일 주소를 확인해 주세요");
		}
		
		// indexOf 구현 예제
//		for(int j=0; j<s1.length(); j++) {
//			char c1 = s1.charAt(j);
//			char c2 = s1.charAt(j+1);
//			if(c1 == '@') {
//				// 인덱스 출력 또는 return 하는 메소드
//				break;
//			}
//		}
		
		// 첫번째 전달인자를 두번째 전달인자로 "모두" 바꿔줌
		String s2 = s1.replace("삼사", "34");
		System.out.println("s1 : "+ s1);
		System.out.println("s2 : "+ s2);
		// replace는 모든걸 바꿔준다
		// 비파괴함수
		
		// 시작index부터 종료index 바로 앞까지 잘라서 돌려줌
		String s3 = s1.substring(2, 4);
		System.out.println("substring(2, 4) : "+ s3);
		
		// 성별을 "남", "여"로 출력하기
		String ssn = "123456-1234567";
		int start = ssn.indexOf("-") + 1;
		int end = start + 1;
		String s4 = ssn.substring(start, end);
		if(s4.equals("1") || s4.equals("3")) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		// 전달인자 하나면 거기서 부터 끝까지
		System.out.println( ssn.substring(3) );
		
		// 앞뒤 공백만 제거, 중간의 공백은 제거하지 않음
		String s5 = "  글씨   중간띄우기    ";
		System.out.println("["+ s5 +"]");
		System.out.println("["+ s5.trim() +"]");
		
		// 구분자로 글씨를 잘라서 배열로 돌려줌
		// 구분자는 사라짐
		// split의 전달인자는 String이 아니라 정규표현식
		// 정규표현식에 예약글자는 그냥 쓰면 안된다
		// 역슬래시로 탈출시키거나 []감싸준다
		String menu = "아무거나,풀떼기,햄북햄부기";
		String[] menus = menu.split(",");
		for(String m : menus) {
			System.out.println(m);
		}
		
		String url = "cafe.naver.com";
		// 정규표현식에서 .은 의미가 있는 예약 문자라서 안됨
//		String[] urls = url.split(".");  
		// []로 감싸거나
		String[] urls = url.split("[.]");
		// \\를 적거나
		String[] urls2 = url.split("\\.");
		System.out.println(urls2.length);
		
		// 문제 1
		// 다음은 query string이 포함된 네이버의 검색 주소 입니다
		// 검색어의 key 값은 query입니다.
		// 검색어만 출력하시오
		String search = "https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&ssc=tab.nx.all&query=grok3&oquery=%EA%B8%80%EB%A1%9D3&tqi=iJQ3Zdqo1e8ssKAA21Cssssss3Z-334527";
		
		// 문제2
		// html 속성 class에 cls의 text가 있을때
		// target의 class가 존재하는지 판단
		String cls = "red bigy px";
		String target = "big";
		
//		System.gc();
		
		// 아래 코드처럼 하면 메모리가 낭비된다
		String a = "a";
		a += "b";
		a = "a" + "b";

		// 메모리를 효율적으로 사용한다
		// 스레드에 안전하다(Thread-safe)
		// StringBuilder보다 쬐끔 느리다
		StringBuffer sb = new StringBuffer("abc");
		sb.append("defg");
		sb.append("defg");
		sb.append("defg");
		sb.append("defg");
		String d = sb.toString();
		
		// 스레드에 안전하지 않다
		// StringBuffer보다 쬐끔 빠르다
		StringBuilder sbb = new StringBuilder("abc");
		sbb.append("defg");
		String d2 = sbb.toString();
	}

}
