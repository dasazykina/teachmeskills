package number2;

import java.util.HashMap;
import java.util.Map;

public class NumberTwo {
    public static void main(String[] args) {
        System.out.println(convertArrayToMap(new String[] {"code", "bug"}));
    }

    public static Map<String, String> convertArrayToMap(String[] strings) {

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            char[] charArray = strings[i].toCharArray();
            map.put(String.valueOf(charArray[0]), String.valueOf(charArray[charArray.length - 1]));
        }
        return map;
    }
}

/* На вход поступает массив непустых строк, создайте и верните Map<String,
String> следующим образом: для каждой строки добавьте ее первый символ в
качестве ключа с последним символом в качестве значения. Пример:
pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"} */