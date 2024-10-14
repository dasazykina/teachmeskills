package number2;

import java.util.function.Predicate;

public class PredicateTask {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, -1, -2, -3, -4, -5};
        System.out.println();

        Predicate<Integer> isPositive = n -> n > 0;

        for (int i : numbers) {
            if (isPositive.test(i)) {
                System.out.println(i);
            }
        }
    }
}

/* Используя Predicate среди массива чисел вывести только те, которые являются
положительными. */