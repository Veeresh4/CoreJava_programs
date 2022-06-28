package assignment4;

import java.util.function.Predicate;

public class PredicateDemo 
{

	public static void main(String[] args) 
	{		
		Predicate<String> stringChecker = str -> str.isEmpty();
		  String s = "Hello";
		  boolean result = stringChecker.test(s);
		  System.out.println(s+" is empty:"+result);

	}

}