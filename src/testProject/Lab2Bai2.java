package testProject;

import java.util.Scanner;

public class Lab2Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào 3 số nguyên a,b,c: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if (a == 0) {
			if (b == 0 && c == 0) {
				System.out.println("Phương trình có vô số nghiệm");
			} else if (b == 0 && c != 0) {
				System.out.println("Phương trình vô nghiệm");
			} else {
				double x = -c * 1.0 / b * 1.0;
				System.out.println("Nghiệm của phương trình là x = " + x);
			}
		} else {
			double delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				double x = -b * 1.0 / (2 * a);
				System.out.println("Nghiệm kép x = " + x);
			} else {
				double x1 = (-b * 1.0 + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b * 1.0 - Math.sqrt(delta)) / (2 * a);
				System.out.println("Nghiệm 2 nghiệm riêng biệt là: x1 = " + x1 + " và x2 = " + x2);
			}
		}
		scanner.close();
	}
}
