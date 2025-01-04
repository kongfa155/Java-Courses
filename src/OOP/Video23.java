package OOP;

public class Video23 {
	public static void main(String[] args) {
		System.out.println("Run video 23");

		Student st3 = new Student("CPYTN", 25);
		System.out.println("Student with name = " + st3.getName() + " and age " + st3.getAge());
		st3.setName("TNCYCP");
		st3.setAge(20);
		System.out.println("Student with name = " + st3.getName() + " and age " + st3.getAge());
		st3.learnJava();

	}
}
