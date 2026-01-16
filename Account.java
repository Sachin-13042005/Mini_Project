import java.util.*;
class Account
{
public static void main(String arg[])
{
User u0=new User(arg[0],arg[1]);
Scanner sc=new Scanner(System.in);
System.out.print("ENTER USERNAME :");
String u=sc.next();
System.out.print("ENTER PASSWORD :");
String p=sc.next();
User u2=new User();
User u3=u2.createuser(u,p);
System.out.println(u3.validateuser(u0));
}
}


class User
{
String username,password;
User()
{
}

User(String username,String password)
{
this.username=username;
this.password=password;
}


User createuser(String u,String p)
{
this.username=u;
this.password=p;
return this;
}


String validateuser(User u0)
{
if(u0.username.equals(username) && u0.password.equals(password))
{
return "LOGIN SUCCESSFUL";
}
else
{
return "INVALID USER";
}
}
}