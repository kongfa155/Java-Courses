package Lab4;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin san pham 1");
		System.out.println("Ten san pham");
		String name = sc.nextLine();
		System.out.println("Gia san pham");
		double price = sc.nextDouble();
		System.out.println("Thue san pham");
		double tax = sc.nextDouble();
		Product pdt1 = new Product();
		pdt1.nhapThongTin(name, price, tax);
		System.out.println("Nhap thong tin san pham 2");
		System.out.println("Ten san pham");
		sc.nextLine();
		name = sc.nextLine();
		System.out.println("Gia san pham");
		price = sc.nextDouble();
		System.out.println("Thue san pham");
		tax = sc.nextDouble();
		Product pdt2 = new Product();
		pdt2.nhapThongTin(name, price, tax);
		pdt1.xuatThongTin();
		pdt2.xuatThongTin();
		sc.close();
	}
}
