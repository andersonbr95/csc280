package module2.resizeArrays;

public class ArrayClient {

    public static void main(String[] args){

        ArrayStack arrayStack = new ArrayStack();

        arrayStack.push("to");
        arrayStack.push("be");
        arrayStack.push("or");
        arrayStack.push("not");

        //arrayStack.printStack(arrayStack);


        ArrayQueue arrayQueue = new ArrayQueue();

        arrayQueue.enqueue("to");
        arrayQueue.enqueue("be");
        arrayQueue.enqueue("or");
        arrayQueue.enqueue("not");

        arrayQueue.printQueue(arrayQueue);

        arrayQueue.dequque();

        arrayQueue.printQueue(arrayQueue);
    }
}
