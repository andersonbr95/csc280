package module2.stack;


import module2.stack.GenericStack;
import module2.stack.StackOfStrings;

import java.util.Iterator;

public class StackClient {

    public static void main(String[] args){
        StackOfStrings stackOfStrings = new StackOfStrings("To");

        stackOfStrings.push("be");
        stackOfStrings.push("or");
        stackOfStrings.push("not");

        stackOfStrings.printStack();

        GenericStack<Integer> stack = new GenericStack<>(3);

        stack.push(5);
        stack.push(2);
        stack.push(6);

        stack.printStack();

        stack.pop();

        //need to create an instant of Iterator in order for this to work
        Iterator stackIterator = stack.iterator();

        while(stackIterator.hasNext()){
            System.out.println(stackIterator.next());
        }

    }
}
