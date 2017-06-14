package vowel;
import java.io.*;
import java.util.Scanner;

public class vowels {
	public static void main(String args[]){
		char ch;
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
		if((ch>='a'||ch<='z')&&(ch>='A'||ch<='Z'))
	{
		System.out.println("alphabet");
	}
		
	else
	{
		System.out.println("not");		
	}
}
	}
