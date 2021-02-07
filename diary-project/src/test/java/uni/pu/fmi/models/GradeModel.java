package uni.pu.fmi.models;

import uni.pu.fmi.services.GradeService;

public class GradeModel {

	private String pupilName;
	private String subjectName;
	private String grade;
	private String message;

	public void navigateToCreateGrade() {
		System.out.println("Екранът за въвеждане на оценка.");
	}

	public void setPupilName(String name) {
		this.pupilName = name;

	}

	public void setSubjectName(String name) {
		this.subjectName = name;

	}

	public void setGrade(String grade) {
		this.grade = grade;

	}

	public void create() {
		message = GradeService.create(grade, subjectName, pupilName);
	}

	public String getMessage() {

		return message;
	}

}
