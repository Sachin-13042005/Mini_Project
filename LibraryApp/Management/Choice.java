package LibraryApp.Management;

public class Choice extends LibraryOperation
{

public Choice()
{
}

public void process(int ch)
{
if(ch==1)
{
addBook();
}
else if(ch==2)
{
addMember();
}
else if(ch==3)
{
memberStatus();
}
else if(ch==4)
{
bookStatus();
}
else if(ch==5)
{
issueBook();
}
else if(ch==6)
{
returnBook();
}
else
{
close();
}
}
}