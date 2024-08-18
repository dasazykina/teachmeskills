package lesson2;

public class Number2 {
    public static void main(String[] args) {
        int n = 54;
        int n2 = n % 10;
        int n1 = (n - n2) / 10;
        System.out.println(n1 + n2);
    }
}
