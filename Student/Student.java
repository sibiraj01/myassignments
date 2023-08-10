package org.Student;

import org.Department.Department;

public class Student extends Department {
	public void Studentname() {
		System.out.println("Ananthi");
	}
	public void StudentDepartment() {
		System.out.println("chemistry");
		
	}
	public void id() {
		System.out.println("20g108");		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.Departmentname();
		stu.Studentname();
		stu.StudentDepartment();
		stu.id();
		
	
 
	}

}
