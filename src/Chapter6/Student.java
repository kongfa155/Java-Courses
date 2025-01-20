package Chapter6;

public class Student {
	private String name;
	private String id;

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	public Student() {

	}

	public Student(String name1, String id1) {
		this.name = name1;
		this.id = id1;
	}

	public void setName(String name1) {
		this.name = name1;
	}

	public void setID(String id1) {
		this.id = id1;
	}

	public String getName() {
		return this.name;
	}

	public String getID() {
		return this.id;
	}

}
