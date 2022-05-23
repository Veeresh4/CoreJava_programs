package sampleprograms;

public class VarDemo {
	int a=20;
	int b=30;
	int c=a+b;
	static int d=25;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e=12;
		VarDemo obj= new VarDemo();
		System.out.println("instance variable "+obj.c);
		System.out.println("static variable "+VarDemo.d);
		System.out.println("local variable "+e);

	}

}
