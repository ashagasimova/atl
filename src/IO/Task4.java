package IO;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String found = "Murekkebdir";
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i=2; i<a/2; i++){
            if (a%i==0){
                found = "Murekkebdir";
                break;
            }
            found = "sadedir";

        }
        System.out.println(found);
    }

}
