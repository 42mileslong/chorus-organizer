import javax.swing.*;

import java.awt.*;

/**
 * Main method
 * Creates display object and frame
 * Adds display to frame
 */
public class Main {
    private static Display display;

    private static Dimension screenSize;

    private static World world = new World();

    /**
     * Creates a frame and adds the display to the frame
     * @param args unused parameter
     */
    public static void main(String args[]) {
        initDisplay();
        test();
    }

    private static void test() {
        world.add(new Student("Ben", new Position(100, 100, Math.PI/4), Student.Pitch.BASS, Student.Gender.MALE, 10));
        world.add(new Student("Rafi", new Position(200, 100, -Math.PI/4), Student.Pitch.SOPRANO, Student.Gender.MALE, 10));
        display.repaint();
        
        for(double i = 0; i < 10*Math.PI; i += 0.01)
        {
        	for(Student student : world.getStudents())
        	{
        		student.getPos().setRotation(i);
        	}
        	
        	try
			{
				Thread.sleep(10);
			} 
        	catch (InterruptedException e)
			{
				e.printStackTrace();
			}
        	display.repaint();
        }
    }

    private static void initDisplay() {
        // finds the available size of the screen
        initScreenSize();

        // creates a new display object
        display = new Display();

        // initializes the frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize((int) screenSize.getWidth(), (int) screenSize.getHeight());
        frame.setVisible(true);
        frame.add(display);
    }

    private static void initScreenSize() {
        screenSize = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getSize();
    }

    public static World getWorld() {
        return world;
    }

    public static Display getDisplay() {
        return display;
    }

    public static Dimension getScreenSize() {
        return screenSize;
    }
}