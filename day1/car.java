package week1.day1;

public class car {
public void ApplyBreak()
{
	System.out.println("Apply Break");
}
public void ApplyGear() 
{
	System.out.println("Apply Gear");
}
public void SwitchOnAc() 
{
System.out.println("SwitchOnAc");	
}
public void ApplyAccelarate() 
{
	System.out.println("Apply Accelarate");
}
public static void main(String[] args)
{
	car myCar=new car();
	myCar.ApplyBreak();
	myCar.ApplyGear();
	myCar.SwitchOnAc();
	myCar.ApplyAccelarate();		
			
}
}
