package Chapter6;

public class SinhVienIT extends SinhVien {
	private String languages;

	public SinhVienIT(String languages, String id, String ten, double price, double tax) {
		super(id, ten, price, tax);
		this.languages = languages;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

}
