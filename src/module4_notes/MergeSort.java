package module4_notes;

import java.util.Arrays;

public class MergeSort {

    /*main frame of thinking with Merge Sort is that it divides your lists in half until you have units of one.
    You'll then, recursively, combine the lists back in a sorted order until all of the lists are sorted back into one list

    */


    /*
    * Merge is what is called a helper function to help complete your merge sort functionality.
    * Helper functions are an integral part of programming, as you only want a funciton to be doing one thing, just as you only want a class to be doing one thing.
    *
    * The merge function requires to lists that are already both individually sorted (this is critical, it will not work if they're not sorted already) and combines
    * them into a single sorted list
    *
    * */
    public static int[] merge(int[] left, int[] right){

        int[] combined = new int[left.length + right.length]; //creates a new array that will eventually have sorted elements from both arrays in them.)

        int index = 0;
        int i = 0;
        int j = 0;

        while(i < left.length && j < right.length){ //this loop will run until one of the arrays runs out of elements)
            if(left[i] < right[j]){
                combined[index] = left[i]; //adds the left element to combined
                index++; //increments index, this will happenen regardless because the array being combined's length will
                        // be equal to a sum of both arrays passed in the arguments lengths
                i++; //moves to the next element for the left array in the next loop iteration
            }else{
                combined[index] = right[j];
                index++;
                j++;
            }
        }

        while(i < left.length){
            combined[index] = left[i];
            index++;
            i++;
        }
        while(j < right.length) {
            combined[index] = right[j];
            index++;
            j++;

        }
            return combined;
    }


    //operates at a complexity of O(n log n)
    //operates best with known large data sets
    //for smaller data sets doesn't comparatively work
    //operates as a divide and conquer method

    public static int[] mergeSort(int[] array){
        if(array.length == 1) return array;

        int midIndex = array.length/2;

        //the mergeSort
        int[] left = mergeSort(Arrays.copyOfRange(array, 0 , midIndex)); //last argument goes up to but not including
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));

        return merge(left, right);
    }


    public static void main(String[] args){
        int[] myArray = {4,2,6,5,1,3};

        int[] sortedArray = mergeSort(myArray);

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(sortedArray));
    }
}
