package threads;

public class Student implements Runnable{
	
	  	private String fileno;  
	    public Student(String s){  
	        this.fileno=s;  
	    }  

	@Override
	public void run() {
		System.out.println("my name   "+Thread.currentThread().getName()+"entering principals cabin with the fileno"+ fileno);
		getSignature();
		System.out.println(Thread.currentThread().getName()+ " is done with the signature");
	}

	private void getSignature() {
		System.out.println("principal is signing the file");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
	}

}
