package uni.pu.fmi;

public class Grade {
	private int grade;
	public Pupil pupil;
	public Teacher teacher;
	public Course course;

	/**
	 * Default constructor
	 */
	public Grade(int grade, String courseName) {
		this.grade = grade;
		this.course = new Course(courseName);
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public Course getCourse() {
		return course;
	}

}