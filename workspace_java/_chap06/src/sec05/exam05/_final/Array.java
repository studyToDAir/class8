package sec05.exam05._final;

public class Array {

//	int[] a = new int[3];
//	Array() {
//		System.out.println(a.length);
//		a.length // final 정수 변수
//		a.length = 5;
//	}
	
	final int length;	// 배열의 크기
	int[] arr;			// 나만의 작고 소중한 배열
	int cursor = 0;		// 현재 위치

	Array(int length){
		this.length = length;
		arr = new int[length];
	}
	// 0 >> 1
	// 1 >> 2
	// 2 >> 3
	// 3 
	void add(int x) {
		// a[0] = 100;
		System.out.println("cursor: "+ cursor +", x: "+ x);
		if(cursor < this.length) {
			arr[cursor] = x;
			cursor++;
		} else {
			System.out.println("범위를 초과했습니다");
		}
	}
	int get(int index) {
		
		if(index < this.length) {
			return arr[index];
		} else {
			System.out.println("범위를 초과했습니다");
			return Integer.MIN_VALUE;
		}
	}
}
