package lab1;

import java.util.Scanner;

public class ViewName {

	public String firstName(String s) {
		s = s.trim();
		return s.substring(s.lastIndexOf(" ") + 1);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho va ten: ");
		String s = sc.nextLine();
		ViewName fn = new ViewName();

		System.out.println("Ten cua ban la: " + fn.firstName(s));
		sc.close();
	}
}
