package k_functionParameters;

import java.util.function.Consumer;
import java.util.function.Function;

public class functionParameters {
    public static void main(String[] args) {
        Function<String, Integer> function1 = arg -> arg.length();
        Function<Void, Integer> function2 = arg -> 42;
        Consumer<Void> function3 = arg -> System.out.println("Hello");
        Consumer<Object> function4 = arg -> System.out.println(arg);

        callFunction(function1, function4);
    }

    public static void callFunction(Function<String, Integer> lengthFunction, Consumer<Object> printFunction) {
        int length = lengthFunction.apply("Hello");
        printFunction.accept(length);
    }
}
