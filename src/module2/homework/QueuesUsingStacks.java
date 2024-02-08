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
        stack1.push(value);
    }

    //TODO Write this method using the 2 stacks provided above only
    public Integer dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.peek());
            }
        }
        if(!stack2.isEmpty()){
            return stack2.peek();
        }
        return null;
    }

    public int peek(){
        return stack1.peek();
    }

    public boolean isEmpty(){
        return stack1.isEmpty();
    }
}
