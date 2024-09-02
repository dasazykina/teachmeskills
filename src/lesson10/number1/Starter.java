package lesson10.number1;

public class Starter {
    public static void main(String[] args) {
        User user1 = new User(30, "Maxim");
        User user2 = new User(30, "Maxim");
        User user3 = new User(18, "Maxim");

        System.out.println(user1);

        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user3));
    }
}
