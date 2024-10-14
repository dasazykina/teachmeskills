package number3;

import java.util.function.Function;

public class FunctionTask {
    public static void main(String[] args) {

        Function<String, Double> exchange = s -> (double) (convert(s) / 3.27);

        System.out.println(exchange.apply("123 BYN") + "$");

    }

    public static Double convert(String currencyValue) {
        String[] parts = currencyValue.split(" ");
        return Double.parseDouble(parts[0]);
    }
}

/*Задача 3:
Используя Function реализовать лямбду, которая будет принимать в себя строку в
формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
возвращать сумму, переведенную сразу в доллары.*/