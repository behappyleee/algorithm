package algo03;

// 학생수와 점수들 입력 후 평균보다 넘은 학생들의 비율 출력
public class Algo_22 {

	public static double average(int std, int[] score) {
		
		int total = 0;
		double average = 0;
		double count = 0;
		
		for(int i = 0; i < score.length; i++) {
			total += score[i];
		}
		// 평균 점수
		average = total / std;
		
		for(int i = 0; i < score.length; i++) {
			if( score[i] > average ) {
				count += 1;
			}
		}
		return (count/std)*100;
	}
	
	
	public static void main(String[] args) {
		
		int std = 7;
		int[] score = {100, 95, 90, 80, 70, 60, 50};
		
		double a = average(std, score);
		
		System.out.println(a);
		
		// 정답
		int[] in = {7, 100, 95, 90, 80, 70, 60, 50};
		int sum = 0;
		
		for(int i = 0; i < in.length; i++ ) {
			sum += in[i];
		}
		
		double avg = (double)sum / in[0]; // int 나누기 int 는 int 가 되어버리므로 더블형으로 강제 업 캐스팅을 해버리기
		int count = 0;
		
		for(int i = 1; i < in.length; i++) {
			if( in[i] > avg ) {
				count++;
			}
		}
		System.out.println( ( count)/in[0] * 100);
		
	}
	
}