package lesson4;

import java.util.Arrays;

public class Number5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i]);
        }

        System.out.println();
        int number = 0;

        for (int i = 0; i < array.length / 2; i++){
            number = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = number;
        }
        System.out.println(Arrays.toString(array));
    }
}
