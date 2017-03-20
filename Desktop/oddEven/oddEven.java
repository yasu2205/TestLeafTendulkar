package day1;
import java.util.Scanner;
public class OddEven {
	public static void main(String[] args) {
		try{
		int n;
		System.out.println("Enter an Integer");
		Scanner oe = new Scanner(System.in);
		n = oe.nextInt();
		if((n>=100 && n<=200))
		{
			OddEve(n);
		}
		else
		{
			System.out.println("out of range");
		}
		}
		catch(Exception e) 
		{
		    System.out.println("I/O Error");
		    System.exit(0);
		 }
	}
public static void OddEve(int a)
{
	for(a=100;a<201;a++)
	{
	if(a%2==0)
	{
	System.out.print(a+" ,");
	}
	else
	{
		//System.out.println("Odd Number");
	}
	}
}
}