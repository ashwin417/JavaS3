import java.util.*;
class pdrome
{
    public static void main(String[] args)
    {
        int a,temp,rem,s=0;
        System.out.print("Enter a number :");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        temp = a;
        while(a>0)
        {
            rem=a%10;
            s=(s*10)+rem;
            a=a/10;
        }
        if(temp==s)
        {
            System.out.println(temp+" is  palindrome");
        }
        else
        {
            System.out.println(temp+" is not  palindrome");
        }
        
    }
}
