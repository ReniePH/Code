import java.util.ArrayList;
import java.util.List;

// class containing the list of shop item and their commends.
public class ShopItemList {
	public List<Shop> shop;
	
	public ShopItemList()//Constructor 
	{
		this.shop = new ArrayList<Shop>();
	}
	public void add(String name, int price)// adds another item
	{
		shop.add(new Shop(name,price));
	}
	public int size()
	{
		return this.shop.size();
	}
	public Shop get(int i)
	{
		return this.shop.get(i);
	}
	public void remove(int nextInt) 
	{
		this.shop.remove(nextInt);
	}
	public String toString()
	{
		return shop.toString();
	}

}
