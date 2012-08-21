import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile {
	public ShopItemList shop;
	
	public ReadFile(String fileName) throws IOException
	{
		this.shop = new ShopItemList();
		try
		{
			FileInputStream fstream = new FileInputStream(fileName);//reads the raw data from the file
			DataInputStream in = new DataInputStream(fstream);// does some magic, please explain to me what it does XD
			BufferedReader br = new BufferedReader(new InputStreamReader(in));// magic turns into an ability to read string from the file XD
			String line;
			while((line = br.readLine()) != null)// I think that when you read a line it steps to the next one so i need to write it like this right?
			{
				int divide = line.indexOf(',');
				int start = line.indexOf('#');
				shop.add(line.substring(start, divide),Integer.parseInt(line.substring(divide+1)));
				//in the text i take for granted that the line is contracted from "name,price"
			}
			in.close();
			// I think it(in.close) closes the option to receive data so the system will be more efficient 
			//please explain to me if its what i think it is
		}catch (Exception e)//in case the file does not exist
		{
			System.out.println("Couldn't find shop.txt, the system will create one");
			File shoptxt = new File("shop.txt");
			if(!shoptxt.exists())
				shoptxt.createNewFile();
			else
				System.out.println("System error, shop.txt will be rewritten");
		}
	}
	public ShopItemList shopList()
	{
		return this.shop;
	}

}

