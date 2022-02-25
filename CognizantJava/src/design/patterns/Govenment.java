package design.patterns;

public class Govenment {
	public static void main(String[] args) {
		PostOffice postoffice = new PostOffice();
		Person chris = new Person("Chris");
		Person john = new Person("John");
		
		//chris n john were bugging/polling the post office
		chris.checkArrivalTheirPassport(null);
		john.checkArrivalTheirPassport(null);
		
		//post office was angry and asked them to leave[register] their ph nos
		postoffice.subscribe(chris);
		postoffice.subscribe(john);
		
		Passport passport = new Passport("John", "johns address", "You've got a secret passport");
		postoffice.ppOfficeSendsaPPPostOffice(passport);


	}

}
