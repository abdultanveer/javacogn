package lamdas;

public class LifeB4Lamdas {
	
	public static void main(String[] args) {
		//life b4 lamdas
		Printable printable = new PrintableImpl();
		printable.print("my content");
		//after lamdas 
		Printable mPrintable = (content) -> {System.out.println("printing something new from lamdas"+content);};
		mPrintable.print("lamda content");
	}

}
