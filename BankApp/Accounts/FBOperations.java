package BankApp.Accounts;
import java.util.*;

public class FBOperations
{

public void deposit(double rs,int ccount)
{
Customer.c[ccount].balance+=rs;
System.out.print("----------------------------------------"+"\n");
System.out.print("     AMOUNT DEPOSITED SUCCEESSFULLY"+"\n");
System.out.print("----------------------------------------"+"\n");
System.out.print("    BALANCE : Rs."+Customer.c[ccount].balance+"\n");
System.out.print("----------------------------------------"+"\n");
}

public double calcInterest(int ccount)
{
return (Customer.c[ccount].balance%8.25)*12;
}

public void view(int ccount)
{
System.out.print("----------------------------------------"+"\n");
System.out.print("    BALANCE : Rs."+Customer.c[ccount].balance+"\n");
System.out.print("----------------------------------------"+"\n");
}


public void close(int ccount)
{
Customer.c[ccount].balance=Customer.c[ccount].balance+calcInterest(ccount);
System.out.print("----------------------------------------"+"\n");
System.out.print("    BALANCE : Rs."+Customer.c[ccount].balance+"\n");
System.out.print("----------------------------------------"+"\n");
System.out.print("             ACCOUNT CLOSED"+"\n");
System.out.print("----------------------------------------"+"\n");

}
}
