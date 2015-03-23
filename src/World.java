import java.util.ArrayList;

/**
 * A class representing a world
 * @author Benjamin Cohen-Wang
 */
public class World {
	/** The collection of students of this world **/
	ArrayList<Student> students;
	
	/**
	 * Default constructor, initializes this world
	 */
	public World() {
		students = new ArrayList<Student>();
	}
	
	/**
	 * Adds the given student to this world
	 * 
	 * @param student	the student to be added
	 */
	public void add(Student student) {
		students.add(student);
	}
	
	/**
	 * Removes the given student from this world
	 * 
	 * @param student	the student to be removed
	 */
	public void remove(Student student) {
		students.remove(student);
	}
}
