package uni.pu.fmi;

import java.util.*;

/**
 * 
 */
public class ClassYear {
    private String name;
    public Set<Pupil> pupils;
    public Teacher teacher;
    public Set<Course> courses;

    /**
     * Default constructor
     */
    public ClassYear(String name, String teacherFirstName, String teacherLastName) {
    	this.name = name;
    	this.teacher = new Teacher(teacherFirstName, teacherLastName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
	    return teacher;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


}