package algo02;

import java.util.logging.Logger;

public class Algo_17 {

	public static int getSquared(int num, int mul) throws Exception {
		
		int answer = 1;
		
		if(num != 0 && mul != 0) {
			for(int i=0; i < mul; i++) {
				answer *= num;
			}
		} else {
			try {
				throw new Exception("0 을 넣으시면 안됩니다.");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Hello !!");
		
		int a = getSquared(5,4);
		System.out.println(a);
		
		System.out.println("Hello !!");
	}
}
