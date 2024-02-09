package module2.stack;

import java.util.Iterator;

public class GenericStack<E> implements Iterable<E>{
    private Node top;
    private int height = 0;

    //Constructor
    public GenericStack(E item){
        Node newNode = new Node(item);
        top = newNode;
        height = 1;
    }

    public Iterator<E> iterator() {
        return new StackIterator();
    }

    private class Node{
        E value;
        Node next;
        Node(E value){
            this.value = value;
        }
    }

    public boolean isEmpty(){
        return top == null;
    }

    public E peek(){
        return top.value;
    }

    public void push(E item){

        Node newNode = new Node(item);//creates a new Node object that will eventually be placed on top of the stack

        if(isEmpty()){
            top = newNode; //sets the newly created node as the top of the stack
        } else{
            newNode.next = top; //connects the pointer from the newly created node to the previous top
            top = newNode; //sets the newly created node as the top of the stack
        }
        height++;
    }


    public Node pop(){
        if(top == null) return null;

        Node temp = top; //sets item equal to the top Node and gives it a variable so it can exist in memory

        top = top.next; //sets the top node to the node it points to. This will remove the previous top node upon garbage collection
        temp.next = null;

        height --;

        return temp; //returns the value of the recently removed top node

    }

    /*TODO WRITE THIS METHOD
    this method will check to see if a stack contains a specified Item using a LinkedList, not an ArrayList
    you'll need to uncomment the code around the method to begin
     */

//    public boolean contains(GenericStack<E> stack, Item item){
//
//    }


    public void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    private class StackIterator implements Iterator<E>{

        private Node current = top;
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
