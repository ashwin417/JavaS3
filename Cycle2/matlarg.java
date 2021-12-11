import java.util.*;
class matlarg
{
	public static void main(String[] arg){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of the NxN Matrix :");
	int n = sc.nextInt();
	int[][] a = new int[n][n];
	int i,j;
	System.out.println("Enter the elements of array");
	for(i=0; i<n; i++)
	{
		for( j=0; j<n ; j++)
		{
			a[i][j] = sc.nextInt();  
		}
	}
	int large = a[0][0];
	System.out.println("The matrix entered is ");
	for( i=0; i<n; i++)
	{
		for( j=0; j<n ; j++)
		{
			System.out.print(a[i][j]+ " ");
			
			if(large < a[i][j])
			{
				large = a[i][j];	   
			}
			
		} System.out.println();
	}
	System.out.print("Largest element in the matrix is " + large);
	}
}
