package module2.stack;


public class StackOfStrings {

    private Node top;
    private int height;

    class Node {
        String value;
        Node next;

        Node(String value) {
            this.value = value;
        }
    }

    public StackOfStrings(String value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;

    }

    public boolean isEmpty() {
        return top == null;
    }

    public String peek() {
        return top.value;
    }

    public void push(String item) {
        Node oldFirst = top;
        top = new Node(item);

        top.value = item;
        top.next = oldFirst;

        height++;
    }

    public String pop() {
        String item = top.value;
        top = top.next;
        return item;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

}
