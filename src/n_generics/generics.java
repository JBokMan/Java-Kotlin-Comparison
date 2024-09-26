// package n_generics

import java.util.Collections;
import java.util.List;

void main() {
    final var box = new Box<Integer>(1);
    final var box2 = new Box<String>("Hello");
    final var box3 = new Box<>(1);

    System.out.println(box.get());
    System.out.println(box2.get());
    System.out.println(box3.get());

    List<String> list = singletonList("Hello");
    System.out.println(list);

    String basicToString = basicToString(1);
    System.out.println(basicToString);
}

public static class Box<T> {
    private final T t;

    public Box(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}

public static <T> List<T> singletonList(T item) {
    return Collections.singletonList(item);
}

public static <T> String basicToString(T item) {
    return STR."Value: \{item}";
}
