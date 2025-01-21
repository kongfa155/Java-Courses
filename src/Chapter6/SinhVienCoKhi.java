package Chapter6;

public class SinhVienCoKhi extends SinhVien {
	private String skills;

	public SinhVienCoKhi(String skills, String id, String ten, double price, double tax) {
		super(id, ten, price, tax);
		this.skills = skills;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

}
