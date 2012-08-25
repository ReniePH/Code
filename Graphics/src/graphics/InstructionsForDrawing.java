package graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InstructionsForDrawing extends JPanel implements KeyListener{
	
	// for saving g later
	protected Graphics g1;
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g1=g;
		BlueRect(g);
		RedCircle(g);
		GreenDiamond(g);
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
	
	@Override
	public void keyPressed(KeyEvent e) {
		// in case the letter a in pressed
		if(e.getKeyCode() == KeyEvent.VK_A)
		{
			System.out.println("IT WORKS!");
			this.clear();
			this.RedCircle(g1);
		}
		// in case the letter b in pressed
		else if(e.getKeyCode() == KeyEvent.VK_B)
		{
			this.GreenDiamond(g1);
			this.BlueRect(g1);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}



}
