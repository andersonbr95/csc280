package module2.homework;

import module2.queue.GenericQueue;
import module2.stack.GenericStack;

public class Homework2Client {

    public static void main(String[] args) {

        QueuesUsingStacks queueUsingStacks = new QueuesUsingStacks();

        queueUsingStacks.enqueue(1);
        queueUsingStacks.enqueue(5);
        queueUsingStacks.enqueue(94);
        queueUsingStacks.enqueue(65);
        queueUsingStacks.enqueue(54);
        queueUsingStacks.enqueue(42);

        queueUsingStacks.dequeue();
        queueUsingStacks.dequeue();
        queueUsingStacks.dequeue();

        System.out.println("The Front of the Queue is " + queueUsingStacks.peek());

        System.out.println("Is the Queue Empty?: " + queueUsingStacks.isEmpty());
        /*
        //tests queue contains method
        GenericQueue testContains = new GenericQueue("Wow");

        testContains.enqueue("That");
        testContains.enqueue("I");
        testContains.enqueue("Was");
        testContains.enqueue("Once");

        System.out.println(testContains.contains(testContains, "Wow"));

        //tests stack contains method
        GenericStack testContains = new GenericStack("That");

        testContains.push("Is");
        testContains.push("Insanity");
        testContains.push("wouldnt");
        testContains.push("You");

        System.out.println(testContains.contains(testContains, "That"));

        //tests queues using stacks method
        QueuesUsingStacks queueStackTest = new QueuesUsingStacks();

        queueStackTest.enqueue(2);
        queueStackTest.enqueue(5);
        queueStackTest.enqueue(8);

        System.out.println(queueStackTest.dequeue());
        System.out.println(queueStackTest.dequeue());

        queueStackTest.enqueue(24);
        queueStackTest.enqueue(64);

        System.out.println(queueStackTest.dequeue());
        System.out.println(queueStackTest.dequeue());
        System.out.println(queueStackTest.dequeue());
        System.out.println(queueStackTest.dequeue());
         */



    }
}