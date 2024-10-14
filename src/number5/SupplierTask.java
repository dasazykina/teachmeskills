package number5;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierTask {
    public static void main(String[] args) {

        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(string);

        Supplier<String> reverseString = () -> stringBuilder.reverse().toString();

        System.out.println("Reversed version: " + reverseString.get());
    }
}

/*Используя Supplier написать метод, который будет возвращать введенную с консоли
строку задом наперед.*/