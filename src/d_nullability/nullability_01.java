package d_nullability;

public class nullability_01 {
    public static void main(String[] args) {

        final var result1 = getLengthWithoutCheck("Hello");
        final var result2 = getLengthWithoutCheck(null);

        final var result3 = getLengthWithCheck("Hello");
        final var result4 = getLengthWithCheck(null);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    // without checking of nullability
    public static int getLengthWithoutCheck(String arg) {
        return arg.length();
    }

    // with nullability check
    public static int getLengthWithCheck(String arg) {
        if (arg != null) {
            return arg.length();
        }
        return -1;
    }
}
