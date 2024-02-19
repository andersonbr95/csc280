package module4;

import java.util.Arrays;

public class BubbleSort {

    //Bubble Sort is typically the slowest and least efficient of the sorting methodologies
    //each iteration will have n-1 operations
    //has a Big O of O(n^2) (remember Big O is the worst case scenario)

    public static void bubbleSort(int[] array){
        for(int i=array.length - 1; i> 0 ; i--){
            for(int j=0; j < i; j++){
                if(array[j] > array[j+1]){ //compares the two values that are right next to each other to see if they need to be swapped.
                    int temp = array[j]; //sets a temporary space in memory to handle the swap
                    array[j] = array[j + 1]; //sets the value of j+1 equal to the initial index of j, essentially moving it back one space
                    array[j + 1] = temp; //sets the old, initial value closer to the proper spot
                }
            }
        }
    }

    public static void main(String[] args){
        int[] myArray = {4,2,6,5,1,3};

        System.out.println(Arrays.toString(myArray));

        bubbleSort(myArray);

        System.out.println(Arrays.toString(myArray));
    }
}
