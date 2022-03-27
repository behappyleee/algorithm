package algo_programmers;

import java.util.Arrays;

public class Algo_Programmers_01 {

	// Programmers 알고리즘 
	// 로또의 최고 순위와 최저 순위
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        // lottos 로또 번호를 담은 배열 (길이 6인 정수 배열)
        // lottos 모든 원소 0 이상 45 이하 (0 은 알아 볼 수 없는 숫자)
        // 알아 볼 수 없는 원소는 0 으로 처리
        // 당첨 번호를 받은 배열 win_nums (같은 숫자 없음)
        int cNum = 0;   // 최고 순위
        int bNum = 0;   // 최저 순위
        for(int i=0; i<win_nums.length; i++) {
           for(int j=0; j<lottos.length; j++) {
               if(lottos[j] == 0) {
                   lottos[j] = -1;
                   cNum++;
               } 
               if(win_nums[i] == lottos[j]) {
                    cNum++;
                    bNum++;
                }               
           } 
        }
        
        // 최고 순위, 최저 순위 차례배열로 담음
        answer = new int [2];
        answer[0] = getNo(cNum);        
        answer[1] = getNo(bNum);
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
    
    public static int getNo(int a) {
        int no = 0;
        switch(a) {
            case 6 :
                no = 1;
                break;
            case 5 :
                no = 2;
                break;
            case 4 :
                no = 3;
                break;
            case 3 :
                no = 4;
                break;    
            case 2 :
                no = 5;
                break;
            default :
                no = 6;
                break;
        }
        return no;
    }
	public static void main(String[] args) {
		int [] lotto_num = {31, 0, 44, 1, 0, 25};	// 기입한 LottoNumber 0 은 알아 볼 수 없는 LottoNum
		int [] win_num = {31, 10, 45, 1, 6, 19}; 	// win_num 은 로또 당첨 번호
		solution(lotto_num, win_num);		// 최고 순위, 최저 순위 배열 가져옴 [3,5]
	}
}

// 문제 
// 로또를 구매한 민우는 당첨 번호 발표일을 학수고대하고 있었습니다. 하지만, 민우의 동생이 로또에 낙서를 하여, 일부 번호를 알아볼 수 없게 되었습니다. 당첨 번호 발표 후, 민우는 자신이 구매했던 로또로 당첨이 가능했던 최고 순위와 최저 순위를 알아보고 싶어 졌습니다.//
// 알아볼 수 없는 번호를 0으로 표기하기로 하고, 민우가 구매한 로또 번호 6개가 44, 1, 0, 0, 31 25라고 가정해보겠습니다. 당첨 번호 6개가 31, 10, 45, 1, 6, 19라면, 당첨 가능한 최고 순위와 최저 순위의 한 예는 아래와 같습니다.


    
