package basics;

public class InstanceOfOperator {
	public static void main(String[] args) {
		Dog1 d1 = new Dog1(); 
		d1.name = "german shepherd";
		d1.age = 3;
		Animal animal = new Animal();
		animal.name = "giraffe";
		//Dog1 d = (Dog1) new Animal();//Compilation error  
	    if(d1 instanceof Animal ){  

		d1 = (Dog1) animal;
	    }

	}
}


class Animal{String name;}  
class Dog1 extends Animal{int age;}
//Dog inherits Animal  