package queueExa;
import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        // Enqueue (add elements)
        queue.add("Alice");  
        queue.offer("Bob");    // queue.add() or queue.offer() to do the same
        queue.offer("Charlie");

        System.out.println("Initial Queue: " + queue);

        // Peek (see head)
        System.out.println("Head: " + queue.peek());

        // Dequeue (remove from front)
        System.out.println("Removed: " + queue.poll());  //you can also use queue.remove() to do the same
        System.out.println("After removal: " + queue);
    }
}
