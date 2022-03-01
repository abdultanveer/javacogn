package lamdas;

public class LifeB4Lamdas {
	
	public static void main(String[] args) {
		//life b4 lamdas
		Printable printable = new PrintableImpl();
		printable.print();
		//after lamdas 
		Printable mPrintable = () -> {System.out.println("printing something new from lamdas");};
		mPrintable.print();
	}

}
