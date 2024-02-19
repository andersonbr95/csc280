package module2.homework;

import module2.queue.GenericQueue;
import module2.stack.GenericStack;

public class Homework2Client {

    public static void main(String[] args) {

        QueuesUsingStacks queueUsingStacks = new QueuesUsingStacks();
//        GenericStack<Integer> newStack = new GenericStack<>(3);
//        newStack.push(6);
//        newStack.push(8);
//        newStack.push(4);
//        newStack.push(9);

//        GenericQueue<Integer> newQueue = new GenericQueue<>(5);
//        newQueue.enqueue(3);
//        newQueue.enqueue(7);
//        newQueue.enqueue(4);
//        newQueue.enqueue(56);

        queueUsingStacks.enqueue(1);
        queueUsingStacks.enqueue(5);
        queueUsingStacks.enqueue(94);
        queueUsingStacks.enqueue(65);
        queueUsingStacks.enqueue(54);
        queueUsingStacks.enqueue(42);

        System.out.println("The Front of the Queue is " + queueUsingStacks.peek());

        queueUsingStacks.dequeue();
        queueUsingStacks.dequeue();
        queueUsingStacks.dequeue();
        queueUsingStacks.dequeue();
        queueUsingStacks.dequeue();

        System.out.println("The Front of the Queue is " + queueUsingStacks.peek());

        System.out.println("Is the Queue Empty?: " + queueUsingStacks.isEmpty());

//        System.out.println(newStack.contains(newStack, 6));
//        System.out.println(newQueue.contains(newQueue, 56));
    }
}