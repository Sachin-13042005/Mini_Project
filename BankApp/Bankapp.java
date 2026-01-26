package BankApp;
import BankApp.Accounts.*;
import java.util.*;

public class Bankapp
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
CreateAccount c1=new CreateAccount();
String ans="yes";
while(!ans.equalsIgnoreCase("no"))
{
System.out.print("\n");
System.out.print("\n");
System.out.print("ENTER 1 TO CREATE SBAccount : "+"\n");
System.out.print("ENTER 2 TO CREATE FDAccount : "+"\n");
int ch=sc.nextInt();
c1.createAccount(ch);
int t=1;
while(t!=0)
{
if(ch==1)
{
System.out.print("----------------------------------------"+"\n");
System.out.print("ENTER 1 FOR DEPOSIT            : "+"\n");
System.out.print("ENTER 2 FOR WITHDRAW           : "+"\n");
System.out.print("ENTER 3 FOR CALCULATE INTEREST : "+"\n");
System.out.print("ENTER 0 FOR TO EXIT !!!        : "+"\n");
System.out.print("\n");

t=sc.nextInt();
SBTransactions t1=new SBTransactions();
t1.transaction(t);
}
else
{
System.out.print("----------------------------------------"+"\n");
System.out.print("ENTER 1 FOR DEPOSIT            : "+"\n");
System.out.print("ENTER 2 VIEW BALANCE                 : "+"\n");
System.out.print("ENTER 3 FOR CLOSE ACCOUNT !!!        : "+"\n");
System.out.print("ENTER 0 FOR TO EXIT !!!        : "+"\n");
System.out.print("\n");

t=sc.nextInt();
FBTransactions t1=new FBTransactions();
t1.transaction(t);
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

if(ans.equalsIgnoreCase("no"))
{
System.out.println("");

System.out.print("-----THANKS FOR BANKING !!-----"+"\n");
System.out.print("-------VISIT AGAIN !!-------"+"\n");

}
}
}