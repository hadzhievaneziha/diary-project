package uni.pu.fmi.models;

import java.util.List;

import uni.pu.fmi.ClassYear;
import uni.pu.fmi.Pupil;
import uni.pu.fmi.services.ClassYearService;

public class ClassYearModel {

	private String name;
	private String message;
	private String selectedClassYear;

	public void navigateToCreateClassYear() {
		System.out.println("Екранът за създаване на паралелки.");
	}

	public void setClassYearName(String name) {
		this.name = name;
	}

	public void create() {
		message = ClassYearService.create(name);
	}

	public String getMessage() {
		return message;
	}

	public void navigateToClassYearList() {
		System.out.println("Екранът за паралелки.");
	}

	public List<ClassYear> getClassYears() {
		List<ClassYear> classYears = ClassYearService.getClassYears();
		
		return classYears;
	}

	public void selectClassYear(String classYear) {
		this.selectedClassYear = classYear;
	}

	public List<Pupil> getPupilsForSelectedClassYear() {
		List<Pupil> pupils = ClassYearService.getPupilsForClassYear(selectedClassYear);
		
		return pupils;
	}

}
