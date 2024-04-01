package module5;
import java.util.List;
public interface HeapInterface {
    List<Integer> getHeap();
    void swap(int index1, int index2);
    void insert(int value);
    // Remove the root of the heap
    Integer remove();
    // heapify method is used to enforce the heap property on a tree where this property may currently be violated at the root
    void heapify(int size, int i);
}
