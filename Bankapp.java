import java.util.*;
class Account
{
long accno;
double balance;

Account()
{
}

Account(long a,double b)
{
accno=a;
balance=b;
}
}


class SBAccount extends Account
{
SBAccount()
{
}

SBAccount(long acc,double bal)
{
super(acc,bal);
}

void deposit(double rs)
{
balance=balance+rs;
System.out.println("");

System.out.print("-----AMOUNT DEPOSITED SUCCEESSFULLY-----"+"\n");
System.out.println("");

System.out.print("BALANCE : Rs."+balance+"\n");
System.out.println("");

}

void withdraw(double rs)
{
if(balance>1000)
{
balance=balance-rs;
System.out.println("");

System.out.print("-----AMOUNT WITHDRAWL SUCCEESSFULL-----"+"\n");
System.out.println("");

System.out.print("BALANCE : Rs."+balance+"\n");
System.out.println("");

}
else
{
System.out.println("");

System.out.println("INSUFFICIENT BALANCE");
System.out.println("");

}
}

void calcInterest()
{
System.out.print("----------------------------------------"+"\n");
System.out.println("");

System.out.print("INTEREST FOR YEAR : Rs."+(balance%4)*12+"\n");
System.out.println("");

}
}


class FDAccount extends Account
{
int period;

FDAccount()
{
}

FDAccount(long a,int period,double rs)
{
super(a,rs);
this.period=period;
}

double calcInterest()
{
return (balance%8.25)*12;
}

void view()
{
System.out.print("----------------------------------------"+"\n");
System.out.println("");

System.out.print("BALANCE : Rs."+balance+"\n");
System.out.println("");


}
void close()
{
balance=balance+calcInterest();
System.out.print("----------------------------------------"+"\n");
System.out.println("");

System.out.print("BALANCE : Rs."+balance+"\n");
System.out.println("");

System.out.print("        -----ACCOUNT CLOSED-----"+"\n");


}
}


class Customer extends Account
{
int custid;
String name,addr;
Scanner sc = new Scanner(System.in);

SBAccount s1;
FDAccount f1;

Customer(int custid,String name,String addr)
{
this.custid=custid;
this.name=name;
this.addr=addr;
}

void createAccount(int ch)
{
if(ch==1)
{
System.out.print("----------------------------------------"+"\n");
System.out.print("ENTER ACC.NO : ");
long accno=sc.nextLong();
s1=new SBAccount(accno,0);
}
else
{
System.out.print("----------------------------------------"+"\n");

System.out.print("ENTER ACC.NO : ");
long accno=sc.nextLong();
System.out.print("ENTER Period : ");
f1=new FDAccount(accno,sc.nextInt(),0);
}
}

void transaction(int ch)
{
if(ch==1)
{
System.out.print("----------------------------------------"+"\n");

System.out.print("ENTER DEPOSIT AMOUNT : Rs.");
double d=sc.nextDouble();;
s1.deposit(d);
}
else if(ch==2)
{
System.out.print("----------------------------------------"+"\n");

System.out.print("ENTER WITHDRAW AMOUNT : Rs.");
double w=sc.nextDouble();
s1.withdraw(w);
}
else if(ch==3)
{
System.out.print("----------------------------------------"+"\n");

s1.calcInterest();
}
else if(ch==0)
{
System.out.print("----------------------------------------"+"\n");

System.out.print("           ----- EXITED -----"+"\n");

System.out.print("----------------------------------------"+"\n");

}
else if(ch==4)
{
f1.view();
}

else if(ch==5)
{
f1.close();
}
else
{
System.out.print("           ----- INVALID INPUT -----"+"\n");
}
}
}

class Bankapp
{
public static void main(String ar[])
{
String ans="yes";
String name,addr;
int custid;
Scanner sc = new Scanner(System.in);
Customer c[]=new Customer[1];
for(int i=0;i<c.length;i++)
{
System.out.print("ENTER NAME    : ");
name=sc.next();
sc.nextLine();
System.out.print("ENTER ADDRESS : ");
addr=sc.nextLine();
System.out.print("ENTER ID      : ");
custid=sc.nextInt();
c[i]=new Customer(custid,name,addr);
System.out.print("----------------------------------------"+"\n");
System.out.print("----------------------------------------"+"\n");
while(!ans.equalsIgnoreCase("no"))
{
System.out.print("ENTER 1 FOR SBAccount : "+"\n");
System.out.print("ENTER 2 FOR FDAccount : "+"\n");
int ch=sc.nextInt();
c[i].createAccount(ch);
int t=1;
while(t!=0 && t!=5)
{
if(ch==1)
{
System.out.print("----------------------------------------"+"\n");
System.out.print("----------------------------------------"+"\n");
System.out.print("ENTER 1 FOR DEPOSIT            : "+"\n");
System.out.print("ENTER 2 FOR WITHDRAW           : "+"\n");
System.out.print("ENTER 3 FOR CALCULATE INTEREST : "+"\n");
System.out.print("ENTER 0 FOR TO EXIT !!!        : "+"\n");

t=sc.nextInt();
c[i].transaction(t);
}
else
{
System.out.print("----------------------------------------"+"\n");
System.out.print("----------------------------------------"+"\n");
System.out.print("ENTER 4 VIEW BALANCE                 : "+"\n");
System.out.print("ENTER 5 FOR CLOSE ACCOUNT !!!        : "+"\n");
t=sc.nextInt();
c[i].transaction(t);

}
}
System.out.print("----------------------------------------"+"\n");
System.out.print("----------------------------------------"+"\n");
System.out.println("");

System.out.print("ENTER YES FOR SWITCH ACCOUNT : "+"\n");
System.out.print("ENTER NO FOR EXIT !!!        : "+"\n");
ans=sc.next();
System.out.println("");


}
}
if(ans.equalsIgnoreCase("no"))
{
System.out.println("");

System.out.print("-----THANKS FOR BANKING !!-----"+"\n");
System.out.print("-------VISIT AGAIN !!-------"+"\n");

}
}
}