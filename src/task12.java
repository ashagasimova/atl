import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        System.out.print("Iki reqemli eded daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        int eded = scanner.nextInt();
            System.out.println((eded/10) + " " + (eded%10));
    }

}
