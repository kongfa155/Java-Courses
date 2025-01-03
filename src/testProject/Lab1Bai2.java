package testProject;

import java.util.Scanner;

public class Lab1Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập 2 cạnh: ");
		double dai = scanner.nextDouble();
		double rong = scanner.nextDouble();
		double chuvi = (dai + rong) * 2;
		double dientich = dai * rong;
		System.out.printf("Chu vi = %.2f\n", chuvi);
		System.out.printf("Dien tich = %.2f\n", dientich);
		System.out.println("Canh nho nhat hcn la " + Math.min(dai, rong));
		scanner.close();
	}
}
