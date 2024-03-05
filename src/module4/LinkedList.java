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
        //If list length is less than 2, no need to sort
        if(this.length < 2){
            return;
        }

        //Initialize sortedUntil as null (nothing is sorted initially)
        Node sortedUntil = null;

        //outer loop continues until sorted part reaches the second node
        while(sortedUntil != this.head.next){

            //Start with the head node
            Node current = this.head;

            //Inner loop for each pass
            while(current.next != sortedUntil){

                //Compare current node with next node
                Node nextNode = current.next;

                //if cuurent node is greater, swap values
                if(current.value > nextNode.value){
                    int temp = current.value;
                    current.value = nextNode.value;
                    nextNode.value = temp;
                }

                //move to the next node
                current = current.next;
            }

            //after each pass, the plargest element is bubbled to the end
            //thus, update sortedUntil to point to the last sorted element
            sortedUntil = current;
        }
    }

    public void merge(LinkedList otherList){
        //get the head node of the other linked list
        Node otherHead = otherList.getHead();
        //create a dummy node to serve as the head of the merged list
        Node dummy = new Node(0);
        //create a current node to keep track of the last node in the merged list
        Node current = dummy;

        //iterate through both input linked lists as long as they are not null
        while(head != null && otherHead != null){

            //compare the values of th head nodes of the two lists
            if(head.value < otherHead.value) {
                //append the smaller node to the merged list
                //update the head of that list to its next node
                current.next = head;
                head = head.next;

            } else{
                //append the smaller node to the merged list
                //update the head of that list to its next node
                current.next = otherHead;
                otherHead = otherHead.next;

            }
            //update the 'current' node to be the last node in the merged list
            current = current.next;
        }

        //if either of the input lists still has nodes, append them to the end of the merged list
        if(head != null){

            current.next = head;
        } else {

            current.next = otherHead;
            //if current list is empty, update tail to last node of other list
            //otherwise, tail remains the last node of the current list
            tail = otherList.getTail();
        }
        //update the head of the current list to be the second node
        //in the merged list (since the first node is the dummy node)
        head = dummy.next;
        //update the length of the current list to reflect the merged list
        length = length + otherList.getLength();
    }

}
