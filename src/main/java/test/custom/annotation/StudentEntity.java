package test.custom.annotation;

public class StudentEntity {
	
	@PropertyName(name = "Name")
	private String name;
	
	@PropertyName(name = "Age")
	private int age;
	
	@PropertyName(name = "Grade")
	private long grade;
	
	private Integer id;
	
	public StudentEntity(String name, int age, long grade, Integer id) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getGrade() {
		return grade;
	}

	public void setGrade(long grade) {
		this.grade = grade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "StudentEntity [name=" + name + ", age=" + age + ", grade="
				+ grade + ", id=" + id + "]";
	}
	
}
