package testProject;

import java.util.Scanner;

public class Lab2Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số điện sử dụng: ");
		int sodien = scanner.nextInt();
		if(sodien < 100) {
			System.out.println("Giá tiền điện là " + sodien*1000 );
		} else {
			System.out.println("Giá tiền điện là " + (100000 + (sodien-100)*1500) );
		}
		scanner.close();
	}
}
