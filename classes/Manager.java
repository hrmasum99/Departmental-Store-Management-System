package classes;
public class Manager 
{
	protected String name;
	protected String manId;
	protected double salary;
	protected static int pin=1234;
	
	public Manager()
	{
		
	}
	public Manager(String name,String manId,double salary)
	{
		this.name=name;
		this.manId=manId;
		this.salary=salary;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setManId(String manId)
	{
		this.manId=manId;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public String getName()
	{
		return name;
	}
	public String getManId()
	{
		return manId;
	}
	public double getSalary()
	{
		return salary;
	}

	public static int getPin()
	{
		return pin;
	}
	
	public void showDetails()
	{
		System.out.println("Name : "+name);
		System.out.println("Manager Id : "+manId);
		System.out.println("Salary : "+salary+" BDT");
	}
	
}