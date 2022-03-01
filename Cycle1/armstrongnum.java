import java.util.*;
import java.lang.*;
class armstrongnum
{
    public static void main(String[] args)
    {
        int n,rem,sum=0;
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        int temp = n,digit=0;
        while(n>0)
        {
            n = n/10;
            digit++;
        }
        n = temp;
        while(n>0)
        {
            rem=n%10;
            sum+=Math.pow(rem,digit);
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println(temp+" is a armstrong number");
        }
        else
        {
            System.out.println("Not a armstrong");
        }
        
    }
}
