package classes;

public class FruitAndVegetable extends Product
{
	protected String variety;
	
	public FruitAndVegetable(String name,String barCode,double price,int availableQuantity,String variety)
	{
		super(name,barCode,price,availableQuantity);
		this.variety=variety;
	}
	
	public void setVariety(String variety)
	{
		this.variety=variety;
	}
	public String getVariety()
	{
		return variety;
	}
	
	public void showDetails()
	{
		System.out.println("\n-_-_-_-_-_-_-_-_-_-_Fruit And Vegetable Product Details_-_-_-_-_-_-_-_-_-_-\n");
		System.out.println("Name: "+name);
		System.out.println("Bar Code: "+barCode);
		System.out.println("Price: "+price+" BDT");
		System.out.println("Available quantity: "+availableQuantity+" pcs");
		System.out.println("Variety: "+variety);
	}
}