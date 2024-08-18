package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Number2 {
    public static void main (String[] args){
        int[] array = new int[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
        }

        int max = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
