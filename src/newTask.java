import java.util.Scanner;

public class newTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eded daxil edin: ");
        int eded = scanner.nextInt();
        int n = 0;
        while (eded!=0){
            eded=eded/10;
            n++;
        }System.out.println(n);

    }
}
