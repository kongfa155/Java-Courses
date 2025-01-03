package testProject;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("First number: ");
		int firstNumber = scanner.nextInt();
		System.out.println("Your age is: ");
		int secondNumber = scanner.nextInt();
		System.out.println("Min = " + Math.min(firstNumber, secondNumber));
		scanner.close();
	}

}
