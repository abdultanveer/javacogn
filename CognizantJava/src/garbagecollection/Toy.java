package garbagecollection;

public class Toy {
	String toyName;
	
	void drive() {
		//created some objects
		System.out.println("driving");
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("remove batteries to recycle it");
	}

}
