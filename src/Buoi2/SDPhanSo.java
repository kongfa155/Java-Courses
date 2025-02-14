package Buoi2;

import java.util.Scanner;

public class SDPhanSo {
	public static void main(String[] args) {
		PhanSo A = new PhanSo(3, 7);
		PhanSo B = new PhanSo(4, 9);
		System.out.print("Gia tri cua A la: ");
		A.show();
		System.out.println("");
		System.out.print("Gia tri cua B la: ");
		B.show();
		System.out.println("");
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		x.nhap();
		y.nhap();
		System.out.print("Gia tri nghich dao cua x la: ");
		(x.giaTriNghichDao()).show();
		System.out.println("");
		System.out.print("Gia tri cua x + y la: ");
		(x.cong(y)).show();
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao mot so n: ");
		int n = sc.nextInt();
		PhanSo P[] = new PhanSo[n];
		PhanSo tong = new PhanSo(0, 1);
		float max = Float.MIN_VALUE;
		PhanSo m = new PhanSo();
		for (int i = 0; i < n; i++) {
			P[i] = new PhanSo();
			P[i].nhap();
			tong = tong.cong(P[i]);
			if (max < P[i].giaTri()) {
				max = P[i].giaTri();
				m = P[i];
			}
		}
		System.out.print("Tong gia tri cua day phan so vua nhap la: ");
		tong.show();
		System.out.println("");
		System.out.print("Gia tri lon nhat cua phan so la: ");
		m.show();
		System.out.println("");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (P[i].lonHon(P[j])) {
					PhanSo temp = new PhanSo();
					temp = P[i];
					P[i] = P[j];
					P[j] = temp;
				}
			}
		}
		System.out.println("Danh sach sau khi sap xep: ");
		for (int i = 0; i < n; i++) {
			P[i].show();
			if (i == n - 1)
				continue;
			System.out.print(" ,");
		}
		sc.close();
	}
}
