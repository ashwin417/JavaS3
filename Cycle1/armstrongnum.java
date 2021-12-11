import java.util.*;
class armstrongnum
{
    public static void main(String[] args)
    {
        int n,rem,sum=0;
        System.out.print("Enter a 3-digit number: ");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        int temp = n;
        while(n>0)
        {
            rem=n%10;
            sum= sum+ (rem*rem*rem);
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
