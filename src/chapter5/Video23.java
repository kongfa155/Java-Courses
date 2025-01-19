package chapter5;

import java.util.ArrayList;

import OOP.Student;

public class Video23 {
	public static void main(String[] args) {
		int a = 10;
		ArrayList a2 = new ArrayList();
		ArrayList<String> a1 = new ArrayList<String>();// generic
		ArrayList<Student> a3 = new ArrayList<Student>();
//		a1.add(2); // integer => Integer unboxing
		a1.add("toi yeu chanhu");
		a1.add("toi yeu chanhu 3000");
		a1.add("toi yeu chanhu 1505");
		a1.remove(1);
		System.out.println(a1.toString() + " " + a1.get(1));
	}
}
