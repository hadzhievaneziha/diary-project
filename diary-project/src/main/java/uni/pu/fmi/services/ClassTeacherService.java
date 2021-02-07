package uni.pu.fmi.services;

public class ClassTeacherService {

	public static String create(String classTeacherName, String classYearName) {
		if(!classTeacherName.equals("Лиляна Петкова")) {
			return "Моля въведете правилно име на класен ръководител.";
		}
		
		return "Успешно добавихте класен ръководител.";
	}

}
