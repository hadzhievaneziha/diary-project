package uni.pu.fmi.models;

import java.util.List;

import uni.pu.fmi.Grade;
import uni.pu.fmi.services.ParentService;

public class ParentModel {

	private String pupilName;

	public void navigateToGradeCheck() {
		System.out.println("Екранът за проверка на оценки.");
	}

	public void setPupilName(String name) {
		this.pupilName = name;

	}

	public List<Grade> getGrades() {
		List<Grade> grades = ParentService.getGrades(pupilName);
		return grades;
	}

}
