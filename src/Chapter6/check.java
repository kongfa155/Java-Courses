package Chapter6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap so can cuoc cong dan");
		String id = sc.nextLine();
		Pattern pattern = Pattern.compile("[0]\\d{11}");
		Matcher matcher = pattern.matcher(id);
		if (matcher.matches()) {
			System.out.println("Ma so can cuoc cong dan :" + id + " la hop le");
		} else {
			System.out.println("Ma so can cuoc cong dan :" + id + " khong hop le");
		}
		System.out.println("Vui long nhap gmail cua ban");
		String gmail = sc.nextLine();
		Pattern gmailPattern = Pattern.compile("^[\\w.+\\-]+@gmail\\.com$");
		Matcher gmailMatcher = gmailPattern.matcher(gmail);
		if (gmailMatcher.matches()) {
			System.out.println("Gmail :" + gmail + " la hop le");
		} else {
			System.out.println("Gmail:" + gmail + " khong hop le");
		}
		sc.close();
	}
}
