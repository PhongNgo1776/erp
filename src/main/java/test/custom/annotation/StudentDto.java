package test.custom.annotation;

public class StudentDto {
	
	@PropertyName(name = "Name")
	private String studentName;
	
	@PropertyName(name = "Age")
	private int studentAge;
	
	@PropertyName(name = "Grade")
	private long studentGrade;
	
	private String page;
	
	public StudentDto() {
		super();
	}

	public StudentDto(String studentName, int studentAge, long studentGrade,
			String page) {
		super();
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentGrade = studentGrade;
		this.page = page;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public long getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(long studentGrade) {
		this.studentGrade = studentGrade;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "StudentDto [studentName=" + studentName + ", studentAge="
				+ studentAge + ", studentGrade=" + studentGrade + ", page="
				+ page + "]";
	}
	
}
