package Chapter6;

import java.util.Scanner;

public class baiTap1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap tai khoan: ");
		String name = sc.nextLine();
		boolean tk = false;
		if (name.equalsIgnoreCase("hoi dan IT")) {
			tk = true;
		} else {
			tk = false;
		}
		System.out.println("Nhap mat khau: ");
		String password = sc.nextLine();
		if (password.length() >= 6 && tk) {
			System.out.println("Chao mung hoi dan IT");
		} else if (password.length() < 6 && tk) {
			System.out.println("Mat khau can co it nhat 6 ky tu!!");
		} else {
			System.out.println("Ban da nhap sai tai khoan");
		}

		sc.close();
	}
}
