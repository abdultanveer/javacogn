package threads.synchronization;

public class Ashwin extends Thread{
	Table table;
	
	public Ashwin(Table mTable) {
		table = mTable;
	}

	@Override
	public void run() {
		super.run();
		table.printTable(5);
	}
}
