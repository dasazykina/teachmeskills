package number1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String string = scanner.nextLine();
        String regex = "[a-zA-Z]{2,6}";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(string);

        while (match.find()) {
            System.out.println(match.group());
        }
    }
}
