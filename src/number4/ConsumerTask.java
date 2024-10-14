package number4;

import java.util.function.Consumer;

public class ConsumerTask {
    public static void main(String[] args) {
        Consumer<String> exchange = s -> System.out.println((convert(s) / 3.27) + "$");
        exchange.accept("234 BYN");
    }

    public static Double convert(String currencyValue) {
        String[] parts = currencyValue.split(" ");
        return Double.parseDouble(parts[0]);
    }
}

/*Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
выводить сумму, переведенную сразу в доллары.*/