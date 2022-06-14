package assignment3;
import java.util.HashMap;

public class hasmap {
	
		public static void main(String[] args) {

		    // create a hashmap
		    HashMap<Integer,String> languages = new HashMap<>();
		    System.out.println("Initial HashMap: " + languages);
		    languages.put(1, "Telugu");
		    languages.put(2, "English");
		    languages.put(3, "Spanish");		    
		    System.out.println("HashMap: " + languages);
		    
		    String value = languages.get(1);		    
		    System.out.println("Value at index 1: " + value);
		    System.out.println("HashMap: " + languages);
		    System.out.println("Keys: " + languages.keySet());
		    System.out.println("Values: " + languages.values());
		    System.out.println("Key/Value mappings: " + languages.entrySet());
		    
		    languages.replace(2, "C++");		    
		    System.out.println("HashMap using replace(): " + languages);
		    
		    String value1 = languages.remove(2);
		    System.out.println("Removed value: " + value1);
		    System.out.println("Updated HashMap: " + languages);
		  }
}