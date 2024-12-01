package Lesson18;

public class BankCustomer extends BankOperation implements PaymentService {

    private Customer customer;

    public BankCustomer(Customer customer) {
        this.customer = customer;
    }


    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Balans 0-dan böyük olmalıdır!");
        }
        customer.deposit(amount);
    }

    @Override
    public void withDraw(double amount) throws InsufficientFundsException {
        if (amount > customer.getBalance()) {
            throw new InsufficientFundsException("Balansınızda kifayət qədər məbləğ yoxdur!");
        }
        if (amount<=0){
            throw new InsufficientFundsException("Mebleg 0-dan boyuk olalidir!");

        }
        customer.withDraw(amount);

    }

    @Override
    public void pay(double amount) throws InsufficientFundsException{
         if (amount > customer.getBalance()){
             throw new InsufficientFundsException("Balansinizda kifayet qeder mebleg yoxdur!");
         }
         if (amount<=0){
             throw new InsufficientFundsException("Mebleg 0-dan boyuk olalidir!");
         }
         customer.pay(amount);

    }

    @Override
    public void refund(double amount) throws InvalidAmountException {
        if (amount<=0){
            throw  new InvalidAmountException("Mebleg 0 dan boyuk olmaldir!");
        } customer.refund(amount);

    }
}
