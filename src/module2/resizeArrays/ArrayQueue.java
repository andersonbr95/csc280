package module2.resizeArrays;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

public class ArrayQueue {

    private String[] queue;
    private int first, last, length;

    ArrayQueue(){
        first = last = 0;
        queue = new String[1];
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int size(){
        return length;
    }

    public void enqueue(String item){
        //double size of array if necessary and recopy to front of new array
        if(length == queue.length) resize(2* queue.length); //double size of array if necessary
        queue[last++] = item; //add new item
        if(last == queue.length) last = 0;
        length++;
    }

    public String dequque(){
        if(isEmpty()){
            throw new NoSuchElementException("oops, no elements to remove!");
        }
        String item = queue[first]; //creating instance of front element in memory;
        queue[first] = null; //removes front item of the queue
        length--; //reduces length of queue;
        first++;
        if(first == queue.length) first = 0;

        if(length > 0 && length == queue.length/4) resize(queue.length*2);
        return item;
    }

    public void peek(){
        if(isEmpty()) throw new NoSuchElementException("No Queue to pull from!");
        System.out.println(queue[first]);
    }

    public void printQueue(ArrayQueue queue){
        ArrayQueue temp = queue;

        while (!temp.isEmpty()){
            temp.peek();
            temp.dequque();
        }
    }

    private void resize(int capacity){
        String copy[] = new String[capacity];

        for(int i = 0; i < length; i++){
            copy[i] = queue[(first+i) % queue.length];
        }
        queue = copy;
        first = 0;
        last = length;
    }



}
