package module4;

public class Homework4Client {



    public static void main(String[] args){

        /*BUBBLE SORT IMPLEMENTATION*/
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(2);
        myLinkedList.append(6);
        myLinkedList.append(5);
        myLinkedList.append(1);
        myLinkedList.append(3);

        System.out.println("Unsorted Linked List");
        myLinkedList.printList();

        myLinkedList.bubbleSort();

        System.out.println("\nSorted Linked List: ");
        myLinkedList.printList();


        /*MERGE IMPLEMENTATION*/
        LinkedList l1 = new LinkedList(1);
        l1.append(3);
        l1.append(5);
        l1.append(7);

        LinkedList l2 = new LinkedList(2);
        l2.append(4);
        l2.append(6);
        l2.append(8);

        l1.merge(l2);

        l1.printAll();


        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 1
            Tail: 8
            Length:8

            Linked List:
            1
            2
            3
            4
            5
            6
            7
            8

        */



    }

}
