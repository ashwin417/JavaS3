import java.util.*;
class factornum
{
	public static void main(String[] args)
	{
	int num,i;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number whose factors need to be found : ");
	num = sc.nextInt();
	System.out.print("Factors are : ");
	for(i=1;i<=num;i++)
 	{
		if(num%i==0)
  		{
			System.out.print(i+",");
		}
		
	}
	System.out.println();
	}
}
