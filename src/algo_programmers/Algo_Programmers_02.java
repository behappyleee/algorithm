package algo_programmers;

public class Algo_Programmers_02 {

    public static int solution(int left, int right) {
        // ����� ������ ����
        // left ���� right ������ ��� ���� �߿��� 
        // ����� ������ ¦���� ���� ���ϰ� ����� ������ Ȧ���� ���� �� ���� return
        int answer = 0; 
        int divCnt = 0; // ����� ����
        for(int i=left; i<=right; i++) {
            // ����� ������ ¦�� Plus Ȧ�� Minus
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
		// left 13	right 17 	result 43	left ���� right ������ ����� ���� ¦�� Plus Ȧ�� Minus
		// left 24	right 27	result 52
		solution(13, 17);
		solution(24, 27);
	}
	
	
}
