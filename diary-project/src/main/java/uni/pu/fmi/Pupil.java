package uni.pu.fmi;

import java.util.*;

public class Pupil extends User {

	/**
	 * Default constructor
	 */
	public Pupil(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public Set<ClassYear> classYear;
	public Set<Grade> grades;
	public Set<Parent> parents;

}