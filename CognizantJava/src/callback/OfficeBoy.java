package callback;

public class OfficeBoy {

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
