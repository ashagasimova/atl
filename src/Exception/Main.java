package Exception;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        try {
            if (num2 == 0){
                throw new Exception();
            }else
                System.out.println(num1/num2);


        } catch (Exception e) {
            System.out.println("sifira bolmek olmaz" + e);
        }
    }
}