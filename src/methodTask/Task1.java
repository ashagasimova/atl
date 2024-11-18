package methodTask;

import java.util.Scanner;

public class Task1 {
    public int quvvetHesablama(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("eded daxil edin: ");
        int eded = scanner.nextInt();
        System.out.print("quvvet daxil edin: ");
        int quvvet = scanner.nextInt();
        int netice = 1;
        for (var i=1; i<=quvvet; i++){
            netice*=eded;
        }
        return netice;

    }
}
