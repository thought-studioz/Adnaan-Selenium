package Testing;

import java.util.Scanner;

public class class1 
{
	public void sum()
	{
		System.out.println("Please enter the value of a and b");
	int a,b;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();
	int c=a+b;
	System.out.println(c);
	}
	public static void main(String[] args) {
		{
			class1 obj=new class1();
			obj.sum();
		}
	}	

	}
	

