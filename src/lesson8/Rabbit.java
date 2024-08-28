package lesson8;

public class Rabbit extends Animal{
    @Override
    public void voice() {
        System.out.println("Squeak!");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println("I don't eat meat!");
        } else if (food.equalsIgnoreCase("Grass")) {
            System.out.println("I like grass!");
        } else {
            System.out.println("I don't know what it is...");
        }
    }
}
