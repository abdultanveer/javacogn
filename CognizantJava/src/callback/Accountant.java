package callback;

public class Accountant implements MobilePhone{

	@Override
	public void onSuccess() {
		System.out.println("im paying on gpay");
	}

	@Override
	public void onFailure() {
		// TODO Auto-generated method stub
		
	}

}
