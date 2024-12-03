package LinkedArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        ArrayList <Integer> list2 = new ArrayList<>();
        System.out.print("Elementleri daxil edin: ");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0 ; i<5; i++){
            list2.add(scanner.nextInt());
        }
        System.out.println(list2);

        System.out.println(list2.indexOf(6));
    }
}
