package week1.day1;

public class mobile {
	public void SendMessage()
	{
		System.out.println("SendMessage");
	}
public void ShareDocument()
{
	System.out.println("ShareDocument");
}
public void Calling()
{
	System.out.println("Make Calling");
}
public static void main(String[] args) {
	mobile Mymobile=new mobile();
	Mymobile.SendMessage();
	Mymobile.ShareDocument();
	Mymobile.Calling();
}
}
