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

    /**
     * Creates a frame and adds the display to the frame
     * @param args unused parameter
     */
    public static void main(String args[]) {
        initDisplay();
    }

    public static void initDisplay() {
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

    public static void initScreenSize() {
        screenSize = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getSize();
    }

    public static Display getDisplay() {
        return display;
    }

    public static Dimension getScreenSize() {
        return screenSize;
    }
}