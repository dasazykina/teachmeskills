package lesson2;

public class Number6A {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = a;
        System.out.println("Было");
        System.out.println(a);
        System.out.println(b);
        a = b;
        b = c;
        System.out.println("Стало");
        System.out.println(a);
        System.out.println(b);
    }
}
