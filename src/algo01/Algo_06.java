package algo01;

// 최대 공약수 구하기
public class Algo_06 {
	
	// 두 수 최대 공약수 반환 메서드
	public static int getMaxDiv(int a, int b) {

		int maxDiv = 0;
		
		for(int i = 1; i < a; i ++) {
			if(a % i == 0 && b % i == 0) {
				maxDiv = i;
			}
		}
		return maxDiv;
	}
	
	public static void main(String[] args) {
		
		System.out.println( getMaxDiv(12, 18) );
		
		// 최대 공약수 정답
		int num1, num2; 
		
		num1 = 12;
		num2 = 18;
		
		int big, small;
		
		if( num1 > num2 ) {
			big = num1;
			small = num2;
		} else {
			big = num2;
			small = num1;
		}
		
		int gcd = 1;	// 최대 공약수는 1로 초기화	
		
		for(int i =1; i <= small; i++) {
			//	가장 마지막에 나누어 떨어지는 수 가 최대공약수
			if(big % i ==0 && small % i ==0 ) {
				gcd = i;
			}
		 }
		
	}
	
}
