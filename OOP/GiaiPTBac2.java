package lab1;

import java.util.Scanner;

public class GiaiPTBac2 {

	public static void ptBac1(int a, int b) {
		if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else {
			System.out.println("Phương trình có nghiệm đơn là " + (-b * 1.0 / a * 1.0));
		}
	}

	public static void ptBac2(int a, int b, int c) {
		if (a == 0 & b != 0) {
			ptBac1(b, c);
		} else {
			float delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				System.out.println("Phương trình có nghiệm kép: " + (-2.0 * b / a * 1.0));
			} else {
				float d = (float) Math.sqrt(delta);
				double x1 = (-b - d) / (2.0 * a);
				double x2 = (-b + d) / (2.0 * a);
				System.out.println("Phương trình có 2 nghiệm x1 = " + x1 + ", x2 = " + x2);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 3 so nguyen a,b,c");
		System.out.println("Nhap so a: ");
		int a = sc.nextInt();
		System.out.println("Nhap so b: ");
		int b = sc.nextInt();
		System.out.println("Nhap so c: ");
		int c = sc.nextInt();
		ptBac2(a, b, c);
		sc.close();
	}
}
