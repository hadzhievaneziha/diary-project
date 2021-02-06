package uni.pu.fmi;

public class Grade {
	private int grade;
	public Pupil pupil;
	public Teacher teacher;
	public Course course;

	/**
	 * Default constructor
	 */
	public Grade() {
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}