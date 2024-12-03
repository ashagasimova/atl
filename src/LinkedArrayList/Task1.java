package LinkedArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        ArrayList <String> list1 = new ArrayList <String> ();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Elementleri daxil edin: ");

        for (int i = 0; i< 7; i++){
            list1.add(scanner.nextLine());
        }
        System.out.println(list1);

        list1.remove(3);
        list1.remove(5);

        System.out.println(list1);
    }
}
