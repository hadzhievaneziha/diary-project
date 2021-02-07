package uni.pu.fmi.services;

import java.util.ArrayList;
import java.util.List;
import uni.pu.fmi.Course;

public class CourseService {

	public static List<Course> getCourses() {

		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(new Course("БЕЛ"));
		courses.add(new Course("Математика"));
		courses.add(new Course("География"));
		courses.add(new Course("Биология"));

		return courses;

	}

}
