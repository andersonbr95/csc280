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
        while(!stack1.isEmpty()) {
            stack2.push(stack1.peek());
            stack1.pop();
        }

        stack1.push(value);

        while(!stack2.isEmpty()){
            stack1.push(stack2.peek());
            stack2.pop();
        }
    }

    //TODO Write this method using the 2 stacks provided above only
    public Integer dequeue(){
        if(isEmpty()) return null;

        Integer value = stack1.peek();
        stack1.pop();
        return value;
    }

    public int peek(){
        return stack1.peek();
    }

    public boolean isEmpty(){
        return stack1.isEmpty();
    }
}
