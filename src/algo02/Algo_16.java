package algo02;

public class Algo_16 {
	
	public static void printStar(int num) {
		
		for(int i=num; i > 0; i--) {
			for(int j=0; j <= num; j++) {
				if(j < i ) {   
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		printStar(5);
		
		// 정답
		int n=5;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j < n ; j++) {
				if( i < n - (j + 1) ) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
