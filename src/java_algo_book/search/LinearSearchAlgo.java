package java_algo_book.search;

import java.util.Scanner;

public class LinearSearchAlgo {

    // 주소록을 검색
    // 선형 검색 / 이진 검색 / 해시법
    // 선형 검색 (순차 검색) - 요소가 직선 모양으로 늘어선 배열에서 원하는 키 값을 갖는 요소르 만날 때 까지 맨 앞 부터 순서대로 검색

    // 배열을 처음 부터 끝까지 순차적 탐색을 함
    // 선형 검색은 반복할 때 마다 조건 2 가지를 모두 검사
    // 1. 배열의 끝까지 검사 하였는 지 2. 검색 할 값의 같은 요소를 발견 하였는 지
    static int linearSearch(int[] a, int n, int key) {
        int i = 0;

        while (true) {
            if (i == n) {
                return -1;
            }
            if (a[i] == key) {
                return i;
            }
            i++;
        }
    }

    static int testDo() {
        int i = 0;

        do {
            i++;
            if (i == 2) break;;

            System.out.println("I Index : " + i);
        } while (true);

        return 3;
    }

    public static void main(String[] args) {
        testDo();

        int[] arrTest = new int[] {1, 2 ,3 ,5 , 6 ,8 ,22, 33, 34, 35};
        int findNum = 8;
        int testNum = linearSearch(arrTest, arrTest.length, findNum);

        System.out.println(testNum);
    }
}
