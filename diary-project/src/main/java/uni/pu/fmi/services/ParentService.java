package uni.pu.fmi.services;

import java.util.ArrayList;
import java.util.List;

import uni.pu.fmi.Grade;

public class ParentService {

	public static List<Grade> getGrades(String pupilName) {
		ArrayList<Grade> grades = new ArrayList<Grade>();
		grades.add(new Grade(3, "Биология"));
		grades.add(new Grade(4, "Математика"));
		grades.add(new Grade(2, "БЕЛ"));
		grades.add(new Grade(5, "География"));

		return grades;
	}

}
