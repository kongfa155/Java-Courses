package testProject;

import java.util.Scanner;

public class Lab3Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập độ rộng cạnh: ");
		double canh = scanner.nextDouble();
		System.out.println("Thể tích khối lập phương là " + Math.pow(canh, 3));
	}
}
