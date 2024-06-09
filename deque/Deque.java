package deque;
import java.util.LinkedList;
public class Deque {

	    public static void main(String[] args) {
	        LinkedList<Integer> fifoQueue = new LinkedList<>();

	        // Enqueue elements
	        fifoQueue.offerLast(3);
	        fifoQueue.offerLast(4);
	        fifoQueue.offerLast(5);

	        // Dequeue elements
	        while (!fifoQueue.isEmpty()) {
	            System.out.println(fifoQueue.pollFirst()); // Output: 3 4 5
	        }
	    }
	}


