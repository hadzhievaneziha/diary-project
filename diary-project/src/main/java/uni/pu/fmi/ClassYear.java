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
    public ClassYear() {
    }

    public String getName() {
        return name;
    }

    /**
     * 
     */
    public void setName(String name) {
		this.name = name;
	}

}