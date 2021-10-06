package algo03;

// 달팽이 출력
public class Algo_27 {
	
	public static void getPrint(int n) {
		
		int a = n;
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= n; j ++) {
				
				if(i == 1) {
					System.out.printf("%3d", j);
				} else {
					
					if(j == n) {
						
						System.out.printf("%3d", j);
						
					} else {
						System.out.printf("%3d", 3);
					}
						
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		getPrint(5);
		
	}
	
}
