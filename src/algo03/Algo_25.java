package algo03;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 1 ~ 8 까지 차례로 입력될 시 ascend 반대일시 descend 섞여있을 시 mixed
public class Algo_25 {

	public static String getType(int[] num) {
		
		String type = "";
		String numArray = Arrays.toString(num);
		
		Integer[] numSample = new Integer[8];
		
		for(int i = 0; i < 8; i++ ) {
			numSample[i] = i + 1;
		}
		
		String numCompare = Arrays.toString(numSample);
		// 배열 뒤집기 뒤집기 위하여 List 화 시키기
		List<Integer> reverse = Arrays.asList(numSample);
		
		Collections.reverse(reverse);
		String reverseSample = Arrays.toString( reverse.toArray() );
		
		if( numArray.equals(numCompare) ) {
			type = "ascend";
		} else if (numArray.equals( reverseSample )) {
			type = "descend";
		} else {
			type = "mixed";
		}
		
		return type;
	}
	
	// 정답 메서드
	public static void distinct(int input[]) {
		
		boolean aFlag = true;
		boolean bFlag = true;
		
		if(input[0] != 1) {
			aFlag = false;
		}
		
		// 오름차순 구분
		for(int i = 1; i < input.length -1 ; i++) {
			
			if(input[i]-input[i+1] != -1 ) {
				aFlag = false;
				break;
			}
		}
		
		if(input[0] != 8) {
			bFlag = false;
		}
		// 내림차순 구분
		for(int i = 1; i < input.length -1; i++) {
			if(input[i] - input[i+1] != 1) {
				bFlag = false;
				break;
			}
		}
		
		if(aFlag) System.out.println("Ascending");
		else if(bFlag) System.out.println("Descending");
		else System.out.println("Mixed");
		
	}
	
	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6,7,8};
		int[] reverseNum = {8, 7, 6, 5, 4, 3, 2, 1 };
		int[] random = {3, 4, 5, 6, 2};
		
		System.out.println( getType(num)  );
		System.out.println( getType(reverseNum) );
		System.out.println( getType(random) );
		
		// 정답
		Scanner scan = new Scanner(System.in);
		int[] input = new int[8];
		
		for(int i = 0; i < input.length; i++) {
			input[i] = scan.nextInt();
		}
		
		distinct(input);
		
	
	}
	
}
