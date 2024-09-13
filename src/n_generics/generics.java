// package n_generics

void main() {
    final var box = new Box<Integer>(1);
    final var box2 = new Box<String>("Hello");
    final var box3 = new Box<>(1);

    System.out.println(box.get());
    System.out.println(box2.get());
    System.out.println(box3.get());
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
