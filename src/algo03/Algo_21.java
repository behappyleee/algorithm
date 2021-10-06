package algo03;

import java.util.Arrays;

// 문자열 뒤집기
public class Algo_21 {

	public static String reverseStr(String str) {
		
		String[] strArray = str.split("");
		String[] reverseStr = new String[strArray.length];
		
		for(int i = 0; i < strArray.length; i++) {
			reverseStr[i] = strArray[ str.length()-i-1 ];
		}
		return Arrays.toString(reverseStr);
	}
	
	
	public static void main(String[] args) {
		System.out.println( reverseStr("ADEFH") );
		
		// 정답 (문자열 뒤집기)
		String n = "ADEFH1234"; // H F E D A 처럼 나옴 대칭해서 바꾸기
		char[] str = n.toCharArray();
		char tmp; // swap 위해서는 임시 변수를 만듦
		
		int len = str.length;
		
		for(int i = 0; i < len/2; i++) {
			 tmp = str[i];
			 str[i] = str[len-i-1];
			 str[len-i-1] = tmp;
		}
		
		n = new String(str);
		
		System.out.println(n);
		
		
		
	}
	
}
