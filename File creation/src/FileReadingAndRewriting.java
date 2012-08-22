
import java.io.*;


public class FileReadingAndRewriting {
	
	public static ShopItemList read(String fileName) throws IOException
	{
		ShopItemList shop = new ShopItemList();
		try
		{
			FileInputStream fstream = new FileInputStream(fileName);//reads the raw data from the file
			DataInputStream in = new DataInputStream(fstream);// does some magic, please explain to me what it does XD
			BufferedReader br = new BufferedReader(new InputStreamReader(in));// magic turns into an ability to read string from the file XD
			String line;
			while((line = br.readLine()) != null)// I think that when you read a line it steps to the next one so i need to write it like this right?
			{
				addItemToShop(shop,line);
			}
			in.close();
			// I think it(in.close) closes the option to receive data so the system will be more efficient 
			//please explain to me if its what i think it is
			System.out.println("file was located and its content was uploaded to the program successfully");
		}catch (Exception e)//in case the file does not exist
		{
			createNewFile(fileName);
		}
		return shop;
	}
	// adds an item to the shop item list
	public static void addItemToShop(ShopItemList shop,String line)
	{
		int divide = line.indexOf(',');
		int start = line.indexOf('#');
		shop.add(line.substring(start, divide),Integer.parseInt(line.substring(divide+1)));
		//in the text i take for granted that the line is contracted from "name,price"
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
		DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName,false));
		for (int i = 0; i < shop.size(); i++) {
			out.writeBytes(i+"#"+shop.get(i).toString());
			//
			//
			//here is the problem in the adding of a new line
			//
			//
		}
		out.close();
	}

	

}
