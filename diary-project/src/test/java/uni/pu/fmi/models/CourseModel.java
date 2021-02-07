package uni.pu.fmi.models;

import java.util.List;

import uni.pu.fmi.Course;
import uni.pu.fmi.services.CourseService;

public class CourseModel {

	public void navigateToCourseList() {
		System.out.println("Екранът с изучавани предмети.");
	}

	public List<Course> getCourses() {
		List<Course> courses = CourseService.getCourses();

		return courses;
	}
}
