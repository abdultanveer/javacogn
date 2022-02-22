package threads.synchronization;

public class JointAccount {
	int amount = 10000;

	synchronized void withDraw(int wAmount) {
		if(amount < wAmount) {
			System.out.println(Thread.currentThread().getName()+"--Less balance; waiting for deposit...");    
			try {
				wait();  // i am asking tyler to wait
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		amount = amount - wAmount;
		System.out.println(Thread.currentThread().getName()+"--withdraw completed...");    
	}

	synchronized void deposit(int dAmount) {
		System.out.println(Thread.currentThread().getName()+"--going to deposit...");    

		amount = amount + dAmount;
		System.out.println(Thread.currentThread().getName()+"--deposit completed... ");    
		notify();

	}

}
