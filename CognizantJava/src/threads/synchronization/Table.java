package threads.synchronization;

public class Table {
	
	void printTable(int multiplier) {
		System.out.println("this area anybody can enter --"+Thread.currentThread().getName());
		
		synchronized(this){
		for (int i=1; i< 6; i++) {
		try {
			System.out.println(i*multiplier);
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}

}
