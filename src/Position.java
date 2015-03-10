/**
 * A basic position class
 */
public class Position {
	/** The x position of this location **/
	private int x;
	
	/** The y position of this location **/
	private int y;
	
	/**
	 * Parametrized constructor, initializes x and y to given location values
	 * 
	 * @param pos the location whose value is constructed
	 */
	public Position(Position pos) {
		this.x = pos.x;
		this.y = pos.y;
	}
	
	/**
	 * Parametrized constructor, initializes x and y to given values
	 * 
	 * @param x	the x of this location
	 * @param y	the y of this location
	 */
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Position other) {
		if(this.x == other.x && this.y == other.y) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
}
