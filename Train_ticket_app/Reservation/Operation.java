package Train_ticket_app.Reservation;
import java.util.*;

public class Operation
{
Train t[]=new Train[3];
Passenger p1[]=new Passenger[10];
int i=0;
int ticketcount=100;
int tcount,t1;
public Operation()
{
t[0]=new Train();

t[0].trainname="Chozhan";
t[0].trainid=101;
t[0].seatno=0;
t[0].tseats=20;
t[0].aseats=20;

t[1]=new Train();


t[1].trainname="Pandiyan";
t[1].trainid=102;
t[1].seatno=0;
t[1].tseats=20;
t[1].aseats=20;


t[2]=new Train();

t[2].trainname="Pandiyan";
t[2].trainid=103;
t[2].seatno=0;
t[2].tseats=20;
t[2].aseats=20;


tcount=3;

}

public void show()
{
System.out.println("-----------------------------------------------------------------");
System.out.println("                       AVAILABLE TRAINS");
for(int j=0;j<tcount;j++)
{
System.out.println("-----------------------------------------------------------------");
System.out.print("Train ID : "+t[j].trainid+"		"+"Train Name : "+t[j].trainname+"\n");
}
System.out.println("-----------------------------------------------------------------");
}

public void bookTicket(Scanner sc)
{
show();

System.out.print("ENTER TRAIN ID       : ");
int tid=sc.nextInt();
t1=-1;
for(int j=0;j<tcount;j++)
{
if(tid==t[j].trainid)
{
t1=j;
break;
}
}
if(t1==-1)
{
System.out.println("-----------------------------------------------------------------");
System.out.print("                         TRAIN NOT FOUND "+"\n");
System.out.println("-----------------------------------------------------------------");
return;
}

System.out.print("ENTER PASSENGER NAME : ");
String name=sc.next();
System.out.print("ENTER AGE            : ");
int age=sc.nextInt();
if(age<18)
{
System.out.println("-----------------------------------------------------------------");
System.out.print("                     YOUR AGE IS NOT ELIGIBLE "+"\n");
System.out.println("-----------------------------------------------------------------");
return;
}
System.out.print("ENTER GENDER         : ");
String gender=sc.next();
System.out.print("ENTER SOURCE         : ");
String source=sc.next();
System.out.print("ENTER DESTINATION    : ");
String destination=sc.next();
if(source.equalsIgnoreCase(destination))
{
System.out.println("-----------------------------------------------------------------");
System.out.print("                       INVALID DESTINATIONS"+"\n");
System.out.println("-----------------------------------------------------------------");
return;
}
System.out.print("ENTER NO.OF SEATS    : ");
int bookedseats=sc.nextInt();
if((t[t1].aseats-bookedseats)>=0)
{
Passenger p=new Passenger();
p.name=name;
p.age=age;
p.gender=gender;
p.source=source;
p.destination=destination;
p.bookedseats=bookedseats;
p.stseat=t[t1].seatno;
p.t1 = t1;
p1[i++]=p;
t[t1].aseats-=p.bookedseats;
p.ticketsts="CONFIRMED";
p.ticketid = ++ticketcount; 
System.out.println("-----------------------------------------------------------------");
System.out.print("                    TICKET BOOKED SUCCESSFULLY"+"\n");
System.out.println("-----------------------------------------------------------------");
System.out.print("YOUR TICKET ID : "+p.ticketid+"\n");
System.out.print("YOUR TRAIN     : "+t[t1].trainname+"\n");

System.out.print("SEAT NUMBER    : "+t[t1].seatno+" TO "+(t[t1].seatno+p.bookedseats-1)+"\n");
t[t1].seatno+=p.bookedseats;
System.out.print("TICKET STATUS  : "+p.ticketsts+"\n");
System.out.println("-----------------------------------------------------------------");
}
else
{
System.out.println("-----------------------------------------------------------------");
System.out.print("                  ONLY "+t[t1].aseats+" AVAILABLE"+"\n");
System.out.println("-----------------------------------------------------------------");
}

}


public void cancelTicket(Scanner sc)
{
System.out.print("ENTER TICKET ID : ");
int tid=sc.nextInt();
for(int j=0;j<i;j++)
{
if(tid==p1[j].ticketid)
{
t1=p1[j].t1;
t[t1].aseats+=p1[j].bookedseats;
p1[j].ticketsts="CANCELLED";
p1[j].ticketid=0;
System.out.println("-----------------------------------------------------------------");
System.out.print("                  TICKET CANCELLED SUCCESSFULLY"+"\n");
System.out.print("                  TICKET STATUS  : "+p1[j].ticketsts+"\n");
System.out.println("-----------------------------------------------------------------");
for(int k=j;k<i-1;k++)
{
p1[k]=p1[k+1];
}
i--;
return;

}
}

System.out.println("-----------------------------------------------------------------");
System.out.print("                         TICKET NOT FOUND"+"\n");
System.out.println("-----------------------------------------------------------------");

}


public void ticketStatus(Scanner sc)
{

System.out.print("ENTER TICKET ID : ");
int tid=sc.nextInt();
for(int j=0;j<i;j++)
{
if(tid==p1[j].ticketid)
{
t1=p1[j].t1;
System.out.println("-----------------------------------------------------------------");
System.out.print("PASSENGER NAME : "+p1[j].name+"\n");
System.out.print("SEAT NUMBER    : "+p1[j].stseat+" TO "+(p1[j].stseat+p1[j].bookedseats-1)+"\n");
System.out.print("TICKET STATUS  : "+p1[j].ticketsts+"\n");
System.out.println("-----------------------------------------------------------------");
return;
}
}

System.out.println("-----------------------------------------------------------------");
System.out.print("                          TICKET NOT FOUND"+"\n");
System.out.println("-----------------------------------------------------------------");


}

public void exit()
{
System.out.println("-----------------------------------------------------------------");
System.out.println("                    THANKS FOR VISITING...");
System.out.println("-----------------------------------------------------------------");

}
}