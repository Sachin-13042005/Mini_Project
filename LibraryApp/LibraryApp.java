package LibraryApp;
import LibraryApp.Management.*;

import java.util.*;
public class LibraryApp
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
Choice c=new Choice();
int ch=0;
while(ch!=7)
{
System.out.println("");
System.out.println("");

System.out.println("ENTER 1 FOR ADD NEW BOOK");
System.out.println("ENTER 2 FOR ADD NEW MEMBER");
System.out.println("ENTER 3 FOR VIEW MEMBER STATUS");
System.out.println("ENTER 4 FOR VIEW BOOK STATUS");
System.out.println("ENTER 5 FOR ISSUE BOOK");
System.out.println("ENTER 6 FOR RETURN BOOK");
System.out.println("ENTER 7 TO CLOSE");
System.out.println("");

ch=sc.nextInt();
c.process(ch);
}
}
}
