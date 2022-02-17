package abstraction;

public class OtherAppliances implements SwitchBoardListener{
	SwitchBoardListener myBoardListener;
	public OtherAppliances() {
		myBoardListener = new GEAppliances();
	}

	@Override
	public void switchOne() {
		myBoardListener.switchOne();
	}

	@Override
	public void switchTwo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchThree() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchFour() {
		// TODO Auto-generated method stub
		
	}

}
