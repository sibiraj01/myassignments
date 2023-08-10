package week4day4;

public class Automation extends MultiLanguage {



	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java");
		
	}

	@Override
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation auto=new Automation();
		auto.java();
		auto.ruby();
		auto.Selenium();
		auto.python();

	}

}
