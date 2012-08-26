package window;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomGraphicsDrawing extends JPanel{
	
	Graphics2D g2;
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g2 = (Graphics2D)g;
	}
	
	//drops all the shapes one pixel in every 50 milliseconds 
	private void makeThemFall()
	{
		
	}

}
