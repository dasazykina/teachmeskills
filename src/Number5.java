import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string :");
        String string = scanner.nextLine();
        char[] word = string.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < word.length; i++) {
            builder.append(word[i]);
            builder.append(word[i]);
        }
        System.out.println(builder);
    }
}
