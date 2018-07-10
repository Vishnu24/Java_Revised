
package multiThreading.queues;

import java.util.concurrent.BlockingQueue;

/**
 * @author Vishnu Garg
 * @created On Jul 10, 2018
 *
 */
public class Producer implements Runnable{

    protected BlockingQueue queue = null;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
        	 System.out.println("Producer Puts 1");
            queue.put("1");
           
            Thread.sleep(1000);
            System.out.println("Producer Puts 2");
            queue.put("2");
          
            Thread.sleep(1000);
            System.out.println("Producer Puts 3");
            queue.put("3");
           
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}