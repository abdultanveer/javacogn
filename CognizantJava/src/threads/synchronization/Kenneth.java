package threads.synchronization;

public class Kenneth extends Thread{
	JointAccount account;

	public Kenneth(JointAccount jointAccount, String threadName) {
		super(threadName);

		account = jointAccount;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		account.deposit(10000);
	}

}
