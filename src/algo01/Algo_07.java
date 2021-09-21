package algo01;

// 소수 판별
public class Algo_07 {

	public static boolean isDec(int num) {
		
		int divZero = 0;
		boolean isDec = false;
		
		if(num == 1) {
			System.out.println("1은 안됩니다.");
			return isDec;
			
		} else if (num > 0 ) {
			
			int i =1;
			while( i <= num) {
				if( num > 0  && num % i == 0 ) {
					divZero += 1;
				}
				i++;
			}
			
		}
		// 삼항 연산자 
		isDec = (divZero == 2) ? true : false;
		return isDec;
	}
	
	public static void main(String[] args) {
		
		System.out.println( isDec(13) );
		
		// 정답
		int num = 13;
		boolean isPrime = true; 
		// 소수는 1과 자기자신만 나누어 떨어지는 수 
		
		// 범위를 어차피 자기 자기자신/2 까지 소수가 아니면 나누어 떨어지기에 범위를 /2 까지 지정
		for(int i = 2; i <= num/2; i++) {
			if(num % i ==0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println(num + "소수 입니다.");
		} else {
			System.out.println(num + "소수가 아닙니다.");
		}
		
		
	}
	
}
