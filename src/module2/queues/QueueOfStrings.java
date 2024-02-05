package module2.queues;

public class QueueOfStrings {

    private Node first, last;
    int length;

    class Node {

        String value;
        Node next;

        Node(String value){
            this.value = value;
        }
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void enqueue(String item){
        Node newNode = new Node(item);

        if(isEmpty()) {
            first = newNode;
            last = newNode;
        }else {
            last.next = newNode; //pointer
            last = newNode; //value
        }
        length++;
    }

    public Node dequeue(){
        if(isEmpty()) return null;

        Node temp = first;

        if(length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }

        length--;
        return temp;
    }


}
