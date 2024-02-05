package module2.resizeArrays;

import module2.queue.GenericQueue;
import module2.stack.GenericStack;

import java.sql.SQLOutput;
import java.util.NoSuchElementException;

public class ArrayStack {
    private String[] stack;
    private int height = 0;

    public ArrayStack(){
        stack = new String[1];
    }

    public boolean isEmpty(){
        return height == 0;
    }

    public void push(String item){
        if(height == stack.length) resize(2 * stack.length);
        stack[height++] = item;
    }

    public String pop(){
        String item = stack[--height];
        stack[height] = null;

        if(height > 0 && height == stack.length/4) resize(stack.length/2);

        return item;
    }

    public void peek(){
        if(height == 0){
            throw new NoSuchElementException("empty array stack");
        } else {
            System.out.println(stack[height-1]);
        }
    }

    private void resize(int capacity){
        String copy[] = new String[capacity];

        for(int i = 0; i < height; i++){
            copy[i] = stack[i];
        }
        stack = copy;
    }

    public void printStack(ArrayStack stack) {
        ArrayStack temp = stack;

        while (!temp.isEmpty()) {
            temp.peek();
            temp.pop();
        }
    }
}


