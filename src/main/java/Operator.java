public class Operator {
    public static void main(String[] args) {
        // write your code here
        int num1 = 10;
        int num2 = 5;
        int num3 = 10;
        boolean a = true;
        boolean b = false;


        /* 논리 연산자 */
        System.out.println(a && b); // false
        System.out.println(a && true);  // true
        System.out.println(a || b); // true
        System.out.println(false || b); // false
        System.out.println(!a); // false
        System.out.println(!b); // true

        /* 관계 연산자 */
        System.out.println(num1 > num2);    // true
        System.out.println(num1 >= num3);   // true
        System.out.println(num1 < num2);    // false
        System.out.println(num1 <= num3);   // true
        System.out.println(num1 == num3);   // true

        /* 산술 연산자 */
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        System.out.println(num1);

        /* 대입 연산자 */
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
