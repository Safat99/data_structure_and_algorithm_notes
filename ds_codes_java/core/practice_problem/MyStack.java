package data_structure_and_algorithm_notes.ds_codes_java.core.practice_problem;


import java.util.PriorityQueue;
import java.util.Queue;

/** Problem name: Implementing Stack using Queues
 *
 *
 *
 */
public class MyStack {

    int capacity = 100;
    int[] ourQueue = new int[capacity];
    int front = 0, rear = -1, totalItem = 0;

    public MyStack() {

    }

    public void push(int x) {

        if (isFull())
            return;


    }

    public int pop() {

        return -1;
    }

    public int top() {

        return -1;

    }

    public boolean empty() {

        return totalItem == 0;
    }

    boolean isFull() {

        return totalItem == capacity;
    }
}