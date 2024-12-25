package GenericTask;

import java.util.Queue;

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




    }



}
