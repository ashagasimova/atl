package BankAccaunt;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Sizin balansiniza " + amount + " AZN" +
                " pul yatirildi. Balansiniz: " + balance);
    }

    public void withDraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance = balance - amount;
            System.out.println("Balansinizda " + balance + " AZN mebleg var");
        } else {
            System.out.println("Hesabinizda kifayet qeder mebleg yoxdur.");
        }
    }
}
