package BankApp.Accounts;
import java.util.*;

public class CreateAccount
{
Scanner sc=new Scanner(System.in);

public void createAccount(int ch)
{
Customer c2=new Customer();
if(ch==1)
{
System.out.print("----------------------------------------"+"\n");

System.out.print("ENTER NAME        : ");
c2.name=sc.next();
sc.nextLine();
System.out.print("ENTER ID          : ");
c2.custid=sc.nextInt();
System.out.print("ENTER 4 DIGIT PIN : ");
c2.pin=sc.nextInt();

c2.accno=++Customer.accno;

c2.s1=new SBAccount(c2.accno,0);
Customer.c[Customer.ccount]=c2;

Customer.ccount++;
}

else
{
System.out.print("----------------------------------------"+"\n");

System.out.print("ENTER NAME        : ");
c2.name=sc.next();
sc.nextLine();
System.out.print("ENTER ID          : ");
c2.custid=sc.nextInt();
System.out.print("ENTER 4 DIGIT PIN : ");
c2.pin=sc.nextInt();
c2.accno=++Customer.accno;

c2.f1=new FDAccount(c2.accno,0);
Customer.c[Customer.ccount]=c2;

Customer.ccount++;

}
}
}
