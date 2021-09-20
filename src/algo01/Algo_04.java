package algo01;

import java.lang.annotation.Native;
import java.util.Arrays;

// 10 진수를 2신수로 변환
public class Algo_04 {

	// 10 진수를 2진수 변환시켜주는 메서드
	public static int getBinary(int num) {
		
		int [] binArray = new int[100];
		int binNum = 0;
		int j = 0;
		
		while( num > 0) {
			binArray[j] = num % 2 ;  
			num /= 2;
			j++;
		}
		j--;
		return 0;
	}

	public static void main(String[] args) {
		
		// 2진수로 변환 할 10 진수를 입력
		int inputNum = 25;
		
		int [] bin = new int [100];	// 2진수로 변환 배열
		
		// 10진수를 2진수로 바꿀떄에는 계속 2로 나누어야 함
		// 그 몫을 또 2로 나누고 2로나누고 해야함 그 몫이 0이 될 때까지 2로 나누어야 함
		
		int mok = inputNum;	// 몫을 계속 2로 나눔
		int i =0;
		
		while( mok > 0) {
			bin[i] = mok % 2;	// 2진수 구할때는 계속 2로 나누어 주어야 함
			mok /= 2;
			i++;
		}
		i--;
		for( ; i >= 0; i--) {
			System.out.println(bin[i]);
		}
		
	}
	
}
