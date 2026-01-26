package BankApp.Accounts;

public class FDAccount extends Account
{
public FDAccount()
{
}

public FDAccount(long acc,double bal)
{
this.atype="fb";
this.accno=acc;
this.balance=bal;
System.out.print("----------------------------------------"+"\n");
System.out.print("     ACCOUNT CREATED SUCCEESSFULLY"+"\n");
System.out.print("----------------------------------------"+"\n");
System.out.print("     ACCOUNT NO : "+this.accno+"\n");
System.out.print("----------------------------------------"+"\n");

}
}
