package Chapter6;

import java.util.ArrayList;
import java.util.Scanner;

public class baiTap2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student1 = new Student("Nguyen Van Nam", "1");
		Student student2 = new Student("Nguyen Van Men", "2");
		Student student3 = new Student("Boy", "3");
		Student student4 = new Student("Kid", "4");
		Student student5 = new Student("Chad", "5");

		ArrayList<Student> stList = new ArrayList<Student>();
		stList.add(student5);
		stList.add(student4);
		stList.add(student3);
		stList.add(student2);
		stList.add(student1);
		for (int i = 0; i < stList.size(); i++) {
			if (stList.get(i).getName().startsWith("Nguyen")) {
				System.out.println("Start with Nguyen " + stList.get(i));
			}
		}
		System.out.println("Check array" + stList);
	}
}
