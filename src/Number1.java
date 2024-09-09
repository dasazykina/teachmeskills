import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string one:");
        String stringOne = scanner.nextLine();
        System.out.println("Enter string two:");
        String stringTwo = scanner.nextLine();
        System.out.println("Enter string three:");
        String stringThree = scanner.nextLine();

        String[] array = new String[]{stringOne, stringTwo, stringThree};
        int maxLength = 0;
        String maxString = "";
        int minLength = array[0].length();
        String minString = "";
        for (int i = 0; i < array.length; i++) {
            if (maxLength < array[i].length()) {
                maxLength = array[i].length();
                maxString = array[i];
            }
            if (minLength > array[i].length()) {
                minLength = array[i].length();
                minString = array[i];
            }
        }
        System.out.println("The max String = " + maxString + ". " + "Length = " + maxLength);
        System.out.println("The min String = " + minString + ". " + "Length = " + minLength);
    }
}
