package uni.pu.fmi.services;
import java.util.ArrayList;
import java.util.List;

import uni.pu.fmi.User;

public class LoginService {
	
	public static String login(String email, String password) {
		List<User> users = getUsers();
		boolean isUserExist = users.stream().anyMatch(user -> 
										(email.equals(user.getEmail())
									    && password.equals(user.getPassword())));
		return isUserExist ? "Успешно влязохте в системата!" : "Грешни данни!";
	}
	
	public static List<User> getUsers(){
		User user = new User("Иван", "Петков");
		user.setEmail("ivan@gmail.com");
		user.setPassword("Pass123!");
		ArrayList<User> users = new ArrayList<User>();
		users.add(user);
		return users;
	}
}
