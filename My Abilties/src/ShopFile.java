import java.util.*;
import java.io.*;

public class ShopFile {

	public static void main(String[] args) throws IOException {// it made me write that throw dunno what it is. does it ignore it or something like that?
		List<Shop> shop = new ArrayList<Shop>();
			try
			{
				FileInputStream fstream = new FileInputStream("shop.txt");
				DataInputStream in = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				String line;
				while((line = br.readLine()) != null)// I think that when you read a line it steps to the next one so i need to write it like this right?
				{
					int divide = line.indexOf(',');
					shop.add(new Shop(line.substring(0, divide),Integer.parseInt(line.substring(divide+1))));
					//in the text i take for granted that the line is contracted from "name,price"
				}
				in.close();
			}catch (Exception e)
			{
				System.out.println("Couldn't find shop.txt, the system will create one");
				File shoptxt = new File("shop.txt");
				if(!shoptxt.exists())
					shoptxt.createNewFile();
			}
			boolean con = true;
			Scanner in = new Scanner(System.in);
			String itemName;
			int itemPrice;
			while(con)
			{
				System.out.println("Please insert a number that represents your choice:");
				System.out.println("1: add item");
				System.out.println("2:remove item by index number");
				System.out.println("3: exit");
					switch(in.nextInt())
					{
					case 1: System.out.println("Please insert item name:");
					itemName = in.next();
					System.out.println("Please insert item price:");
					itemPrice = in.nextInt();
					shop.add(new Shop(itemName,itemPrice));
					break;
					case 2: System.out.println("Please insert item index number for removal:");
					shop.remove(in.nextInt());
					break;
					case 3:
						DataOutputStream out = new DataOutputStream(new FileOutputStream("shop.txt",false));// this is why i wrote throws
						for (int i = 0; i < shop.size(); i++) {
							out.write(shop.get(i).toString().getBytes());
						}
						con = false;
						break;
					}
					
				}
				
			}
			

	}
