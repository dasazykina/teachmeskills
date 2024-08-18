package lesson3;

import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = in.nextInt();
        int result = 0;
        if(number > 0){
            for (int i = number; i > 0; i--){
                result = result + i;
            }
            System.out.println(result);
        } else {
            System.out.println("Введите положительное число!");
        }

    }
}
