package classes;
import interfaces.QuantityOperations;
public abstract class Product implements QuantityOperations
{
	
	protected String name;
    protected String barCode;
    protected double price;
    protected int availableQuantity;
	
	public Product()
	{
	  
	}
  
	public Product(String name,String barCode,double price,int availableQuantity)
	{
		this.name=name;
		this.barCode=barCode;
		this.price= price;
		this.availableQuantity=availableQuantity;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setBarCode(String barCode)
	{
		this.barCode=barCode;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity=availableQuantity;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getBarCode()
	{
		return barCode;
	}
	
	public double getPrice()
	{
		return price;
	}
	public int getAvailableQuantity()
	{
		return availableQuantity;
	}
	
	public boolean addQuantity(int amount)
	{
		boolean bool=false;
		if(amount>0)
		{
			availableQuantity+=amount;  
			bool=true;
			System.out.println("New quantity : "+availableQuantity);
		}
		else 
		{
			System.out.println("Invalid amount !");
		}
		return bool;
	}
	public boolean sellQuantity(int amount)
	{
		boolean bool=false;
		if(amount>0 && amount<=availableQuantity)
		{
			availableQuantity-=amount;
			bool=true;
			System.out.println("New quantity : "+availableQuantity);
		}
		else
		{
			System.out.println("Invalid amount !");
		}
		return bool;
	}
	
	public abstract void showDetails();
	
}