package testNgpkg;

public class constructor {
	
	int empid;
	String empname;
	int Salary;
	public constructor(int empid,String empname,int salary) {
		this.empid=empid;
		this.empname=empname;
		this.Salary=Salary;
	}
	public void display() {
		System.out.println("Employee Id ="+empid);
		System.out.println("Employee name="+empname);
		System.out.println("Employee Salary="+Salary);
	}

	public static void main(String[] args) {
		
		constructor con=new constructor(1,"Arjun",25000);
		con.display();
	}

}
