package garbagecollection;

public class Home {
	
	public static void main(String[] args) {
		Toy rcCar = new Toy(); // i bought my toy
		rcCar = null;  // my kid has thrown it on the road
		System.gc();
	}

}
