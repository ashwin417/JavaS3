// Little complicated program of factorial and sum

import java.util.*;
class facsum
{
	static int op,a;
	public static void main(String[] args)
	{
		facsum f = new facsum();
		f.Input();

		if(op==1)
			f.factorial();
		else if(op==2)
			f.sumdig();
        else
            return;

	}
	void Input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the option :");
		System.out.println("1. Factorial");
		System.out.println("2. Sum of Digits \n3.None ");
		System.out.print("Enter your choice 1,2 or 3? ");
		op = sc.nextInt();
		switch(op)
		{
			case 1 : System.out.print("Enter the number whose factorial has to be found : ");
					a = sc.nextInt();
					break;
			case 2 :System.out.print("Enter the number whose Sum of digits has to be found : ");
					a= sc.nextInt();
					break;
            case 3 : System.out.print("You chose none");
                        break;
			default : System.out.println("Wrong option ");
						break;
		}
		
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
		while(a>0)
		{
			sum = sum + (a%10);
			a=a/10;
		}	  
		System.out.println("Sum of digit of number entered is " +sum);
	}
}
