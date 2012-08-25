package window;

import javax.swing.*;
import java.awt.*;

public class RandomGraphicsDrawing extends JPanel{
	
	Graphics2D g2;
	Polygon[] polygon;
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g2 = (Graphics2D)g;
		this.polygon = new Polygon[(int)(Math.random()*4)];
		for (int i = 0; i < this.polygon.length; i++) {
			//does this creates a random polygon?
			this.polygon[i] = new Polygon();
		}
		//g2.drawPolygon(this.polygon[0]);
	}
	
	//drops all the shapes one pixel in every 50 milliseconds 
	public void makeThemFall()
	{
		for (int i = 0; i < this.polygon.length; i++) 
		{
			while(this.polygon[i].getBoundingBox().getLocation().y < WindowFrame.getHeight())
			{
				g2.drawPolygon(this.polygon[i]);
				while(!Tick.milisec50())
				{
					//delays by 50 milliseconds
				}
				fallOne(this.polygon[i].ypoints);
				
			}
			
		}
		// should i use it?
		g2.dispose();
	}
	//drops the shape one pixel
	private void fallOne(int[] ypoints) {
		for (int i = 0; i < ypoints.length; i++) {
			ypoints[i] -= 1;
		}
		
	}

}
