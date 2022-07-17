package goshop;

public class primeacc extends shopacc
{
	public boolean isPrime;

	
	public primeacc(int accno, String accname, float charges,boolean isPrime) {
		super(accno, accname, charges);
		this.isPrime = isPrime;
	}

	public void bookproduct(float charges)
	{
		
	}

	@Override
	public String toString() {
		return "primeacc [isPrime=" + isPrime + ", accno=" + accno + ", accname=" + accname + ", charges=" + charges
				+ "]";
	}

	
	}
	
	

