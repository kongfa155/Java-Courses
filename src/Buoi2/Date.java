package Buoi2;

import java.util.Scanner;

public class Date {
	private int ngay;
	private int thang;
	private int nam;

	public Date() {
	};

	public Date(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	public void hienThi() {
		System.out.printf("%2d/%2d/%4d \n", ngay, thang, nam);
	}

	public boolean isNamNhuan() {
		return (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
	}

	public Date congNgay(int ngayCong) {
		Date ketqua = new Date();
		int[] soNgayTrongThang = { 31, isNamNhuan() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int d = ngay + ngayCong;
		int m = thang;
		int y = nam;
		while (d > soNgayTrongThang[m - 1]) {
			d = d - soNgayTrongThang[m - 1];
			m++;
			if (m > 12) {
				m = 1;
				y++;
			}
		}
		ketqua.ngay = d;
		ketqua.thang = m;
		ketqua.nam = y;
		return ketqua;
	}

	public Date ngayHomSau() {
		Date ketqua = new Date();
		int d = ngay + 1;
		int m = thang;
		int y = nam;
		int[] soNgayTrongThang = { 31, isNamNhuan() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (d > soNgayTrongThang[thang - 1]) {
			d = 1;
			m++;
			if (m > 12) {
				m = 1;
				y++;
			}
		}
		ketqua.ngay = d;
		ketqua.thang = m;
		ketqua.nam = y;
		return ketqua;
	}

	public boolean hopLe() {
		if (thang < 1 || thang > 12)
			return false;
		int[] soNgayTrongThang = { 31, isNamNhuan() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		return ngay >= 1 && ngay <= soNgayTrongThang[thang - 1];
	}

	public void nhapNgay() {
		Scanner sc = new Scanner(System.in);
		int ngay, thang, nam;
		while (!this.hopLe()) {
			while (true) {
				System.out.println("Nhap ngay: ");
				ngay = sc.nextInt();
				if (ngay < 1 || ngay > 31)
					System.out.println("Ngay khong hop le vui long nhap lai");
				else
					break;
			}
			while (true) {
				System.out.println("Nhap thang: ");
				thang = sc.nextInt();
				if (thang < 1 || thang > 12)
					System.out.println("Thang khong hop le vui long nhap lai");
				else
					break;
			}
			while (true) {
				System.out.println("Nhap nam: ");
				nam = sc.nextInt();
				if (nam < 0)
					System.out.println("Nam chi duoc tinh tu nam 0");
				else
					break;
			}
			this.ngay = ngay;
			this.thang = thang;
			this.nam = nam;
			if (!this.hopLe())
				System.out.println("Ngay ban nhap khong hop le vui long nhap lai");
		}
		sc.close();
	}

}
