package testProject;

import java.util.Scanner;

public class Lab3Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so ban muon in bang cuu chuong: ");
		int num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
		sc.close();
	}
}
