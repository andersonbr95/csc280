package module2.homework;

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
    }
}