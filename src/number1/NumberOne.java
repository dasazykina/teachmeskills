package number1;

import java.util.List;

public class NumberOne {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,4,4,5,6,6,7,8,9,9);

        int sum = numbers.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}

/* Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
Stream'ов:
- Удалить дубликаты
- Оставить только четные элементы
- Вывести сумму оставшихся элементов в стриме */