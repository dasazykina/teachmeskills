package lesson9.number1;

public class Starter {
    public static void main(String[] args) {
        Director director = new Director();
        Accountant accountant = new Accountant();
        Worker worker = new Worker();

        director.print();
        accountant.print();
        worker.print();
    }

}
