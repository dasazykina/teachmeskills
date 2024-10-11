package number2;

public class Starter {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.add("Dog");
        animal.add("Bull");
        animal.add("Cow");
        animal.add("Cat");
        animal.add("Bird");

        animal.getString();
        animal.remove();

        animal.getString();
    }
}
