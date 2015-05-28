import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Display class
 */
public class Display extends JPanel implements MouseListener {
	/** The menu bar of this display panel **/
	private JMenuBar menuBar;
	
	/** The file menu of this display panel **/
	private JMenu file;
	private JMenu newItem;
	
    /**
     * No need for content in constructor: display automatically paints on create
     */
    public Display() {
    	menuBar = new JMenuBar();
    	
    	file = new JMenu("File");
    	file.setMnemonic(KeyEvent.VK_A);
    	file.getAccessibleContext().setAccessibleDescription("File");
    	
    	menuBar.add(file);
    	this.add(menuBar);
    }

    /**
     * Includes all the individual body parts of the cow
     * Organized by body part
     * Paints each body part
     *
     * @param g graphics
     */
    public void paint(Graphics g) {
        Main.getWorld().draw(g);
    }

	@Override
	public void mouseClicked(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
}