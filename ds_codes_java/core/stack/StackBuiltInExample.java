package data_structure_and_algorithm_notes.ds_codes_java.core.stack;

import java.util.Stack;

public class StackBuiltInExample {

    public static void main(String[] args) {

        Stack<String> myStack = new Stack();

        myStack.push("Bangldadesh");
        myStack.push("Dhaka");

        System.out.println(myStack);

        System.out.println(myStack.pop());
        System.out.println(myStack.peek());

        System.out.println(myStack.size());
        System.out.println(myStack.pop());
    }
}
