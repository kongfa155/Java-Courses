package Buoi2;

import java.util.Scanner;

public class Diem {
	private int x;
	private int y;

	public Diem() {
	};

	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		int x, y;
		while (true) {
			System.out.println("Nhap toa do diem x: ");
			try {
				x = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Vui long nhap mot so nguyen");
			}
		}
		while (true) {
			System.out.println("Nhap toa do diem y: ");
			try {
				y = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Vui long nhap mot so nguyen");
			}
		}
		this.x = x;
		this.y = y;
		sc.close();
	}

	public void hienThi() {
		System.out.println("Toa do diem la (" + this.x + "," + y + ")");
	}

	public void doiDiem(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	public int giaTriX() {
		return this.x;
	}

	public int giaTriY() {
		return this.y;
	}

	public float khoangCach() {
		return (float) Math.sqrt(x * x + y * y);
	}

	public float khoangCach(Diem d) {
		int newX = d.x - this.x;
		int newY = d.y - this.y;
		return (float) Math.sqrt(newX * newX + newY * newY);
	}
}
