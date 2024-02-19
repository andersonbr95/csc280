package module4;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;
    class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public Node getHead() {
        return head;
    }
    public Node getTail() {
        return tail;
    }
    public int getLength() {
        return length;
    }
    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }

        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void bubbleSort(){
        // WRITE BUBBLESORT METHOD HERE //
        if(length < 2) return;

        Node sortedUntil;
        sortedUntil = null;

        while(sortedUntil != this.head.next) {
            Node current = head;
            while(current.next != sortedUntil) {
                if(current.value > current.next.value) swap(current, current.next);
                current = current.next;
            }
            sortedUntil = current;
        }
    }

    public void merge(LinkedList otherList){
        // WRITE MERGE METHOD HERE //
        Node otherHead = otherList.head;
        Node dummy = new Node(0);
        Node current = dummy;

        while(head != null &&  otherHead != null) {
            if(head.value <= otherHead.value) {
                current.next = head;
                head = head.next;
            }
            else {
                current.next = otherHead;
                otherHead = otherHead.next;
                length++;
            }
            current = current.next;
        }

        if(head != null) {
            append(head.value);
        }

        if(otherHead != null) {
            append(otherHead.value);
        }

        head = dummy.next;
    }

    public void swap(Node node1, Node node2) {
        int temp = node1.value;
        node1.value = node2.value;
        node2.value =  temp;
    }

}
