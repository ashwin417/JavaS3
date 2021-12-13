import java.util.*;
class matmult
{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int p = sc.nextInt();
		int q = sc.nextInt();
		int[][] a = new int[m][n];
		int[][] b = new int[p][q]; 
		int i,j,k;
		if(n==p)
		{
		for(i=0; i<m; i++)
		{
			for( j=0; j<n ; j++)
			{
				a[i][j] = sc.nextInt();  
			}
		}
		for(i=0; i<p; i++)
		{
			for( j=0; j<q ; j++)
			{
				b[i][j] = sc.nextInt();  
			}
		}
		
		int sum;
		int[][] pt = new int[m][q];
		
		for(i=0; i<m; i++)
		{
			for( j=0; j<q ; j++)
			{
				sum = 0;
				for(k = 0; k<n ; k++)
				{
					sum += a[i][k]*b[k][j];
					
				}
				pt[i][j]= sum;
			}
		}
		for(i=0; i<m; i++)
		{
			for( j=0; j<q ; j++)
			{
				System.out.print(pt[i][j]+ " ");
			}
			System.out.println();
		}
		}
		else
			System.out.println("Multiplication not possible");
	}
}
