package callback;

public class Me {
	
	public static void main(String[] args) {
		OfficeBoy officeboy = new OfficeBoy();
		MobilePhone iPhone = new Accountant();
		officeboy.doWork(iPhone);
	}

}
