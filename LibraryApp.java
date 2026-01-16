import java.util.*;

class LibraryApp
{
static  String library;
public static void main(String arg[])
{
String name;
int memberid;
int book[];


Scanner sc=new Scanner(System.in);
int l=Integer.valueOf(arg[0]);
LibraryMember t[]=new LibraryMember[l];

for(int i=0;i<l;i++)
{
System.out.println("ENTER NAME");
name=sc.next();
System.out.println("ENTER ID");
memberid=sc.nextInt();
System.out.println("ENTER NO. OF BOOKS");
int n=sc.nextInt();
book=new int[n];
for(int j=0;j<n;j++)
{
System.out.println("BOOK ID");
book[j]=sc.nextInt();
}
System.out.println("ENTER LIBRARY NAME");
library=sc.next();
t[i]=new LibraryMember(name,memberid,book,n);
}
Fine f=new Fine();
LibraryMember f1=f.calcfine(t);
f.display(f1);

}
}


class LibraryMember
{
String name;
int memberid;
int book[];


LibraryMember(String name,int id,int b[],int n)
{
this.name=name;
this.memberid=id;
this.book=b;
}
}

class Fine
{
LibraryMember calcfine(LibraryMember t[])
{
LibraryMember s=t[0];
double f;
for(int i=0;i<t.length;i++)
{
if(t[i].book.length>s.book.length)
s=t[i];
}
return s;
}

void display(LibraryMember f1)
{
System.out.println("HIGHEST FINE :"+f1.name+"\n"+"FINE AMOUNT :"+f1.book.length*100);
}
}






