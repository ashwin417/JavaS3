import java.util.*;
class sumarray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements ? ");
		int sum=0,n = sc.nextInt();
		System.out.println("Enter the elements : ");
		int[] a = new int[50];
		for(int i=0;i<n;i++)
			{
				a[i] = sc.nextInt();
				sum = sum + a[i];
			}
		System.out.print("Sum is "+sum);
	}
}
