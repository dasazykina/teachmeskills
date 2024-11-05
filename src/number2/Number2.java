package number2;

import java.util.Arrays;

public class Number2 {
    public static void main(String[] args) throws Exception {

        int[] arrayOne = new int[]{2, 1, 5, 7, 6, 9, 3, 0, 4, 8};
        int[] arrayTwo = new int[]{13, 14, 16, 19, 15, 11, 12, 10, 18, 17};
        int[] arrayThree = new int[]{26, 28, 24, 25, 27, 23, 29, 20, 21, 22 };


        Thread bubble = new Thread(() -> {
            boolean isSorted = false;

            int buffer;

            while (!isSorted){

                isSorted = true;

                for (int i = 0; i < arrayOne.length - 1; i++) {
                    if(arrayOne[i] > arrayOne[i + 1]) {
                        buffer = arrayOne[i + 1];
                        arrayOne[i + 1] = arrayOne[i];
                        arrayOne[i] = buffer;

                        isSorted = false;
                    }
                }
            }
            System.out.println(Arrays.toString(arrayOne));
        });
        bubble.start();


        Thread selection = new Thread(() -> {

            for (int i = 0; i < arrayTwo.length - 1; i++) {
                int minNumber = i;

                for (int j = i + 1; j < arrayTwo.length; j++) {
                    if (arrayTwo[j] <arrayTwo[minNumber]) {
                        minNumber = j;
                    }
                }

                int buffer = arrayTwo[i];
                arrayTwo[i] = arrayTwo[minNumber];
                arrayTwo[minNumber] = buffer;
            }
            System.out.println(Arrays.toString(arrayTwo));
        });
        selection.start();


        Thread insert = new Thread(() -> {

            for (int i = 0; i < arrayThree.length; i++) {

                int key = arrayThree[i];
                int j = i - 1;

                while (j >= 0 && arrayThree[j] > key) {
                    arrayThree[j + 1] = arrayThree[j];
                    j = j - 1;
                }
                arrayThree[j + 1] = key;
            }
            System.out.println(Arrays.toString(arrayThree));
        });
        insert.start();
    }
}

/* Сортировка массива цифр в нескольких потоках различными алгоритмами:
 сортировка вставками;
 сортировка выбором;
 сортировка пузырьком.
Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
результат отсортированных массивов в консоль. */
