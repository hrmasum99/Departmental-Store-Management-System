package classes;
public class Employee 
{
	protected String name;
	protected String empId;
	protected double salary;
	
	public Employee()
	{
		
	}
	public Employee(String name,String empId,double salary)
	{
		this.name=name;
		this.empId=empId;
		this.salary=salary;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setEmpId(String empId)
	{
		this.empId=empId;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public String getName() 
	{
		return name;
	}
	public String getEmpId()
	{
		return empId;
	}	
	public double getSalary()
	{
		return salary;
	}	
	
	public void showDetails()
	{
		System.out.println("\nName : "+name);
		System.out.println("Employee Id : "+empId);
		System.out.println("Salary : "+salary+" BDT");
	}
}