package Chapter6;

public class SinhVien {
	protected String id;
	protected String ten;
	protected double price;
	protected double tax;

	public SinhVien(String id, String ten, double price, double tax) {
		this.id = id;
		this.ten = ten;
		this.price = price;
		this.tax = tax;
	}

	public double getTaxPrice() {
		return this.price * this.tax;
	}
}
