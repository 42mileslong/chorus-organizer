/**
 * A basic position class
 */
public class Position {
	/** The x position of this location **/
	private int x;
	
	/** The y position of this location **/
	private int y;

    /** The rotation of the position, goes counterclockwise from positive x-axis */
    private double rotation;
	
	/**
	 * Parametrized constructor, initializes x and y to given location values
	 * 
	 * @param pos the location whose value is constructed
	 */
	public Position(Position pos) {
		this.x = pos.x;
		this.y = pos.y;
        this.rotation = pos.rotation;
	}
	
	/**
	 * Parametrized constructor, initializes x and y to given values
	 * 
	 * @param x	the x of this location
	 * @param y	the y of this location
	 */
	public Position(int x, int y, double r) {
		this.x = x;
		this.y = y;
        this.rotation = r;
	}

	public boolean equals(Position other) {
        return (this.x == other.x && this.y == other.y && this.rotation == other.rotation);
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

    public double getRotation() {
        return rotation;
    }

    public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

    public void setRotation(double rotation) {
        this.rotation = rotation;
    }
}
