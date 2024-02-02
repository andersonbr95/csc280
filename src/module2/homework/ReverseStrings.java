package module2.homework;

import module2.stack.GenericStack;

public class ReverseStrings {

    public static void main(String[] args){
        String myString = "hello";
        String reversedString = reverseString(myString);

        System.out.println(reversedString);
        //Expected Output 'olleh'
    }

    /*TODO HOMEWORK CREATE THIS METHOD USING STACKS*/
    private static String reverseString(String myString) {
        GenericStack charStack = new GenericStack(myString.charAt(0));

        /*
        alternatively:
        for(char C : myString.toCharArray()) charStack.push(C);
        but didn't think it was possible to create a stack without parameter since its a generic stack
         */

        //since genericstack requires parameter upon creation use charat 0 and add char 1 to length through push
        for(int i = 1; i < myString.length(); i++) {
            charStack.push(myString.charAt(i));
        }

        String reversedString = "";

        while(!charStack.isEmpty()) {
            reversedString += charStack.pop();
        }


        return reversedString;
    }

}
