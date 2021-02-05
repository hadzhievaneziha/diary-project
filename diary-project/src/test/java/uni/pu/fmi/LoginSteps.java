package uni.pu.fmi;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	@Given("^Потребитеял отваря екрана за вход в системата$")
	public void openLoginScreen() throws Throwable {
	}

	@When("^Потребителя въведе потребителско име \"([^\"]*)\"$")
	public void typeUsername(String arg1) throws Throwable {
	}

	@When("^Въведе парола \"([^\"]*)\"$")
	public void typePassword(String arg1) throws Throwable {
		
	}

	@When("^Натисне върху бутона за вход в системата$")
	public void clickLoginBtn() throws Throwable {
		
	}

	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void checkLoginMessage(String arg1) throws Throwable {
		
	}

}
