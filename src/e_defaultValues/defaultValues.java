package e_defaultValues;

public class defaultValues {
    private static final int defaultValue = 1;

    public static void main(String[] args) {
        call();
        call(2);
    }

    public static void call(int arg) {
        System.out.println(arg);
    }

    public static void call() {
        System.out.println(defaultValue);
    }
}
