package keys;
import graphics.InstructionsForDrawing;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyControl extends InstructionsForDrawing implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_A)
		{
			super.clear();
			System.out.println("IT WORKS!");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

}
