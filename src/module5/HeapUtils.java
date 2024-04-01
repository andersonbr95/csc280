package module5;
public class HeapUtils {
    static int leftChild(int index) {
        return 2 * index + 1; //returns the left child of the index provided in the argument
    }
    static int rightChild(int index) {
        return 2 * index + 2; //returns the left child of the index provided in the argument
    }
    static int parent(int index) {
        return (index - 1) / 2; // returns the parent of the index provided in the argument
    }
}
