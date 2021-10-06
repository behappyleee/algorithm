package algo02;

//3 6 9 게임 출력 하기
public class Algo_18 {
	
	public static void printGame(int num) {
		
		String getNum;	// 숫자 String 변환
		String[] count;	// count 로 숫자 하나하나 판단하기
		
		for(int i = 1; i <= num; i++) {
			getNum = String.valueOf(i);
			System.out.print(" ");
			if( getNum.contains("3") || getNum.contains("6") || getNum.contains("9") ) {
				
				count = getNum.split("");	// index : 3, length : 1
				
				for(int k=0; k < count.length; k++ ) {
					if( count[k].contentEquals("3") || count[k].contentEquals("6") || count[k].contentEquals("9") ) {
						System.out.print("짝");
					}
				}
			} else {
				System.out.print(i + " ");
			}
			
		}
	}
	
	// 정답
	public static int getNum(int i) {
		
		int j = 0;
		
		while(i > 0) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
					j++;
			i /= 10;
		}
		
//		int a = 0;
		
//		for(int k=0; k < (int)(Math.log10(i)); k++ ) {
//			a /= i;
//			switch(a) {
//				case  3 :  
//					 j += 1;
//					 break;
//				case  6 : 
//					j += 1;
//					break;
//				case 9 :
//					j += 1;
//					break;
//				default : 
//					break;
//			}
//			k /= 10;
//		}
		
		return j;
	}
	
	
	public static void main(String[] args) {
		
		// printGame(50);
		
		// 정답
		int n = 100;
		
		for(int i = 1; i < n; i++) {
			int cnt = getNum(i);
		
			if(cnt == 0) {
				System.out.print(i + " ");
			} else {
				for(int l = 0; l < cnt; l ++) {
					System.out.print("짝");
				}
				System.out.print(" ");
				
			}
			
		}
	
	}
	
}
