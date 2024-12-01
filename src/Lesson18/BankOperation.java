package Lesson18;

public  abstract class BankOperation{

    public abstract void deposit(double amount) throws InvalidAmountException;

    public abstract void withDraw(double amount) throws InsufficientFundsException;


}

