package GenericTask;

import java.util.LinkedList;
import java.util.Queue;

public class GenericQueue <T> {

    private Queue <T> myqueue;

    public GenericQueue() {
        this.myqueue = new LinkedList<>();
    }

    public void enqueue(T element){
        myqueue.add(element);
    }


    public T dequeue (){
        return myqueue.poll();
    }

    public boolean isEmpty(){
        return myqueue.isEmpty();
    }

    public void displayInfo(){
        for (T elements: myqueue){
            System.out.println(elements);
        }
    }


}
