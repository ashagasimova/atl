package Lesson18;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Asha", "362894A");
        BankCustomer customerA = new BankCustomer(customer);
        customer.setBalance(500.0);
        customer.checkBalance(customer.getBalance());

        customer.deposit(200);
        customer.pay(100);
        customer.checkBalance(customer.getBalance());
        customer.refund(50);
        customer.checkBalance(customer.getBalance());

        try {
            customerA.withDraw(780);

        } catch (InsufficientFundsException e) {
            System.out.println("Xeta: " +  e.getMessage());
        }
    }
}
