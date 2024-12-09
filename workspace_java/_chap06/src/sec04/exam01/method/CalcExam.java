package sec04.exam01.method;

import java.util.Scanner;

public class CalcExam {

	// 전달인자 선언의 ()
	public static void main(String[] args) {

		Calc calc = new Calc();

		calc.powerOn();	// 실행의 ()
		System.out.println("calc.isOn : "+ calc.isOn);
		
		calc.powerOff();
		System.out.println("calc.isOn : "+ calc.isOn);
		
		int b = 7;
		int a = calc.plus(b, 10);
		double c = calc.divide(10, 0);
		System.out.println("c : "+ c);
		
		
		Calc[] d = new Calc[10];
		d[0] = new Calc();
		
		Calc[] e = {new Calc(), new Calc()};
		
		
		Calc c1 = new Calc();
		Calc c2 = new Calc();
		c1.isOn = true;
		
		Calc[] h = new Calc[100];
		h[0] = new Calc();
		
		Calc[] h2 = {
				new Calc(), 
				new Calc(),
				c1
			};
		
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		Scanner[] s = {
				new Scanner(System.in),
				scan1
		};
		
		
		String s2 = "a";
		String s3 = new String("a");
		String[] ss = {
				new String("김"), 
				new String("이"),
				s3,
				s2
		};
		boolean d0 = d[0].isOn;
		
		
		System.out.format("%d월 %d일 %s %d시", 12, 6, "오후", 4);
		System.out.println();
		
		int[] f = {1,2,3,4,5};
		int f1 = calc.sum1(f);
		System.out.println("f1 : "+ f1);
		
		int f2 = calc.sum2(f);
		int f3 = calc.sum2(1,2,3,4,5);
		System.out.println("f2 : "+ f2);
		System.out.println("f3 : "+ f3);
		
	}

}
