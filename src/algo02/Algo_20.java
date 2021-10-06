package algo02;

// 팰린드롬인치 판별 (가운데를 기준으로 숫자가 똑같은지)
public class Algo_20 {

	public static boolean getNum(int num) {
		
		boolean numFel = false;
		String strNum = String.valueOf(num);
		
		if( strNum.length() % 2 == 0) {
			System.out.println("자릿수가 홀수여야 합니다.");
			return numFel;
		} 
		
		// Substring 은 해당 인덱스만큼 문자열을 뺴 온다.
		String firstStr = strNum.substring(0, strNum.length()/2 );
		System.out.println(firstStr);
		String secondStr = strNum.substring( strNum.length()/2+1, strNum.length() );
		System.out.println(secondStr);
		
		if(firstStr.equals(secondStr)) {
			numFel = true;
		}
		
		return numFel;
	}
	
	public static void main(String[] args) {
		
		System.out.println( getNum(3126312) );
		
		// 정답 (팰린드롬 수를 잘못 이햄 12521 은 팰린드롬 이 맞고 12512 는 팰린드롬이 아님)
		String n = "12521";
		
		int len = n.length();
		boolean flag = true;
		
		for(int i = 0; i < len/2; i++) {
			if( n.charAt(i) != n.charAt(len-i-1) ) {
				flag = false;
			}
		}
		 
		System.out.println("Boolean : " + flag);
		
	}
	
}
