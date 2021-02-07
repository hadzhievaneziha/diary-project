package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.ClassTeacherModel;

public class ClassTeacherSteps {
	
	private ClassTeacherModel classTeacherModel = new ClassTeacherModel();

	@Given("^Отваряне на страницата за добавяне на класен ръководител$")
	public void navigateToCreateClassTeacher() throws Throwable {
		classTeacherModel.navigateToCreateClassTeacher();
	}

	@When("^Потребителят въвежда име на класен ръководител (.*)$")
	public void typeClassTeacherName(String name) throws Throwable {
		classTeacherModel.setClassTeacherName(name);
	}

	@When("^Въвеждане на име на паралелка (.*)$")
	public void typeClassYearName(String name) throws Throwable {
		classTeacherModel.setClassYearName(name);
	}

	@When("^Натиска бутона за добавяне$")
	public void clickCreateClassTeacher() throws Throwable {
		classTeacherModel.create();
	}

	@Then("^Вижда съобщение за добавяне на класен ръководител (.*)$")
	public void checkCreateMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, classTeacherModel.getMessage());
	}

}
