import java.util.*;
class elerep
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements");
		int n = sc.nextInt();
		System.out.println("Enter the elements : ");
		int[] a = new int[50];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.print("Enter the element that needed to be replaced : ");
		int r = sc.nextInt();
		System.out.print("Enter the number to replace the element :  ");
		int ne = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==r)
   			{
	   			a[i] = ne;
			}	
		}
		System.out.print("The Array After Replacing :");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+ " ");
		}
	}		
}		
