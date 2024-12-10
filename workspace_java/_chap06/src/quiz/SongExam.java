package quiz;

public class SongExam {

	public static void main(String[] args) {

		// Song 클래스를 생성
		// 제목과 가수명을 넣고
		// 제목, 가수명, 좋아요수 출력
		
		String title = "abc";
		title = "cde";
		
		Song song1 = new Song();
		song1.title = "home sweet home";
		song1.singer = "G-Dragon";
		
		System.out.println(song1.title);
		System.out.println(song1.singer);
		System.out.println(song1.like);
		
		Song song2 = new Song();
		song2.title = "APT.";
		song2.singer = "로제";
		
		System.out.println(song2.title);
		System.out.println(song2.singer);
		
		// song3은 
		// setTitle() 이용하기
		Song song3 = new Song();
		song3.setTitle("Whiplash");
		System.out.println(song3.title);
		
//		// 3.5+7.5
//		song3.plus(3.5, 7.5);
		// (1 + 5) + 7
		double a = song3.plus(1, 5);
		double b = song3.plus(a, 7);
		System.out.println("정답은 "+ b);
		
	}

}
