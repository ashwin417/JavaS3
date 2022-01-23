//Program to input and display details of students using main class

import java.util.*;
class stud
{
    int rollno;
    String name;
    float[] marks = new float[5];
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many students : ");
        int ns = sc.nextInt();
        stud s[] = new stud[ns];
        int i,j;
        for( i=0; i<ns ; i++)
        {
                s[i]= new stud();
        System.out.println("Enter the Roll Number of the Student : ");
        s[i].rollno= sc.nextInt();
        System.out.println("Enter the Name of the Student : ");
        s[i].name = sc.next();
        System.out.println("Enter the Marks of 5 subjects of the Student : ");
       for(j=0; j<5; j++)
           s[i].marks[j] = sc.nextFloat();
        }
   for( i=0; i<ns ; i++)
        {
        System.out.println();
        System.out.println("Roll No : "+s[i].rollno);
        System.out.println("Name : "+s[i].name);
       for(j=0; j<5; j++)
          System.out.println("Marks of Subject" + i+ ":"+s[i].marks[j]);
        }
    }
}
