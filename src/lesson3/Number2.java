package lesson3;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите температуру:");
        int temperature = in.nextInt();
        // t > -5 warm
        //-5 >= t > -20 normal
        //-20 >= t cold
        if (temperature > -5) {
            System.out.println("Warm");
        }
        if (-5 >= temperature && temperature > -20) {
            System.out.println("Normal");
        }
        if (-20 >= temperature ) {
            System.out.println("Cold");
        }
    }
}
