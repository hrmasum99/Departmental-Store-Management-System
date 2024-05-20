package classes;              
import interfaces.*;


public class DepartmentalStore implements ProductOperations,EmployeeOperations,ManagerOperations
{
	private Product products[]=new Product[100000];			//one to many
	private Manager manager;           						//one to one
	private Employee employees [] = new Employee[100];		//one to many
	private int totalProduct;
	private int totalEmployee;

	public boolean insertProduct(Product p)
	{
		boolean bool=false;
		if(totalProduct<products.length)
		{
			products[totalProduct]=p;
			totalProduct++;
			bool=true;
			System.out.println("Product has been successfully added !");
		}
		else
		{
			System.out.println("Not enough space !");
		}
		return bool;
	}

	/*public boolean removeProduct(Product p)
	{
		boolean bool=false;
		for(int i=0;i<totalProduct;i++)
		{
			if(products[i]==p)
			{
				products[i]=products[--totalProduct];
				bool=true;
			}
			else
			{
				bool = false;
			}
		}
		if(bool==true)
		{
			System.out.println("Product has been successfully removed !");
		}
		else
			{
				System.out.println("Product remove has been failed !");
			}
		return bool;
	}*/

	public boolean removeProduct(Product p)
	{
		boolean bool = false;

		for(int i=0;i<totalProduct; i++){
			if(products[i]==p){
				products[i]=null;
				bool =  true;
				break;
			}
			else
			{
				bool = false;
			}
		}
		if(bool==true)
		{
			System.out.println("Product has been successfully removed !");
		}
		else
			{
				System.out.println("Product remove has been failed !");
			}
		return bool;
	}

	public Product searchProduct(String barCode)
	{
		Product p = null;
		for(int i=0;i<totalProduct;i++){
			if(products[i]!= null){
				if(products[i].getBarCode().equals(barCode)){
					p=products[i];
					break;
				}
			}
		}
		return p;
	}

	/*public Product searchProduct(String barCode)
	{
		boolean bool=false;
		int result=0;
		try
		{
			for(int i=0;i<totalProduct;i++)
			{
				if(products[i].getBarCode()==barCode)
				{
					result=i;
					bool=true;
				}
			}
		}
		catch(NullPointerException e1)
		{
			System.out.println("Exception : "+e1);
		}
		catch(Exception e2)
		{
			System.out.println("Exception : "+e2);
		}
		return products[result];
	}*/

	public void showAllProducts()
	{
		for(int i=0;i<totalProduct;i++)
		{
			if(products[i]!=null)
			{
				products[i].showDetails();
			}
			else
			{
				System.out.println("There is no product !");
			}
		}
	}

	public boolean insertEmployee(Employee e)
	{
		boolean bool=false;
		if(totalEmployee<employees.length)
		{
			employees[totalEmployee]=e;
			totalEmployee++;
			bool=true;
			System.out.println("Employee has been successfully added !");
		}
		else
		{
			System.out.println("Employee limit has been reached !");
		}
		return bool;
	}

	/*public boolean removeEmployee(Employee e)
	{
		boolean bool=false;
		for(int i=0;i<totalEmployee;i++)
		{
			if(employees[i]==e)
			{
				employees[i]=employees[--totalEmployee];
				bool=true;
			}

		}
		if(bool==true)
		{
			System.out.println("Employee has been successfully removed !");
		}
		else
		{
			System.out.println("Employee remove has been failed !");
		}
		return bool;
	}*/

	public boolean removeEmployee(Employee e)
	{
		boolean bool = false;

		for(int i=0;i<totalEmployee; i++){
			if(employees[i]==e){
				employees[i]=null;
				bool =  true;
				break;
			}
			else
			{
				bool = false;
			}
		}
		if(bool==true)
		{
			System.out.println("Employee has been successfully removed !");
		}
		else
		{
			System.out.println("Employee remove has been failed !");
		}
		return bool;
	}

	public Employee searchEmployee(String empId)
	{
		Employee e = null;
		for(int i=0;i<totalEmployee;i++){
			if(employees[i]!= null){
				if(employees[i].getEmpId().equals(empId)){
					e=employees[i];
					break;
				}
			}
		}
		return e;
	}

	/*public Employee searchEmployee(String empId)
	{
		boolean bool=false;
		int result=0;
		try
		{
			for(int i=0;i<totalEmployee;i++)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					result=i;
					bool=true;
				}
			}
		}
		catch(NullPointerException e1)
		{
			System.out.println("Exception : "+e1);
		}
		catch(Exception e2)
		{
			System.out.println("Exception : "+e2);
		}
		return employees[result];
	}
	*/
	public void showAllEmployees()
	{
		for(int i=0;i<totalEmployee;i++)
		{
			if(employees[i]!=null)
			{
				employees[i].showDetails();
			}
			else
			{
				System.out.println("There is no product !");
			}
		}
	}

	public void addManager(Manager m)
	{
		manager=m;
	}

	public boolean addBonus(int amount)
	{
		boolean bool=false;
		for(int i=0;i<totalEmployee;i++)
		{
			if(amount>0)
			{
				employees[i].setSalary(employees[i].getSalary()+amount);
				bool=true;
				System.out.println("New salary : "+employees[i].getSalary());
				}
			else
			{
				System.out.println("Invalid amount !");
			}

		}
		if(bool==true)
		{
			System.out.println("Bonus added in all employee's salary Successfully !");
		}
		return bool;
	}

	public boolean backBonus(int amount)
	{
		boolean bool=false;
		for(int i=0;i<totalEmployee;i++)
		{
			if(amount>0&&amount<10001)
			{
				employees[i].setSalary(employees[i].getSalary()-amount);
				bool=true;
				System.out.println("New salary : "+employees[i].getSalary());
				}
			else
			{
				System.out.println("Invalid amount !");
			}

		}
		if(bool==true)
		{
			System.out.println("Bonus has been back for all employee's salary Successfully !");
		}
		return bool;
	}

	public boolean increaseSalary(Employee e,int amount)
	{
		boolean bool=false;
		for(int i=0;i<totalEmployee;i++)
		{
			if(employees[i]==e)
			{
				if(amount>0)
				{
					employees[i].setSalary(employees[i].getSalary()+amount);
					bool=true;
					System.out.println("New salary : "+employees[i].getSalary());
					}
				else
				{
				System.out.println("Invalid amount !");
				}
			}
		}
		if(bool==true)
		{
			System.out.println("Increasd the salary Successfully !");
		}
		return bool;
	}

	public void showManager()
	{
		manager.showDetails();
	}
}