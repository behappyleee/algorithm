package algo01;

// 입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출력되는 숫자 사격형  
public class Algo_10_02 {

	public static void getPrint(int num) {

		int j;
		
		for(int i=0; i<num; i++) {
			// 짝수번쨰 행
			if( i % 2 == 0) {
				j = 1;
				while(j <= num) {
					System.out.printf("%3d", ( num*i ) + j);
					j++;
				}
			// 홀수번째 행
			} else {
				j = num;
				while(j > 0 ) {
					System.out.printf("%3d", (num*i) + j);
					j--;
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		getPrint(4);
		
		// 정답
		int n = 3;
		int[][] arr = new int [n][n];
		/*
		 *  n = 3
		 * 	1 2 3
		 *  4 5 6
		 *  7 8 9
		 *  
		 */
		
		for(int i=0; i<n; i++) {
				
			// 짝수 행
			if( i % 2 == 0) {
				for(int j = 0; j < n; j++) {
					arr[i][j] = i* n + j + 1;
				}
			}
			
			// 홀수 행
			if( i % 2 != 0) {
				for(int j = n-1; j >= 0; j--) {
					arr[i][j] = i* n + n - j ;
				}
			}
			
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%4d" , arr[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
	
	
	
	
}
