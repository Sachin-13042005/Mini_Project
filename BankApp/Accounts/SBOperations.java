package BankApp.Accounts;
import java.util.*;

public class SBOperations
{
public void deposit(double rs,int ccount)
{
Customer.c[ccount].balance+=rs;
System.out.println("");
System.out.print("----------------------------------------"+"\n");
System.out.print("     AMOUNT DEPOSITED SUCCEESSFULLY"+"\n");
System.out.print("----------------------------------------"+"\n");
System.out.print("     BALANCE : Rs."+Customer.c[ccount].balance+"\n");
System.out.print("----------------------------------------"+"\n");

}

public void withdraw(double rs,int ccount)
{
if(Customer.c[ccount].balance>1000)
{
Customer.c[ccount].balance-=rs;
System.out.println("");
System.out.print("----------------------------------------"+"\n");
System.out.print("     AMOUNT WITHDRAWL SUCCEESSFULL"+"\n");
System.out.print("----------------------------------------"+"\n");

System.out.print("     BALANCE : Rs."+Customer.c[ccount].balance+"\n");
System.out.print("----------------------------------------"+"\n");

}
else
{
System.out.print("----------------------------------------"+"\n");
System.out.println("       INSUFFICIENT BALANCE");
System.out.print("----------------------------------------"+"\n");

}
}

public void calcInterest(int ccount)
{
System.out.print("----------------------------------------"+"\n");
System.out.print("   INTEREST FOR YEAR : Rs."+(Customer.c[ccount].balance%4)*12+"\n");
System.out.print("----------------------------------------"+"\n");

}

}
