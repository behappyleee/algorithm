package java_algo_book;

public class GenericStack<E> {

    private int stackPointer;   // Stack Pointer 값
    private int stackMax;       // Stack Max 값
    private E[] stack;

    public GenericStack(int capacity) {
        stackPointer = 0;
        stackMax = capacity;

        try {
            stack = (E[]) new Object[capacity];
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("This is normal !");
    }
}
