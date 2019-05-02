/*
Adam Anderson
4/30/2019
GenericQueue to go along with exercise 24_05
**/

public class GenericQueue<E> extends java.util.LinkedList<E> {

	// enqueue (add) method
	public void enqueue(E e) {
		addLast(e);
	}
	
	// getSize method
	public int getSize() {
		return size();
	}

	// dequeue (removal) method
	public E dequeue() {
		return removeFirst();
	}
}