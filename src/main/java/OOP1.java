class Calculation {
    int add(int x, int y) {
        return x + y;
    }

    int subtract(int x, int y) {
        return x - y;
    }
}

public class OOP1 {
    public static void main(String[] args) {
        // write your code here
        Calculation calculation = new Calculation();
        int addResult = calculation.add(1, 2);
        int subtractResult = calculation.subtract(2, 1);

        System.out.println(addResult);
        System.out.println(subtractResult);
    }
}