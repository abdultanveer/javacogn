package abstraction;

public class Wiring {
	
	public static void main(String[] args) {
		SwitchBoardListener sbl = new GEAppliances();
				//new AnchorAppliances();
		
		sbl.switchOne();
		sbl.switchTwo();
		sbl.switchThree();
		sbl.switchFour();
		int a = 10;
		
		System.out.println((a > 9)? true : false);
	}

}
