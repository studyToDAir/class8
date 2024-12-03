package sec01.exam01;

public class BreakExam {

	public static void main(String[] args) {

		System.out.println("게임을 시작하지");
		int count = 0;
		while(true) {
			
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			
			if(num == 6) {
				break;
			}
			count++;
		}
		System.out.println("게임 종료 : 총 :"+ count);
		
		for(int i=1; i<10; i += 2) {
			System.out.println(i);
			
			if(i >= 5) {	// 혹시 몰라서
				break;
			}
		}
		
		
		for(int i=0; i<5; i++) {
			System.out.println("i : "+ i);
			
			for(int j=0; j<30; j++) {
				if(j >= 2) {
					break;
				}
				System.out.println("j : "+ j);
			}
			System.out.println();
		}
		
		boolean isStop = false;
		
		for(int i=0; i<5; i++) {
			System.out.println("i : "+ i);
			
			for(int j=0; j<30; j++) {
				if(j >= 2) {
					isStop = true;
					break;
				}
				System.out.println("j : "+ j);
			}
			
			if(isStop) {
				break;
			}
			System.out.println();
		}
		
		for(int i=1; i<=10; i++) {
			if( i % 2 == 0) {	// 짝수
				System.out.println(i);
			}
		}
		
		for(int i=1; i<=10; i++) {
			if( i % 2 != 0) {	// 홀수
				continue;
			}
			System.out.println(i);
		}
		// 유튜브볼때
		// continue : 영상 중단하고 다음 영상으로
		// break : 유튜브 중단
		
		
		/*
		 * 1. 예금
		 * 예금액 음수 불가
		 * 
		 * 2. 출금
		 * 출금액 음수 불가
		 * 잔고보다 큰 금액 불가
		 */
		
	}

}




