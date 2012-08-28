package window;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class RandomGraphicsDrawing extends JPanel{
	
	Graphics2D g2;

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g2 = (Graphics2D)g;
		makeThemFall();
	}
	
	//drops all the shapes one pixel in every 50 milliseconds 
	private void makeThemFall()
	{
		for (int i = 0; i < 5; i++) 
		{
			g2.setColor(randomColor());
			Rectangle rect = rect();
			g2.fill(rect);
			while(rect.getY() <WindowFrame.getHeight())
			{
				tick(50);
				super.removeAll();
				rect.setLocation((int)(rect.getX()), (int)(rect.getY())+1);
				super.updateUI();
				
			}
			
		}
		
	}
	private void tick(int wait)
	{
		long time;
		time = System.currentTimeMillis();
		while(System.currentTimeMillis() - time < wait)
		{	
		}
		
	}
	private Shape randomShape() {
		
		return null;
	}
	// creates a random rectangle
	public Rectangle rect()
	{
		Rectangle rect = new Rectangle();
		rect.setLocation(randomSizeOneTo(1), 0);
		rect.setSize(randomSizeOneTo(20), randomSizeOneTo(20));
		return rect;
	}
	
	// returns a random value between 1 and the windows size divided by x
	public int randomSizeOneTo(int x)
	{
		return (int)((Math.random()*WindowFrame.getHeight())/x +1);
	}
	public Color randomColor()
	{
		return new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
	}

}
