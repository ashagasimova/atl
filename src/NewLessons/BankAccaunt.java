package NewLessons;

public class BankAccaunt {
    private String accauntNumber;
    private double balance;

    public String getAccauntNumber() {
        return accauntNumber;
    }

    public void setAccauntNumber(String accauntNumber) {
        this.accauntNumber = accauntNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance>=0){
            this.balance = balance;
        }else {
            System.out.println("Balance menfi ola bilmez");
        }
        this.balance = balance;
    }


    public double deposit(double newBalance) {
        balance = newBalance + getBalance();
        return newBalance;
    }

    public void withDraw(double amount) {
        if (balance >= amount && amount>0) {
            balance = balance - amount;
            System.out.println(" Balansinizdan " + amount + "cixildi");
        } else {
            System.out.println("fail");
        }
        System.out.println("yeni balansiniz" + balance);
    }
}
