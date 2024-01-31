package module2.stacks;
public class Stackclient {
    public static void main (String[] args) {
        StackOfStrings stackofStrings = new StackOfStrings("To");

        StackOfStrings.push("be");
        StackOfStrings.push("or");
        StackOfStrings.push("not");
        StackOfStrings.push("to");
        StackOfStrings.push("be");

        StackOfStrings.printStack();
    }
}
