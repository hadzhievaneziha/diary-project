package uni.pu.fmi.models;

import uni.pu.fmi.services.LoginService;

public class LoginScreenModel {
	private String email;
	private String password;
	private String message;

	public void navigate() {
		System.out.println("Екранът за вход в системата е отворен.");
	}

	public void setEmail(String email) {
		this.email = email;

	}

	public void setPassword(String password) {
		this.password = password;

	}

	public void submit() {
		this.message = LoginService.login(email, password);
	}

	public String getMessage() {
		return message;
	}

}
