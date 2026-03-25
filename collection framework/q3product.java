
/* Q3. Create a Product POJO with productId, name, price, quantity.
Store products in a Vector.
Perform:
Display out-of-stock products
Calculate total stock value
Display products with stock value > 10,000
Sample Output :- 
	Out of Stock Products:
Pen

Total Stock Value: 45500
High Value Products:
Laptop

Explanation
Stock value = price × quantity
Use loops to calculate total
Use conditions to check quantity and stock value
 */
import java.util.*;
class Product
{
	private int productId;
	private String name;
	private int price;
	private int quantity;
	
	public Product(int productId ,String name,int price , int quantity)
	{
		this.productId=productId;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	public int getProductId()
	{
		return productId;
	}
	public String getName()
	{
		return name;
	}
	public int getPrice()
	{
		return price;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
}
public class q3product
{
	public static void main(String x[])
	{
		Vector<Product> v=new Vector<>();
		v.add(new Product(1,"pen",10,0));
		v.add(new Product(2,"notebook",70,10));
		v.add(new Product(3,"books",10,30));
		v.add(new Product(4,"Notes",80,10));
		v.add(new Product(5,"Laptop", 45000, 1));
		
		double totalStockValue=0;
		System.out.println("out of stock product:");
		
		for(Product p:v)
		{
			if(p.getQuantity()==0)
			{
				System.out.println("\t"+p.getName());
			}
		}
		
		//Calculate total stock vlaue
		for(Product p:v)
		{
			totalStockValue+=p.getPrice()*p.getQuantity();
			
		}
		System.out.println("\nTotal stock of value:"+totalStockValue);
		
		
		System.out.println("Hight value product:");
		for(Product p:v)
		{
			double stockValue=p.getPrice()*p.getQuantity();
			if(stockValue>10000)
			{
				System.out.println(p.getName());
			}
		
		}
		
		
	}
}