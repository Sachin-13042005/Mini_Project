import java.util.*;
class Arr
{
int x[];
void input()
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
x=new int[n];
for(int i=0;i<n;i++)
x[i]=sc.nextInt();
}
Arr process(Arr b)
{
Arr d=new Arr();
d.x=new int[this.x.length+b.x.length];
System.arraycopy(this.x,0,d.x,0,this.x.length);
System.arraycopy(b.x,0,d.x,this.x.length,b.x.length);
Arrays.sort(d.x);
return d;
}
void output()
{
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]+" ");
}
}
}
class Merge
{
public static void main(String arg[])
{
Arr a=new Arr();
Arr b=new Arr();
Arr c=new Arr();
a.input();
b.input();
c=a.process(b);
c.output();
}
}