package deque;
import java.util.Deque;
import java.util.ArrayDeque;
public class Deque2 {
	 
	    public static void main(String[] args) {
	        Deque<Integer> fifoQueue = new ArrayDeque<>();

	        // Enqueue elements
	        fifoQueue.offerLast(1);
	        fifoQueue.offerLast(2);
	        fifoQueue.offerLast(3);

	        // Dequeue elements
	        while (!fifoQueue.isEmpty()) {
	            System.out.println(fifoQueue.pollFirst()); // Output: 1 2 3
	        }
	    }
	}


