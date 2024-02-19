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
        GenericStack<Character> stack = new GenericStack<>(myString.charAt(0));

        StringBuilder reversedString = new StringBuilder();

        stack.pop();
        for(char c: myString.toCharArray()){
            stack.push(c);
        }

        while(!stack.isEmpty()){
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }

}
