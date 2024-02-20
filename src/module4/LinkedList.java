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
        if(this.length < 2)
            return;

        Node sortedUntil = null;
        while(sortedUntil != head.next) {
            Node currentNode = head;
            
            while(currentNode.next != sortedUntil) {
                if(currentNode.value > currentNode.next.value) {
                    int temp = currentNode.value;
                    currentNode.value = currentNode.next.value;
                    currentNode.next.value = temp;
                }
                currentNode = currentNode.next;
            }
            
            sortedUntil = currentNode;
        }
    }

    public void merge(LinkedList otherList){
        Node dummy = new Node(0);
        Node otherListHead = otherList.head;

        Node currentNode = dummy;

        while(head != null && otherListHead != null) {

            if(head.value < otherListHead.value) {
                currentNode.next = head;
                head = head.next;
            } else {
                currentNode.next = otherListHead;
                otherListHead = otherListHead.next;
            }
            currentNode = currentNode.next;
        }

        if(head != null)
            currentNode.next = head;

        else if(otherListHead != null)
            currentNode.next = otherListHead;

        head = dummy.next;
        tail = currentNode;

        length += otherList.length;
    }

}
