package chapter8;

public class Student extends Person {
	private int mark;
	private String grade;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String id, String name, int age, int mark) {
		super(id, name, age);
		this.mark = mark;
	}

	public int getMark() {
		return this.mark;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public void setGrade() {
		if (this.mark >= 8) {
			this.grade = "A";
		} else if (this.mark >= 7 && this.mark < 8) {
			this.grade = "B";
		} else if (this.mark >= 6 && this.mark < 7) {
			this.grade = "C";
		} else if (this.mark >= 5 && this.mark < 6) {
			this.grade = "D";
		} else {
			this.grade = "Tach Cmnr";
		}
	}

	@Override
	public String toString() {
		return "Student [mark=" + mark + ", grade=" + grade + "]";
	}

}
