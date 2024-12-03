package LinkedArrayList;

import java.util.LinkedList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        LinkedList<String> list4 = new LinkedList<>();

        System.out.print("Elementleri daxil edin: ");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list4.add(scanner.next());
        }
        System.out.println(list4);

        list4.addFirst("Leyla");
        list4.addLast("Konul");
        System.out.println(list4);
    }
}