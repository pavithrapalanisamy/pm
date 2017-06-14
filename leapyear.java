package projectass1;
import java.util.Scanner;
public class leapyear {
	public static void main(String args[])
	{
	int year;
	Scanner s=new Scanner(System.in);
	year=s.nextInt();
	System.out.println("enter a year");
	if(year%4==0)
	{
		System.out.println("leap year");
	}
		else
		{
			System.out.println("not a leap year");
		}
	}
	

	}

