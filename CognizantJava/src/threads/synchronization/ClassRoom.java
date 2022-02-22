package threads.synchronization;

public class ClassRoom {
	public static void main(String[] args) {
		Table table = new Table(); //common/shared object b/w ashwin n ayman
		Ashwin ashwin = new Ashwin(table);
		Ayman ayman = new Ayman(table);
		ashwin.start();
		ayman.start();
	}

}
