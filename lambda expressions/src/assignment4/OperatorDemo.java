package assignment4;

interface Operator 
   {
	 public int operate(int num1,int num2);
	}

public class OperatorDemo 
{
	public static void main(String[] args) 
	{
		  Operator op = (num1,num2) -> num1+num2;
		  int sum = op.operate(10,20);
		  System.out.println("sum:"+sum);
		 
		  Operator op2 = (num1,num2) -> num1-num2;
		  int difference = op2.operate(25, 10);
		  System.out.println("Difference:"+difference);
	}
}