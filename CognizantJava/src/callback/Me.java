package callback;

public class Me {
	
	public static void main(String[] args) {
		System.out.println("abdul needs to leave for airport");
		MobilePhone iPhone = new Accountant();

		OfficeBoy officeboy = new OfficeBoy(iPhone);
		officeboy.start();
		
		//officeboy.doWork(iPhone);
		System.out.println("abdul has left for airport");
	}

}
