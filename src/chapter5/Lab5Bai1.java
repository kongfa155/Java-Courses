package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5Bai1 {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Nhap vao mot so bat ky ");
			double x = sc.nextDouble();
			list.add(x);
			sc.nextLine();
			System.out.print("Do you want to add more number in list (Y/N) ?");
			String option = sc.nextLine();
			if (!option.equalsIgnoreCase("Y") & !option.equalsIgnoreCase("N")) {
				System.out.println("Loi cu phap");
				System.exit(0);
			}
			if (option.equalsIgnoreCase("N"))
				break;
		}
		Double sum = 0.0;
		System.out.print("Chuoi vua nhap gom: ");
		for (Double x : list) {
			System.out.print(x + " ");
			sum += x;
		}
		System.out.println("\nTong chuoi vua nhap la: " + sum);
		sc.close();
	}
}
