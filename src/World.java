import java.awt.*;
import java.util.ArrayList;

/**
 * A class representing a world
 * @author Benjamin Cohen-Wang
 */
public class World {
    /** The collection of students of this world **/
	ArrayList<Student> students;

    /** The size of the world in pixels */
    Dimension size;
	
	/**
	 * Default constructor, initializes this world
	 */
	public World() {
		students = new ArrayList<Student>();
	}
	
	/**
	 * Adds the given student to this world
	 * @param student	the student to be added
	 */
	public void add(Student student) {
		students.add(student);
	}
	
	/**
	 * Removes the given student from this world
	 * @param student	the student to be removed
	 */
	public void remove(Student student) {
		students.remove(student);
	}

    /**
     * Returns the list of students in the form of an array
     * @return the students in the world
     */
    public Student[] getStudents() {
        Student[] studentList = new Student[students.size()];
        for (int i = 0; i < students.size(); i++) {
            studentList[i] = students.get(i);
        }
        return studentList;
    }

    /**
     * Returns the size of the world in pixels
     * @return the size of the world in pixels
     */
    public Dimension getSize() {
        return size;
    }

    /**
     * Sets the size of the world
     * @param size the size of the world
     */
    public void setSize(Dimension size) {
        this.size = size;
    }
}
