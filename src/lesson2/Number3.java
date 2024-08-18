package lesson2;

public class Number3 {
    public static void main(String[] args) {
        int n = 174;
        int n3 = n % 10;
        int n2 = ((n - n3) / 10) % 10;
        int n1 = ((n - n3) - (n2 * 10)) / 100;
        System.out.println(n1 + n2 + n3);
    }
}
