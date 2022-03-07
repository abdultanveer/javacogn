package lamdas;

public class LifeB4Lamdas {
	
	public static void main(String[] args) {
		//life b4 lamdas
		Printable printable = new PrintableImpl();
		printable.print("my content");
		//after lamdas 
		Printable mPrintable = (abc) -> {System.out.println("printing something new from lamdas"+abc);};
		mPrintable.print("--lamda content");
		//method reference
		Printable aPrintable = Ayman::writeCode;
		aPrintable.print("--s/w requirement");
	}

}

class Ayman{
	static void writeCode(String requirement) {
		System.out.println("ayman is writing the code"+ requirement);
	}
}