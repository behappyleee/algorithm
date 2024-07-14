package java_algo_book;

public class AddNumber {

    public static class NumberMustBePositive extends RuntimeException {}


    // 1 .. untilNumber 까지 값을 더 함
    public static int addNumber(int untilNumber) {
        if (untilNumber < 0) throw new NumberMustBePositive();

        int addNum = 0;

        for (int i = 1; i <= untilNumber; i++) {
            addNum += i;
        }

        return addNum;
    }

    public static int addNumberWhileLoop(int untilNumber) {
        if (untilNumber < 0) throw new NumberMustBePositive();

        int i = 1;
        int sum = 0;

        while (i <= untilNumber) {
            sum += i;
            i++;
        }
        System.out.println("I index : " + i);
        return sum;
    }

    public static int gausNumber(final int UNTIL_NUMBER) {
        final int START_NUMBER = 1;
        if (isEvenNumber(UNTIL_NUMBER)) {
            return (START_NUMBER + UNTIL_NUMBER) * (UNTIL_NUMBER / 2);
        } else {
            final int MULTI_NUMBER = UNTIL_NUMBER / 2;
            return ((START_NUMBER + UNTIL_NUMBER) * MULTI_NUMBER) + ((START_NUMBER + UNTIL_NUMBER) / 2);
        }
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int sumNumber = addNumberWhileLoop(5);

        System.out.println("Total Sum Number : " + sumNumber);

        System.out.print("A");
        System.out.println("B");

        int num1 = gausNumber(10);
        int num2 = gausNumber(13);

        System.out.println(num1);
        System.out.println(num2);
    }
}
