package graphics;
import javax.swing.*;
import java.awt.*;

import keys.KeyControl;
public class InstructionsForDrawing extends JPanel{
	
	public void paintComponent(Graphics g)
	{
		//please explain to me what this action does
		super.paintComponent(g);
		BlueRect(g);
		RedCircle(g);
		GreenDiamond(g);
		KeyControl kc = new KeyControl();
	}
	// set instructions to build a non filled rectangle in the color blue
	private void BlueRect(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.drawRect(200, 250, 100, 50);
	}
	// set instructions to build a non filled circle in the color red
	private void RedCircle(Graphics g)
	{
		g.setColor(Color.RED);
		g.drawRoundRect(200, 300, 100, 100, 100, 100);
	}
	// set instructions to build a non filled diamond in the color green
	private void GreenDiamond(Graphics g)
	{
		g.setColor(Color.GREEN);
		g.drawLine(250,250,300,200);
		g.drawLine(250,250,200,200);
		g.drawLine(200,200,250,150);
		g.drawLine(300,200,250,150);
	}
	protected void clear() {
		super.removeAll();
		super.updateUI();
	}



}
