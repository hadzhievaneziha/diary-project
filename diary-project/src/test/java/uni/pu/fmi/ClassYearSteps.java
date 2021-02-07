package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.ClassYearModel;

public class ClassYearSteps {
	ClassYearModel classYearModel = new ClassYearModel();
	
	@Given("^Отваряне на страницата за създаване на паралелка$")
	public void navigateToCreateClassYear() throws Throwable {
		classYearModel.navigateToCreateClassYear();
	}

	@When("^Потребителят въвежда име на паралелка: (.*)$")
	public void typeClassYearName(String name) throws Throwable {
		classYearModel.setClassYearName(name);
	}

	@When("^Натиска върху бутона за създаване на паралелка$")
	public void clickCreateClassYear() throws Throwable {
		classYearModel.create();
	}

	@Then("^Вижда съобщение за създаване на паралелка (.*)$")
	public void checkCreateMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, classYearModel.getMessage());
	}

	@When("^Отваряне на списъка с паралелки$")
	public void navigateClassYearsList() throws Throwable {
		classYearModel.navigateToClassYearList();
	}

	@Then("^Вижда списъка с паралелки: (.*)$")
	public void checkClassYearsList(List<String> expectedClassYears) throws Throwable {
		List<ClassYear> classYears = classYearModel.getClassYears();
		
		for (int i = 0; i < expectedClassYears.size(); i++) {
			String expectedClassYearName = expectedClassYears.get(i);
			ClassYear classYear = classYears.get(i);
			Teacher classTeacher = classYear.getTeacher();
			String classYearName = classYear.getName() + " - " + classTeacher.getFullName();

			assertEquals(expectedClassYearName, classYearName);
		}
	}

	@When("^Отваряне на списъка с ученици$")
	public void navigatePupilsList() throws Throwable {
		classYearModel.navigateToClassYearList();
	}

	@When("^Избира паралелка: (.*)$")
	public void selectClassYear(String classYear) throws Throwable {
		classYearModel.selectClassYear(classYear);
	}

	@Then("^Вижда списъка с ученици: (.*)$")
	public void checkPupilsList(List<String> expectedPupils) throws Throwable {
		List<Pupil> pupils = classYearModel.getPupilsForSelectedClassYear();
		
		for (int i = 0; i < expectedPupils.size(); i++) {
			String expectedPupilName = expectedPupils.get(i);
			String pupilName = pupils.get(i).getFullName();

			assertEquals(expectedPupilName, pupilName);
		}
	}
}
