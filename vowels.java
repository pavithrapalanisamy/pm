package vowel;
import java.io.*;
import java.util.Scanner;

public class vowels {
	public static void main(String args[]){
		char ch;
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
		System.out.println("vowels");
	}
		
	else
	{
		System.out.println("consonants");		
	}
}
	}
