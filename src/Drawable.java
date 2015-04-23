import java.awt.Graphics;

/**
 * An interface representing drawable objects
 * 
 * @author Benjamin Cohen-Wang
 */
public interface Drawable {
	/**
	 * Draws this drawable object
	 * @param graphics	the graphics object to be drawn on
	 */
	public abstract void draw(Graphics graphics);
}
