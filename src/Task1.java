import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int a = 10;
        int b = 5;
        int c = a / b +8924 - 963;

        long endTime = System.currentTimeMillis();

        long duration = endTime - startTime;

        System.out.println("İşləmə müddəti: " + duration + " millisaniyə");
    }
}
