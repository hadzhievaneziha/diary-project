package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.LoginScreenModel;

public class LoginSteps {
	private LoginScreenModel loginScreenModel = new LoginScreenModel();
	
	@Given("^Потребителят отваря екрана за вход в системата$")
	public void openLoginScreen() throws Throwable {
		loginScreenModel.navigate();
	}

	@When("^Потребителят въведе e-mail \"([^\"]*)\"$")
	public void typeUsername(String email) throws Throwable {
	 loginScreenModel.setEmail(email);
	}

	@When("^Въведе парола \"([^\"]*)\"$")
	public void typePassword(String password) throws Throwable {
		loginScreenModel.setPassword(password);
		
	}

	@When("^Натисне върху бутона за вход в системата$")
	public void clickLoginBtn() throws Throwable {
		loginScreenModel.submit();
	}

	@Then("^Вижда съобщение за вход \"([^\"]*)\"$")
	public void checkLoginMessage(String expectedMessage) throws Throwable {
		String message = loginScreenModel.getMessage();
		assertEquals(expectedMessage, message);
	}

}
