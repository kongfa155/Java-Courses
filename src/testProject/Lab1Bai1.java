package testProject;

import java.util.Scanner;

public class Lab1Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên sinh viên: ");
		String tensinhvien = scanner.nextLine();
		System.out.println("Điểm của sinh viên: ");
		double diemsinhvien = scanner.nextDouble();
		System.out.printf("\"" + tensinhvien + "\"" + " có điểm =  %.1f", diemsinhvien);
	}
}
