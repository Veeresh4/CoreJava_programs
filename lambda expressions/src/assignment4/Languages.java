package assignment4;

import java.util.Set;

public class Languages 
{

	public static void main(String[] args) 
	{
		
				Set<String> Languages = Set.of("Java","Ruby","Python","C");
				Languages.forEach(Language -> System.out.println("language is:"+Language));

	}

}