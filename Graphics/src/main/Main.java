package main;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1 for first, 2 for second");
		if(in.nextInt() == 1)
		{
		// calls the Frame class which is responsible for creating the window
		graphics.Frame.window500X500();
		}
		else
			window.WindowFrame.windowfalling();

	}

}
