package module4_notes;

import java.util.Arrays;

public class QuickSort {


    /*pivot function is going to be placing all items less than our pivot to the left of it in the array and everything
    greater than the pivot to the right of it in the array.
    *
    */

    private static int pivot(int[] array, int pivotIndex, int endIndex){
        int swapIndex = pivotIndex;

        for(int i = pivotIndex + 1; i <= endIndex; i++){

            if (array[i] < array[pivotIndex]) {
                swapIndex++; //increments our swap index only when conditions met so we can swap the value at i with it into the proper space
                swap(array, swapIndex, i); //swaps i
            }

        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex; //notice how it's returning the index of the swapped value not the actual value of the pivot.
    }


    //helper function to clean our code up in other functions, feel free to utilize this in other implementations, or create your own variation if you'd like
    //swaps the locations of first and second index
    private static void swap(int[]array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }


    public static void quickSortHelper(int arr[], int left, int right) {

        if (left < right)
        {
            int pivotIndex = pivot(arr, left, right);

            quickSortHelper(arr, left, pivotIndex-1); //runs quick sort on the items to the left
            quickSortHelper(arr, pivotIndex+1, right); //runs quick sort on the items to the right
        }
    }

    public static void quickSort(int arr[]) {
        quickSortHelper(arr, 0, arr.length - 1);
    }

    public static void main(String[] args)
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort qs = new QuickSort();
        qs.quickSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}