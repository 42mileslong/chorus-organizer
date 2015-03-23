
/**
 * The class representing a Student
 * @author Benjamin Cohen-Wang
 */
public class Student {
    /**
     * The enum describing pitch
     */
    public static enum Pitch {
    	SOPRANO,
    	MEZZO_SOPRANO,
    	CONTRALTO,
    	COUNTERTENOR,
    	TENOR,
    	BARITONE,
    	TREBLE,
    	BASS,
    	UNKNOWN
    }
	
    /**
     * THe enum describing gender
     */
    public static enum Gender {
    	MALE,
    	FEMALE,
    	UNKNOWN
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
    
    /** The default constructor of a student, sets fields to unknown **/
    public Student() {
    	this(new Position(0, 0, 0));
    }
    
    /** The parameterized constructor of a student, sets position**/
    public Student(Position pos) {
    	this("", pos, Pitch.UNKNOWN, Gender.UNKNOWN, 0);
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
