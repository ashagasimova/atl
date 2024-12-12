import java.util.Scanner;

public class whileOp {
    public static void main(String[] args) {
        int i = 0;
        int cem = 0;
        while (i <= 10) {
            if (i % 2 == 1) {
                cem += i;
            }
            i++;

        }
        System.out.println(cem);
    }
}