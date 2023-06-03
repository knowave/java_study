import java.util.Arrays;

public class ReDataType {
    public static void main(String[] args) {
        // write your code here
        String sparta = "Hello Sparta";
        System.out.println(sparta);

        int[] intEmptyArray = new int[5];
        System.out.println(Arrays.toString(intEmptyArray));

        int[] intArray = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(intArray));  // [0, 0, 0, 0, 0]

        String[] stringEmptyArrays = new String[5];
        System.out.println(Arrays.toString(stringEmptyArrays)); // [null, null, null, null, null]

        String[] season = {"봄", "여름", "가을", "겨울"};
        System.out.println(Arrays.toString(season));

        System.out.println(season[season.length -1]);
    }
}
