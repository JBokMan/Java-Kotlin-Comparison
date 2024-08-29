package f_conditions;

public class conditions {
    public static void main(String[] args) {
        System.out.println(checkValue(0));
        System.out.println(checkValue(5));
        System.out.println(checkValue(6));
        System.out.println(checkValue(9));
        System.out.println(checkValue(10));
        System.out.println(checkValue(21));
    }

    public static char checkValue(int value) {
        char result;

        if (value >= 0 && value < 5) {
            result = 'a';
        } else if (value == 5) {
            result = 'b';
        } else if (value == 6 || value == 7 || value == 8) {
            result = 'c';
        } else if (value == 9) {
            result = 'd';
        } else if (value >= 10 && value <= 20) {
            result = 'e';
        } else {
            throw new IllegalArgumentException();
        }

        return result;
    }
}
