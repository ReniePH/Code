package window;

import java.awt.Color;
import javax.swing.JFrame;

public class WindowFrame {
	static JFrame wf;
	public static void windowfalling()
	{
		//creates the window with the title "Day 2 Success"
		wf = new JFrame("Falling From Heaven");
		// sets the windows to be visible
		wf.setVisible(true);
		//sets the size of the window to 500 in length and in width
		wf.setSize(750,750);
		// sets the background color to white (for some reason the color didn't change) 
		wf.setBackground(Color.WHITE);
		//sets the program to close when the windows is closed
		wf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// creates a new object that will contain the instructions for the drawing
		RandomGraphicsDrawing rgd = new RandomGraphicsDrawing();
		// adds the object instructions to the JFrame object
		wf.add(rgd);
	}
	public static int getHeight()
	{
		return wf.getHeight();
	}

}
