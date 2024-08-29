package i_interoperability;

import h_classes.KotlinUserDataClass;
import h_classes.KotlinUserRegularClass;

public class interoperability {
    public static void main(String[] args) {
        var kotlinUserDataClassInstance = new KotlinUserDataClass("Alice", "+49-012345678910");

        System.out.println(kotlinUserDataClassInstance.getName());
        System.out.println(kotlinUserDataClassInstance.getPhoneNumber());

        var kotlinUserRegularClass = new KotlinUserRegularClass("Bob", "+49-9876543210");
        kotlinUserRegularClass.printUser();
    }
}
