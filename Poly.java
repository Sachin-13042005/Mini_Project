import java.util.*;
class Add
{
int a,b;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER A :");
a=sc.nextInt();
System.out.println("ENTER B :");
b=sc.nextInt();
}
int process()
{
return a+b;
}
int process(int a)
{
return a+10;
}
int process(int a,int b)
{
return a+b;
}
int set(int a,int b)
{
this.a=a;
this.b=b;
return this.a+this.b;
}
}
class Poly
{
public static void main(String arg[])
{
Add a1=new Add();
a1.input();
System.out.println(a1.process());
System.out.println(a1.process(10));
System.out.println(a1.process(10,20));
System.out.println(a1.set(2,2));
}
}