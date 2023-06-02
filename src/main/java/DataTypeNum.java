public class DataTypeNum {
    public static void main(String[] args) {
        // write your code here
        short s = 1;
        System.out.println(s);

        int i = 3;
        System.out.println(i);

        long l = 4;
        System.out.println(l);

        float f = 5.5F;
        System.out.println(f);

        double d = 6.6;
        System.out.println(d);

        // 아래와 같이 각 자료형의 MAX, MIN 값을 가져올 수 있다.
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
    }
}
