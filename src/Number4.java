import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string one:");
        String stringOne = scanner.nextLine();
        System.out.println("Enter string two:");
        String stringTwo = scanner.nextLine();
        System.out.println("Enter string three:");
        String stringThree = scanner.nextLine();

        String[] array = new String[]{stringOne, stringTwo, stringThree};

        for (int i = 0; i < array.length; i++) {
            char[] word = array[i].toCharArray();
            boolean unique = true;

            for (int j = 0; j < word.length; j++) {
                for (int k = j + 1; k < array[i].length(); k++) {
                    if (word[j] == word[k]) {
                        unique = false;
                        break;
                    }
                }
                if (!unique) {
                    break;
                }
            }

            if (!unique) {
                continue;
            }
            System.out.println(array[i]);
            break;
        }
    }
}
