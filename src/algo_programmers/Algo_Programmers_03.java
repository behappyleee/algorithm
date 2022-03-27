package algo_programmers;

import java.util.*;

public class Algo_Programmers_03 {
	
	  public static int[] solution(int[] numbers) {
	        int[] answer = {};
	        List <Integer> temp = new ArrayList<Integer>();
	        List <Integer> answerList = new ArrayList<Integer>();
	        
	        //  정부 배열 numbers 서로 다른 index 에 있는 두 개의 수를 뽑아 더해서 만들 수 있는
	        //  모든 수를 배열에 오름차순으로 담아 Return
	        for(int i=0; i<numbers.length; i++) {
	            for(int j=0; j<numbers.length; j++) {
	                if(i != j) {
	                    int plus = numbers[i] + numbers[j];
	                    temp.add(plus);
	                }
	            }
	        }
	        for(int each : temp) {
	            if(!answerList.contains(each)) {
	                answerList.add(each);
	            }
	        }
	        Collections.sort(answerList);
	        System.out.println("each Print : " + answerList);        
	        System.out.println("temp 2 : " + temp);
	        
	        answer = new int[ answerList.size() ];
	        int cnt = 0;
	       for(int a : answerList) {
	           answer[cnt] = a;
	           cnt++;
	       }
	        return answer;
	  }
	  
	 public static void main(String[] args) {
		int [] test1 = {2,1,3,4,1}; 
		int [] test2 = {5,0,2,7}; 
		solution(test1); 
		solution(test2);
	}
}
// 입출력 예
//numbers	result
//[2,1,3,4,1] [2,3,4,5,6,7]
//[5,0,2,7]	[2,5,7,9,12]


// 문제
// 정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.










