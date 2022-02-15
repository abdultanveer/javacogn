package inheritance;

public class Gst extends IncomeTax{
	
	@Override //redefining previous method
	int calculateTax(int income) {
		
		int oldTax = super.calculateTax(income);
		int gst = income/20;
		return oldTax + gst;
	}
	
	
	int calculateLuxuryTax(int luxurySpending) {
		return luxurySpending /100 *3;
	}

}
