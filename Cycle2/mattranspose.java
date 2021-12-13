import java.util.*;
class mattranspose
{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Matrix :");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] a = new int[m][n];
		int[][] c = new int[n][m];
		
		int i,j;
		System.out.println("Enter the elements of array");
		for(i=0; i<m; i++)
		{
			for( j=0; j<n ; j++)
			{
				a[i][j] = sc.nextInt();  
			}
		}
		System.out.println("The matrix entered is ");
		for( i=0; i<m; i++)
		{
			for( j=0; j<n ; j++)
			{
				System.out.print(a[i][j]+ " ");				
			} System.out.println();
		}
		for(i=0; i<m; i++)
		{
			for( j=0; j<n ; j++)
			{
				c[j][i] = a[i][j];  
			}
		}
		System.out.println("Transpose of the entered Matrix is ");
		for( i=0; i<n; i++)
		{
			for( j=0; j<m ; j++)
			{
				System.out.print(c[i][j]+ " ");				
			} System.out.println();
		}
		
	}
}
