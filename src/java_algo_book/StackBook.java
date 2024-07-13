package java_algo_book;

import java.util.EmptyStackException;
import java.util.Scanner;

public class StackBook {

    private int max;    // 스택 용량
    private int ptr;    // 스택 포인터, 스택에 인덱스를 가르킨다고 하여 스택 포인터라고 지칭
    private int[] stack;  // 스택 본체

    // 실행 시 예외 스택이 비어있음
    public class EmptyStackException extends RuntimeException {
        public EmptyStackException() {}
    }

    // 실행 시 예외
    public class OverflowStackException extends RuntimeException {
        public OverflowStackException() {}
    }

    public StackBook(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stack = new int[capacity];  // 스택 본체용 배열을 사용
        } catch (OutOfMemoryError e) {  // 생성할 수 없음
            max = 0;
        }
    }

    public int push(int addElement) throws OverflowStackException {
        if (ptr >= max) throw new OverflowStackException();    // 등위 연산자 == 를 사용하여 비교를 할 수 있지만 프로그램 안전성을 위하여 >= 로 비교하는 것으로 수정
        
        return stack[ptr++] = addElement;   // 메서드에 반환 값은 푸쉬한 값임
    }

    public int pop() throws EmptyStackException {
        if (ptr <= 0) throw new EmptyStackException();  // 스택이 비어있는 상태

        return stack[--ptr];    // 스택 포인터의 ptr 의 값을 감소시키고 stk[ptr] 의 들어있는 값을 반환시켜줌
    }

    public int peek() throws EmptyStackException {   // 몰래 엿보는 메서드
        if (ptr <= 0) throw new java.util.EmptyStackException();

        return stack[ptr - 1];
    }

    // 배열 인덱스가 큰 쪽에서 작은 쪽으로 검색
    public int indexOf(int findElem) throws EmptyStackException {  // 값이 포함 되어있는 지 검사, 맨 끝에 인덱스부터 0 인덱스로 검색
        for (int i = (ptr - 1); i >= 0; i--) {
            if (findElem == stack[i]) {
                return i;   // 검색 성공
            }
        }
        return -1;  // 검색 실패
    }

    public void clear() {
        ptr = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return ptr;
    }

    public boolean isEmpty() {
        return ptr <= 0;
    }

    public boolean isFull() {
        return ptr >= max;
    }

    // Stack 안에 모든 데이터들을 바닥 -> 꼭대기 순으로 출력
    public void dump() {
        if (ptr <= 0) System.out.println("Stack 이 비어 있습니다");

        for (int i = 0; i < ptr; i++) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원하시는 Stack 사이즈를 입력 해 주세요 : ");
        int stackNum = scanner.nextInt();
        System.out.print(stackNum + " 입력 하신 스탭 사이즈 입니다.");

        StackBook sb = new StackBook(stackNum);

    }
}
