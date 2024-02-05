package module2.stacks;

public class StackClient {

    public static void main(String[] args) {

        StackOfStrings stackOfStrings = new StackOfStrings("To");

        stackOfStrings.push("be");
        stackOfStrings.push("or");
        stackOfStrings.push("not");
        stackOfStrings.push("to");
        stackOfStrings.push("be");

        stackOfStrings.pop();
        stackOfStrings.pop();

        stackOfStrings.printStack();

    }

}