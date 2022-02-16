package threads;

public class Classroom {
	
	public static void main(String[] args) {
		Friend jhon = new Friend("jhon");
		Friend kenneth = new Friend("kenneth");
		Friend tyler = new Friend("tyler");
		
		jhon.start();
		
		/*
		 * try { jhon.join(); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
		
		
		kenneth.start();
		tyler.start();

	}

}
