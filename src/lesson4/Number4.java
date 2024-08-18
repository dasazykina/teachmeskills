package lesson4;

public class Number4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i]);
        }

        System.out.println();

        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                counter++;
            }

        }
        if (counter > 0) {
            System.out.println(counter);
        } else {
            System.out.println("Нулей нет");
        }
    }
}
