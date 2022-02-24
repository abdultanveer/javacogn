package exceptions;

import java.io.IOException;

public class UncheckedExceptionPropogation {
	
	public void m() throws IOException {
		//int d = 50/0;
	    throw new java.io.IOException("device error");//checked exception  
	    //either handle this exception here itself by surrounding the above statement with try catch block
	    //or inform the caller [method n] that if you consume m, m might throw an IOException be ready to handle it
	}
	public void n() throws IOException {
		m();
	}
	
	public void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled in p");
		}
	}

	public static void main(String[] args) {
		UncheckedExceptionPropogation uep = new UncheckedExceptionPropogation();
		uep.p();
		
		//uep.m();
	}

}
