package Assignment4;

public class Employee {
	public void getEmployeeInfo(int id) {
		System.out.println("Employee Id: "+id);
	}
	public void getEmployeeInfo(String name) {
		System.out.println("Employee name: "+name );
	}
	public void getEmployeeInfo(String email,long phone) {
		System.out.println("Employee Email: "+email+" phone NO: "+phone);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.getEmployeeInfo(1670);
		emp.getEmployeeInfo("sibi");
		emp.getEmployeeInfo("sibi123@gmaol.com",9876543210L);

	}

}
