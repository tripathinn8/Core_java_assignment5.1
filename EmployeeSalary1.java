
public class EmployeeSalary1 extends EmployeeSalary
{

	public double salary(double sal)
	{
		sal=sal*10;
		return sal;
		
	}
	
	
	public static void main(String[] args) 
	{
		EmployeeSalary1 emp=new EmployeeSalary1();
		double z=emp.salary(2010);
		System.out.println("The salary of the employee is"+" "+ z);
	}

}
