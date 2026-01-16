import java.util.*;
class Employee
{
double bas,da,hra,ra,ma,inc,gr,pf,lic,loan,mis,ded,net;
int sno;
String name;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER SNO");
sno=sc.nextInt();
System.out.println("ENTER NAME");
name=sc.next();
System.out.println("ENTER SALARY");
bas=sc.nextDouble();

}
void process()
{
da=bas/100*27;
hra=bas/100*9;
ra=bas/100*12;
ma=bas/100*5;
inc=bas/100*2000;
gr=da+hra+ra+ma+inc;
pf=bas/100*12;
lic=bas/100*10;
loan=bas/100*5;
mis=bas/100*2;
ded=pf+lic+loan+mis;
net=gr-ded;
}
void output()
{
System.out.println(net);
}
}
class Demo1
{
public static void main(String arg[])
{
Employee e=new Employee();
e.input();
e.process();
e.output();
}
}