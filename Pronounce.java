import java.util.*;
import java.lang.*;
import java.io.*;

class Pronounce
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		
		    Pro p=new Pro();
		    p.input(sc);
		    System.out.println(p.process());
		

	}
}
class Pro
{
    int l;
    String s,g;
    void input(Scanner sc)
    {
       int l=sc.nextInt();
       s=sc.next();
    }
    String process()
    {
       int f=0;
       if(l>4)
       {
       g = s.substring(0, 4);
       for(int i=0;i<g.length();i++) 
       {
	char r=g.charAt(i);
       if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u')
       f=1;
       }
       if(f==0)
       return "NO";
       else
       return "YES";
       }
       else
       return "YES";
}
}