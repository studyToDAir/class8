package sec01.exam01;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		
		int sum = 0;
		
		// 1씩 증가하는 것을 5번 하고싶다
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		System.out.println("sum : "+ sum);
		
		// 1 + 2 + 3 + 4 + 5
		// 참고로 1~n까지의 합
		// n*(n+1) / 2
		sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println("sum : "+ sum);
		
		int i = 1;
//		int i = 0;
		
		sum = 0;
		
//		i++;
		sum = sum + i;	// 1
		
		i++;
		sum = sum + i;	// 2
		
		// 3
		i++;
		sum = sum + i;	// 3
		
		i++;
		sum = sum + i;	// 4
		
		i++;
		sum = sum + i;	// 5
		System.out.println("sum : "+ sum);
		
		/*
		 * 반복문을 만드는 원리
		 * 
		 * 1. 반복 되는 것 찾기
		 * 		Ctrl + c, v 했을때 바뀌지 않는 것
		 * 
		 * 2. 반복 되지 않는 것 찾기
		 * 		규칙(패턴)을 찾을 수 있으면 반복문으로 만들 수 있음
		 * 		변수를 활용해서 더이상 바뀌지 않게 만들기 
		 * 
		 * 3. 시작 조건
		 * 
		 * 4. 종료 조건
		 * 
		 * for : 반복 횟수를 아는 경우
		 * while : 반복 횟수를 모르는 경우
		 * 
		 */
		
		int sum2 = 0;
		for(int e = 1; e <= 5; e++) {
			sum2 = sum2 + e;
		}
		System.out.println("sum2 : "+ sum2);
		
		
		int sum3 = 0;
		for(int e = 1; e <= 5; e++) {
//			System.out.println("e : "+ e);
			sum3 = sum3 + e;
//			System.out.println("sum3 : "+ sum3);
		}
		System.out.println("최종 sum3 : "+ sum3);
		
		// 1~10까지 출력
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		int i2 = 1;
		System.out.println(i2);	// 1
		
		i2 = i2 + 1;
		System.out.println(i2);	// 2
		
		i2 = i2 + 1;
		System.out.println(i2);	// 3
		// 더이상 바뀌는게 없다 복붙이면 끝난다
		
		System.out.println("--------------");
		for(int i3 = 1; i3 <= 10; i3 = i3 + 1) {
			System.out.println(i3);
		}
		
		// 1 + 2 + 3 + ... + 100을 구하시오
		// 항이 많을 경우 항 별로 결과를 변수에 담아본다
		
		/*
			1
			1+2
			1+2 +3
			1+2 +3 +4
		*/
		int sum4 = 1;
		sum4 = sum4 + 2;
		sum4 = sum4 + 3;
		sum4 = sum4 + 4;
		
		int sum5 = 0;
		int i5 = 1;
		sum5 = sum5 + i5;
		i5 += 1;			// 2
		sum5 = sum5 + i5;
		
		i5 += 1;			// 3
		sum5 = sum5 + i5;
		
		i5 += 1;			// 4
		sum5 = sum5 + i5;
		
		int sum6 = 0;
		for(int i6 = 1; i6 <= 100; i6 += 1) {
			sum6 = sum6 + i6;
		}
		System.out.println("sum6 : "+ sum6);
		
		// 깜짝퀴즈
		// 10 ~ 1 출력하시오
		System.out.println(10);
		System.out.println(9);
		System.out.println(8);
		
		int i7 = 10;
		System.out.println(i7);
		--i7;
		System.out.println(i7);
		i7--;
		System.out.println(i7);
		
		for(int i8 = 10; i8 >= 1; i8--) {
			System.out.println(i8);
		}
		
		System.out.println("---q1----------");
		// 1 ~ 20 까지 짝수만 출력하시오
		/*
		 * 2 4 6 8 10 ... 20
		 * 시작, 증감식 조절
		 * 짝수일때만 출력
		 */
		int q1 = 2;	//2
		q1 += 2;	//4
		q1 += 2;	//6
		for(int qq1=2; qq1<=20; qq1 += 2) {
			System.out.println(qq1);
		}
		
		for(int qqq1=1; qqq1<=20; qqq1++) {
			if( qqq1 % 2 == 0 ) {
				System.out.println(qqq1);
			}
		}
		
		
		// 1 ~ 20 까지 3의 배수만 출력하시오
		System.out.println("---q2----------");
		for(int qq2=3; qq2<=20; qq2 += 3) {
			System.out.println(qq2);
		}
		
		for(int qqq2=1; qqq2<=20; qqq2++) {
			if( qqq2 % 3 == 0 ) {
				System.out.println(qqq2);
			}
		}
		
		// 1 ~ 5 까지 모두 출력하면서 홀/짝
		//		1 : 홀수
		//		2 : 짝수
		System.out.println("---q2----------");
		for(int q3 = 1; q3 <= 5; q3++) {
			if(q3 % 2 == 0) {
				System.out.println(q3 +": "+ "짝수");
			} else {
				System.out.println(q3 +": "+ "홀수");
			}
			
			String ea = "홀수";
			if(q3 % 2 == 0) {
				ea = "짝수";
//			} else {
//				ea = "홀수";
			}
			System.out.println(q3 +": "+ ea);
			
			String ae = (q3 % 2 == 0) ? "짝수" : "홀수";
			System.out.println(q3 +": "+ ae);
		}
		
		// 1~20까지 홀수의 합
		System.out.println("---q4----------");
		int summ4 = 0;
		for(int q4=1; q4<=20; q4++) {
			if(q4 % 2 == 1) {
				System.out.println(q4);
				summ4 += q4;
			}
		}
		System.out.println("summ4 : "+ summ4);
		
		// 1~20까지 홀수의 개수
		
		System.out.println("---q5----------");
		int summ5 = 0;
		for(int q4=1; q4<=20; q4++) {
			if(q4 % 2 == 1) {
				System.out.println(q4);
				summ5 += 1;
			}
		}
		System.out.println("summ5 : "+ summ5);		
		
		// 구구단 2단 출력
		//		2 x 1 = 2
		//		2 x 2 = 4
		System.out.println("2 x 1 = 2");
		System.out.println("2 x 2 = 4");
		int qq6 = 1;
		int qqq6 = 2;
		System.out.println("2 x "+ qq6 +" = "+ (2*qq6));
		qq6++;
		qqq6 += 2;
		System.out.println("2 x "+ qq6 +" = "+ (2*qq6));
		
		System.out.println("---q6----------");
		for(int q = 1; q <= 9; q++) {
			System.out.println("2 x "+ q +" = "+ (2*q));	
		}
		
		System.out.println("---q7----------");
		// 1~10까지 옆으로 3개씩 출력
		//		1 2 3
		//		4 5 6
		//		7 8 9
		//		10
//		System.out.println("1 2 3");
//		1 2 3
//		4 5 6
//		System.out.print(1 +" ");
//		System.out.print(2 +" ");
//		System.out.println(3 +" ");
//		System.out.print(1 +" ");
//		System.out.print(2 +" ");
//		System.out.print(3 +" ");
//		System.out.println();
		for(int q = 1; q <= 10; q++) {
//			System.out.print(q +" ");
//			if(q % 3 == 0) {
//				System.out.println();
//			}
			
			if(q % 3 != 0) {
				System.out.print(q +" ");
			} else {
//				System.out.print(q +"\n");
				System.out.println(q);
			}
		}
		
		// 1~n (n은 입력받은 수)까지의 합 또는 짝수의 합
		System.out.print("n을 입력:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int sum8 = 0;
		for(int q=1; q<=n; q++) {
			sum8 += q; 
		}
		System.out.println("1 ~ "+ n +"까지 합은 : "+ sum8);
		
		
		// 구구단 전부 출력
		/*
		 * 2단 출력
		 * --------
		 * 3단 출력
		 * -------
		 * 4단 출력
		 */
		
		for(int q = 1; q <= 9; q++) {
			System.out.println("2 x "+ q +" = "+ (2*q));	
		}
		
		for(int q = 1; q <= 9; q++) {
			System.out.println("3 x "+ q +" = "+ (3*q));	
		}
		
		int q9 = 2;
		for(int q = 1; q <= 9; q++) {
			System.out.println(q9 +" x "+ q +" = "+ (q9*q));	
		}
		
		q9++;
		for(int q = 1; q <= 9; q++) {
			System.out.println(q9 +" x "+ q +" = "+ (q9*q));	
		}
		
		System.out.println("---q9------------");
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("-- "+ dan +"단--");
			
			for(int q = 1; q <= 9; q++) {
				System.out.println(dan +" x "+ q +" = "+ (dan*q));	
			}
			
		}
		
		
		// 한줄에 1단씩 출력
		// 2x1=2 2x2=4... 2x9=18
		// 3x1=3 3x2=6... 3x9=27
		
		// 2x1=2 2x2=4 2x3=6...
		System.out.println("2x1=2 ");
		System.out.println("2x2=4 ");
		int i3 = 1;
		System.out.println("2x"+ i3 +"="+ (2*i3) +" ");
		i3++;
		System.out.println("2x"+ i3 +"="+ (2*i3) +" ");

		i3++;
		System.out.println("2x"+ i3 +"="+ (2*i3) +" ");
		
		// 시작 1
		// 종료 9
		System.out.println("--- 한줄 ----");
		for(int i4=1; i4<=9; i4++) {
			System.out.print("2x"+ i4 +"="+ (2*i4) +" ");
		}
		
		for(int i4=1; i4<=9; i4++) {
			System.out.print("3x"+ i4 +"="+ (3*i4) +" ");
		}
		
		int i6 = 2;
		for(int i4=1; i4<=9; i4++) {
			System.out.print(i6 +"x"+ i4 +"="+ (i6*i4) +" ");
		}
		
		i6++;
		for(int i4=1; i4<=9; i4++) {
			System.out.print(i6 +"x"+ i4 +"="+ (i6*i4) +" ");
		}
		
		i6++;
		for(int i4=1; i4<=9; i4++) {
			System.out.print(i6 +"x"+ i4 +"="+ (i6*i4) +" ");
		}
		
		// 시작 : 2
		// 종료 : 9
		System.out.println();
		System.out.println("--- 한줄 최종----");
		for(int i8 = 2; i8 <= 9; i8++) {
			for(int i4=1; i4<=9; i4++) {
				System.out.print(i8 +"x"+ i4 +"="+ (i8*i4) +"\t");
			}
			System.out.println();
		}
		
		

		// 두~세 단씩 옆으로 출력
		// 2x1=2 3x1=3
		// 2x2=4 3x2=6
		// ...   ...
		// 2x9=18 3x9=27
		//
		// 4x1=4 5x1=5
		// ...   ...
		
		
		
		// 2x1=2 3x1=3
		// 2x2=4 3x2=6
		
//		2x1=2 3x1=3
		
		System.out.println("2x1=2 3x1=3");
		System.out.println("2x2=4 3x2=6");
		
		int k = 1;
		int m = 2;
		int m2 = 3;
		m2 = m + 1;
		System.out.println(m +"x"+ k +"="+ (m*k) +" "+ m2 +"x"+ k +"="+ (m2*k) +"");
		System.out.println(m +"x"+ k +"="+ (m*k) +" "+ (m+1) +"x"+ k +"="+ ((m+1)*k) +"");

		k++;
		System.out.println(m +"x"+ k +"="+ (m*k) +" "+ (m+1) +"x"+ k +"="+ ((m+1)*k) +"");
		
		k++;
		System.out.println(m +"x"+ k +"="+ (m*k) +" "+ (m+1) +"x"+ k +"="+ ((m+1)*k) +"");
		
		// 2,3단 출력
		// 시작 : 1
		// 종료 : 9
		for(int k2=1; k2<=9; k2++) {
			System.out.println(m +"x"+ k2 +"="+ (m*k2) +" "+ (m+1) +"x"+ k2 +"="+ ((m+1)*k2) +"");
		}
		System.out.println();
		m += 2;
		for(int k2=1; k2<=9; k2++) {
			System.out.println(m +"x"+ k2 +"="+ (m*k2) +" "+ (m+1) +"x"+ k2 +"="+ ((m+1)*k2) +"");
		}
		System.out.println();
		m += 2;
		for(int k2=1; k2<=9; k2++) {
			System.out.println(m +"x"+ k2 +"="+ (m*k2) +" "+ (m+1) +"x"+ k2 +"="+ ((m+1)*k2) +"");
		}
		System.out.println();
		
		System.out.println("-- 2단씩 출력 --");
		// 시작 : 2
		// 종료 : 9
		for(int p = 2; p <= 9; p += 2) {
			
			for(int k2=1; k2<=9; k2++) {
				System.out.println(p +"x"+ k2 +"="+ (p*k2) +" "+ (p+1) +"x"+ k2 +"="+ ((p+1)*k2) +"");
			}
			
			System.out.println();
		}
		
		
		
//		for (int i5 = 2; i5 <= 9; i5 += 2) {
//			for (int i4 = 1; i4 <= 9; i4++) {
//				System.out.println(i5 + "x" + i4 + "=" + i4 * i5 + " " + (i5 + 1) + "x" + i4 + "=" + (i4 * (i5 + 1)));
//				System.out.println();
//			}
//		}
		
		
		for(int w = 2; w <= 2; w++) {
			System.out.println("!!!!");
		}
		
		System.out.println("!!!!");
		
		
		// 0단계
		/*
		 
		 +
		 +
		 +
		 +
		 +
		 
		 */
		
		// 1단계
		/*
		 
		 +++++
		 
		 */
		
		// 2단계
		/*
		 
		 +++++
		 +++++
		 +++++
		 
		 */
		
		// 3단계
		/*
		 
		 +.+.+.+.+.
		 		 
		 */
		
		// 3.5단계
		/*
		 
		 1
		 22
		 333
		 4444
		 55555
		 
		 */
		
		// 4단계
		/*
		 
		 +
		 ++
		 +++
		 ++++
		 +++++
		 
		 */
		
		
		// 4.5단계
		/*
		 	11111
		 	2222
		 	333
		 	44
		 	5
		 	
		 */
		
		// 5단계
		/*
		 
 		 +____
		 ++___
		 +++__
		 ++++_
		 +++++
		 
		 */
		
		// 6단계
		/*
		 
 		 ____+
		 ___++
		 __+++
		 _++++
		 +++++
		 
		 */
		
		// 7단계
		/*
		 
 		 ____+
		 ___+++
		 __+++++
		 _+++++++
		 +++++++++
		 
		 */
		
		// 8단계
		/*
		 
 		 ____+____
		 ___+++___
		 __+++++__
		 _+++++++_
		 +++++++++
		 
		 */
		
		// 9단계
		// 입력 받은 만큼 출력
		
		
		// 주사위 두개로 나올 수 있는 모든 조합 출력
		/*
		 	2 : [1,1]
		 	3 : [1,2] [2,1]
		 	4 : [1,3] [2,2] [3,1]
		 */
		// 중복을 제거한 경우의 수를 출력
		/*
		 	2 : 1가지
		 	3 : 1가지
		 	4 : 2가지
		 */
		
		int x = 1;
		
		for( ; x <= 5; ) {
			
			x++;
		}
		System.out.println("x : "+ x);
	}

}









