// Simple Program to find factorial and sum in a class

import java.util.*;
class factorialsum
{
	static int a,b;
	public static void main(String[] args)
	{
		factorialsum f = new factorialsum();
		f.Input();

			f.factorial();
			f.sumdig();

	}
	void Input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number whose factorial has to be found : ");
        a = sc.nextInt();
        System.out.print("Enter the number whose Sum of digits has to be found : ");
        b= sc.nextInt();



	}
	void factorial()
	{
		int i,fact=1;
		for(i=1;i<=   a;i++)
			fact = fact * i;
		System.out.println("factorial is " + fact);
	}
	void sumdig()
	{
		int sum = 0;
		while(b>0)
		{
			sum = sum + (b%10);
			b=b/10;
		}
		System.out.println("Sum of digit of number entered is " +sum);
	}
}
