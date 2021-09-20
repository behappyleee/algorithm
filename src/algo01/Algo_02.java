package algo01;

public class Algo_02 {

	// 피보나치 수열을 출력하기
	// 피보나치 수열은 An = An-1 + An-2 (즉 해당 수는 그전에 항과 그 전전에 항과 동일)
	public static int[] getFibo(int [] fiboArray) {
		
		// 해당 수는 그 전에 항과 그 전전 항과 동일
		for(int i=0; i<fiboArray.length; i++) {
			if( i >= 3) {
				fiboArray[i] = fiboArray[i-1]+fiboArray[i-2];
			}
		}
		return fiboArray;
	}
	
	
	public static void main(String[] args) {
		/* 내가 한 풀이 
		int[] getArray = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 };
		int[] getFibo = getFibo(getArray);
 		
		
		for(int i=0; i<getFibo.length; i++) {
			System.out.println(getFibo[i]);
		}
		
		// System.out.println( getFibo(getArray) );
		// getFibo(getArray);
		*/
		
		// 피보나치 수열 출력 ! (정답 코드)
		int [] arr = new int[100];
		// An = An-1 + An-2; (조건 만족은 n>=3 때부터 만족)
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i=3; i < 100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for(int i=1; i < 10; i++) {
			System.out.println(arr[i] + " ");
		}
		
		// 2번째 방법 
		int prevPrevNum = 1;	// An-2
		int prevNum = 1;		// An-1
		
		System.out.println(prevPrevNum + " ");
		System.out.println(prevNum + " ");
		
		for(int i=3; i<10; i++) {
			// 피보나치 수열 피보나치 수열 출력시 Array 사용 방법과 이전 이전 숫자랑 이전 숫자랑 미리
			// 기억을 해둔 뒤 현재 n 번째 항을 구할 떄 계산을 해 줌 
			int currentNum = prevPrevNum + prevNum;
			
			System.out.println("fibo : " + currentNum + " ");
			
			prevPrevNum = prevNum;
			prevNum = currentNum;
		}
		
	}
	
	
}
