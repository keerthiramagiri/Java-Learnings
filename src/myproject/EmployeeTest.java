package myproject;class Employee
{
	int empNum;
	String empName;
	double empSalary;
	void setEmpDetails(int empNum, String empName, double empSalary)
	{
		this.empNum = empNum;
		this.empName = empName;
		this. empSalary= empSalary;
		}
	void disEmpDetails()
	{
		System.out.println("Emp Num= "+empNum);
		System.out.println("Emp Name= "+empName);
		System.out.println("Emp Salary= "+empSalary);
		
	}
	
	
	
}

public class EmployeeTest {

	public static void main(String[] args){
		Employee e1 = new Employee();
		e1.setEmpDetails(111,"kiki",2000.0);
		e1.disEmpDetails();
		Employee e2 = new Employee();
		e2.setEmpDetails(333,"jiju",4000.0);
		e2.disEmpDetails();
		
		
		

	}

}
