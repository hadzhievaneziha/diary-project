package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.ParentModel;

public class ParentSteps {
	
	private ParentModel parentModel = new ParentModel();

	@Given("^Отваря страницата за проверка на оценки$")
	public void navigateToGradeCheck() throws Throwable {
		parentModel.navigateToGradeCheck();
	}
	
	@When("^Въвежда име на ученик: (.*)$")
	public void typePupilName(String name) throws Throwable {
		parentModel.setPupilName(name);
	}
	
	@Then("^Вижда списъка с оценки: (.*)$")
	public void checkGradeList(List<String> expectedGrades) throws Throwable {
		List<Grade> grades = parentModel.getGrades();

		for (int i = 0; i < expectedGrades.size(); i++) {
			String expectedGrade = expectedGrades.get(i);
			Grade grade = grades.get(i);
			Course course = grade.getCourse();

			assertEquals(expectedGrade, course.getName() + " - " + grade.getGrade());
		}
	}
}
