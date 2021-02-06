package uni.pu.fmi;

public class User {
	private String email;
	private String password;
	private String firstName;
	private String lastName;

	/**
	 * Default constructor
	 */
	public User() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}