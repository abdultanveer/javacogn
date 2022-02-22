package threads.synchronization;

public class Table {
	
synchronized	void printTable(int multiplier) {
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
