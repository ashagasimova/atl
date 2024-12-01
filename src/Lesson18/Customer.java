package Lesson18;

public class Customer implements PaymentService {
    private String customerName;
    private double balance;
    private String customerId;

    public Customer(String customerName, String customerId) {
        this.customerName = customerName;
        this.balance = 0.0;
        this.customerId = customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public void setBalance(Double balance) {
        this.balance = balance;
    }


    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void deposit(double amount){
        balance +=amount;
        System.out.println("Balansiniza " + amount + " AZN  elave olundu. Balans " + balance);

    }

    public void withDraw(double amount){
        balance -=amount;
        System.out.println("Balansinizdan " + amount + " AZN mebleg cixildi. Balansiniz: " + balance);

    }


    @Override
    public void pay(double amount) {
        balance -=amount;
        System.out.println("Odemeniz ugurlu oldu. Balansiniz: " + balance);

    }

    @Override
    public void refund(double amount) {
        balance+=amount;
        System.out.println(amount +  " AZN balansiniza geri qayitdi. Balansiniz: " + balance);

    }

    public void checkBalance(double balance){
        getBalance();
        System.out.println("Cari balans : " + balance);
    }
}
