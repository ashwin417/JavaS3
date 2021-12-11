import java.util.*;
class matadd
{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		int[][] b = new int[n][n]; 
		int i,j;
		for(i=0; i<n; i++)
		{
			for( j=0; j<n ; j++)
			{
				a[i][j] = sc.nextInt();  
			}
		}
		for(i=0; i<n; i++)
		{
			for( j=0; j<n ; j++)
			{
				b[i][j] = sc.nextInt();  
			}
		}
		
		int[][] c = new int[n][n];
		for(i=0; i<n; i++)
		{
			for( j=0; j<n ; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
