package module2.queue;

public class QueueOfStrings {

    private Node first, last; //these are your Node pointers you're going to need for the queue

    private int length;
    class Node{
        String value;
        Node next;

        Node(String value){
            this.value = value;
        }
    }

    public void enqueue(String item){
        Node newNode = new Node(item);

        if(isEmpty()){
            first = newNode;
            last = newNode; //at this point the length of the queue is 1 and we need both nodes to point to something, so they point to the new node
        } else {
            last.next = newNode; //sets the pointer
            last = newNode; //sets the Node
        }
        length++;
    }

    public Node dequeue(){
        if(isEmpty()) return null;

        Node temp = first; //storing the soon to be removed node to it's own variable in memory
        if(length == 1){
            first = null;
            last = null;
        } else {
            first = first.next; //creates a new first Node on the queue
            temp.next = null; // cuts off pointer to the queue
        }

        length --;
        return temp;
    }

    public boolean isEmpty(){
        return first == null;
    }

}
