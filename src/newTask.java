import java.util.Scanner;

public class newTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eded = scanner.nextInt();
        int quvvet = scanner.nextInt();
        int netice = 1;
        for (var i=1; i<=quvvet; i++){
            netice*=eded;
        }
        System.out.println(netice);
    }
}
