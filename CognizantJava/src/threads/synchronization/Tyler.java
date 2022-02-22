package threads.synchronization;

public class Tyler extends Thread {
	JointAccount account;

	public Tyler(JointAccount jointAccount, String threadName) {
		super(threadName);
		account = jointAccount;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		account.withDraw(15000);
	}

}
