package algo03;

import java.util.Arrays;

// N 의 사이클 길이 구하기
public class Algo_23 {
	// 1 <= N <= 100
	// ex) 2 + 6 = 8, 6 + 8 = 14, 84 -> 8 + 4 = 12, 42 -> 4 + 2 = 6, 26  정답 --> 4
//	public static int getCycle(int n) {
//		
//		String[] strNum = String.valueOf(n).split(""); 
//		int a = 0;
//		int b = 0;
//		int answer = 0;
//		int j = 0;
//		String strSum = null;	
//		System.out.println(Arrays.toString(strNum));
//		
//		a = n % 10;
//		b = n / 10;
//
//		int[] numArray  = {a, b};
//		
//		for(int i = 0; strSum.equals(numArray); i++) {
//			
//			answer = numArray[0] + numArray[1]; 
//			
//			numArray[0] = numArray[1];
//			
//			if(answer > 10 ) {
//				numArray[1] = answer%10;
//			} else {
//				numArray[1] = answer;
//			}
//			
//			while(strSum.equals(answer)) {
//				answer = a + b;
//				strSum = String.valueOf(answer);
//				j++;
//			}
//			
//			
//		}
//		
//		return i;
//	}
//	
	
	public static void main(String[] args) {
		
		// 1 부터 100 까지 사이클의 합 구하기
		// int a = getCycle(26);
		// System.out.println(a);
		
		// 정답
		
		int n = 26;
		int res = n;
		int cnt = 0;
		int tmp;
		// 26 2 + 6 = 8 -> 68 6 + 8 = 14 -> 84 8 + 4 = 12, 42 4 + 2 = 6 26 4회 정답
		// 05 0+5=5 55, 5+5=10, 50 5 + 0 => 5 3회가 정답
		// 42 4+2=6, 26 2+6=8, 68 6+8=14 => 84 8+4=12 42 4회가 정답
		
		 do {
			 tmp = res/10 + res%10 ;
			 res =  res % 10 *10 + tmp % 10;
			 cnt++;
		 } while( n != res);
		
		
		
		System.out.println(cnt);
		
		
	}
	
}
