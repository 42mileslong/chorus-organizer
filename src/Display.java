import javax.swing.*;
import java.awt.*;

/**
 * Display class
 */
public class Display extends JComponent {

    /**
     * No need for content in constructor: display automatically paints on create
     */
    public Display() {

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
}