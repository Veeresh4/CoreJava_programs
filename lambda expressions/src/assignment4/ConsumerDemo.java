package assignment4;

import java.util.function.Consumer;

public class ConsumerDemo 
{

	public static void main(String[] args) 
	{
		Consumer<Integer> multiplier = num -> System.out.println(num*num);
		  multiplier.accept(10);
		  multiplier.accept(4);

	}

}