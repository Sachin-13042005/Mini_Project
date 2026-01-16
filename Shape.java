import java.util.*;
abstract class Area
{
double dim1,dim2;

Area(double d1,double d2)
{
dim1=d1;
dim2=d2;
}

abstract double calc(double dim1,double dim2);
abstract void disp();
}

class Rectangle extends Area
{

Rectangle(double d1,double d2)
{
super(d1,d2);
}

double calc(double a,double b)
{
return a*b;
}

void disp()
{
System.out.println("");
System.out.println("");

System.out.println("-----AREA OF RECTANGLE-----");
System.out.println("");
System.out.println("  LENGTH   : "+dim1);
System.out.println("  HEIGHT   : "+dim2);


System.out.println("  AREA     : "+calc(dim1,dim2));
System.out.println("");
System.out.println("");

}
}

class Triangle extends Area
{

Triangle(double d1,double d2)
{
super(d1,d2);
}

double calc(double a,double b)
{
return a*b/2;
}

void disp()
{
System.out.println("-----AREA OF TRIANGLE-----");
System.out.println("");

System.out.println("  BASE     : "+dim1);
System.out.println("  HEIGHT   : "+dim2);

System.out.println("  AREA     : "+calc(dim1,dim2));
}
}

class Shape
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER LENGTH & BREADTH : ");

Rectangle r=new Rectangle(sc.nextInt(),sc.nextInt());
System.out.println("ENTER BASE & HEIGHT : " );
Triangle t=new Triangle(sc.nextInt(),sc.nextInt());
r.disp();
t.disp();
}
}

