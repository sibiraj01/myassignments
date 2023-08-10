package Assignement3;

public class AccessBank extends Bankinfo{
	public void deposit() {
		System.out.println("deposit");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessBank acc=new AccessBank();
		acc.saving();
		acc.fixed();
		acc.deposit();
		acc.deposit();
		

	}

}
