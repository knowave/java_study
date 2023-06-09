import java.util.Scanner;

public class ConditionalQuiz {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);    // Scanner의 System input을 받을 거라는 의미.
        int score = sc.nextInt();               // 다음에 들어오는 숫자를 받겠다는 의미. (여기서 다음은 Enter치기 전까지.)

        // 첫 번째 방법
        if (score <= 100 && score >= 90) {
            System.out.println("A등급");
        } else if (score <= 90 && score >= 80) {
            System.out.println("B등급");
        } else if (score <= 80 && score >= 70) {
            System.out.println("C등급");
        } else {
            System.out.println("F등급");
        }

        // 두 번재 방법
        switch (score / 10) {
            case 9:
                System.out.println("A등급");
                break;
            case 8:
                System.out.println("B등급");
                break;
            case 7:
                System.out.println("C등급");
                break;
            default:
                System.out.println("F등급");
                break;
        }
    }
}
