package java_algo_book;

import java.util.EmptyStackException;

public class QueueBook {

    private int max;    // 큐 용량
    private int num;    // 현재 데이터 수
    private int[] queue;    // 큐 본체

    public class EmptyQueueException extends RuntimeException {}

    public class OverflowQueueException extends RuntimeException {}

    public QueueBook(int capacity) {
        max = capacity;
        num = 0;
        try {
            queue = new int[capacity];
        } catch (OutOfMemoryError e) {
            max = 0;
            throw e;
        }
    }

    // 복잡도 O(1)
    public int enqueue(int addElem) {
        if (num >= max) throw new OverflowQueueException();

        return queue[num++] = addElem;
    }

    // 복잡도 O(n)
    public int dequeue() {
        if (num <= 0) throw new EmptyStackException();
        int firstElem = queue[0];

        for (int i = (num - 1); i > 0; i--) {
            queue[i - 1] = queue[i];
        }

        return firstElem;
    }

    // 배열 요소를 앞 쪽으로 이동하지 않는 Ring Buffer 자료구조임
    // 링 버퍼로 큐 만들기


    public static void main(String[] args) {

        // Queue - 데이터를 일시적으로 쌓아놓는 데이터 자료구조, FIFO First In First Out

    }
}
