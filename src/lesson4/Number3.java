package lesson4;

public class Number3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i]);
        }

        System.out.println();

        int max = 0;
        int min = 0;
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
                maxIndex = i;
            }
            if (array[i] <= min){
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println(maxIndex);
        System.out.println(minIndex);
    }
}
