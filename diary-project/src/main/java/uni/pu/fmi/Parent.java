package uni.pu.fmi;

import java.util.*;

public class Parent extends User {

	/**
	 * Default constructor
	 */
	public Parent(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public Set<Pupil> pupils;

}