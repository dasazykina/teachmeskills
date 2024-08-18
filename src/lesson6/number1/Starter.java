package lesson6.number1;

public class Starter {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(1, 1000000);
        CreditCard creditCard2 = new CreditCard(2, 2000000);
        CreditCard creditCard3 = new CreditCard(3, 3000000);

        creditCard1.replenishment(1000);
        creditCard2.replenishment(2000);
        creditCard3.withdrawal(3000);

        creditCard1.printInfo();
        creditCard2.printInfo();
        creditCard3.printInfo();
    }
}
