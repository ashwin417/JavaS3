import java.util.*;
class Employee
{
    String Name, Address;
    int age, phone_number;
    float Salary;

    void print_Salary()
    {
        System.out.println(Salary);
    }

    public static void main(String args[])
    {Scanner sc = new Scanner(System.in);
        Officer o = new Officer();
        Manager m = new Manager();
        o.input();
        o.specialization = sc.nextLine();
        m.input();
        m.Department = sc.nextLine();
        o.display();
        System.out.print(o.specialization);
        m.display();
        System.out.print(m.Department);
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        Name= sc.nextLine();
        Address=sc.nextLine();
        System.out.print("Enter the age :");
        age = sc.nextInt();
        phone_number = sc.nextInt();
        Salary = sc.nextInt();
    }

    void display()
    {
    System.out.print(Name+Address+age+phone_number);
    print_Salary();
    }

}
class Officer extends Employee
{
    String specialization;
}

class Manager extends Employee
{
    String Department;
}

