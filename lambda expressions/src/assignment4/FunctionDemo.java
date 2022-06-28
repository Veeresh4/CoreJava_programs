package assignment4;

import java.time.LocalDate;
import java.util.function.Function;

public class FunctionDemo 
{

	public static void main(String[] args) 
	{
        
		Function<LocalDate,Integer> yearRetriever = date -> date.getYear();
		  LocalDate today = LocalDate.now();
		  System.out.println("Year corresponding to "+today+" is "+yearRetriever.apply(today));

	}

}