import java.io.*;
import java.util.Scanner;


public class ActionsOnShopItems {
	
	public static void actions(ShopItemList shop) throws IOException
	{
		Scanner in = new Scanner(System.in);
		
		boolean con = true;//the condition for the loop to start over, once "exit" is selected it becomes false
		String itemName;//the item name for the "add item" option
		int itemPrice;//the item price for the "add item" option
		
		while(con)
		{
			System.out.println();
			System.out.println("Please insert a number that represents your choice:");
			System.out.println("1: add item");
			System.out.println("2: remove item by index number");
			System.out.println("3: print changed file");
			System.out.println("4: exit");
			
				switch(in.nextInt())
				{
					case 1: System.out.println("Please insert item name and price in the following order:");// add option
					System.out.println("name:");
					itemName = in.next();
					System.out.println("price:");
					itemPrice = in.nextInt();
					
					shop.add(itemName,itemPrice);
					break;
					case 2: System.out.println("Please insert item index number for removal:");// removal option
					shop.remove(in.nextInt());
					break;
					case 3:
						System.out.println(shop.toString());
						break;
					case 4:// exit option. once selected the file is rewritten from the data inside the list. note that in the loop the data is virtual and does not save in case of input error
						FileReadingAndRewriting.rewrite(shop,"shop.txt");
						con = false;
						break;
				}
				
			}
			in.close();// closes scanner in
	}

}
