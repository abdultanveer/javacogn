package inheritance;
 class Animal{ 
	
	Animal(){System.out.println("animal is created");}  

	
	 void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
	final int age = 2;
	
	Dog(){  
		//super();  
		System.out.println("dog is created"); 
		//age = 3;
		}
	
	
	void eat(){System.out.println("eating bread...");}  
	void bark(){System.out.println("barking...");}  
	void work(){  
		eat();  
		bark();  
	}  
}  
