package lesson4;

public class Number6 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i]);
        }

        System.out.println();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                System.out.println("Последовательность нарушена");
                break;
            }
        }
    }
}
