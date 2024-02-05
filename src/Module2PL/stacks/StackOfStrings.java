package module2.stacks;

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

    public StackOfStrings(String value){
        Node newNode = new Node(value);

        top = newNode;
        height = 1;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(String item){
        Node newNode = new Node(item);

        if(isEmpty()){
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public String pop(){
        if(top == null) return null;

        String temp = top.value;
        top = top.next;
        return temp;
        }
        public void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }



    }

}
