// Program to input and display details of students using two classes

import java.util.*;
class students
{
    int rollno;
    String name;
    float[] marks = new  float[5];
}
class student
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many students : ");
        int ns = sc.nextInt();
        students s[] = new students[ns];
        int i,j;
        for( i=0; i<ns ; i++)
        {
        s[i]= new students();
        System.out.print("Enter the Roll Number of the Student : ");
        s[i].rollno= sc.nextInt();
        System.out.print("Enter the Name of the Student : ");
        s[i].name = sc.next();
        System.out.print("Enter the Marks of 5 subjects of the Student : ");
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
