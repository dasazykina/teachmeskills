import java.util.Arrays;
import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string one:");
        String stringOne = scanner.nextLine();
        System.out.println("Enter string two:");
        String stringTwo = scanner.nextLine();
        System.out.println("Enter string three:");
        String stringThree = scanner.nextLine();

        String[] array = new String[]{stringOne, stringTwo, stringThree};
        String string;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].length() > array[i + 1].length()){
                string = array[i];
                array[i] = array[i + 1];
                array[i + 1] = string;
            }
            System.out.println(Arrays.toString(array));

        }
    }
}
