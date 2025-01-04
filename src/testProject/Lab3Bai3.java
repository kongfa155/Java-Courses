package testProject;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chieu dai cua mang ban muon tao ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Hay nhap mang");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.print("\n");
		System.out.println("So nho nhat la " + arr[0]);
		System.out.println("So lon nhat la " + arr[size - 1]);
		sc.close();
	}
}
