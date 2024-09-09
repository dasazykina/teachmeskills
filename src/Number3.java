import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string one:");
        String stringOne = scanner.nextLine();
        System.out.println("Enter string two:");
        String stringTwo = scanner.nextLine();
        System.out.println("Enter string three:");
        String stringThree = scanner.nextLine();

        String[] array = new String[]{stringOne, stringTwo, stringThree};

        int sum = 0;
        int avg = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i].length();
        }

        avg = sum / array.length;
        for (int i = 0; i < array.length; i++) {
            if (avg > array[i].length()) {
                System.out.println("String: " + array[i] + " has length: " + array[i].length());
            }
        }
    }
}
