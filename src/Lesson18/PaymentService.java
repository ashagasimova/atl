package Lesson18;

public interface PaymentService {

   void pay(double amount) throws InsufficientFundsException;

    void refund(double amount) throws InvalidAmountException;

}
