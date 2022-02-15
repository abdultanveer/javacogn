package inheritance;

public class DemoTax {
	
	public static void main(String[] args) {
		Gst incomeTax = new Gst();
		int tax = incomeTax.calculateTax(10000);
		System.out.println(tax);
	}

}
