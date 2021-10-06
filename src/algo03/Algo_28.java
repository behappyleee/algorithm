package algo03;

import java.util.Scanner;

// 입력된 두 수 의 합
public class Algo_28 {

	public static int getSum(int a, int b) {
		
		int sum = 0;
		
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}
	
	// 재귀 함수를 이용
	public static int recursiveFunc(int a, int b) {
		
		
		
		
		return 0;
	}
	
	// 정답 (재귀함수를 이용) 재귀함수는 탈출 조건을 반드시 명시해야 함
	// 재귀함수를 이용시에는 간단한 예제를 먼저 만든 후에 사용
	public static int calAccSum(int start, int end) {
		
		if(start == end) {
			return start;
		}
		
		return start + calAccSum(start+1, end);
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("다음 두 수를 입력 하시오 ");
		
		System.out.print("a : " );
		int a = scan.nextInt();
		
		System.out.print("b : ");
		int b = scan.nextInt();
		
		System.out.println("답 : " + getSum(a, b));
		
		// 정답
		
		int start; 
		int end;
		
		start = scan.nextInt();
		end = scan.nextInt();
		
		int sum = 0;
		System.out.println( "정답 : " + calAccSum(start, end) );
		
		
	}
	
}
