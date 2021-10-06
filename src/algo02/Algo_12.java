package algo02;

// 구구단 출력하기
public class Algo_12 {
	
	public static void guGuDan(int num) {
		for(int i = 2; i <= num; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+" * " + j + " = " + i * j);
			}
		}
	}
	
	public static void main(String[] args) {
		
		guGuDan(3);
		
	}
	
	
}
