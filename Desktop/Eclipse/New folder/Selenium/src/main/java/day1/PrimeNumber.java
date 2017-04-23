package day1;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
try{
	int n;
	System.out.println("Enter an Integer");
	Scanner Prime = new Scanner(System.in);
	n = Prime.nextInt();
	if((n>=31 && n<=45))
	{
		PrimeCalc(n);
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
	public static void PrimeCalc(int n) {
int i;		
for(i=2;i<n;i++)	
{
	if(n%i==0)
	{
		System.out.println("Not a Prime Number");
		break;
	}
	else if(i==n-1){
		System.out.println("Prime Number");
	}
}
	}

}
