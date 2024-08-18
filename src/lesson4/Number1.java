package lesson4;

public class Number1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

        System.out.println();

        for (int i = array.length - 1; i > -1; i--) {
            System.out.print(array[i]);
        }

    }
}
