package chapter9;

import java.util.Scanner;

public class Video52 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Nhap vao mot so x");
			try {
				int x = scanner.nextInt();
				try {
					System.out.println("Ket qua 10/x la: " + 10 / x);
					break;
				} catch (Exception e) {
					System.out.println("Run error with x = " + x);
				}
			} catch (Exception e) {
				scanner.next();
				System.out.println("Run error");
				continue;
			}

		}
		scanner.close();
	}
}
