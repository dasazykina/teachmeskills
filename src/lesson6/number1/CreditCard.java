package lesson6.number1;

public class CreditCard {
    private int accountNumber;
    private int balance;

    public CreditCard(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void replenishment(int credit) {
        balance += credit;
    }

    public void withdrawal(int debit) {
        balance -= debit;
    }

    public void printInfo() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

}
