import module2.stack.GenericStack;

public class App {

    public static void main(String[] args) {

        //Pointer is a reference to a point in memory that stores a value or an object

        //Pointers with Integers they don't behave the way that data structures do
        int i = 4;
        int j = i;

        i = 7;

        System.out.println("The value of j is " + j);
        System.out.println("The value of i is " + i);


        //Pointers with Stacks behave the way that we would want a pointer to behave
        GenericStack<Integer> stack1 = new GenericStack<>(3);
        GenericStack<Integer> stack2;

        stack1.push(2);

        stack2 = stack1;

        while(!stack1.isEmpty()) {
            System.out.println(stack2.peek());
            stack1.pop();
        }
    }


}
