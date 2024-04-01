package module5;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class HulkSmash {
    public int objectSmash(int[] objects){
        return 0;
    }
    public static void main(String[] args) {
        LinkedList<Integer> objectsToBeSpashed = new LinkedList<>();
        objectsToBeSpashed.add(2);
        objectsToBeSpashed.add(7);
        objectsToBeSpashed.add(9);
        objectsToBeSpashed.add(3);
        objectsToBeSpashed.add(5);
        objectsToBeSpashed.add(3);
        objectsToBeSpashed.add(2);
        objectsToBeSpashed.add(3);

        System.out.println("Objects to be smashed: " + objectsToBeSpashed);
        int remaining = hulkSmash(objectsToBeSpashed);

        if(remaining == 0)
            System.out.println("There are no other objects for the Hulk to destroy.");

        System.out.println("Objects remaining after rampage: " + remaining);
    }

    public static PriorityQueue<Integer> sort(PriorityQueue<Integer> heap){
        LinkedList<Integer> tray = new LinkedList<>();

        while(!heap.isEmpty())
            tray.add(heap.poll());

        tray.sort(Collections.reverseOrder());
        heap.addAll(tray);

        return heap;
    }

    public static int hulkSmash(LinkedList<Integer> objects){
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for(Integer element : objects)
            heap.offer(element);

        System.out.println("Destruction report:");
        while(heap.size() > 1){
            Integer c1 = heap.poll();
            Integer c2 = heap.poll();

            if(c1 > c2)
                heap.offer(c1 - c2);

            String resultant = (c1.equals(c2) ? "no object" : "an object size" + Math.abs(c1 - c2));

            System.out.print("Objects " + c1 + " and " + c2 + " are destroyed leaving " + resultant + " behind. ");
            heap = sort(heap);

            if(!heap.isEmpty())
                System.out.println("Remaining object to be smashed: " + heap);
        }
        if(heap.isEmpty())
            return 0;
        else
            return heap.poll();
    }
}
