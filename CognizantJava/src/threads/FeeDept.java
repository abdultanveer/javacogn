package threads;

public class FeeDept  extends Thread{
	
	@Override
	public void run() {
		super.run();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("this is being printed concurrently");
		System.out.println("getting signature from the fee dept");
	}

}
