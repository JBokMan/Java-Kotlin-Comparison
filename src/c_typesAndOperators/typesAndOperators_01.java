package c_typesAndOperators;

public class typesAndOperators_01 {
    public static void main(String[] args) {
        final int x = 1;
        final int y = 2;

        System.out.println(x + y * 4 / 3);
        // output -> x = 3

        System.out.println((x + y) * 4 / 3);
        // output -> x = 4
    }
}
