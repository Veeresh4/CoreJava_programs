package operators;

public class unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=29;
		int y=33;
		int a,b,c;
		
		System.out.println("Before increment "+x);
		a=++x;
		c=+x;
		System.out.println("After increment "+a);
		System.out.println("value is " +c);
		
		System.out.println("Before decrement "+y);
		b=--y;
		c=-y;
		System.out.println("After decrement "+b);
		System.out.println("value is " +c);

	}

}