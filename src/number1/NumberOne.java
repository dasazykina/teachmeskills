package number1;

import java.util.HashMap;
import java.util.Map;

public class NumberOne {

    public static void main(String[] args) {
        System.out.println(convertArrayToMap(new String[] {"a", "b", "a", "c", "b"}));
    }

    public static Map<String, Boolean> convertArrayToMap(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i])) {
                map.put(strings[i], false);
            } else {
                map.put(strings[i], true);
            }
        }
        return map;
    }
}

/* Задача 1:
На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
строка является ключом, и ее значение равно true, если эта строка встречается в массиве
2 или более раз. Пример:
wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true} */