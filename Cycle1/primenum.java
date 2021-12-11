import java.util.Scanner;
class primenum
{
    public static void main(String[] args)
    {
        int num,i,flag=0;
        System.out.print("Enter a number : ");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
		if(num<=1)
			flag=1;
		else
		{
        for( i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                flag=1;
                break;
            }
        }
		}
        if(flag==0)
        {
            System.out.println(num+" is a prime");
        }
        else
        {
            System.out.println(num+" is not a prime number");
        }
    }
}
