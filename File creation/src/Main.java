import java.io.IOException;
import IO.FileIO;
import shop.ActionsOnShopItems;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		ActionsOnShopItems.actions(FileIO.read("shop.txt"));
		
	}
	
}
	
