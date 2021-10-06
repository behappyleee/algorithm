package algo03;

import java.util.Scanner;

// 피보나치 재귀
public class Algo_30 {

	public static int getFibo(int num) {

		// nextNum = prevNum + prevNum - 1;
		int prevNum = 0;	// 하나 전에 수
		int nextNum = 0;	// 다음 수 
		int tmp;
		
		// nextNum = prevNum
		
		
		
		return prevNum;
	}
	
	public static int getFi(int n) {
		
		if(n == 1) return 1;
		if(n == 2) return 1;
		
		return getFi(n-1) + getFi(n-2); 
	}
	
	
	
	public static void main(String[] args) {
		
		int answer = getFibo(6);

		System.out.println(answer);
		
		// 정답
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int a = getFi(n);
		System.out.println(a);
		
		
	}
	
}
