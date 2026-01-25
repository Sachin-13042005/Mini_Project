package Train_ticket_app;
import Train_ticket_app.Reservation.*;
import java.util.*;

public class Trainticket
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int ch=0,c=0;
String ans="";
Booking b=new Booking();

while(ch!=4)
{
if(c==1)
{
System.out.print("ENTER YES FOR MORE SERVICES"+"\n");
System.out.print("ENTER NO  FOR EXIT"+"\n");
System.out.print("\n");

ans=sc.next();
if(ans.equalsIgnoreCase("yes"))
{
c=0;
}
else
{
System.out.print("---------------------------------"+"\n");
System.out.println("THANKS FOR VISITING...");
System.out.print("---------------------------------"+"\n");
break;
}
}

System.out.print("\n");
System.out.print("\n");
System.out.print("ENTER 1 TO BOOK TICKET"+"\n");
System.out.print("ENTER 2 FOR CANCEL TICKET"+"\n");
System.out.print("ENTER 3 FOR VIEW STATUS"+"\n");
System.out.print("ENTER 4 EXIT...!!"+"\n");
System.out.print("\n");

ch=sc.nextInt();
b.process(ch,sc);
c=1;
}
}
}
