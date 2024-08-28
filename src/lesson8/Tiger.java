package lesson8;

public class Tiger extends Animal{
    @Override
    public void voice() {
        System.out.println("Roar!");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println("I like meat!");
        } else if (food.equalsIgnoreCase("Grass")) {
            System.out.println("I don't eat grass!");
        } else {
            System.out.println("I don't know what it is...");
        }
    }
}
