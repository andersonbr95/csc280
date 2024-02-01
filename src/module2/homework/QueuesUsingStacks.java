package module2.homework;

import module2.stack.GenericStack;

public class QueuesUsingStacks {

    private GenericStack<Integer> stack1;
    private GenericStack<Integer> stack2;

    public QueuesUsingStacks(){
        stack1 = new GenericStack<Integer>(1);
        stack2 = new GenericStack<Integer>(2);
    }

    //TODO write this method using the 2 stacks provided above only
    public void enqueue(Integer value){
        //store data in stack 1, which is LIFO
        stack1.push(value);
    }

    //TODO Write this method using the 2 stacks provided above only
    public Integer dequeue() {
        //confirm stack2 is empty to not mix up data
        if(stack2.isEmpty()) {
            //prevent dequeue with no values in queue
            if(stack1.isEmpty()) return null;

            //input LIFO data which then becomes FIFO from ORIGINAL input
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public int peek(){
        return stack1.peek();
    }

    public boolean isEmpty(){
        return stack1.isEmpty();
    }
}
