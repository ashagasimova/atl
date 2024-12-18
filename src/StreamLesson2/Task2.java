package StreamLesson2;

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {

        LinkedList <Integer> myList = new LinkedList<>();

        myList.add(12);
        myList.add(7);
        myList.add(6);
        myList.add(4);
        myList.add(17);
        myList.add(2);
        myList.add(18);

        myList.stream().filter(x->x%2==0).map(x->x*2)
                .filter(x->x>20).sorted()
                .toList().forEach(System.out::println);


    }
}
