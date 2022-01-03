// Program to find frequency and reverse a string

import java.util.*;
class freqrev
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        int n= s.length();
        freqrev f = new freqrev();
        f.freq(n,s);
        f.rev(n,s);
    }
    void freq( int n, String s)
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter the character whose frequency to be measured : ");
        char ch = sc.next().charAt(0);
        for(int i=0; i<n ; i++)
            if(ch == s.charAt(i))
                count++;
        System.out.println("Frequency of "+ch+" is : " +count);
    }
    void rev( int n, String s)
    {
    char x;
    String rvsd="";
    for(int i=n-1;i>=0;i--)
        {
        x=s.charAt(i);
        rvsd+=x;
        }
    System.out.println("Reversed String is : " +rvsd);
    }
}
