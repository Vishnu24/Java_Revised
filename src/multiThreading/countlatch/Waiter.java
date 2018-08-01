
package multiThreading.countlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author Vishnu Garg
 * @created On Jul 10, 2018
 *
 */
public class Waiter implements Runnable{

    CountDownLatch latch = null;

    public Waiter(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Waiter Released");
    }
}


