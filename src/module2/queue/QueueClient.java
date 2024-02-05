package module2.queue;

import java.util.Iterator;

public class QueueClient {
    public static void main(String[] args){
        GenericQueue<Integer> queue = new GenericQueue<>(3);

        queue.enqueue(5);
        queue.enqueue(2);
        queue.enqueue(6);

        queue.printQueue();

        queue.dequeue();

        queue.printQueue();

        Iterator queueIterator = queue.iterator(); //need to create an instance of Iterator in order for this to work

        while(queueIterator.hasNext()){
            System.out.println(queueIterator.next());
        }
    }
}
