package module2.stacks;

public class GenericStacks<E> {
    private Node top;
    int height;
    private class Node{
        E value;
        Node next;

        Node(E value){
            this.value = value;
        }
    }
    public GenericStacks(E item){
        Node newNode = new Node(item);
        top = newNode;
        height = 1;
    }
}
