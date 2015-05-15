
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 * The class representing a Student
 * @author Benjamin Cohen-Wang
 */
public class Student implements Drawable {
	/** The length of the triangle representing this student **/
	public static int LENGTH;
	
	/** The width of the triangle representing this student **/
	public static int WIDTH;
	
    /**
     * The enum describing pitch
     */
    public static enum Pitch {
    	SOPRANO(new Color(129, 85, 109)),
    	MEZZO_SOPRANO(new Color(129, 55, 62)),
    	CONTRALTO(new Color(129, 83, 48)),
    	COUNTERTENOR(new Color(129, 126, 72)),
    	TENOR(new Color(82, 129, 95)),
    	BARITONE(new Color(86, 125, 129)),
    	TREBLE(new Color(64, 86, 122)),
    	BASS(new Color(73, 67, 127)),
    	UNKNOWN(new Color(137, 137, 137));

    	Color color;

    	private Pitch(Color color) {
    		this.color = color;
    	}
    	
    	public Color getColor() {
    		return color;
    	}
    }
	
    /**
     * The enum describing gender
     */
    public static enum Gender {
    	MALE,
    	FEMALE,
    	UNKNOWN
    }
    
    /**
     * Returns the color corresponding to the given grade
     * 
     * @param grade	the grade to be converted
     * @return the color of this grade
     */
    public static Color getGradeColor(int grade) {
    	switch(grade) {
    	case 9:
    		return new Color(67, 40, 24);
    	case 10:
    		return new Color(45, 90, 60);
    	case 11:
    		return new Color(42, 51, 68);
    	case 12:
    		return new Color(79, 44, 72);
    	default:
    		return new Color(44, 44, 44);
    	}
    }
    
    /**
     * Returns the color corresponding to the given skill level
     * 
     * @param skill	the skill to be converted
     * @return the color of this skill
     */
    public static Color getSkillColor(int skill) {
    	switch(skill) {
    	case 1:
    		return new Color(119, 102, 193);
    	case 2:
    		return new Color(110, 155, 193);
    	case 3:
    		return new Color(102, 193, 159);
    	case 4:
    		return new Color(88, 193, 96);
    	case 5:
    		return new Color(181, 193, 86);
    	case 6:
    		return new Color(193, 159, 88);
    	case 7:
    		return new Color(193, 102, 82);
    	case 8:
    		return new Color(193, 74, 38);
    	case 9:
    		return new Color(193, 94, 133);
    	case 10:
    		return new Color(157, 14, 142);
    	default:
    		return new Color(223, 223, 223);
    	}
    }
    
    /**
     * Returns the color corresponding to the given skill level and pitch
     * 
     * @param skill	the skill to be converted
     * @param pitch	the color associated with the pitch
     * @return the color of this skill and pitch
     */
    public static Color getColor(Color pitch, int skill) {
    	int colorAvg = (pitch.getRed() + pitch.getGreen() + pitch.getBlue())/3;
    	
    	int newRed = (pitch.getRed()*skill + colorAvg)/(skill + 1);
    	int newGreen = (pitch.getGreen()*skill + colorAvg)/(skill + 1);
    	int newBlue = (pitch.getBlue()*skill + colorAvg)/(skill + 1);
    	
    	return new Color(newRed, newGreen, newBlue);
    }
    
	/** The name of this student **/
    private String name;
    
    /** The position of this student **/
    private Position pos;
    
    /** The pitch of this student **/
    private Pitch pitch;
    
	/** The gender of this student **/
    private Gender gender;
 
    /** The grade of this student **/
    private int grade;
    
    /** The skill of this choir member **/
    private int skill;
    
    /** The default constructor of a student, sets fields to unknown **/
    public Student() {
    	this(new Position(0, 0, 0));
    }
    
    /** The parameterized constructor of a student, sets position**/
    public Student(Position pos) {
    	this("[Insert Name]", pos, Pitch.UNKNOWN, Gender.UNKNOWN, 0);
    }
    
    /** The parameterized constructor of a student, sets fields to parameters **/
    public Student(String name, Position pos, Pitch pitch, Gender gender, int grade) {
    	setName(name);
    	setPos(pos);
    	setPitch(pitch);
    	setGender(gender);
    	setGrade(grade);
    }
    
	/**
	 * Draws this student
	 */
	@Override
	public void draw(Graphics graphics)
	{
		Position[] points = new Position[3];
		
		points[0] = new Position(pos.getX(), pos.getY() + LENGTH/2);
		points[1] = new Position(pos.getX() + WIDTH/2, pos.getY() - LENGTH/2);
		points[2] = new Position(pos.getX() - WIDTH/2, pos.getY() - LENGTH/2);
		
		Position[] rotatedPoints = rotate(pos, pos.getRotation(), points);
		
		int[] xPoints = new int[points.length];
		int[] yPoints = new int[points.length];
		
		for(int i = 0; i < rotatedPoints.length; i ++) {
			xPoints[i] = rotatedPoints[i].getX();
			yPoints[i] = rotatedPoints[i].getY();
		}
		
		graphics.drawPolygon(new Polygon(xPoints, yPoints, points.length));
	}
	
	public Position[] rotate(Position point, double angle, Position[] points)
	{
		Position[] rotatedPoints = new Position[points.length];
		
		for(int i = 0; i < points.length; i ++)
		{
			double xCoord = points[i].getX();
			double yCoord = points[i].getY();
			double cos = Math.cos(angle);
			double sin = Math.sin(angle);
			rotatedPoints[i] = new Position((int) (xCoord*cos - yCoord*sin), (int)(xCoord*sin + yCoord*cos));
		}
		
		return rotatedPoints;
	}
    
    /**
	 * @return the skill
	 */
	public int getSkill() {
		return skill;
	}
    
    /**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the pos
	 */
	public Position getPos() {
		return pos;
	}

	/**
	 * @return the pitch
	 */
	public Pitch getPitch() {
		return pitch;
	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}
	
	/**
	 * @param skill the skill to set
	 */
	public void setSkill(int skill) {
		this.skill = skill;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param pos the pos to set
	 */
	public void setPos(Position pos) {
		this.pos = pos;
	}

	/**
	 * @param pitch the pitch to set
	 */
	public void setPitch(Pitch pitch) {
		this.pitch = pitch;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
