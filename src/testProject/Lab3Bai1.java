package testProject;

import java.util.Scanner;

public class Lab3Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("Nhap so ban muon kiem tra: ");
		int num = sc.nextInt();
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				System.out.println("Uoc so khac: " + i);
				count++;
			}
		}
		if (count != 0) {
			System.out.printf("So %d khong phai so nguyen to!!", num);
		} else {
			System.out.printf("So %d la so nguyen to", num);
		}
		sc.close();
	}
}
