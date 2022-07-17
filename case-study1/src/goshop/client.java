package goshop;

public class client {

	public static void main(String[] args) {
		//step a
		gsshopfactory gssfactory=new gsshopfactory();
		gssfactory.getnewprimeaccount(101,"xyz", 10000,true);
		gssfactory.getnormalaccount(102, "abc", 875637, 50);
		
		//step b
		gsprimeacc gsprime=new gsprimeacc(101,"xyz", 10000,true);
 
		//step c
		gsnormalacc gsnormal=new gsnormalacc(102, "abc", 875637, 50);
		
		//step d
		gsprime.bookproduct(10000);
		gsnormal.bookproduct(875637);
		
		//step e
		gsprime.toString();
		gsnormal.toString();
	}

}