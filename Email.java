import java.util.*;
class Email
{
public static void main(String arg[])
{
String u[];
User u0=new User(arg[0],arg[1]);
u=u0.getdomain();
u0.createuser(u);

}
}


class User
{

String username;
String email;

User(String u,String e)
{
this.username=u;
this.email=e;
}

String[] getdomain()
{
String s[]=email.split("@");
return s;
}

void createuser(String s[])
{
System.out.println("NAME :"+username);
System.out.println("EMAIL :"+email);
System.out.println("DOMAIN :"+s[1]);
}
}
