package java_algo_book;

public class JudgeNumber {

    public String judgeNumber(int number) {
        if (number > 0) {
            return "양수 입니다";
        } else if (number <0) {
            return "음수 입니다.";
        } else {
            return "0 입니다";
        }
    }
}
