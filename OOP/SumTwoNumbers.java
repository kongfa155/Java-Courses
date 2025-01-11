package lab1;

import java.util.Scanner;

public class SumTwoNumbers {

	public int input() {
		Scanner sc = new Scanner(System.in);
		int a;
		String s;
		do {
			System.out.println("Nhap vao so nguyen: ");
			s = sc.nextLine();
			try {
				a = Integer.parseInt(s);
			} catch (Exception e1) {
				System.out.println("So khong hop le vui long nhap lai");
				a = Integer.MAX_VALUE;
			}
		} while (a == Integer.MAX_VALUE);
		return a;
	}

	public static void main(String[] args) {
		int a, b;

		SumTwoNumbers num = new SumTwoNumbers();
		a = num.input();
		b = num.input();
		System.out.println("Tong 2 so la: " + (a + b));
	}
}
