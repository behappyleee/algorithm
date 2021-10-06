package algo02;

import java.util.Arrays;

// 숫자의 갯수 구하기
public class Algo_11 {

	public static String getNum(int num) {
		
		int[] a = new int[10];
		
		// 입력 num 을 String 으로 변환 배열로 변환
		String[] getNumArray = String.valueOf(num).split("");
		
		for(int i = 0; i < getNumArray.length; i++) {
			for(int j = 0; j < 10; j++) {
				if( Integer.parseInt(getNumArray[i]) == j ) {
					a[j] += 1;
				}
			}
		}
		return Arrays.toString(a);
	}
	
	public static void main(String[] args) {
		// 입력 421314218 --> 0:0, 1:3, 2:2, 3:1, 4:2, 5:0, 6:0, 7:0, 8:1, 9:0
		System.out.println(getNum(421314218));
		
		// 정답
		int n = 421314218;	
		int [] arr = new int [10];	// 0 ~ 9 입력된 수를 cnt 위한 용도 
		
		// 10 으로 나눈 나머지를 추출
		while( n > 0 ) {
			// 해당하는 인덱스를 1씩 증가 시켜줌 
			arr[n % 10]++;
			n /= 10;
		}
		
		for(int i=0; i < 10; i++) {
			System.out.println( i + " : " + arr[i] );
		}
		
	}
	
}
