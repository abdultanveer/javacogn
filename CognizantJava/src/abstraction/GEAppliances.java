package abstraction;

public class GEAppliances implements SwitchBoardListener{
	
	SwitchBoardListener mySwitchBoardListener = this;
	 public GEAppliances() {
		// mySwitchBoardListener = sbl;
		 
	}

	@Override
	public void switchOne() {
		System.out.println("ge fan is on");
	}

	@Override
	public void switchTwo() {
		System.out.println("ge light is on");
		
	}

	@Override
	public void switchThree() {
		System.out.println("ge AC is on");
		
	}

	@Override
	public void switchFour() {
		System.out.println("ge bell is on");
		
	}

}
