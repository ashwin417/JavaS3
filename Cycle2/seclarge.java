import java.util.*;
class seclarge
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements: ");
		int n = sc.nextInt();
		int i;
		System.out.print("Enter the elements : ");
		int[] a = new int[50];
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int large;
		int sec ;
		if(a[0]<a[1])
		{
			large = a[0];
			sec = a[1];
		}
		else
		{
			large=a[1];
			sec = a[0];
		}
		for(i=0;i<n;i++)
		{
			if(a[i]>large)
			{
				sec = large;
				large = a[i];
			}
			else if (a[i] > sec) 
			{sec = a[i];}
		}
		System.out.println("The second largest element is " +sec);
	}
}
