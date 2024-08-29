package h_classes;

public class JavaUserRegularClass {
    private final String name;
    private final String phoneNumber;

    public JavaUserRegularClass(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void printUser() {
        System.out.println(name);
        System.out.println(phoneNumber);
    }
}
