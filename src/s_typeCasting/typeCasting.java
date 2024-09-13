// package s_typeCasting;

void main() {
    final var num1 = 12.6;
    final var num2 = 42;

    // explicit type casting
    final var int1 = (int) num1;
    final var int2 = (int) num2;

    System.out.println(STR."int1: \{int1}");
    System.out.println(STR."int2: \{int2}");
    System.out.println();

    // check type before casting with instanceof
    /*if (num1 instanceof Integer) {
        final var int3 = (int) num1;
        System.out.println(STR."int3: \{int3}");
    }*/

    /*if (num2 instanceof Integer) {
        final var int4 = (int) num2;
        System.out.println(STR."int4: \{int4}");
    }
    System.out.println();*/

    // cast with check
    if (Integer.class.isInstance(num1)) {
        final var int5 = Integer.class.cast(num1);
        System.out.println(STR."int5: \{int5}");
    }

    if (Integer.class.isInstance(num2)) {
        final var int6 = Integer.class.cast(num2);
        System.out.println(STR."int6: \{int6}");
    }
    System.out.println();
}