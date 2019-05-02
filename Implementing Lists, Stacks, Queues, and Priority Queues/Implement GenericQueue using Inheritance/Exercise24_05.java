/*
Adam Anderson
4/30/2019
(Implement GenericQueue using inheritance) In Section 24.5, Stacks and Queues, GenericQueue is implemented using composition. Define a new queue class that extends java.util.LinkedList.
**/

public class Exercise24_05 {
	public static void main(String[] args) {
		// Create a newQueue
		GenericQueue<String> newQueue = new GenericQueue<>();

		// Add elements to the newQueue
		newQueue.enqueue("Tom"); // enqueue it to the newQueue
		System.out.println("(1) " + newQueue);

		newQueue.enqueue("Susan"); // enqueue it to the the newQueue
		System.out.println("(2) " + newQueue);

		newQueue.enqueue("Kim"); // enqueue it to the newQueue
		newQueue.enqueue("Michael"); // enqueue it to the newQueue
		System.out.println("(3) " + newQueue);

		// Remove elements from the newQueue
		System.out.println("(4) " + newQueue.dequeue());
		System.out.println("(5) " + newQueue.dequeue());
		System.out.println("(6) " + newQueue);

	}
}