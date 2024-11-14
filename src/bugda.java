import java.math.BigInteger;

public class bugda {
    public static void main(String[] args) {
        BigInteger bugda = BigInteger.valueOf(1);
        BigInteger cem = BigInteger.valueOf(0);
        for (long i= 1; i<=64 ; i++){
            cem=cem.add(bugda);
            bugda=bugda.multiply(BigInteger.valueOf(2));

        }
        System.out.println("Toplam bugda sayi = " + cem);
    }
}