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
    public void enqueue(Integer x){
        // (Credit to GeekforGeeks) Move all elements from stack1 to stack2
//        while (!stack1.isEmpty())
//        {
//            stack2.push(stack1.pop());
//            //stack1.pop();
//        }
//
// // Push item into stack1
//        stack1.push(x);

        // Push everything back to stack1
//       while (!stack2.isEmpty())
//        {
//            stack1.push(stack2.pop());
//            //stack2.pop();
//        }
    }

    //TODO Write this method using the 2 stacks provided above only
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
