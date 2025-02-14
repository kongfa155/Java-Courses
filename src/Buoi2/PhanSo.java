package Buoi2;

import java.util.Scanner;

public class PhanSo {
	private int tuSo;
	private int mauSo;

	public PhanSo() {
	};

	public PhanSo(int tuso, int mauso) {
		this.tuSo = tuso;
		this.mauSo = mauso;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		int tuso, mauso;
		System.out.println("Nhap vao mot phan so");
		while (true) {
			try {
				System.out.println("Tu so: ");
				tuso = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Ban can nhap vao mot so nguyen");
			}
		}
		while (true) {
			try {
				System.out.println("Mau so: ");
				mauso = sc.nextInt();
				if (mauso == 0) {
					System.out.println("Mau so phai khac 0");
				} else
					break;
			} catch (Exception e) {
				System.out.println("Ban can nhap vao mot so nguyen");
			}
		}
		this.tuSo = tuso;
		this.mauSo = mauso;
	}

	public void show() {
		rutGon();
		if (this.tuSo == 0) {
			System.out.print("0");
		} else if (this.mauSo == 1 && this.tuSo != 0) {
			System.out.print(this.tuSo);
		} else {
			System.out.print(tuSo + "/" + mauSo);
		}

	}

	public void nghichDao() {
		int tmp = tuSo;
		tuSo = mauSo;
		mauSo = tmp;
	}

	public PhanSo giaTriNghichDao() {
		return new PhanSo(mauSo, tuSo);
	}

	public float giaTri() {
		return (float) tuSo / mauSo;
	}

	public boolean lonHon(PhanSo a) {
		return this.giaTri() > a.giaTri();
	}

	public PhanSo cong(PhanSo a) {
		if (a.tuSo == 0)
			return new PhanSo(this.tuSo, this.mauSo);
		int mau = this.mauSo * a.mauSo;
		int tu = (this.tuSo * a.mauSo) + (a.tuSo * this.mauSo);
		PhanSo ketqua = new PhanSo(tu, mau);
		ketqua.rutGon();
		return ketqua;
	}

	public PhanSo tru(PhanSo a) {
		int mau = this.mauSo * a.mauSo;
		int tu = (this.tuSo * a.mauSo) - (a.tuSo * this.mauSo);
		PhanSo ketqua = new PhanSo(tu, mau);
		ketqua.rutGon();
		return ketqua;
	}

	public PhanSo nhan(PhanSo a) {
		PhanSo ketqua = new PhanSo(this.tuSo * a.tuSo, this.mauSo * a.mauSo);
		ketqua.rutGon();
		return ketqua;
	}

	public PhanSo chia(PhanSo a) {
		PhanSo ketqua = new PhanSo(this.tuSo * a.mauSo, this.mauSo * a.tuSo);
		ketqua.rutGon();
		return ketqua;
	}

	public PhanSo congN(int N) {
		PhanSo ketqua = new PhanSo(this.tuSo + N * this.mauSo, this.mauSo);
		ketqua.rutGon();
		return ketqua;
	}

	public PhanSo truN(int N) {
		PhanSo ketqua = new PhanSo(this.tuSo - N * this.mauSo, this.mauSo);
		ketqua.rutGon();
		return ketqua;
	}

	public PhanSo nhanN(int N) {
		PhanSo ketqua = new PhanSo(this.tuSo * N, this.mauSo);
		ketqua.rutGon();
		return ketqua;
	}

	public PhanSo chiaN(int N) {
		PhanSo ketqua = new PhanSo(this.tuSo, this.mauSo * N);
		ketqua.rutGon();
		return ketqua;
	}

	// Lam them phan rut gon
	private int gcd(int a, int b) {
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}

	public void rutGon() {
		int gcd = gcd(tuSo, mauSo);
		tuSo = tuSo / gcd;
		mauSo = mauSo / gcd;
	}
}
