import java.util.*;
class freq
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String to check the Frequency: ");
		String a = sc.nextLine();
		int n = a.length();
		a = a.toLowerCase();
		int[] f = new int[n];
		int[] flag = new int[n];
		
		int i,j;
		char x,y;
		for(i = 0; i<n ; i++)
		{
			flag[i] =0;
		}
		for(i = 0; i<n ; i++)
		{
			f[i]=1;
			for(j=i+1;j<n;j++)
			{
				x=a.charAt(i);
				y=a.charAt(j);
				if(x==y)
				{
					if(x==' ' && y==' ')
					{ 
						flag[j]=-1;
						f[i]=0;
					}
	 				else
					{
					f[i]++;
					flag[j]=1;
						
					}
						
					
				}
			}
			
		}
		for(i=0; i<n; i++){
			if(flag[i]==0 && f[i]!=0)
			{ System.out.println(a.charAt(i)+" is "+ f[i]);}}
	}
}
