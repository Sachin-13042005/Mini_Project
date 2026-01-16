import java.util.*;
import java.math.*;
class Mul
{
double p,r,i;
int n;
void input()
{
Scanner sc=new Scanner(System.in);
p=sc.nextDouble();
r=sc.nextDouble();
n=sc.nextInt();
}
void process()
{
i=p*(Math.pow((1+r/100),n))-p;
}
void output()
{
System.out.println(i);
}
}
class Demo
{
public static void main(String arg[])
{
Mul m=new Mul();
m.input();
m.process();
m.output();
}
}
