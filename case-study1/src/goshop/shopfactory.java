package goshop;

public interface shopfactory 
{
	public abstract primeacc  getnewprimeaccount(int accno,String accname,float charges,float isPrime);
	public abstract normalacc getnormalaccount(int accno,String accname,float charges,float deliverycharges);
	gsprimeacc getnewprimeaccount(int accno, String accname, float charges, boolean isPrime);
}