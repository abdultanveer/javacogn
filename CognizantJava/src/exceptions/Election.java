package exceptions;

public class Election {
	public static void main(String[] args) throws InvalidAgeException {
		int age = 13;
		if(age<18) {
			throw new InvalidAgeException();
		}
	}

}
