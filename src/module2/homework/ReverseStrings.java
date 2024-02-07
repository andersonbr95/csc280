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
//        String reversedString = "";
        char[] charArray = myString.toCharArray();
        int arrIndex = 0;
        GenericStack<Character> stackOfChars = new GenericStack<>(charArray[0]);

        for(int i = 1; i < myString.length(); i++) {
            stackOfChars.push(myString.charAt(i));
        }

        while(!stackOfChars.isEmpty()) {
            charArray[arrIndex] = stackOfChars.peek();
            stackOfChars.pop();
            arrIndex++;
        }
        return new String(charArray);
    }

}
