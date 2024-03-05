package exam1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumWithTargetSolution {

        public static List<List<Integer>> threeSumWithTarget(int[] list, int targetValue){
            List<List<Integer>> returnedList = new ArrayList<>();

            for(int i = 0; i < list.length; i++){
                for(int j = i+1; j < list.length ; j++){
                    for(int k = j + 1 ; k < list.length ; k++){
                        if (list[i] + list[j] + list[k] == targetValue) {
                            List<Integer> triplet = new ArrayList<>();
                            triplet.add(list[i]);
                            triplet.add(list[j]);
                            triplet.add(list[k]);
                            returnedList.add(triplet);
                        }
                    }
                }
            }
            if(returnedList.isEmpty()){
                System.out.print("There are no possible combinations");
            }
            return returnedList;
        }

        public static List<Integer> combineLists(List<List<Integer>> lists) {
            List<Integer> combinedList = new ArrayList<>();

            for (List<Integer> sublist : lists) {
                combinedList.addAll(sublist);
            }

            return combinedList;
        }


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

        public static void main(String[] args) {
            int[] listOne = {9, -18, 0, 3, -9, -7, 5, -2};
            int[] listTwo = {5, -3, 15, -11, 29, -20, -5, 0};
            int[] listThree = {};

            System.out.println("The initial lists are: ");
            System.out.println(Arrays.toString(listOne));

            System.out.println("The lists contains the following combinations for target value: ");
            System.out.println("List One: " + threeSumWithTarget(listOne, 0));
            System.out.print("List Two: ");
            System.out.println(threeSumWithTarget(listTwo, 2));
            System.out.print("List Three : ");
            System.out.println(threeSumWithTarget(listThree, 0));

            System.out.println("The combined, unsorted lists are: ");
            System.out.println("List One: " + combineLists(threeSumWithTarget(listOne, 0)));
            System.out.println("List Two: " + combineLists(threeSumWithTarget(listTwo, 2)));


            System.out.println("The combined lists, sorted sorted are: ");
            System.out.println("List One: " + Arrays.toString(mergeSort(listOne)));
        }
    }


