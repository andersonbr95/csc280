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
        StringBuilder reversedString = new StringBuilder();
        char[] charArray = myString.toCharArray();
        GenericStack<Character> stackOfChars = new GenericStack<>(charArray[0]);

        for(int i = 1; i < myString.length(); i++) {
            stackOfChars.push(myString.charAt(i));
        }

        while(!stackOfChars.isEmpty()) {
            reversedString.append(stackOfChars.peek());
            stackOfChars.pop();
        }

        return reversedString.toString();
    }
}
