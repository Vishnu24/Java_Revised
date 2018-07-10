
package multiThreading.queues;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Vishnu Garg
 * @created On Jul 10, 2018
 *
 */
public class BlockingQueueImplementation {

	private List queue = new LinkedList();
	private int limit = 10;

	public BlockingQueueImplementation(int limit) {
		this.limit = limit;
	}

	public synchronized void enqueue(Object item) throws InterruptedException {
		while (this.queue.size() == this.limit) {
			wait();
		}
		if (this.queue.size() == 0) {
			notifyAll();
		}
		
		this.queue.add(item);
	}

	public synchronized Object dequeue() throws InterruptedException {
		while (this.queue.size() == 0) {
			wait();
		}
		if (this.queue.size() == this.limit) {
			notifyAll();
		}
		return this.queue.remove(0);
	}

}
