package algo01;

// 입력된 수 (N) 만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사격형
public class Algo_10_01 {

	public static void printSquare(int inputNum) {
		// N 행 N열
		for(int i = 1; i<=inputNum; i++) {
			
			for(int j = 1; j <= inputNum; j++) {
				System.out.print(j * i + " ");
			}
			
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		printSquare(3);
		System.out.println("Hello ! ");
		
		// 정답
		int n = 5;
		/*	
		 * 	n = 3
		 * 	1 2 3
		 *  4 5 6
		 *  7 8 9
		 *  
		 */
		int num = 1;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j ++) {
				// d 앞에 숫자가 공백을 줄 수 있음
				System.out.printf("%3d" , i*(n) + j + 1);
				// num++; num 변수 선언하고 사용하고 싶을 시
			}
			
			System.out.println();
		}
		
	}
	
}
