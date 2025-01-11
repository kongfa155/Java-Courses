package lab1;

import java.util.Scanner;

public class PrimaryNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap vao mot so nguyen");
		String s = sc.nextLine();
		s = s.trim();
		try {
			n = Integer.parseInt(s);
		} catch (Exception e1) {
			n = 0;
		}
		if (n < 2) {
			System.out.println("So da nhap khong phai so nguyen to");
			System.exit(0);
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println("So da nhap khong phai so nguyen to");
				System.exit(0);
			}
		}
		System.out.printf("So %d la so nguyen to\n", n);
		String binaryOfN = Integer.toBinaryString(n);
		System.out.println("So " + n + " viet duoi dang nhi phan la: " + binaryOfN);
		sc.close();
	}
}
