import java.util.*;
class Student
{
String name;
Student(String n)
{
name=n;
}

void disp()
{
System.out.print("NAME   	:"+name+"\n");
}
}

class Person extends Student
{
int rollno;
Person(String name,int rollno)
{
super(name);
this.rollno=rollno;
}

void disp()
{
super.disp();
System.out.print("ROLL.NO	:"+rollno+"\n");
System.out.println("----------------------");
}
}

class Inherit1
{
public static void main(String arg[])
{
String n;
int r;
Scanner sc=new Scanner(System.in);
System.out.print("NO.OF STUDENTS : ");

int l=sc.nextInt();
Person p[]=new Person[l];
for(int i=0;i<l;i++)
{
System.out.print("STUDENT NAME : ");
n=sc.next();
System.out.print("ROLL NO : ");
r=sc.nextInt();
p[i]=new Person(n,r);
}

System.out.println("");
System.out.println("----------------------");
System.out.println("STUDENT DETAILS");
System.out.println("----------------------");
for(int i=0;i<l;i++)
p[i].disp();
System.out.println("----------------------");

}
}

