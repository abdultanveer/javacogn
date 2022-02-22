package threads.synchronization;

public class Ayman extends Thread{
	Table table;
	
	public Ayman(Table mTable) {
		table = mTable;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		table.printTable(100);
	}
}
