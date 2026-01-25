package Train_ticket_app.Reservation;
import java.util.*;
public class Booking extends Operation
{
public Booking()
{
}
public void process(int ch,Scanner sc)
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
