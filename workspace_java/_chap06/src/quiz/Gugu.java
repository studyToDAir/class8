package quiz;

public class Gugu {
	Gugu(){
		
	}

	void test() {
		System.out.println("오랫만이야");
	}
	
	// 전달받은 숫자에 해당하는 구구단을 출력
	// 1~9까지 반복하면서 출력
	void printDan(int x) {
		for(int i=1; i<=9; i++) {
			System.out.println(x+"*"+i+"="+(x*i));
		}
	}
	
	void printMultiDan(int x, int y) {
		for(int i=x; i<=y; i++) {
			System.out.println("-- "+i+"단 출력 --");
			// 한단씩 출력하기
			printDan( i );
			
		}
	}
	
	void printMultiDan(int x) {
		printMultiDan(x, 9);
	}
	
	void printMultiDan() {
		printMultiDan(2, 9);
	}
	
	
	
}








