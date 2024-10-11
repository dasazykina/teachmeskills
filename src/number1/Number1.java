package number1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by commas: ");
        String string = scanner.nextLine();
        String[] strings = string.split(", ");
        System.out.println(Arrays.toString(strings));

        Set<String> set = new HashSet<>(Arrays.asList(strings));

        System.out.println(set);
    }
}
