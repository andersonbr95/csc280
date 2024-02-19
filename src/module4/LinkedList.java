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

//        public static void bubbleSort(int[] array){
//            LinkedList<int> linkedList = new LinkedList<>();
//        }





//            for(int i = array.length - 1; i> 0 ; i--){
//                for(int j=0; j < i; j++){
//                    if(array[j] > array[j+1]){ //compares the two values that are right next to each other to see if they need to be swapped.
//                        int temp = array[j]; //sets a temporary space in memory to handle the swap
//                        array[j] = array[j + 1]; //sets the value of j+1 equal to the initial index of j, essentially moving it back one space
//                        array[j + 1] = temp; //sets the old, initial value closer to the proper spot
//                    }
//                }
//            }
//        }
    }

    public void merge(LinkedList otherList){

        // WRITE MERGE METHOD HERE //
        // //
        // //
        // //
        // //
        /////////////////////////////
    }

}
