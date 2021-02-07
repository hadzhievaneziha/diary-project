package uni.pu.fmi.models;

import uni.pu.fmi.services.ClassTeacherService;

public class ClassTeacherModel {

	private String classTeacherName;
	private String classYearName;
	private String message;

	public void navigateToCreateClassTeacher() {
		System.out.println("Екранът за добавяне на класен ръководител.");
	}

	public void setClassTeacherName(String name) {
		this.classTeacherName = name;
	}

	public void setClassYearName(String name) {
		this.classYearName = name;
		
	}

	public void create() {
		message = ClassTeacherService.create(classTeacherName, classYearName);
	}

	public String getMessage() {
		return message;
	}

}
