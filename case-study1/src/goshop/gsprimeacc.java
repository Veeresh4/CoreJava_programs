package goshop;

public class gsprimeacc extends primeacc
{
	public final float charges = 0;
	
	public gsprimeacc(int accno, String accname, float charges, boolean b) {
		super(accno, accname, charges, b);
		// TODO Auto-generated constructor stub
	}
	
	public void bookproduct(float charges)
	{
		System.out.println("Dear prime user your product charges are" +charges);
	}

	@Override
	public String toString() {
		return "gsprimeacc [charges=" + charges + ", isPrime=" + isPrime + ", accno=" + accno + ", accname=" + accname
				+ "]";
	}
	

}