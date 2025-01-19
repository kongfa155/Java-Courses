package Lab4;

public class Product {
	private String name;
	private double price;
	private double tax;

	public Product() {

	}

	public Product(String name1, double price1, double tax1) {
		this.name = name1;
		this.price = price1;
		this.tax = tax1;
	}

	public void nhapThongTin(String name1, double price1, double tax1) {
		this.setName(name1);
		this.setPrice(price1);
		this.setTax(tax1);
	}

	public void xuatThongTin() {
		System.out.println("Ten san pham: " + this.getName());
		System.out.println("Muc thue: " + this.getTax());
		System.out.println("Gia goc cua san pham: " + this.getPrice());
		System.out.println("Gia sau VAT: " + this.getTaxPrice());
	}

	public double getTaxPrice() {
		return this.price * this.tax;
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public double getTax() {
		return this.tax;
	}

	public void setName(String name1) {
		this.name = name1;
	}

	public void setPrice(double price1) {
		this.price = price1;
	}

	public void setTax(double tax1) {
		this.tax = tax1;
	}
}
