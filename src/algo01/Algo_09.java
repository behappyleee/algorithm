package algo01;

// 입력된 수 의 각 자릿수 합을 구하시오
public class Algo_09 {
	
	public static int getEachSum(int num) {
		
		int sum = 0;
		
		String[] inputNum = String.valueOf(num).split("");
		
		for(int i = 0; i < inputNum.length; i++) {
			sum += Integer.parseInt(inputNum[i]);
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		// 1242 ==> 9 가 나와야 함 각 자릿수의 합 구하기 문제임
		System.out.println( getEachSum(1215) );
	
		// 정답
		int inputNum = 1232;
		int accSum = 0;
		
		// 10으로 나누고 그 나머지를 계속 더함 
		// 10으로 나누고 각 자릿수의 나머지를 계속 더 함
		while(inputNum > 0) {
			accSum += inputNum % 10 ;
			inputNum /= 10;
		}
		
	
	}

}
