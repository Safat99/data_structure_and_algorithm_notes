package data_structure_and_algorithm_notes.ds_codes_java.core.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueBuiltInExample {

    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>(1);

        queue.add("safat");
        queue.add("rafat");
//        queue.add('rabi');
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue.peek());

    }
}
