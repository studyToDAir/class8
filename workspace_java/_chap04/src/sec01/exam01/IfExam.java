package sec01.exam01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {

		int score = 93;
//		Scanner scan = new Scanner(System.in);
//		int score = scan.nextInt();
		
		if(score >= 90) {
			System.out.println("90점 이상입니다");
			System.out.println("등급 A");
		}
		
		if( !(score >= 90) ) {
//		if(score < 90) {
			System.out.println("90점 미만입니다");
			System.out.println("등급 B");
		}
		
		if(score >= 90) {
			System.out.println("90점 이상입니다");
			System.out.println("등급 A");
		} else {
			System.out.println("90점 미만입니다");
			System.out.println("등급 B");
		}
		
		if(score >= 90) {
			System.out.println("90점 이상입니다");
			System.out.println("등급 A");
			
//		} else if (score < 90 && score >= 80) {
//		} else if (score >= 90) {
		} else if (score >= 80) {
			
			System.out.println("80~89입니다");
			System.out.println("등급 B");
		} else if (score < 80 && score >= 70) {
			System.out.println("70~79입니다");
			System.out.println("등급 C");
		} else {
			System.out.println("70점 미만입니다");
			System.out.println("등급 D");
		}
		
		score = 97;
		System.out.println("90점 이상입니다");
		System.out.println("95점 이상입니다");
		
		score = 94;
		System.out.println("90점 이상입니다");
		
		if(score >= 95) {
			System.out.println("90점 이상입니다");
			System.out.println("95점 이상입니다");
		} else if(score >= 90) {
			System.out.println("90점 이상입니다");
		}
		
		if(score >= 90) {
			System.out.println("90점 이상입니다");
			
//			if(score >= 90 && score >= 95) {
			if(score >= 95) {
				System.out.println("95점 이상입니다");
			}
		}
		
		
		int a = 0;
		if(score >= 90) {
			System.out.println("90점 이상입니다");
			a += 10;
		}
		
		if(score >= 95) {
			System.out.println("95점 이상입니다");
		}
		
		// 문제 1.
		// z1이 x1과 y1사이에 있는지 확인
		int x1 = 15;
		int y1 = 20;
		int z1 = 17;
		
		boolean r1 = (z1 >= x1);
		boolean r2 = (z1 <= y1);
//		if(r1 && r2) {
		if((z1 >= x1) && (z1 <= y1)) {
			System.out.println(z1 +": 사이에 있다");
		} else {
			System.out.println(z1 +": 사이에 없다");
		}
		
		
//		if( !( (z1 >= x1) && (z1 <= y1) ) ) {
		if( (z1 < x1) || (z1 > y1) ) {
			System.out.println(z1 +": 사이에 없다");
		} else {
			System.out.println(z1 +": 사이에 있다");
		}
		
		int x2 = 3;
		if( (x2 % 2) == 0 ) {
			System.out.println(x2 +": 짝수");
		} else {
			System.out.println(x2 +": 홀수");
		}
		
		// 문제 2
		/*
		 * 어제 온도가 -3도 였을때
		 * 오늘 온도(입력 받아도 됨)가
		 * 
		 * 1. 오늘이 "영하"인지 "영상"인지 (0은 영하)
		 * 
		 * 2. 만약 영하라면 "영하 1도입니다"
		 * 영상이라면 "영상 2도 입니다"
		 * 
		 * 3. "어제보다 온도가 높습니다"
		 * "어제보다 온도가 낮습니다"
		 * 
		 * 4. "어제보다 2도 높습니다"
		 * ex : 3, -1면 "어제보다 4도 낮습니다"
		 * 
		 */
		int yt = 3;		// 어제 온도
		int t = -1;		// 오늘 온도
		
		System.out.println("어제 온도 : "+ yt);
		System.out.println("오늘 온도 : "+ t);
		if(t <= 0) {
			System.out.println("1. 영하");
//			System.out.println("2. 영하 "+ (t * -1) +"도 입니다");
			System.out.println("2. 영하 "+ (-t) +"도 입니다");
			
		} else {
			System.out.println("1. 영상");
			System.out.println("2. 영상 "+ t +"도 입니다");
		}
		
		// 7,3 : 4 >> 7-3
		// -5, -2 : 3 >> -5 - -2 >> -5 + 2 >> -3
		// -2, 3 : 5 >> -2 - 3 >> -5
		// 3, -2 : 5 >> 3 - -2 >> 5
		int diff = yt - t;
		if(diff < 0) {
			diff = -diff;
//				diff = diff * -1;
//				diff *= -1;
		}
//		if(yt < t ) {
		if(diff < 0) {
			System.out.println("어제보다 온도가 높습니다");
			System.out.printf("어제보다 %d도 높습니다", diff);
		} else {
			System.out.println("어제보다 온도가 낮습니다");
			System.out.printf("어제보다 %d도 낮습니다", diff);
		}
		System.out.println();
		
		// 문제 3
		/*
		 * 어떤 수가 있을때 예를 들어 123
		 * 
		 * "입력한 수는 100보다 "큰/같은/작은" 수이며
		 * 양수이고
		 * 홀수입니다"
		 */
		int q3 = -123;
		if(q3 > 100) {
			System.out.println("입력한 수는 100보다 큰 수이며");
		} else if (q3 < 100) {
			System.out.println("입력한 수는 100보다 작은 수이며");
			
//		} else if (q3 == 100) {
		} else {
			System.out.println("입력한 수는 100과 같은 수이며");
			
		}
		
		if(q3 >= 0) {
			System.out.println("양수이고");
		} else {
			System.out.println("음수이고");
		}
		
		if(q3 % 2 == 0) {
			System.out.println("짝수 입니다");
		} else {
			System.out.println("홀수 입니다");
		}
		
		// 문제 4
		/*
		 * a, b 두 수가 있을때
		 * 둘중에 큰 값 출력
		 */
		int a5 = 5;
		int b5 = 5;
		if(a5 > b5) {
			System.out.println(a5);
		} else {
			System.out.println(b5);
		}
		
		// 문제 5
		/*
		 * 숫자가
		 * 1일때 "일"
		 * 2일때 "이"
		 * 3일때 "삼"
		 * 다른 수일때 "그 외"
		 */
		int a6 = 2;
		if( a6 == 1 ) {
			System.out.println("일");
		} else if( a6 == 2 ) {
			System.out.println("이");
		} else if( a6 == 3 ) {
			System.out.println("삼");
		} else {
			System.out.println("그 외");
		}
		
		// 문제 6
		/*
		 * 월에 따라서
		 * 4계절을 출력
		 * 봄 : 3,4,5
		 * 여름 : 6,7,8
		 * 가을 : 9, 10, 11
		 * 겨울 : 12, 1, 2
		 */
		
		int m = -1;
		
		if(m < 1) { m = 1; }
		if(m > 12) m = 12;
		
//		if(m < 1) 
//			if( m == -2 )
//				m = 0;
//			else	// else 어떤 if껀지 애매해 지니까
					// 가능하면 중괄호 쓰자
//				m = -1;
		
		
		if(m >= 1 && m <= 12) {
			
			if( m >= 3 && m <= 5 ) {
				System.out.println("봄");
			} else if( m >= 6 && m <= 8 ) {
				System.out.println("여름");
			} else if( m >= 9 && m <= 11 ) {
				System.out.println("가을");
			} else if( m == 12 || (m >= 1 && m <= 2)) {
//		} else if( m == 12 || m == 1 || m == 2) {
//		} else {
				System.out.println("겨울");
			}
			
		} else {
			System.out.println("정확한 월을 입력해주세요");
		}
		
		if( m >= 3 && m <= 5 ) {
			System.out.println("봄");
		} else {
			System.out.println("봄 아님");
		}
		String season = ( m >= 3 && m <= 5 ) ? "봄" : "봄 아님";
		System.out.println(season);
		System.out.println(( m >= 3 && m <= 5 ) ? "봄" : "봄 아님");
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("월을 입력하세요");
//		int month = scan.nextInt();
		
		// 어려운 문제 1.
		// 두자리 정수가
		// 10의 자리와 1의자리가 같은지 판단
		int num = 33;	// 같음
		num = 64;		// 다름
		
		// 어려운 문제 2.
		// 사각형의 한쪽 모서리 : (10, 20)
		// 다른쪽 모서리 : (90, 100)
		// 새로운 점 : xc, yc가 직각사각형에 포함 되는가?
		
		
		// random 사용법
		/*
		 * Math.random();
		 * 0 <= Math.random() < 1
		 * 
		 * 주사위 : 3 ~ 6
		 * (0 ~ 5) + 1
		 * x + 1 = y - 2
		 * x + 1 + 2 = y - 2 + 2
		 * 0 ~ 0.999999999 
		 * 곱하기 6을 하면 5.999999999
		 * 0 <= Math.random() < 1
		 * 0*5 <= Math.random()*5 < 1*5 // 0~4.999
		 * 0*(5+1) <= Math.random()*(5+1) < 1*(5+1)
		 * // 0 ~ 5.9999999999
		 * (int) 0~5
		 */
		double rand = Math.random();
		System.out.println("rand : "+ rand);

		double rand2 = Math.random()*(5+1);
		int rand3 = (int)rand2;	// 0~5
		int rand4 = rand3 + 1; 	// 1~6
		System.out.println("주사위 : "+ rand4);
		
		// 쉽게 사용하기
		int rnd1 = (int) (Math.random() * 60000);
		int rnd2 = rnd1 % 6;
		int rnd3 = rnd2 + 1;
		
		// 가위 바위 보 게임
		
	}

}
