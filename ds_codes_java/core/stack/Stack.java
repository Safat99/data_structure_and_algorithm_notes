package data_structure_and_algorithm_notes.ds_codes_java.core.stack;

import java.util.Arrays;

public class Stack {

    int capacity = 3;
    int[] integers = new int[capacity];
    int point = -1;

    public Stack() {
    }

    public Stack(int[] integers) {
        this.integers = integers;
    }

    void push(int value) {
        if (capacity - 1 > point) {
            point++;
            integers[point] = value;
            System.out.println("Successfully added: " + value);
            System.out.println("Stack is now: " + Arrays.toString(integers));
            System.out.println();
        } else {
            System.out.println("Exception!! Stack Overflow");
        }
    }

    int pop() {
        if (point < 0) {
            System.out.println("Exception!! cannot pop from an empty stack");
            return -1;
        }

        int popTemp = integers[point];
        integers[point] = 0;
        point--;
        return popTemp;
    }

    int peek() {
        if (point < 0) {
            System.out.println("Exception!! Stack Underflow");
            return -1;
        }
        return this.integers[point];
    }

    public static void main(String[] args) {
        System.out.println("Implenting my stack");

        Stack newStack = new Stack();
        newStack.peek();
        newStack.pop();

        newStack.push(4);
        newStack.push(5);
        newStack.push(6);
        newStack.push(7);

        System.out.println("peek returned: " + newStack.peek());

        System.out.println("pop deleted: " + newStack.pop());
        System.out.println("pop deleted: " + newStack.pop());
        System.out.println("now the stack is: " + Arrays.toString(newStack.integers));

        System.out.println("pop deleted: " + newStack.pop());
        System.out.println("now the stack is: " + Arrays.toString(newStack.integers));
    }
}
