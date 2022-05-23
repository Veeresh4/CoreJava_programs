package operators;

public class logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=25;
		int y=30;
		int a=12;
		int b=16;
		System.out.println((x>y)&&(x>y));
		System.out.println((x<y)&&(x<y));
		System.out.println((x<y)&&(x>y));
		System.out.println((x>y)&&(x<y));
		
		System.out.println((a>b)||(a>b));
		System.out.println((a<b)||(a<b));
		System.out.println((a<b)||(a>b));
		System.out.println((a>b)||(a<b));
		
		System.out.println(!(x>y));
		System.out.println(!(x<y));
		System.out.println(!(a>b));
		System.out.println(!(a<b));
		System.out.println(!(x==y));
		System.out.println(!(a==b));
		
	}

}