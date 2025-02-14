package Buoi2;

public class SDDate {
	public static void main(String[] args) {
		Date A = new Date(15, 05, 2005);
		A.hienThi();
		Date B = new Date();
		B.nhapNgay();
		B.hienThi();
		Date C = new Date();
		C = B.ngayHomSau();
		C.hienThi();
		Date D = new Date();
		D = B.congNgay(365);
		D.hienThi();
	}
}
