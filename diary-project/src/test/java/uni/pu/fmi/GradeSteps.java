package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.GradeModel;

public class GradeSteps {
	
	private GradeModel gradeModel = new GradeModel();

	@Given("^Отваря страницата за добавяне на оценки$")
	public void navigateToCreateGrade() throws Throwable {
		gradeModel.navigateToCreateGrade();
	}
	
	@When("^Въвежда име на ученик (.*)$")
	public void typePupilName(String name) throws Throwable {
		gradeModel.setPupilName(name);
	}
	
	@When("^Въвежда име на предмет (.*)$")
	public void typeSubjectName(String name) throws Throwable {
		gradeModel.setSubjectName(name);
	}
	
	@When("^Потребителят въвежда оценка (.*)$")
	public void typeGrade(String grade) throws Throwable {
		gradeModel.setGrade(grade);
	}
	

	@When("^Натиска върху бутона за добавяне на оценка$")
	public void clickCreateGrade() throws Throwable {
		gradeModel.create();
	}

	@Then("^Вижда съобщение за добавена оценка (.*)$")
	public void checkCreateMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, gradeModel.getMessage());
	}
}
