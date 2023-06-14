public class LoopQuiz {
    public static void main(String[] args) {
        // write your code here
        // 문제1. 1부터 100까지의 합을 구하는 반복문 코드 작성하기
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            sum += (i + 1);
        }

        System.out.println(sum);

        // 문제2. 5초부터 시작하는 카운트 다운을 반복문 코드 작성하기

        for (int i = 5; i >= 0; i--) {
            System.out.println("카운트 다운: " + i);
        }

        // 문제 3. 1부터 30까지 홀수의 합과 짝수의 합을 구하고, 각각 출력하는 코드 작성하기
        int odd = 0;
        int even = 0;

        for (int i = 0; i < 30; i++) {
            int value = i + 1;

            if (value % 2 == 0) {
                even += value;
            } else {
                odd += value;
            }
        }

        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);
    }
}
