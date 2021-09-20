package algo01;

import java.util.Scanner;

// 최빈수 구하는 알고리즘
public class Algo_03 {

	// 가장 많이 출현 한 수를 출력하기
	public static int getMostNum(int[] getArray) {
		int mostNum=0;
		int count;
		int[] saveCount = new int[getArray.length];
		
		// 배열에 가장 많은 수 출력하기
		for(int i=0; i < getArray.length; i++) {
			// a = getArray[i];
			count = 0;
			for(int j=0; j<getArray.length; j++) {
				if( getArray[i] == getArray[j]) {
					count += 1;
				}
			}
			saveCount[i] = count;
		}
		
		for(int i=0; i < saveCount.length; i++) {
			if( i < saveCount.length-1 ) {
				if( saveCount[i] > saveCount[i+1] ) {
					mostNum = getArray[i];
				}
			}
		}
		// 가장 많이 나온 수를 반환
		return mostNum;
	}
	
	public static void main(String[] args) {
		
		// 최빈 수 구하기
		int[] numArray = {1, 2, 3, 4, 5, 5, 5, 5, 7, 8,10,10,10,10,10,12,13,10,10};
		System.out.println( getMostNum(numArray) );
		
		int []numArray2 = {2,2,2,2,2,2,5,5,5,5,7,7,7,8,8,8,8,8,8,8,8,8,8,8,8};
		System.out.println( getMostNum(numArray2) );
		
		// 사용자 input
		// mode는 출현한 수를 의미
		int[] mode = new int[10];
		// index --> 출현한 수
		// index 값 --> index (출현한 수) 가 몇번 나오는지 저장하는 용도
		
		// Scanner scan = new Scanner(System.in);
		
		// inputNum 은 수가 몇번 출현하였는지 저장하는 용도로 사용
		int[] inputNum = {1, 2, 2, 3, 1, 4, 2, 2, 4, 3};
		
		/*
		 * for(int i=0; i<10; i++) { inputNum[i] = scan.nextInt(); }
		 */
		
		// inputNum --> 1 2 2 3 1 4 2 2 4 3
		int modeNum = 0; 	// 최빈수를 의미
		int modeCnt = 0;	// 최빈수가 나온 횟수 
		
		for(int i=0; i<10; i++) {
			mode[inputNum[i]]++;	// mode[2] == 4 
			// mode[1] ==2 mode[2] == 4 mode[3] == 2 mode[4] == 2		
		}
		
		for(int i=0; i<10; i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		
		System.out.println("최빈수는 : " + modeNum + " cnt 카운트 횟수 : " + modeCnt);
	}
	
}
