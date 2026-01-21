import java.util.*;
class Passenger
{
String name,gender,trainname,source,destination,classtype;
int trainid,age,ticketid=100,seatno=0,tseats=20,aseats=20,bookedseats=0;
int i=0;

Passenger p[]=new Passenger[10];
}

class Operation extends Passenger
{

void bookTicket(Scanner sc)
{
p[i]=new Passenger();
System.out.print("\n");
System.out.print("\n");

System.out.print("ENTER PASSENGER NAME : ");
p[i].name=sc.next();
System.out.print("ENTER AGE            : ");
p[i].age=sc.nextInt();
if(p[i].age<18)
{
System.out.print("---------------------------------"+"\n");
System.out.print("YOUR AGE IS NOT ELIGIBLE "+"\n");
System.out.print("---------------------------------"+"\n");
return;
}
System.out.print("ENTER GENDER         : ");
p[i].gender=sc.next();
System.out.print("ENTER TRAIN NAME     : ");
p[i].trainname=sc.next();
System.out.print("ENTER TRAIN NO.      : ");
p[i].trainid=sc.nextInt();
System.out.print("ENTER SOURCE         : ");
p[i].source=sc.next();
System.out.print("ENTER DESTINATION    : ");
p[i].destination=sc.next();
System.out.print("ENTER CLASS TYPE     : ");
p[i].classtype=sc.next();
System.out.print("ENTER NO.OF SEATS    : ");
p[i].bookedseats=sc.nextInt();
if((aseats-p[i].bookedseats)>=0)
{
aseats-=p[i].bookedseats;
System.out.print("---------------------------------"+"\n");
p[i].ticketid+=1;
System.out.print("TICKET BOOKED SUCCESSFULLY"+"\n");
System.out.print("YOUR TICKET ID : "+p[i].ticketid+"\n");

System.out.print("SEAT NUMBER    : "+seatno+" TO "+(seatno+p[i].bookedseats)+"\n");
seatno+=p[i].bookedseats;
System.out.print("TICKET STATUS  : CONFIRMED"+"\n");
System.out.print("---------------------------------"+"\n");
i++;
}
else
{
System.out.print("---------------------------------"+"\n");
System.out.print("ONLY "+aseats+" AVAILABLE"+"\n");
System.out.print("---------------------------------"+"\n");
}

}


void cancelTicket(Scanner sc)
{
System.out.print("ENTER TICKET ID : ");
int t=sc.nextInt();
for(int j=0;j<i;j++)
{
if(t==p[j].ticketid && t!=100)
{
ticketid--;
aseats+=p[j].bookedseats;

System.out.print("---------------------------------"+"\n");

System.out.print("TICKET CANCELLED SUCCESSFULLY"+"\n");
System.out.print("TICKET STATUS  : CANCELLED"+"\n");
System.out.print("---------------------------------"+"\n");
}
}

System.out.print("---------------------------------"+"\n");

System.out.print("TICKET NOT FOUND"+"\n");
System.out.print("---------------------------------"+"\n");


}


void ticketStatus(Scanner sc)
{

System.out.print("ENTER TICKET ID : ");
int t=sc.nextInt();

System.out.print("---------------------------------"+"\n");
for(int j=0;j<i;j++)
{
if(t==p[j].ticketid && t!=100)
{
System.out.print("---------------------------------"+"\n");

System.out.print("PASSENGER NAME : "+name+"\n");
System.out.print("SEAT NO.       : "+seatno+"\n");
System.out.print("TICKET STATUS  : CONFIRMED"+"\n");
System.out.print("---------------------------------"+"\n");
return;
}
}

System.out.print("---------------------------------"+"\n");

System.out.print("TICKET NOT FOUND"+"\n");
System.out.print("---------------------------------"+"\n");


}

void exit()
{
System.out.print("---------------------------------"+"\n");

System.out.println("THANKS FOR VISITING...");
System.out.print("---------------------------------"+"\n");

}
}

class Booking extends Operation
{
Booking()
{
}
void process(int ch,Scanner sc)
{
if(ch==1)
{
bookTicket(sc);
}
else if(ch==2)
{
cancelTicket(sc);
}
else if(ch==3)
{
ticketStatus(sc);
}
else
{
exit();
}
}
}





class Train_ticket_app
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

ch=sc.nextInt();
b.process(ch,sc);
c=1;
}
}
}

