package threads;
class OfficeBoy extends Thread{    
	public void run(){    
		for(int i=1;i<5;i++){   
			// the thread will sleep for the 500 milli seconds   
			try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}    
			System.out.println(i);    
		}    
	}    
	public static void main(String args[]){    
		OfficeBoy t1=new OfficeBoy();    
		OfficeBoy t2=new OfficeBoy();    

		t1.start();    
		t2.start();    
	}    
}    