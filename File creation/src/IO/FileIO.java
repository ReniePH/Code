package IO;

import java.io.*;
import java.util.Scanner;

import shop.ShopItemList;


public class FileIO {
	
	public static ShopItemList read(String fileName) throws IOException
	{
		ShopItemList shop = new ShopItemList();
		try
		{
			Scanner cc = new Scanner(new File(fileName));
			while(cc.hasNext())// I think that when you read a line it steps to the next one so i need to write it like this right?
			{ 
				addItemToShop(shop,cc.nextLine());
			}
			System.out.println("file was located and its content was uploaded to the program successfully");
			cc.close();
		}catch (Exception e)//in case the file does not exist
		{
			createNewFile(fileName);
		}
		return shop;
	}
	// adds an item to the shop item list
	public static void addItemToShop(ShopItemList shop,String line)
	{
		//in the text i take for granted that the line is contracted from "name,price"
		int divide = line.indexOf(',');
		int start = line.indexOf('#')+1;
		shop.add(line.substring(start, divide),Integer.parseInt(line.substring(divide+1)));
	}
	// creates new file. in case of an unknown error informs the user
	public static void createNewFile(String fileName) throws IOException
	{
		File shoptxt = new File(fileName);
		if(!shoptxt.exists())
		{
			System.out.println("Couldn't find shop.txt, the system will create one");
			shoptxt.createNewFile();
		}
		else
			System.out.println("System error, shop.txt will be rewritten");
	}
	// rewrite the shop.txt file with the new values
	public static void rewrite(ShopItemList shop, String fileName) throws IOException
	{
		//DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName,false));
		PrintWriter out = new PrintWriter(fileName);
		for (int i = 0; i < shop.size(); i++) {
			
			out.println(i+"#"+shop.get(i).toString());
		}
		out.close();
	}

	

}
