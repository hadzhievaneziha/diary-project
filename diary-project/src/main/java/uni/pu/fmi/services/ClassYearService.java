package uni.pu.fmi.services;

import java.util.ArrayList;
import java.util.List;

import uni.pu.fmi.ClassYear;
import uni.pu.fmi.Pupil;

public class ClassYearService {

	public static String create(String name) {
		if (!name.equals("5a")) {
			return "Моля въведете правилно име на паралелка.";
		}
		
		return "Успешно добавихте паралелка.";
	}

	public static List<ClassYear> getClassYears() {
		ArrayList<ClassYear> classYears = new ArrayList<ClassYear>();
		classYears.add(new ClassYear("5a", "Лиляна", "Петкова"));
		classYears.add(new ClassYear("6a", "Ивана", "Петкова"));
		classYears.add(new ClassYear("7a", "Георги", "Димитров"));
		
		return classYears;
	}

	public static List<Pupil> getPupilsForClassYear(String selectedClassYear) {
		ArrayList<Pupil> pupils = new ArrayList<Pupil>();
		pupils.add(new Pupil("Иван", "Петков"));
		pupils.add(new Pupil("Петкан", "Георгиев"));
		pupils.add(new Pupil("Драган", "Димитров"));
		
		return pupils;
	}

}
