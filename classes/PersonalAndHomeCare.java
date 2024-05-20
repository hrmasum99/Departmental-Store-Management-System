package classes;

public class PersonalAndHomeCare extends Product
{
	protected String brand;
	
	public PersonalAndHomeCare(String name,String barCode,double price,int availableQuantity,String brand)
	{
		super(name,barCode,price,availableQuantity);
		this.brand=brand;
	}
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public String getBrand()
	{
		return brand;
	}
	
	public void showDetails()
	{
		System.out.println("\n-_-_-_-_-_-_-_-_-_-_Personal And HomeCare Product Details_-_-_-_-_-_-_-_-_-_-\n");
		System.out.println("Name: "+name);
		System.out.println("Bar Code: "+barCode);
		System.out.println("Price: "+price+" BDT");
		System.out.println("Available quantity: "+availableQuantity+" pcs");
		System.out.println("Brand: "+brand);
	}
}