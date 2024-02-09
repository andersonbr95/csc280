package module2.homework;

import java.util.*;

public class ReverseStrings {

    public static void main(String[] args) {
        String myString = "hello";
        String reversedString = reverseString(myString);

        System.out.println(reversedString);
        //Expected Output 'olleh'


        /*TODO HOMEWORK CREATE THIS METHOD USING STACKS*/


        Stack<Character> stack = new Stack<>();
        for (char c : myString.toCharArray()) {
            stack.push(c);
        }

        String rvs = "";

        while (!stack.isEmpty()) {
            rvs += stack.pop();
        }

        System.out.println(rvs);
    }




    private static String reverseString(String myString) {
        return "";
    }

}
