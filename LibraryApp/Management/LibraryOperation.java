package LibraryApp.Management;

import java.util.*;

public class LibraryOperation implements LibraryActions
{

protected Book b[]=new Book[10];
protected Member m[]=new Member[10];
protected int bookcount=0;
protected int membercount=0;
protected Scanner sc=new Scanner(System.in);


public LibraryOperation()
{
b[0]=new Book();
b[0].bookid=101;
b[0].title="KATHTHI";
b[0].author="AR MURUGADOSS";
b[0].totalcopies=10;
b[0].availablecopies=10;

b[1]=new Book();
b[1].bookid=102;
b[1].title="THERI";
b[1].author="ATLEE";
b[1].totalcopies=10;
b[1].availablecopies=10;

b[2]=new Book();
b[2].bookid=103;
b[2].title="LEO";
b[2].author="LOKESH KANAGARAJ";
b[2].totalcopies=10;
b[2].availablecopies=10;

b[3]=new Book();
b[3].bookid=104;
b[3].title="MASTER";
b[3].author="LOKESH KANAGARAJ";
b[3].totalcopies=10;
b[3].availablecopies=10;

bookcount=4;
}

public void show()
{
System.out.println("-----------------------------------------------------------------");
System.out.println("                       AVAILABLE BOOKS");
for(int j=0;j<bookcount;j++)
{
System.out.println("-----------------------------------------------------------------");
System.out.print("BOOK ID : "+b[j].bookid+"		"+"TITLE : "+b[j].title+"\n");
}
System.out.println("-----------------------------------------------------------------");

}

public void addBook()
{
show();
Book b1=new Book();
System.out.println("");
System.out.print("ENTER BOOK ID      : ");
b1.bookid=sc.nextInt();
sc.nextLine();
System.out.print("ENTER TITLE        : ");
b1.title=sc.nextLine();
System.out.print("ENTER AUTHOR       : ");
b1.author=sc.nextLine();
System.out.print("ENTER TOTAL COPIES : ");
b1.totalcopies=sc.nextInt();
b1.availablecopies+=b1.totalcopies;
b[bookcount++]=b1;
System.out.println("-----------------------------------------------------------------");
System.out.println("                    BOOK ADDED SUCCESSFULLY");
System.out.println("-----------------------------------------------------------------");


}

public void addMember()
{
Member m1=new Member();
System.out.println("");
System.out.print("ENTER NAME           : ");
m1.name=sc.next();
System.out.print("ENTER MEMBER ID      : ");
m1.memberid=sc.nextInt();
sc.nextLine();
m1.bookissued = 0;
m[membercount]=m1;
membercount++;
System.out.println("-----------------------------------------------------------------");
System.out.println("                    MEMBER ADDED SUCCESSFULLY");
System.out.println("-----------------------------------------------------------------");


}

public void issueBook()
{
show();
Book b1=new Book();
Member m1=new Member();
System.out.println("");
System.out.print("ENTER BOOK ID          : ");
int bid=sc.nextInt();
System.out.print("ENTER MEMBER ID        : ");
int mid=sc.nextInt();
System.out.print("ENTER NO.OF BOOKS      : ");
int bcount=sc.nextInt();

for(int i=0;i<bookcount;i++)
{
if(bid==b[i].bookid)
{
for(int j=0;j<membercount;j++)
{
if(mid==m[j].memberid)
{
if(b[i].availablecopies>bcount)
{
m[j].bookissued+=bcount;
b[i].availablecopies-=bcount;
System.out.println("-----------------------------------------------------------------");
System.out.println("                    BOOKS ISSUED SUCCESSFULLY");
System.out.println("-----------------------------------------------------------------");

return;
}
else
{
System.out.println("-----------------------------------------------------------------");
System.out.println("                    ONLY FEW BOOKS AVAILABLE");
System.out.println("-----------------------------------------------------------------");

return;
}
}
}
System.out.println("-----------------------------------------------------------------");
System.out.println("                     INVALID MEMBER ID");
System.out.println("-----------------------------------------------------------------");

return;
}
}
System.out.println("-----------------------------------------------------------------");
System.out.println("                     INVALID BOOK ID");
System.out.println("-----------------------------------------------------------------");
}

public void returnBook()
{
show();
Book b1=new Book();
Member m1=new Member();
System.out.println("");
System.out.print("ENTER BOOK ID          : ");
int bid=sc.nextInt();
System.out.print("ENTER MEMBER ID        : ");
int mid=sc.nextInt();
System.out.print("ENTER NO.OF BOOKS      : ");
int bcount=sc.nextInt();

for(int i=0;i<bookcount;i++)
{
if(bid==b[i].bookid)
{
for(int j=0;j<membercount;j++)
{
if(mid==m[j].memberid)
{
if(m[j].bookissued>0)
{
m[j].bookissued-=bcount;
b[i].availablecopies+=bcount;
System.out.println("-----------------------------------------------------------------");
System.out.println("                    BOOKS RETURNED SUCCESFULLY");
System.out.println("-----------------------------------------------------------------");
return;
}
else
{
System.out.println("-----------------------------------------------------------------");
System.out.println("             THIS MEMBER NOT BORROWED A BOOK YET...!!");
System.out.println("-----------------------------------------------------------------");
return;
}
}
}
System.out.println("-----------------------------------------------------------------");
System.out.println("                     INVALID MEMBER ID");
System.out.println("-----------------------------------------------------------------");
return;
}
}
System.out.println("-----------------------------------------------------------------");
System.out.println("                     INVALID BOOK ID");
System.out.println("-----------------------------------------------------------------");
}

public void memberStatus()
{
Member m1=new Member();
System.out.println("");
System.out.print("ENTER MEMBER ID : ");
int mid=sc.nextInt();

for(int i=0;i<membercount;i++)
{
if(mid==m[i].memberid)
{
System.out.println("-----------------------------------------------------------------");
System.out.print("NAME        : "+m[i].name+"\n");
System.out.print("MEMBER ID   : "+m[i].memberid+"\n");
System.out.print("BOOK ISSUED : "+m[i].bookissued+"\n");
System.out.println("-----------------------------------------------------------------");
return;
}
}
}

public void bookStatus()
{
show();
System.out.println("");
System.out.print("ENTER BOOK ID    : ");
int bid=sc.nextInt();
for(int i=0;i<bookcount;i++)
{
if(bid==b[i].bookid)
{
System.out.println("-----------------------------------------------------------------");
System.out.print("BOOK NAME        : "+b[i].title+"\n");
System.out.print("BOOK ID          : "+b[i].bookid+"\n");
System.out.print("AUTHOR           : "+b[i].author+"\n");
System.out.print("TOTAL COPIES     : "+b[i].totalcopies+"\n");
System.out.print("AVAILABLE COPIES : "+b[i].availablecopies+"\n");
System.out.println("-----------------------------------------------------------------");
return;
}
}
System.out.println("-----------------------------------------------------------------");
System.out.println("                    BOOK NOT FOUND");
System.out.println("-----------------------------------------------------------------");

}

public void close()
{
System.out.println("-----------------------------------------------------------------");
System.out.println("                    THANK YOU FOR VISITING");
System.out.println("                         GROW HIGH !!");
System.out.println("-----------------------------------------------------------------");

}
}







