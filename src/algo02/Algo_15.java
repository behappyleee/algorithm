package algo02;

public class Algo_15 {
	
	public static void printStar(int num) {
		
		for(int i=num; i>0; i--) {
			for(int j=i; j>0; j--) {
				if( j < num) {
					for(int k=i-1; k > i-k ; k++) {
						System.out.print(" ");
					}
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		// printStar(5);
		
		int n =5;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if ( i > j ) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
	}
	
	
}
