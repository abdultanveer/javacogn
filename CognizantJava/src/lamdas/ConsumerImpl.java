package lamdas;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<String>{

	@Override
	public void accept(String message) {
		System.out.println(message);
	}

}
