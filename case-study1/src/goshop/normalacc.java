package goshop;

public class normalacc extends shopacc
{
	public float deliverycharges;

	
	public normalacc(int accno, String accname, float charges, float deliverycharges) {
		super(accno, accname, charges);
		this.deliverycharges = deliverycharges;
	}
	
	public void bookproduct(float charges)
	{
		
	}

	@Override
	public String toString() {
		return "normalacc [deliverycharges=" + deliverycharges + ", accno=" + accno + ", accname=" + accname
				+ ", charges=" + charges + "]";
	}
	
}