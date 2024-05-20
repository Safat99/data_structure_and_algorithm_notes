package data_structure_and_algorithm_notes.ds_codes_java.core.queue;

public class QueueImplementation {

    private static final int capacity = 5;

    int[] ourQueue = new int[capacity];
    int front = 0, rear = -1, totalItem = 0;

    boolean isFull() {
        return totalItem == capacity;
    }

    boolean isEmpty() {
        return totalItem == 0;
    }

    void enqueue(int item) {

        if (isFull()) {
            System.out.println("Sorry the Queue is full");
            return;
        }

        rear = (rear + 1) % capacity; // for circular queue
        ourQueue[rear] = item;
        totalItem++;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Sorry, the Queue is already empty");
            return -99999;
        }

        int output = ourQueue[front];
        ourQueue[front] = -1; // -1 means this item has been deleted
        front = (front + 1) % capacity;
        totalItem--;
        return output;
    }

    void printQueue() {
        for (int i = 0; i < capacity; i++) {
            System.out.printf("%d ", ourQueue[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueImplementation queue = new QueueImplementation();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.printQueue();

        System.out.println("Dequeue = " + queue.dequeue());
        queue.printQueue();
    }


}
