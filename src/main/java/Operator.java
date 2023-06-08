public class Operator {
    public static void main(String[] args) {
        // write your code here
        int num1 = 10;
        int num2 = 5;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        System.out.println(num1);

        num1 += num2;
        System.out.println(num1);   // 15

        num1 -= num2;
        System.out.println(num1);   // 10 (num1은 윗 줄에서 이미 num2랑 더한 값의 결과를 num1에 값을 할당해줬기 때문에 num1은 15였으니까 결과는 10.)

        num1 *= num2;
        System.out.println(num1);   // 50

        num1 /= num2;
        System.out.println(num1);   // 10

        num1 %= num2;
        System.out.println(num1);   // 0
    }
}
