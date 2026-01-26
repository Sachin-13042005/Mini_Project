package BankApp.Accounts;
import java.util.*;

public class SBTransactions extends Customer
{
Scanner sc=new Scanner(System.in);
public int f=-1;
SBOperations o=new SBOperations();
public void transaction(int ch)
{
System.out.print("----------------------------------------"+"\n");

System.out.print("ENTER ACCOUNT NO. : ");
long accno=sc.nextLong();

for(int i=0;i<Customer.ccount;i++)
{
if(accno==Customer.c[i].accno)
{
f=i;
}
}
if(f!=-1)
{
System.out.print("ENTER 4 DIGIT PIN : ");
int pin=sc.nextInt();

if(pin==Customer.c[f].pin)
{

if(ch==1)
{
System.out.print("----------------------------------------"+"\n");
System.out.print("ENTER DEPOSIT AMOUNT : Rs.");
double d=sc.nextDouble();;
o.deposit(d,f);
}

else if(ch==2)
{
System.out.print("----------------------------------------"+"\n");
System.out.print("ENTER WITHDRAW AMOUNT : Rs.");
double w=sc.nextDouble();
o.withdraw(w,f);
}

else if(ch==3)
{
System.out.print("----------------------------------------"+"\n");
o.calcInterest(f);
}

else if(ch==0)
{
System.out.print("----------------------------------------"+"\n");
System.out.print("                EXITED"+"\n");
System.out.print("----------------------------------------"+"\n");
}

else
{
System.out.print("----------------------------------------"+"\n");
System.out.print("             INVALID INPUT"+"\n");
System.out.print("----------------------------------------"+"\n");
}
}
else
{
System.out.print("----------------------------------------"+"\n");
System.out.println("              INVALID PIN ");
System.out.print("----------------------------------------"+"\n");

return;
}
}

else
{
System.out.print("----------------------------------------"+"\n");
System.out.println("        INVALID ACCOUNT NUMBER ");
System.out.print("----------------------------------------"+"\n");
return;
}

}
}