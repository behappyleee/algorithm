package java_algo_book;

import java.util.EmptyStackException;

public class RingBufferQueue {

    // 배열 요소를 앞 쪽으로 이동하지 않는 Ring Buffer 자료구조임
    // 링 버퍼로 큐 만들기
    // Front 와 Rear 를 기억하고 있으면 Enqueue / Dequeue 복잡도가 O(1) 임
    private int max;    // 큐의 용량
    private int front;  // 큐의 앞쪽
    private int rear;   // 큐의 뒤쫌
    private int num;    // 현재 데이터 수

    private int[] queue;    // 큐 본체

    public class QueueEmptyException extends RuntimeException {}

    public class QueueOverflowException extends RuntimeException {}

    public RingBufferQueue(int capacity) {
        front = 0;
        rear = 0;
        num = 0;
        max = capacity;
        
        try {
            queue = new int[capacity];  // 큐 본체용 배열을 생성
        } catch (OutOfMemoryError e) {
            max = 0;
            num = 0;
            throw e;
        }
    }

    // 인큐에 성공 시 인큐 한 값을 그대로 반환
    public int enqueue(int addElem) {
        if (num >= max) throw new QueueOverflowException();   // 큐가 가득 참
    
        queue[rear++] = addElem;
        num++;
        
        if (rear == max) rear = 0;
        
        return addElem;
    }

    // 큐에서 데이터를 dequeue 하고 그 값을 반환
    public int dequeue() {
        if (num <= 0) throw new EmptyStackException();

        int elem = queue[front++];
        num--;

        if (front == max) front = 0;

        return elem;
    }

    // 큐에서 데이터를 피크 (프론트 데이터를 들여다 봄)
    public int peek() {
        if (num <= 0) throw new EmptyStackException();  // Queue 가 비어있음

        return queue[front];
    }

    public int indexOf(int elem) {

        for (int i=0; i<num; i++) {
            int idx = (i + front) % max;
            if (queue[idx] == elem) {
                return idx; // 검색 성공
            }
        }
        return -1;  // 검색 실패
    }

    public static void main(String[] args) {

    }
}
