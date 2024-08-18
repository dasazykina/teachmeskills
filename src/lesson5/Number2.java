package lesson5;

import java.util.Arrays;

public class Number2 {
    public static void main(String[] args) {
        String[][] array = new String[8][8];
        int counter = 1;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (counter  % 2 == 0){
                    array[i][j] = "B";
                } else {
                    array[i][j] = "W";
                }
                counter++; // w b
            }
            counter++; // b w
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

}
