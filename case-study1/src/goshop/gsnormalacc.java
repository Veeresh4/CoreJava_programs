package goshop;

public class gsnormalacc extends normalacc
{
	public float deliverycharges=50;
	public gsnormalacc(int accno, String accname, float charges, float deliverycharges) {
		super(accno, accname, charges, deliverycharges);
		// TODO Auto-generated constructor stub
	}
	public void bookproduct(float charges)
	{
		System.out.println("Dear normal user your project charges are" +charges+ "with deliverycharges"+deliverycharges);
	}
	@Override
	public String toString() {
		return "gsnormalacc [deliverycharges=" + deliverycharges + ", accno=" + accno + ", accname=" + accname
				+ ", charges=" + charges + "]";
	}	
}