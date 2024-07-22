package java_algo_book.search;

public class SentinealSearch {

    // Sentinel : 검색하기 전 맨 끝에 검색하고자 하는 키 값을 맨 끝에 넣어놓음
    // 이 값을 보초 값이라고 함

    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        while(true) {
            if(a[i] == key) {
                break;
            }
            i++;
        }

        // 변수 i 의 값이 n 이면 찾은 값이 보초 값
        return i == n ? -1 : i;
    }


    public static void main(String[] args) {
        int num = 3;
        int[] x = new int[num + 1];

        for (int i=0; i<x.length; i++) {
            x[i] = i;
        }

        int idx = seqSearchSen(x, num, 2);
                
        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("값이 존재 합니다.");
        }
    }
}
