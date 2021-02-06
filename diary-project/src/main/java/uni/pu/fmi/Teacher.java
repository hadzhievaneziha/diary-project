package uni.pu.fmi;

import java.util.*;

public class Teacher extends User {

	/**
	 * Default constructor
	 */
	public Teacher() {
	}

	public ClassYear classYear;
	public Set<Course> courses;
	public Set<Grade> grades;
}