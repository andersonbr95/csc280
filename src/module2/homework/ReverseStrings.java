package module2.homework;

import java.util.Stack;

public class ReverseStrings {

    public static void main(String[] args){
        String myString = "hello";
        String reversedString = reverseString(myString);

        System.out.println(reversedString);
        //Expected Output 'olleh'
    }

    /*TODO HOMEWORK CREATE THIS METHOD USING STACKS*/
    private static String reverseString(String myString) {
        Stack<Character> stack = new Stack<>();
        char[] characterArray = myString.toCharArray();
        for(int i = 0; i < characterArray.length; ++i)    {
            char stringChar = characterArray[i];
            stack.push(stringChar);
        }
        String revString = "";
        while(!stack.isEmpty()) {
            revString += stack.pop();
        }
        return revString;
    }

}
