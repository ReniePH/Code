import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		ReadFile f = new ReadFile("shop.txt");//reads the file and saves it as a ShopItemList type
		RewriteFile rf = new RewriteFile(f.shopList());// Receives a ShopItemList type list and rewrites it according to the user will
		
		
	}
	
}
	
