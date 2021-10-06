package algo03;

import java.util.Scanner;

// 더하기 & 마이너스 (입력된 숫자까지 + - 를 차례대로 반복)
public class Algo_26 {

	public static int getCal(int num) {
		
		int answer = 0;
		
		for(int i = 1; i < num + 1; i++) {
			
			if( i == 1) answer += 1;
			
			if( i >= 2 ) {
				if( i % 2 == 0 ) {
					answer += i;
				} else {
					answer -= i;
				}
			}
			
		}
		
		return answer;
	}
	
	public static String getPrint(int num) {
		
		String a = String.valueOf(num);
		String answer = null;
		
		for(int i = 1; i < num + 1; i++) {
			
			if( i == 1 ) answer = String.valueOf(i);
			
			if( i >= 2 ) {
				
				if(i % 2 == 0) {
					answer += " + " + String.valueOf(i);
				} else {
					answer += " - " + String.valueOf(i);
				}
				
			}
			
		}
		return answer;
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println( getCal(9) );
		System.out.println( getPrint(9) );
		
		// 정답
		int num;
		boolean aFlag = true;
		
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			if( i == num) {
				System.out.println(i);
				break;
			}
			
			if(aFlag) {
				System.out.print(i + " + ");
				aFlag = !aFlag;
			} else {
				System.out.print(i + " - ");
				aFlag = !aFlag;
			}
			
			
		}
		
		
	}
	
}
