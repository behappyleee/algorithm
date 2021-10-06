package algo02;

// 별찍기
public class Algo_14 {

	public static void printStar(int row) {
		
		for(int i=0; i<row; i++) {
			for(int j=0; j <i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
 	
	public static void main(String[] args) {
		
		printStar(6);
		
		// 정답
		int n =5;
		
		for(int i = 0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
