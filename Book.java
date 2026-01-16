import java.util.*;
class Bookname
{
String bkname,author;
int bkid;

Bookname()
{
bkname="NULL";
bkid=0;
author="NULL";
}

Bookname(String bkname,String author,int id)
{
this.bkname=bkname;
this.author=author;
bkid=id;
}

void update(String bkname,String author,int id)
{
this.bkname=bkname;
this.author=author;
bkid=id;
}

void display()
{
System.out.println("-----BOOK DETAILS----- ");
System.out.println("");

System.out.print("  BOOK NAME : "+this.bkname+"\n");
System.out.print("  BOOK ID   : "+this.bkid+"\n");
System.out.print("  AUTHOR    : "+this.author+"\n");
System.out.println("");
System.out.println("---------------------- ");
System.out.println("");
System.out.println("");

}
}

class Book
{
public static void main(String arg[])
{
Bookname b1=new Bookname("JAVA","SACHIN",65);
b1.display();
b1.update("PYTHON","RAHUL",58);
b1.display();
Bookname b2=new Bookname();
b2.display();
b1.update("C","SANJAI",68);
b1.display();
}
}




