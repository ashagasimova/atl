package GenericTask;

import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        GenericQueue<Integer> queue = new GenericQueue<>();

        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(12);
        queue.enqueue(3);



        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());

        queue.displayInfo();

        GenericQueue<String> queue2 = new GenericQueue<>();

        queue2.enqueue("Apple");
        queue2.enqueue("Banana");
        queue2.enqueue("Apricot");

        System.out.println(queue2.dequeue());
        System.out.println(queue2.isEmpty());

        queue2.displayInfo();





    }



}
