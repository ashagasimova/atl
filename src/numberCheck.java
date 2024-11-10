import java.util.Scanner;

public class numberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eded daxil edin: ");
        var eded = scanner.nextInt();
        if (eded>0){
            System.out.println(eded + " musbetdir.");
        } else if (eded<0) {
            System.out.println(eded + " menfidir.");
        }else {
            System.out.println(eded + " sifirdir.");
        }
    }
}
