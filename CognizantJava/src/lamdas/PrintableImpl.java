package lamdas;

public class PrintableImpl implements Printable {

	@Override
	public void print(String content) {
			System.out.println("printing something new--"+content);
	}

}
