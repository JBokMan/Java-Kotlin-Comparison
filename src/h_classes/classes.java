package h_classes;

public class classes {
    public static void main(String[] args) {
        var user = new JavaUserRecord("Alice", "+49-012345678910");
        System.out.println(user.name());
        System.out.println(user.phoneNumber());

        var user2 = new JavaUserRegularClass("Bob", "+49-012345678910");
        user2.printUser();
    }
}
