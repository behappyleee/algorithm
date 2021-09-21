package algo01;

// 팩토리얼 구하기
public class Algo_08 {
	
	// 반복문 팩토리얼
	public static int getFactorial(int num) {
		int sum = 1;
		for(int i = num; i > 0; i--) {
			sum *= i;
		}
		return sum;
	}
	
	// 재귀함수 팩토리얼
	public static int getFactorial_02(int num) {
		
		for(int i =num; i > 0; i--) {
			
		}
		return num--;
	}
	
	public static void main(String[] args) {
		
		System.out.println( "Factiorial : " + getFactorial(5) );
		
		// 정답
		int inputNum = 5;
		int accNum = 1;
		// 5! = 5 * 4 * 3 * 2 * 1
		// 7! = 7 * 6 * 5 * 4 * 3 * 2 * 1
	
		for(int i = 1; i <= inputNum; i++) {
			accNum *= i; 	// accNum = accNum * i
		}
		System.out.println(accNum);
		
	}
}
