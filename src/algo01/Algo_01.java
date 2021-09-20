package algo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student {
	
	private String name; // 학생 이름
	private String no; 	 // 학생 번호
	
	public Student() {}
	
	public Student(String name, String no) {
		this.name=name;
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
}

public class Algo_01 {
	
	public static int searchStd(String name) {
		
		int getCode = 0;	// 같은 학생 있는지 없는지 조사 여부
		return getCode;
	}
	
	public static void main(String[] args) {
		
		Student st1 = new Student("손오공" , "1");
		Student st2 = new Student("저팔계" , "2");
		Student st3 = new Student("사오정" , "3");
		
		ArrayList <Student> list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		Iterator <Student> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println( it.next().toString() );	// 객체의 주소값을 가져 옴  
		}
		
		for(Student i : list) {
			System.out.println(i.getName());
			System.out.println(i.getNo());
		}
		
		Scanner scan = new Scanner (System.in);
		System.out.println("계속 검사를 원할 시 y, 종료 원하실 시 n");
		
		String answer = scan.next();	// next 라는 메서드는 문자를 받는 메서드
		// input 에 값에 따라 값이 반복이 됨 y 는 계속 진행 n 은 종료
		
		while(true) {
			// String input = scan.next();
			
			if(answer.equals("y") ) {
				System.out.println("검색을 시작합니다 !");
				System.out.println("이름을 입력해주세요 : ");
				
				String name = scan.next();
				boolean isStd = false; // 한번이라도 if 문을 탔는지 확
				
				for(Student std : list) {
					if(std.getName().equals(name)) {	// 문자열 비교는 항상 euqals 사용 == 은 주소값을 서로 비교함
						System.out.println("해당하는 학생의 학번은 : " + std.getNo() );
						isStd = true;
					} 
				}
				
				if( !isStd ) {	// flag 가 flase 일시 해당하는 학생이 없음 !false 는 true 임
					System.out.println("해당하는 학생 이름이 없습니다 ! ");
				}
				
				
				
				
			} else if (answer.equals("n") ) {
				break;	// break 입력시 가장 가까운 while 문 탈출을 함
			} else if( !answer.equals("y") || !answer.equals("n") ) {
				System.out.println("값을 잘못 입력하셨습니다 !");
			}
			
		}
		
		System.out.println("종료 되었습니다 ! ");
		
//		Scanner scan = new Scanner(System.in);
//		Student st1 = new Student();
//		String answer;
//		int num = 1; // 학생 몇명 까지 만들 것인지
//		
//		do {
//			System.out.println("학생등록을 계속 하시겠습니까 ? ( y / n )");
//			answer = scan.nextLine();
//			
//			Student st1 + num = new Student();
//			
//			
//			num++;
//		} while( answer.contains("y") ); 
//			
//		
//		
//		
//		
//		
//		ArrayList school = new ArrayList();
		
		
		
		
		
		
		
		
	}
	
}