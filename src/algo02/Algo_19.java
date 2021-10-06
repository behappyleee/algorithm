package algo02;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// 중복된 수 제거 후 출력하기 
public class Algo_19 {

	public static int[] getNum(int num) {
		
		int[] onlyNum = new int[num];
		int i=0;
		
		while( num > 0) {
			onlyNum[i] = num % 10;
			num /= 10;
			
			for(int j = 0; j < onlyNum.length; j++) {
				if(onlyNum[i] == onlyNum[j] ) {
					onlyNum[i]= 0;
				}
			}
			i++;
		}
		return onlyNum;
	}
	
	public static boolean[] printNum(long num) {
		
		String[] findNum = String.valueOf(num).split("");
		boolean[] existNum = new boolean[10];
		
		for(int i = 0; i < findNum.length; i++) { 
			existNum[Integer.parseInt(findNum[i])] = true;
		}
		return existNum;
	}
	
	
	
	public static void main(String[] args) {
		
		long num = 3355600073434347L;
		// 중복된 수 제거 후 출력하기
		
		// 값이 있다면 true 로 바꾸어 줌
		boolean[] getBoolean = printNum(num);
		
		for(int i=0; i<getBoolean.length; i++) {
			if(getBoolean[i] == true) { 
				System.out.print(i + " ");
			}
		}
		
	}
	
}
