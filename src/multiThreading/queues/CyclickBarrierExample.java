
package multiThreading.queues;

import java.util.concurrent.CyclicBarrier;

/**
 * @author Vishnu Garg
 * @created On Jul 10, 2018
 *
 */
public class CyclickBarrierExample {
	  public static void main(String[] args) throws Exception {
		  Runnable barrier1Action = new Runnable() {
			    public void run() {
			        System.out.println("BarrierAction 1 executed ");
			    }
			};
			Runnable barrier2Action = new Runnable() {
			    public void run() {
			        System.out.println("BarrierAction 2 executed ");
			    }
			};

			CyclicBarrier barrier1 = new CyclicBarrier(2, barrier1Action);
			CyclicBarrier barrier2 = new CyclicBarrier(2, barrier2Action);

			CyclicBarrierRunnable barrierRunnable1 =
			        new CyclicBarrierRunnable(barrier1, barrier2);

			CyclicBarrierRunnable barrierRunnable2 =
			        new CyclicBarrierRunnable(barrier1, barrier2);

			new Thread(barrierRunnable1).start();
			new Thread(barrierRunnable2).start();
	  }

		  
}

