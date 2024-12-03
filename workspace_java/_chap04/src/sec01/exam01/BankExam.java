package sec01.exam01;

import java.util.Scanner;

public class BankExam {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int balance = 0;
		
		do {
			System.out.println("------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				System.out.println("예금액 : ");
				int input = scan.nextInt();
				if(input > 0) {
					balance += input;
				} else {
					System.out.println("예금액을 확인해주세요");
				}
			} else if(menu == 2) {
				System.out.println("출금액 : ");
				int output = scan.nextInt();
				if(output < 0 || balance < output) {
					System.out.println("출금액을 확인해주세요");
				} else {
					System.out.println("출금액 : "+ output);
					balance -= output;
					
					System.out.println("출금 후 잔액 : "+ balance);
				}
			} else if (menu == 3) {
				System.out.println("잔액 : "+ balance);
			} else if(menu == 4) {
				break;
			}
			
		}while( true );
		
	}

}
