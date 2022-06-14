package assignment3;
import java.util.LinkedHashMap;

public class linkedhasmap {
	
		public static void main(String[] args) {
	        // Creating a LinkedHashMap of even numbers
	        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();
	        evenNumbers.put("Two", 2);
	        evenNumbers.put("Four", 4);
	        System.out.println("LinkedHashMap1: " + evenNumbers);

	        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>(evenNumbers);
	        numbers.put("Three", 3);
	        System.out.println("LinkedHashMap2: " + numbers);
	        int value = numbers.remove("Two");
	        System.out.println("Removed value: " + value);

	        boolean result = numbers.remove("Three", 3);
	        System.out.println("Is the entry Three removed? " + result);
	        System.out.println("Updated LinkedHashMap: " + numbers);
	    }

	}