package module5;
import java.util.ArrayList;
import java.util.Random;
public class HeapClient {
    public static ArrayList<Integer> createArray(int arraySize) {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>(arraySize);
        for (int i = 0; i < arraySize; i++) {
            arr.add(i, rand.nextInt(100));
        }
        return arr;
    }
    public static void printArrayList(ArrayList<Integer> array){
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + ", ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        ArrayList<Integer> maxHeapArray = createArray(10);
        ArrayList<Integer> minHeapArray = createArray(10);
        System.out.println("Here's a couple of random arrays");
        printArrayList(maxHeapArray);
        printArrayList(minHeapArray);
        MaxPQ newMaxPQ = new MaxPQ(maxHeapArray);
        MinPQ newMinPQ = new MinPQ(minHeapArray);
        System.out.println("Here's our new MaxPQ implemented using a heap");
        System.out.println(newMaxPQ.getHeap());
        System.out.println("Here's our new MinPQ implemented using a heap");
        System.out.println(newMinPQ.getHeap());
        System.out.println("Lets insert an item into the MaxPQ heap");
        newMaxPQ.insert(99);
        System.out.println("Here is the updated MaxPQ");
        System.out.println(newMaxPQ.getHeap());
        System.out.println("Lets insert some items into the MinPQ heap");
        newMinPQ.insert(0);
        newMinPQ.insert(1);
        newMinPQ.insert(2);
        newMinPQ.insert(3);
        System.out.println("Here is the updated MinPQ");
        System.out.println(newMinPQ.getHeap());
        System.out.println("Here's the node removed from MaxPQ");
        System.out.println(newMaxPQ.remove());
        System.out.println("Here's our new MaxPQ after removing the root");
        System.out.println(newMaxPQ.getHeap());
        System.out.println("Here's the node removed from MinPQ");
        System.out.println(newMinPQ.remove());
        System.out.println("Here's our new MinPQ after removing the root");
        System.out.println(newMinPQ.getHeap());
    }
}
