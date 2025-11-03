import java.util.PriorityQueue;
import java.util.Comparator;

public class InversePriority {
    public static void main(String[] args) {
        // Create a max-heap by reversing the comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        maxHeap.offer(10);
        maxHeap.offer(50);
        maxHeap.offer(20);
        maxHeap.offer(40);

        System.out.println("Max-Heap PriorityQueue: " + maxHeap);

        while (!maxHeap.isEmpty()) {
            System.out.println("Polled: " + maxHeap.poll());
        }
    }
}
