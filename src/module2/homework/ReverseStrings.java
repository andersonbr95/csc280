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

        // The Method .toCharArray() will help you loop through the String passed
        //into the argument
        char[] charArray = myString.toCharArray();

        //You’ll want to create a Generic Stack of type ‘Character’.
        Stack<Character> stack = new Stack<>();

        for(char a : charArray) {
            stack.push(a);

        }
        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());


        }
        //return the reversed string.
        return reversed.toString();
    }


}
