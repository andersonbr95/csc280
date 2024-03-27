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



    public void bubbleSort() {
        // WRITE BUBBLESORT METHOD HERE //
        Node current;
        Node sortedUntil = null;
        if (head == null || head.next == null) {
            return;
        } else {
            int count = 0;
            Node beginHere = head;
            while(beginHere.next != sortedUntil) {
                count++;
                beginHere = beginHere.next;
            }
            int i;
            for(i = 0; i < count; ++i) {
                current = head;
                while (current.next != null && current != null) {
                    if (current.value > current.next.value) {
                        int temp = current.value;
                        current.value = current.next.value;
                        current.next.value = temp;
                    }
                    current = current.next;
                }

            }
        }

    }


    public void merge(LinkedList otherList) {

        // WRITE MERGE METHOD HERE //
        Node otherHead = otherList.head;
        Node dummy = new Node(0);
        Node newCurrent = dummy;
        Node otherCurrent = otherHead;

        int count = 0;
        while (head != null && otherHead != null) {
            if (head.value <= otherHead.value) {
                newCurrent.next = head;
                head = head.next;
            } else {
                newCurrent.next = otherHead;
                otherHead = otherHead.next;
            }
            newCurrent = newCurrent.next;
        }
        if (head == null) {
            newCurrent.next = otherHead;
        } else {
            newCurrent.next = head;
        }

     while(newCurrent.next != null) {
         newCurrent = newCurrent.next;
     }
    tail = newCurrent;
     length += otherList.length;
     head = dummy.next;


    }
}


