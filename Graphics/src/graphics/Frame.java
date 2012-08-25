package graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class Frame {
	
	public static void window()
	{
		//creates the window with the title "Day 2 Success"
		JFrame f = new JFrame("Day 2 Success");
		// sets the windows to be visible
		f.setVisible(true);
		//sets the size of the window to 500 in length and in width
		f.setSize(500,500);
		// sets the background color to white (for some reason the color didn't change) 
		f.setBackground(Color.WHITE);
		//sets the program to close when the windows is closed
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// creates a new object that will contain the instructions for the drawing
		InstructionsForDrawing d = new InstructionsForDrawing();
		// adds a keylistener
		d.addKeyListener(d);
		// adds the object instructions to the JFrame object
		f.add(d);
	}

}
