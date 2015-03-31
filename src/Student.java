import java.awt.Color;


/**
 * The class representing a Student
 * @author Benjamin Cohen-Wang
 */
public class Student {
    /**
     * The enum describing pitch
     */
    public static enum Pitch {
    	SOPRANO(new Color(0, 0, 0)),
    	MEZZO_SOPRANO(new Color(0, 0, 0)),
    	CONTRALTO(new Color(0, 0, 0)),
    	COUNTERTENOR(new Color(0, 0, 0)),
    	TENOR(new Color(0, 0, 0)),
    	BARITONE(new Color(0, 0, 0)),
    	TREBLE(new Color(0, 0, 0)),
    	BASS(new Color(0, 0, 0)),
    	UNKNOWN(new Color(0, 0, 0));
    	
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
    		return new Color(0, 0, 0);
    	case 10:
    		return new Color(0, 0, 0);
    	case 11:
    		return new Color(0, 0, 0);
    	case 12:
    		return new Color(0, 0, 0);
    	default:
    		return new Color(0, 0, 0);
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
    		return new Color(0, 0, 0);
    	case 2:
    		return new Color(0, 0, 0);
    	case 3:
    		return new Color(0, 0, 0);
    	case 4:
    		return new Color(0, 0, 0);
    	case 5:
    		return new Color(0, 0, 0);
    	case 6:
    		return new Color(0, 0, 0);
    	case 7:
    		return new Color(0, 0, 0);
    	case 8:
    		return new Color(0, 0, 0);
    	case 9:
    		return new Color(0, 0, 0);
    	case 10:
    		return new Color(0, 0, 0);
    	default:
    		return new Color(0, 0, 0);
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
	 * @param name the skill to set
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
