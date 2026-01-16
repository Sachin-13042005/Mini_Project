import java.util.*;
class Stud
{
int sno;
String name;
double wt;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("NAME :");
name=sc.next();
System.out.println("SNO :");
sno=sc.nextInt();
System.out.println("WEIGHT :");
wt=sc.nextInt();
}
Stud process(Stud s2)
{
if(this.wt>s2.wt)
return this;
else
return s2;
}
void output()
{
System.out.println("SNO"+sno+"\n"+"NAME"+name+"\n"+"WEIGHT"+wt);
}
}
class Student
{
public static void main(String arg[])
{
Stud s1=new Stud();
Stud s2=new Stud();
s1.input();
s2.input();
Stud s3=s1.process(s2);
s3.output();
}
}