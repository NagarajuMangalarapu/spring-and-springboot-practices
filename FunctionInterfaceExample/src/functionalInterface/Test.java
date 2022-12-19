package functionalInterface;

import java.util.function.Consumer;

public class Test implements Consumer {
//	
//	public void consumer()
//	{
//		Consumer<Integer> consumer = (x)->System.out.println(x);
//		consumer.consumer(4);
//	}

	@Override
	public void accept(Object t) {
		
		Consumer<Integer> c=(x)->System.out.println(x);
		c.accept(3);
	}
	
	public static void main(String[] args) {
		Test.accept();
	}

}
