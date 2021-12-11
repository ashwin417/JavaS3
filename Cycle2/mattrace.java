import java.util.*;
class mattrace
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		int i,j;
		for(i=0; i<n; i++)
		{
			for( j=0; j<n ; j++)
			{
				a[i][j] = sc.nextInt();  
			}
		}
		
		
		int sum = 0;		
		for(i=0; i<n; i++)
		{
			for( j=0; j<n ; j++)
			{
				if(i==j)
				{
					sum = sum + a[i][j];
				}
			}
		}
		
		System.out.println(sum);
		
	}
}
