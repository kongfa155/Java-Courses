package chapter9;

public class SinhVien {
	private String mssv;
	private String hoten;
	private double diem;
	private int age;

	public SinhVien() {

	}

	public SinhVien(String mssv, String hoten, double diem, int age) {
		this.age = age;
		this.hoten = hoten;
		this.diem = diem;
		this.mssv = mssv;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SinhVien [mssv=" + mssv + ", hoten=" + hoten + ", diem=" + diem + ", age=" + age + "]";
	}

}
