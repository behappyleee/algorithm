package java_algo_book;

import java.util.Scanner;

public class AddPositiveNumber {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inputNumber;
        int sum = 0;
        do {
            System.out.println("원하시는 수를 입력 해 주세요 ! : ");
            inputNumber = scan.nextInt();
        } while (inputNumber <= 0);

        for (int i = 1; i <= inputNumber; i++) {
            sum += i;
        }

        System.out.println("1 부터 " + inputNumber + " 까지 총 합은 : " + sum + " 입니다.");

    }
}
