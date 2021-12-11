import java.util.Scanner;
class fibonacci
{
	public static void main(String[] args)
	{
		int i;
		int n1=0, n2=1,n3;
		System.out.print("Enter the number of elements of fibonacci series is needed : ");
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		System.out.print("First "+n+" elements of Fibonacci series are ");
		for(i=0;i<n;i++)
		{
			System.out.print(n1+",");
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}			
		System.out.println();
		
	}
}
