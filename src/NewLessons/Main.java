package NewLessons;

public class Main {
    public static void main(String[] args) {
        BankAccaunt accaunt1 = new BankAccaunt();
        accaunt1.setBalance(-256);
        accaunt1.setAccauntNumber("263548s");
        accaunt1.deposit(235);
        System.out.println(accaunt1.getAccauntNumber() + " Your New balance is " +
                accaunt1.getBalance());

        accaunt1.withDraw(200);


    }
}
