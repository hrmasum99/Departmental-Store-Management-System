package classes;

public class DairyAndBakery extends Product
{
	protected String type;
	
	public DairyAndBakery(String name,String barCode,double price,int availableQuantity,String type)
	{
		super(name,barCode,price,availableQuantity);
		this.type=type;
	}
	
	public void setType(String type)
	{
		this.type=type;
	}
	public String getType()
	{
		return type;
	}
	
	public void showDetails()
	{
		System.out.println("\n-_-_-_-_-_-_-_-_-_-_Dairy And Bakery Product Details_-_-_-_-_-_-_-_-_-_-\n");
		System.out.println("Name: "+name);
		System.out.println("Bar Code: "+barCode);
		System.out.println("Price: "+price+" BDT");
		System.out.println("Available quantity: "+availableQuantity+" pcs");
		System.out.println("Type: "+type);
	}
}