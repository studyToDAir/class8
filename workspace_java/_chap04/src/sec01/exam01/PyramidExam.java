package sec01.exam01;

import java.util.Scanner;

public class PyramidExam {

	public static void main(String[] args) {

		// 0단계
		/*
		 * + + + + +
		 */
		System.out.println("--- 0단계 ---");
//		System.out.println("+");
//		System.out.println("+");
		for (int i = 1; i <= 5; i++) {
			System.out.println("+");
		}

		// 1단계
		/*
		 * 
		 * +++++
		 * 
		 */
		System.out.println("--- 1단계 ---");
//		System.out.print("+");
//		System.out.print("+");
		for (int i = 1; i <= 5; i++) {
			System.out.print("+");
		}
		System.out.println();

		// 2단계
		/*
		 * 
		 * +++++ +++++ +++++
		 * 
		 */
		System.out.println("--- 2단계 ---");
//		for(int i=1; i<=5; i++) {
//			System.out.print("+");
//		}
//		System.out.println();
//		
//		for(int i=1; i<=5; i++) {
//			System.out.print("+");
//		}
//		System.out.println();

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("+");
			}
			System.out.println();
		}

		// 3단계
		/*
		 * 
		 * +.+.+.+.+.
		 * 
		 */
		System.out.println("--- 3단계 ---");
//		System.out.print("+");
//		System.out.print(".");
//		System.out.print("+");
//		System.out.print(".");
		for (int i = 1; i <= 5; i++) {
			System.out.print("+");
			System.out.print(".");
		}
		System.out.println();

		// 3.5단계
		/*
		 * 1 22 333 4444 55555
		 */
		// 첫번째 줄 1 하나 출력
		// 2번째 줄 2를 2개 출력하고 엔터
		// 3번째 줄 3을 3개 출력하고 엔터
//		System.out.print(1);
//		System.out.println();
//		
//		System.out.print(2);
//		System.out.print(2);
//		System.out.println();

//		for(int i=1; i<=1; i++) {
//			System.out.print(1);
//		}
//		System.out.println();
//		
//		for(int i=1; i<=2; i++) {
//			System.out.print(2);
//		}
//		System.out.println();
//		
//		int j = 3;
//		for(int i=1; i<=j; i++) {
//			System.out.print(2);
//		}
//		System.out.println();

		System.out.println("--- 3.5단계 ---");
		for (int j = 1; j <= 5; j++) {

			for (int i = 1; i <= j; i++) {
				System.out.print(j);
			}
			System.out.println();

		}

		// 4단계
		/*
		 * + ++ +++ ++++ +++++
		 */
		// 첫번째 줄에 + 하나
		// 2번째 줄에 + 2개
		// 3번째 줄에 + 3개 출력하고 엔터
//		System.out.println("+");
//		
//		for(int i=1; i<=2; i++) {
//			System.out.print("+");
//		}
//		System.out.println();
//		
//		for(int i=1; i<=3; i++) {
//			System.out.print("+");
//		}
//		System.out.println();
//		
//		int j = 4;
//		for(int i=1; i<=j; i++) {
//			System.out.print("+");
//		}
//		System.out.println();
//		
//		j = j + 1;
//		for(int i=1; i<=j; i++) {
//			System.out.print("+");
//		}
//		System.out.println();

		System.out.println("--- 4단계 ---");
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("+");
			}
			System.out.println();
		}

		// 4.5단계
		/*
		 * 11111 2222 333 44 5
		 * 
		 */
		// 1번줄에 1이 5개
		// 2번줄에 2가 4개
//		int k = 1;
//		int m = 5;
//		for(int i = 1; i<=m; i++) {
//			System.out.print(1);
//		}
//		System.out.println();
//		
//		k = k + 1;
//		m--;
//		for(int i = 1; i<=m; i++) {
//			System.out.print(k);
//		}
//		System.out.println();
//		
//		k = k + 1;
//		m--;
//		for(int i = 1; i<=m; i++) {
//			System.out.print(k);
//		}
//		System.out.println();

//		int k1 = 1, m1 = 5;
		System.out.println("--- 4.5단계 ---");
		for (int k = 1, m = 5; k <= 5 && m >= 1; k++, m--) {
			for (int i = 1; i <= m; i++) {
				System.out.print(k);
			}
			System.out.println();
		}

//		int k = 1;
//		int m = 6 - k;

		System.out.println("--- 4.5단계 ---");
		// 전체 5줄
		for (int k = 1; k <= 5; k++) {

			// 한줄의 내용을 완성하는 반복문
			for (int i = 1; i <= (6 - k); i++) {
				System.out.print(k);
			}
			System.out.println(); // 엔터

		}

		// 5단계
		/*
		 * +____ ++___ +++__ ++++_ +++++
		 */
		System.out.println("--- 5단계 ---");
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("+");
			}
			for (int i = 1; i <= (5 - j); i++) {
				System.out.print("_");
			}
			System.out.println();
		}

		// 6단계
		/*
		 * ____+ ___++ __+++ _++++ +++++
		 */
		System.out.println("--- 6단계 ---");
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= (5 - j); i++) {
				System.out.print("_");
			}
			for (int i = 1; i <= j; i++) {
				System.out.print("+");
			}
			System.out.println();
		}

		// 7단계
		/*
		 * ____+ ___+++ __+++++ _+++++++ +++++++++ 1 1 2 2 3 4 3 5 6
		 * 
		 */
		System.out.println("--- 7단계 ---");
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= (5 - j); i++) {
				System.out.print("_");
			}
			for (int i = 1; i <= (j * 2) - 1; i++) {
				System.out.print("+");
			}
			System.out.println();
		}

		// 8단계
		/*
		 * 
		 * ____+____ ___+++___ __+++++__ _+++++++_ +++++++++
		 * 
		 */

		System.out.println("--- 8단계 ---");
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= (5 - j); i++) {
				System.out.print("_");
			}
			for (int i = 1; i <= (j * 2) - 1; i++) {
				System.out.print("+");
			}
			for (int i = 1; i <= (5 - j); i++) {
				System.out.print("_");
			}
			System.out.println();
		}

		// 9단계
		// 입력 받은 만큼 출력
		System.out.println("--- 9단계 ---");
		int k = 15;
		for (int j = 1; j <= k; j++) {
			for (int i = 1; i <= (k - j); i++) {
				System.out.print("_");
			}
			for (int i = 1; i <= (j * 2) - 1; i++) {
				System.out.print("+");
			}
			for (int i = 1; i <= (k - j); i++) {
				System.out.print("_");
			}
			System.out.println();
		}

		// 제출 예시
		Scanner scan = new Scanner(System.in);
		System.out.println("몇줄출력할지 입력:");
		int user20 = scan.nextInt();

		for (int tree1 = 1; tree1 < user20; tree1++) {
			for (int tree2 = user20; tree2 >= tree1; tree2--) {
				System.out.print("_");
			}
			for (int tree3 = 1; tree3 <= tree1; tree3++) {
				System.out.print("+");
			}
			for (int tree4 = 2; tree4 <= tree1; tree4++) {
				System.out.print("+");
			}
			for (int tree5 = user20; tree5 >= tree1; tree5--) {
				System.out.print("_");
			}
			System.out.println();

		}
		
		
	}

}
