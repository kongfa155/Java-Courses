package lab1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
	int n, A[];

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap so phan tu: ");
		n = sc.nextInt();
		A = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("\nNhap phan tu thu " + (i + 1) + ":");
			A[i] = sc.nextInt();
		}
	}

	public void show() {
		for (int e : A) {
			System.out.print(e + " ");
		}
		System.out.print("\n");
	}

	public int find(int x) {
		int c = 0;
		for (int i : A) {
			if (i == x)
				c++;
		}
		return c;
	}

	public void sort() {
		for (int i = 0; i < A.length - 1; i++)
			for (int j = i + 1; j < n; j++) {
				if (A[i] > A[j]) {
					int tmp = A[i];
					A[i] = A[j];
					A[j] = tmp;
				}
			}
	}

	public void add(int x) {
		A = Arrays.copyOf(A, A.length + 1);
		A[A.length - 1] = x;
		n++;
	}

	public void delete(int x) {
		int i;
		for (i = 0; i < A.length; i++)
			if (A[i] == x)
				break;
		if (i < A.length) {
			for (int j = i; j < A.length - 1; j++) {
				A[j] = A[j + 1];
			}
			n--;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex8 ca = new Ex8();
		ca.input();
		System.out.println("Day so vua nhap la:");
		ca.show();
		System.out.println("Nhap vao phan tu ban muon tim");
		int x = sc.nextInt();
		int c = ca.find(x);
		if (c == 0)
			System.out.print("\nKhong ton tai " + x + " trong day so\n");
		else
			System.out.print("\nSo " + x + " xuat hien " + c + " lan trong day so\n");
		System.out.println("Them phan tu x: ");
		ca.add(x);
		ca.show();
		System.out.println("Xoa phan tu x: ");
		ca.delete(x);
		ca.show();
		System.out.println("Day so theo thu tu tang dan la: ");
		ca.sort();
		ca.show();
	}
}
