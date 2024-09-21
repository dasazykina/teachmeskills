import java.io.*;

public class Starter {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();
        String line;
        File file = new File("C:\\java hm\\teachmeskills\\Romeo and Julietta (en).txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                text.append(line).append(System.lineSeparator());
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        System.out.println(text);

        String textWithoutSymbols = text.toString().replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "");

        String longestWord = "";
        String[] strings = textWithoutSymbols.split("\\s+");

        for (String word : strings) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The longest word is: " + longestWord);
    }
}
