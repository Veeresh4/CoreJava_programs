package controlstatements;

public class nestedif {
	
	public static void main(String[] args) {
		
		    int a = 18, b = 12, c = 16, largest;
		    if (a >= b) {
		    	if (a >= c) {
		    		largest = a; }
		    	else {
		    		largest = c;}
		    	}
		    else {
		    	if (b >= c) {
		    		largest = b; }
		    	else {
		    		largest = c; }
		    	}
		    System.out.println("Largest Number: " + largest);
		    }
}