package threads;

public class NocProcess {
	
	public static void main(String[] args) {
		FeeDept myfriend = new FeeDept();
		myfriend.start();
		System.out.println("my friend has started");
		Thread lThread = new Thread(new Labdept());
		lThread.start();
	}

}
