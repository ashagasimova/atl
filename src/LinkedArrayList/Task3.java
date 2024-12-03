package LinkedArrayList;

import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> list3 = new LinkedList<>();
        System.out.print("Elementleri daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<6; i++){
            list3.add(scanner.nextInt());
        }
        System.out.println(list3);
        System.out.println("Size: " + list3.size());
        System.out.println("First element: " + list3.getFirst());
        System.out.println("Last element: " + list3.getLast());

        if(list3.contains(3)){
            System.out.println("3 reqemi siyahida var");
        } else {
            System.out.println("Yoxdur");
        }
    }
}
