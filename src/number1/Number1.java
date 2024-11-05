package number1;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        System.out.println("Fill the array with numbers: ");

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        Thread maxThread = new Thread(() -> {
            int maxNumber = Integer.MIN_VALUE;
            for (int value : array) {
                if (value > maxNumber) {
                    maxNumber = value;
                }
            }
            System.out.println("Highest value: " + maxNumber);
        });

        Thread minThread = new Thread(() -> {
            int minNumber = Integer.MAX_VALUE;
            for (int value : array) {
                if (value < minNumber) {
                    minNumber = value;
                }
            }
            System.out.println("Minimum value: " + minNumber);
        });

        maxThread.start();
        minThread.start();

        maxThread.join();
        minThread.join();
    }
}

/* Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
вычислений возвращаются в метод main()/ */

