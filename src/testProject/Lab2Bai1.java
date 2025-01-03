package testProject;

import java.util.Scanner;

public class Lab2Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào 2 số nguyên a,b: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			double x = -b * 1.0 / a * 1.0;
			System.out.println("Nghiệm của phương trình là x = " + x);
		}
		scanner.close();
	}
}
