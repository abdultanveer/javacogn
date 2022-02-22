package threads.synchronization;

public class Town {

	public static void main(String[] args) {
		JointAccount jointAccount = new JointAccount();
		Tyler tylerThread = new Tyler(jointAccount,"tyler");
		Kenneth kennethThread = new Kenneth(jointAccount,"kenneth");
		
		tylerThread.start();
		kennethThread.start();
	}
}
