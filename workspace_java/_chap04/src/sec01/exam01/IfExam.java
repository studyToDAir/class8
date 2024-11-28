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
		 * 1. "영하"인지 "영상"인지
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
		
		// 문제 3
		/*
		 * 어떤 수가 있을때
		 * 
		 * "입력한 수는 100보다 큰/작은 수이며
		 * 양수이고
		 * 홀수입니다"
		 */
		
		
	}

}
