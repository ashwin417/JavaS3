// Simple Program to find factorial and sum in a class

import java.util.*;
class factorialsum
{
	static int a;
	public static void main(String[] args)
	{
		factorialsum f = new factorialsum();

	Scanner sc = new Scanner(System.in);
		System.out.print("1.Fatorial \t 2.Sum of Digits of a Number \nEnter the option :  ");
		int n = sc.nextInt();
		switch(n)
		{
            case 1 : { System.out.print("Enter the number whose factorial has to be found : ");
            a = sc.nextInt();
            f.factorial();
            break;
            }
            case 2 : {
            System.out.print("Enter the number whose Sum of digits has to be found : ");
            a= sc.nextInt();
            f.sumdig();
            break;
            }
        }

	}
	void factorial()
	{
		int i,fact=1;
		for(i=1;i<=a;i++)
			fact = fact * i;
		System.out.println("Factorial is " + fact);
	}
	void sumdig()
	{
		int sum = 0;
		while(a>0)
		{
			sum = sum + (a%10);
			a=a/10;
		}
		System.out.println("Sum of digit of number entered is " +sum);
	}

}
