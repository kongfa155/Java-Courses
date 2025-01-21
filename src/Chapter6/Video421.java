package Chapter6;

public class Video421 {
	public static void main(String[] args) {
		SinhVienIT st1 = new SinhVienIT("Java", "1234", "CP", 10000, 0.1);
		SinhVienCoKhi st2 = new SinhVienCoKhi("MayHoc", "4321", "TN", 10000, 0.1);
		System.out.println("Thong tin sinh vien: " + st1.ten);
		System.out.println("id: " + st1.id);
		System.out.println("Hoc ngon ngu: " + st1.getLanguages());
		System.out.println("Hoc phi: " + (st1.price - st1.getTaxPrice()));
		System.out.println("Thong tin sinh vien: " + st2.ten);
		System.out.println("id: " + st2.id);
		System.out.println("Hoc chuyen nganh: " + st2.getSkills());
		System.out.println("Hoc phi: " + (st2.price - st2.getTaxPrice()));
	}
}
