package abstraction;

public class AnchorAppliances implements SwitchBoardListener{

	@Override
	public void switchOne() {
		System.out.println("anchor fan is on");
	}

	@Override
	public void switchTwo() {
		System.out.println("anchor light is on");
		
	}

	@Override
	public void switchThree() {
		System.out.println("anchor AC is on");
		
	}

	@Override
	public void switchFour() {
		System.out.println("anchor bell  is on");
		
	}

}
