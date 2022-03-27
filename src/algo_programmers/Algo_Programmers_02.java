package algo_programmers;

public class Algo_Programmers_02 {

    public static int solution(int left, int right) {
        // 약수의 개수와 덧셈
        // left 부터 right 까지의 모든 수들 중에서 
        // 약수의 개수가 짝수인 수는 더하고 약수의 갯수가 홀수인 수는 뺀 수를 return
        int answer = 0; 
        int divCnt = 0; // 약수의 갯수
        for(int i=left; i<=right; i++) {
            // 약수의 갯수가 짝수 Plus 홀수 Minus
           for(int j=1; j<=i; j++) {
               if(i % j == 0) {
                   divCnt++;
               }
           }
          if(divCnt % 2 == 0) {
              answer += i;
          } else {
              answer -= i;
          }
          divCnt = 0;  
        }
        System.out.println("Answer : " + answer);
        return answer;
    }
	
	public static void main(String[] args) {
		// left 13	right 17 	result 43	left 부터 right 까지의 약수의 갯수 짝수 Plus 홀수 Minus
		// left 24	right 27	result 52
		solution(13, 17);
		solution(24, 27);
	}
	
	
}
