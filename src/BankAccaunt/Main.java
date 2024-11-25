package BankAccaunt;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println("Sizin musteri nomreniz: " + account.getAccountNumber());
        account.setBalance(500.3);
        account.deposit(220.5);
        account.withDraw(100);

    }
}
