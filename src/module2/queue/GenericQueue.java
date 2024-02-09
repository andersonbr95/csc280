package module2.queue;


import module2.stack.GenericStack;

import java.util.Iterator;

public class GenericQueue<E> implements Iterable<E> {

    private Node first, last ;
    private int length;

    @Override
    public Iterator<E> iterator() {
        return new QueueIterator();
    }


    private class Node{
        E value;
        Node next;

        Node(E value){
            this.value = value;
        }
    }

    public GenericQueue(E item){
        Node newNode = new Node(item);

        first = newNode;
        last = newNode;
        length = 1;
    }

    public void enqueue(E value){
        Node newNode = new Node(value);
        if(isEmpty()){
            first = newNode;
            last = newNode;
        }else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue(){
        if(isEmpty()) return null;

        Node temp = first; //storing the soon-to-be removed Node to its own variable in memory
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

    /*TODO WRITE THIS METHOD HOMEWORK
    this method will check to see if a queue contains a specified item using a LinkedList, not an ArrayList
    you'll need to uncomment the code around the method to begin
    */

    public boolean contains(GenericQueue<E> queue, Item item){
        QIterator iterator = new QIterator();
        LinkedList<E> list = new LinkedList<>();

        while(list.hasNext())
            list.add(iterator.next());








    }


    public void printQueue(){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    private class QueueIterator implements Iterator<E> {

        private Node current = first;
        public boolean hasNext() {
            return current != null;
        }

        public E next() {
            E item = current.value;
            current = current.next;
            return item;
        }
    }

}
