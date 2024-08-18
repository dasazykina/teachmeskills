package lesson3;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("Это число четное?");
        boolean result = number % 2 == 0;
        System.out.println(result);
    }

}
