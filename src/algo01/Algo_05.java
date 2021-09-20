package algo01;

// 대문자 -> 소문자, 소문자 -> 대문자
public class Algo_05 {
	
	public static String getReverseString(String word) {
		
		String[] wordArray = word.split("");
		String[] lowAlphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String[] bigAlphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String getReverseWord="";
		
		for(int i=0; i<wordArray.length; i++) {
			// 대문자를 소문자로 소문자는 대문자로 바꾸어 줌
			for(int j=0; j<lowAlphabet.length; j++) {
				if( wordArray[i].equals(lowAlphabet[j]) ) {
					wordArray[i] = wordArray[i].toUpperCase();
				} else if( wordArray[i].equals(bigAlphabet[j] ) ) {
					wordArray[i] = wordArray[i].toLowerCase();
				}
			}
			getReverseWord += wordArray[i];
		}
		return getReverseWord;
	}
	
	public static void main(String[] args) {
		
		System.out.println(getReverseString("hellOWORld"));
		
		// 모든 문자는 아스키 코드를 가지고 있음, 자바는 스트링 참조변수를 저장 이렇게 저장할 시 아스키 코드를 가져오기 힘듦
		String input = "helloWorldD";
		char[] arr;
		
		// 모든 문자는 아스키 코드에 맵핑 아스키 코드는 10진수와 같은 숫자 
		arr = input.toCharArray(); // toCharArray 메서드는 String 문자열을 하나씩 쪼개어서 char 타입의 배열로 생성 
		
		for(int i=0; i<arr.length; i++) {
			
			// 아스키 코드에 숫자에 걸림 아스키 코드가 소문자는 a 보다 크거나 z 보다 작을 시 
			if( arr[i] >= 'a' && arr[i] <= 'z' ) {
				// 소문자 a 랑 대문자 a 랑 떨어져 있는 간격이 같음 (b 랑 B랑 아스키 코드 간격이 같음)
				arr[i] = (char)(arr[i] + ('A' - 'a') );
			} else if ( arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char)(arr[i] - ('A' - 'a') );
			}
		}
		
		System.out.println(arr);
	
		input = "i CAN do iT";
		arr = input.toCharArray();
		for(int i=0; i<arr.length; i++) {
			
			// 아스키 코드에 숫자에 걸림 아스키 코드가 소문자는 a 보다 크거나 z 보다 작을 시 
			if( arr[i] >= 'a' && arr[i] <= 'z' ) {
				// 소문자 a 랑 대문자 a 랑 떨어져 있는 간격이 같음 (b 랑 B랑 아스키 코드 간격이 같음)
				arr[i] = (char)(arr[i] + ('A' - 'a') );
			} else if ( arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char)(arr[i] - ('A' - 'a') );
			}
		}
	
		System.out.println(arr);
	}
	
}
