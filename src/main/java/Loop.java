import java.util.Arrays;

public class Loop {
    public static void main(String[] args) {
        // write your code here

        // for 문
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += (i + 1);
        }

        System.out.println(sum);

        // for-each 문
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (String day: days) {
            System.out.println(day);
        }

        // while 문
        int i = 0;
        int result = 0;

        while (i < 10) {
            result += (i + 1);
            i++;
        }

        System.out.println(result);
    }
}
