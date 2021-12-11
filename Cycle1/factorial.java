import java.util.*;
class factorial
{
	public static void main(String[] args)
	{
		int n,i,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number which factorial is to be calculated : ");
		n = sc.nextInt	();
		System.out.print("Factorial of "+n+" = ");
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
