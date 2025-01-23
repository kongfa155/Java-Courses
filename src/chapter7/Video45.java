package chapter7;

public class Video45 {
	public static void main(String[] args) {
		System.out.println("Video 45");

		SinhVien IT1 = new SinhVienIT(9.6, 9.7);
		SinhVien BK1 = new SinhVienCoKhi(10, 9.2);

		System.out.println("Diem TB cua SVIT la: " + IT1.getDiem());
		System.out.println("Diem TB cua SVCK la: " + BK1.getDiem());

	}
}
