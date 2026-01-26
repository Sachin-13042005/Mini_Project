package BankApp.Accounts;

public class SBAccount extends Account
{
public SBAccount()
{
}

public SBAccount(long acc,double bal)
{
this.atype="sb";
this.accno=acc;
this.balance=bal;
System.out.print("----------------------------------------"+"\n");
System.out.print("     ACCOUNT CREATED SUCCEESSFULLY"+"\n");
System.out.print("----------------------------------------"+"\n");
System.out.print("     ACCOUNT NO : "+this.accno+"\n");
System.out.print("----------------------------------------"+"\n");

}
}
