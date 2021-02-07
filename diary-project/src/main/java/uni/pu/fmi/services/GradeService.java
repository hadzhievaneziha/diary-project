package uni.pu.fmi.services;

public class GradeService {

	public static String create(String grade, String subjectName, String pupilName) {
		int gradeNumber = Integer.parseInt(grade);
		if (gradeNumber < 2 || gradeNumber > 6) {
			return "Моля въведете валидна оценка";

		}
		return "Успешно добавихте оценка.";
	}

}
