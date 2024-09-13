// package o_arrays;

import java.util.Arrays;

void main() {
    final int[] array0 = {1, 2, 3};
    final String[] array1 = {"1", "2", "3"};
    final String[] array2 = {null, null, null};
    final int[] array3 = {};

    Arrays.stream(array0).forEach(System.out::print);
    System.out.println();
    Arrays.stream(array1).forEach(System.out::print);
    System.out.println();
    Arrays.stream(array2).forEach(System.out::print);
    System.out.println();
    Arrays.stream(array3).forEach(System.out::print);

    System.out.println(array1[0]);
    System.out.println(array1[1]);

    array1[0] = "4";

    System.out.println(array1[0]);


    int[][] nestedArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    for (int[] row : nestedArray) {
        for (int anInt : row) {
            System.out.print(anInt);
        }
        System.out.println();
    }
    System.out.println(nestedArray[1][2]);
}