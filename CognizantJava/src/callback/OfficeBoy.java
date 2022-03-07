package callback;

public class OfficeBoy extends Thread {
	
	MobilePhone uPhone;
	
	 public OfficeBoy(MobilePhone phone) {
		 uPhone = phone;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		doWork(uPhone);
		
	}

	public void doWork(MobilePhone iPhone) {
		System.out.println("i am doing the work");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("i am done with the work--plz pay");
		iPhone.onSuccess();
	}

}
