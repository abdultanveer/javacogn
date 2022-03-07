package lamdas;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class LifebeforeFuncInterfaces {
	
	public static void main(String[] args) {
		//life before lamdas
		ConsumerImpl consumerImpl = new ConsumerImpl();
		consumerImpl.accept("welcome to functional interfaces");
		
		//life after lamdas
		Consumer<String> consumer;
		consumer = (msg) -> {System.out.println(msg);}; //defination
		consumer.accept("welcome to cognizant");
		
		Consumer<String> methodRefConsumer = SomeClass::printMessage;//method reference
		methodRefConsumer.accept("welcome to android");
		
		//IntPredicate intPredicate = (a) -> { (a>18)?true:false };
		Supplier<Integer> otpSupplier = () -> {return new Random().nextInt(100);};
		otpSupplier.get();
		
		Summable operation = (a,b) -> {return a+b;};
		
	}

	
}

class SomeClass {
	static void printMessage(String note) {
		System.out.println("from printMessage method --"+note);
	}
}
