package exam1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumWithTarget {

    public static List<List<Integer>> threeSumWithTarget(int[] list, int targetValue){
        List<List<Integer>> returnedList = new ArrayList<>();


        return returnedList;
    }

    public static List<Integer> combineLists(List<List<Integer>> lists) {
        List<Integer> combinedList = new ArrayList<>();


        return combinedList;
    }

    public static void main(String[] args) {
        int[] listOne = {9, -18, 0, 3, -9, -7, 5, -2};
        int[] listTwo = {5, -3, 15, -11, 29, -20, -5, 0};
        int[] listThree = {};

        System.out.println("The initial lists are: ");
        System.out.println(Arrays.toString(listOne));
        System.out.println(Arrays.toString(listTwo));
        System.out.println(Arrays.toString(listThree));

        System.out.println("\nThe lists contains the following combinations for target value: ");
        System.out.println("List One: " + threeSumWithTarget(listOne, 0));
        System.out.print("List Two: ");
        System.out.println(threeSumWithTarget(listTwo, 2));
        System.out.print("List Three : ");
        System.out.println(threeSumWithTarget(listThree, 0));

        System.out.println("\nThe combined, unsorted lists are: ");
        System.out.println("List One: " + combineLists(threeSumWithTarget(listOne, 0)));
        System.out.println("List Two: " + combineLists(threeSumWithTarget(listTwo, 2)));


        System.out.println("\nThe combined lists, sorted sorted are: ");
        System.out.println("List One: " + "Replace this last string with your method call");
    }
}
