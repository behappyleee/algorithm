package algo_programmers;

import java.util.Arrays;

public class Algo_Programmers_01 {

	// Programmers �˰��� 
	// �ζ��� �ְ� ������ ���� ����
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        // lottos �ζ� ��ȣ�� ���� �迭 (���� 6�� ���� �迭)
        // lottos ��� ���� 0 �̻� 45 ���� (0 �� �˾� �� �� ���� ����)
        // �˾� �� �� ���� ���Ҵ� 0 ���� ó��
        // ��÷ ��ȣ�� ���� �迭 win_nums (���� ���� ����)
        int cNum = 0;   // �ְ� ����
        int bNum = 0;   // ���� ����
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
        
        // �ְ� ����, ���� ���� ���ʹ迭�� ����
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
		int [] lotto_num = {31, 0, 44, 1, 0, 25};	// ������ LottoNumber 0 �� �˾� �� �� ���� LottoNum
		int [] win_num = {31, 10, 45, 1, 6, 19}; 	// win_num �� �ζ� ��÷ ��ȣ
		solution(lotto_num, win_num);		// �ְ� ����, ���� ���� �迭 ������ [3,5]
	}
}

// ���� 
// �ζǸ� ������ �ο�� ��÷ ��ȣ ��ǥ���� �м�����ϰ� �־����ϴ�. ������, �ο��� ������ �ζǿ� ������ �Ͽ�, �Ϻ� ��ȣ�� �˾ƺ� �� ���� �Ǿ����ϴ�. ��÷ ��ȣ ��ǥ ��, �ο�� �ڽ��� �����ߴ� �ζǷ� ��÷�� �����ߴ� �ְ� ������ ���� ������ �˾ƺ��� �;� �����ϴ�.//
// �˾ƺ� �� ���� ��ȣ�� 0���� ǥ���ϱ�� �ϰ�, �ο찡 ������ �ζ� ��ȣ 6���� 44, 1, 0, 0, 31 25��� �����غ��ڽ��ϴ�. ��÷ ��ȣ 6���� 31, 10, 45, 1, 6, 19���, ��÷ ������ �ְ� ������ ���� ������ �� ���� �Ʒ��� �����ϴ�.


    
