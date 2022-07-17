package goshop;
//abstract public class shopacc
public class shopacc 
{
	public int accno;
	public String accname;
	public float charges;
	
	public shopacc(int accno,String accname,float charges)
	{
		super();
		this.accno = accno;
		this.accname = accname;
		this.charges = charges;
	}
	public void bookproduct()
	{
		
	}
	public void items()
	{
		
	}
	public String toString() {
		return "shopacc [accno="+ accno +". accname="+ accname +". charges="+ charges;
	}
}
