package lesson8;

public class Zoo {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();
        Dog dog = new Dog();

        System.out.println("Feeding the rabbit:");
        rabbit.eat("grass");
        rabbit.eat("meat");
        rabbit.eat("egg");
        System.out.println("Feeding the dog:");
        dog.eat("meat");
        dog.eat("grass");
        dog.eat("egg");
        System.out.println("Feeding the tiger:");
        tiger.eat("meat");
        tiger.eat("grass");
        tiger.eat("egg");

        System.out.println("Rabbit voice: ");
        rabbit.voice();
        System.out.println("Dog voice: ");
        dog.voice();
        System.out.println("Tiger voice: ");
        tiger.voice();
    }
}
