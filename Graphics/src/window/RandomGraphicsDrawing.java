package window;

import javax.swing.*;
import java.awt.*;
import java.awt.Polygon;

public class RandomGraphicsDrawing extends JPanel{
	
	Graphics2D g2;
	Polygon[] polygon;
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g2 = (Graphics2D)g;
		this.polygon = new Polygon[(int)(Math.random()*4)];
		
	}

}
