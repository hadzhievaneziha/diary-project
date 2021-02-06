package uni.pu.fmi;

import java.util.*;

public class Course {
	private String name;
	public Set<Teacher> teachers;
	public ClassYear classYear;
	public Set<Grade> grades;

	/**
	 * Default constructor
	 */
	public Course() {
	}

	/**
	 * 
	 */
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