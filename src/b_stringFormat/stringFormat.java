package b_stringFormat;

public class stringFormat {
    public static void main(String[] args) {
        // var name = "Johnny";
        String name = "Johnny";

        String output = String.format("\nHello, %s", name);
        String output2 = "\nHello, " + name;
        String output3 = STR."""
    Hello, \{name}
    """;

        System.out.println(output);
        System.out.println(output2);
        System.out.println(output3);


        String firstname = "anthony";
        String lastname = "nahas";
        int favNumber = 12;

        System.out.println("Hi, I am " + firstname + " " + lastname + " and my favorite number is " + favNumber);
    }
}
