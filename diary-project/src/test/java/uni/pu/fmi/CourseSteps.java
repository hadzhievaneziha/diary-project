package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.CourseModel;

public class CourseSteps {

	private CourseModel courseModel = new CourseModel();

	@When("^Отваряне на списъка с предмети$")
	public void navigateCoursesList() throws Throwable {
		courseModel.navigateToCourseList();
	}

	@Then("^Вижда списъка с предмети: (.*)$")
	public void checkCoursesList(List<String> expectedCourses) throws Throwable {
		List<Course> courses = courseModel.getCourses();

		for (int i = 0; i < expectedCourses.size(); i++) {
			String expectedCourseName = expectedCourses.get(i);
			String courseName = courses.get(i).getName();

			assertEquals(expectedCourseName, courseName);
		}
	}
}
