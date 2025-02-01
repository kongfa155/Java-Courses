package chapter9;

import java.util.Scanner;

public class Video54 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Video 54");
			System.out.println("Nhap thong tin sinh vien");
			System.out.println("Ho va ten");
			String name = scanner.nextLine();
			System.out.println("MSSV: ");
			String mssv = scanner.nextLine();
			int age;
			double diem;
			while (true) {
				System.out.println("Tuoi: ");
				age = scanner.nextInt();
				if (age < 18 || age > 100) {
					System.out.println("Loi tuoi phai nam trong khoang tu 18 den 100");
					scanner.nextLine();
				} else
					break;
			}
			while (true) {
				System.out.println("Diem: ");
				diem = scanner.nextDouble();
				if (diem < 0 || diem > 10) {
					System.out.println("Diem phai nam trong khoang tu 0 den 10");
					scanner.nextLine();
				} else
					break;
			}
			SinhVien st1 = new SinhVien(mssv, name, diem, age);
			System.out.println(st1);
		}

		catch (NumberFormatException e) {
			System.out.println("Loi nhap sai kieu du lieu");
		} finally {
			scanner.close();
		}

	}
}
