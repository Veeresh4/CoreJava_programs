package goshop;

public class gsshopfactory implements shopfactory{

	@Override
	public gsprimeacc getnewprimeaccount(int accno, String accname, float charges, boolean isPrime) {
		gsprimeacc gsprime=new gsprimeacc(accno,accname,charges,isPrime);
		return gsprime;
	}

	@Override
	public gsnormalacc getnormalaccount(int accno, String accname, float charges, float deliverycharges) {
		normalacc gsnormal=new normalacc(accno,accname,charges,deliverycharges);
		return (gsnormalacc) gsnormal;
	}

	@Override
	public primeacc getnewprimeaccount(int accno, String accname, float charges, float isPrime) {
		// TODO Auto-generated method stub
		return null;
	}

}