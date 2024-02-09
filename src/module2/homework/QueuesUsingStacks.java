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
    public Integer dequeue() {
        if (stack1.isEmpty()) {
            return null;
        }

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        Integer dqItem = stack2.pop();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return dqItem;
    }

    public Integer dequeue(){
        return null;
    }

    public int peek(){
        return stack1.peek();
    }

    public boolean isEmpty(){
        return stack1.isEmpty();
    }
}
