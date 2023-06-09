import java.security.PrivilegedExceptionAction;

public class Conditional {
    public static void main(String[] args) {
        // write your code here

        // if 문, else if 문
        int check = 100;
        int num1 = 51;

        if (num1> check) {
            System.out.println("100보다 큰 수 입니다.");
        } else if (num1 > 50) {
            System.out.println("50보다 큰 수 입니다. 또는 100보다 작거나 같습니다.");
        }

        // switch 문
        char score = 'A';

        switch (score) {
            case 'A':
                System.out.println("A등급");
                break;
            case 'B':
                System.out.println("B등급");
                break;
            case 'C':
                System.out.println("C등급");
            default:
                System.out.println("C등급 아래 등급");
        }
    }
}
