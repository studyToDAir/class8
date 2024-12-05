package _random;

public class Random {

	// 반장 추천
	// 박혜성
	// 김경민
	public static void main(String[] args) {

		String[] names = new String[10];
		names[0] = "남기원";
		names[1] = "김도희";
		names[2] = "이준규";
		names[3] = "탁정현";
		names[4] = "이주희";
		names[5] = "김경민";
		names[6] = "박혜성";
		names[7] = "안혜리";
		names[8] = "채민병";
		names[9] = "최수완";		

		int fire = (int)(Math.random() * 10000) % 10;
		System.out.println("당선 : "+ names[fire]);
		
		
		
		// names와 똑같은 크기의 int 배열
		int[] vote = new int[names.length];
		
		for(int i=0; i<1000; i++) {
			fire = (int)(Math.random() * 10000) % 10;
//			System.out.println("당선 : "+ names[fire]);
			vote[fire] += 1;
		}
		
		int max = Integer.MIN_VALUE; // -2147483648
		int index = -1;
		for(int i=0; i<vote.length; i++) {
			
			if(max < vote[i]) {
				max = vote[i];
				index = i;
			}
			
		}
		
		for(int i=0; i<names.length; i++) {
			System.out.print("이름 : "+ names[i]);
			System.out.println("["+ vote[i]+"]");
		}
		
		System.out.println("최대값 : "+ names[index] +", 득표수:"+max);
		
		
		// 3~10
		int start = 3;
		int end = 10;
		
		// 0~0.999
		double dRandom = Math.random();	
		
		// 0~7
		int iRandom = (int)(dRandom*(end - start + 1));
		
		int result_random = iRandom + start;
		
		// 한줄로
		int random = ( (int)(Math.random()*(end - start + 1)) ) + start;
	}

}
